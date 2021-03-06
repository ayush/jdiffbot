/**
 * Copyright (c) 2012 Contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * Contributors:
 *          Alessandro Ferreira Leite - the initial implementation.
 */
package diffboat.http;

import java.io.Serializable;

public final class Response implements Serializable
{

    /**
     * Serial code version <code>serialVersionUID</code> for serialization.
     */
    private static final long serialVersionUID = 1293612143192917226L;

    /**
     * The response code.
     */
    private String code_;
    
    /**
     * The response state. 
     */
    private String state_;
    
    /**
     * The response content in JSON format. 
     */
    private String json_;

    /**
     * @return the code
     */
    public String getCode()
    {
        return code_;
    }

    /**
     * @param code
     *            the code to set
     */
    public void setCode(String code)
    {
        this.code_ = code;
    }

    /**
     * @return the state
     */
    public String getState()
    {
        return state_;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state)
    {
        this.state_ = state;
    }

    /**
     * @return the json
     */
    public String getJson()
    {
        return json_;
    }

    /**
     * @param json
     *            the json to set
     */
    public void setJson(String json)
    {
        this.json_ = json;
    }
}
