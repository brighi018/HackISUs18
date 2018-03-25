/*
    Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
    except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
    the specific language governing permissions and limitations under the License.
 */

package com.amazon.speech.speechlet.interfaces.display.template;

import com.amazon.speech.speechlet.interfaces.display.element.Image;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This body template is comprised of the following elements:
 * <ul>
 * <li>An optional full-screen background image</li>
 * <li>An image (rectangular, square)</li>
 * <li>An optional title</li>
 * </ul>
 *
 * <p>
 * For layout specifics, please refer to our template documentation.
 * </p>
 */
@JsonTypeName("BodyTemplate7")
public class BodyTemplate7 extends Template {
    private Image backgroundImage;
    private Image image;
    private String title;

    /**
     * Returns the background image.
     *
     * @return the background image
     */
    public Image getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Sets the background image.
     *
     * @param backgroundImage
     *            the background image
     */
    public void setBackgroundImage(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    /**
     * Returns the image.
     *
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the image.
     *
     * @param image
     *            the image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * Returns the title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     *
     * @param title
     *            the title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
