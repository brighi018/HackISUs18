package com.dance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.SpeechletV2;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SimpleCard;
import com.amazon.speech.ui.OutputSpeech;

public class DanceSpeechlet implements SpeechletV2 {
	private static final Logger log = LoggerFactory.getLogger(DanceSpeechlet.class);
	
	@Override
    public void onSessionStarted(SpeechletRequestEnvelope<SessionStartedRequest> requestEnvelope) {
        log.info("onSessionStarted requestId={}, sessionId={}", requestEnvelope.getRequest().getRequestId(),
                requestEnvelope.getSession().getSessionId());
        // any initialization logic goes here
    }

    @Override
    public SpeechletResponse onLaunch(SpeechletRequestEnvelope<LaunchRequest> requestEnvelope) {
        log.info("onLaunch requestId={}, sessionId={}", requestEnvelope.getRequest().getRequestId(),
                requestEnvelope.getSession().getSessionId());
        return getInstructionsResponse();
    }

	@Override
	public SpeechletResponse onIntent(SpeechletRequestEnvelope<IntentRequest> requestEnvelope) {
		IntentRequest request = requestEnvelope.getRequest();
        log.info("onIntent requestId={}, sessionId={}", request.getRequestId(),
                requestEnvelope.getSession().getSessionId());

        Intent intent = request.getIntent();
        String intentName = (intent != null) ? intent.getName() : null;

        if ("Instructions".equals(intentName)) {
            return getInstructionsResponse();
        } 
        else if ("RepeatStep".equals(intentName)) {
            return getRepeatStepResponse();
        } 
        else if ("NextStep".equals(intentName)) {
            return getNextStepResponse();
        } 
        else if ("PreviousStep".equals(intentName)) {
            return getPreviousStepResponse();
        } 
        else if ("StartOver".equals(intentName)) {
            return getStartOverResponse();
        } 
        else if ("Review".equals(intentName)) {
            return getReviewResponse();
        } 
        else if ("AMAZON.HelpIntent".equals(intentName)) {
            return getHelpResponse();
        } else {
            return getAskResponse("HelloWorld", "This is unsupported.  Please try something else.");
        }
	}

	private SpeechletResponse getAskResponse(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	private SpeechletResponse getHelpResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private SpeechletResponse getReviewResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private SpeechletResponse getStartOverResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private SpeechletResponse getPreviousStepResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private SpeechletResponse getNextStepResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private SpeechletResponse getRepeatStepResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	private SpeechletResponse getInstructionsResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onSessionEnded(SpeechletRequestEnvelope<SessionEndedRequest> requestEnvelope) {
		 log.info("onSessionEnded requestId={}, sessionId={}", requestEnvelope.getRequest().getRequestId(),
	                requestEnvelope.getSession().getSessionId());
	}
}
