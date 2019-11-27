/*
 * (C) Copyright IBM Corp. 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.natural_language_understanding.v1.model;

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Tokens and sentences returned from syntax analysis.
 */
public class SyntaxResult extends GenericModel {

  private List<TokenResult> tokens;
  private List<SentenceResult> sentences;

  /**
   * Gets the tokens.
   *
   * @return the tokens
   */
  public List<TokenResult> getTokens() {
    return tokens;
  }

  /**
   * Gets the sentences.
   *
   * @return the sentences
   */
  public List<SentenceResult> getSentences() {
    return sentences;
  }
}