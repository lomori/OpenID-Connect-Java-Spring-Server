/*******************************************************************************
 * Copyright 2015 The MITRE Corporation
 *   and the MIT Kerberos and Internet Trust Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package org.mitre.uma.service;

import org.mitre.oauth2.model.OAuth2AccessTokenEntity;
import org.mitre.uma.model.PermissionTicket;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

/**
 * Service to create special tokens for UMA.
 * 
 * @author jricher
 *
 */
public interface UmaTokenService {

	/**
	 * Create the RPT from the given authentication and ticket. 
	 * 
	 * @param o2auth
	 * @param ticket
	 * @return
	 */
	public OAuth2AccessTokenEntity createRequestingPartyToken(OAuth2Authentication o2auth, PermissionTicket ticket);

}
