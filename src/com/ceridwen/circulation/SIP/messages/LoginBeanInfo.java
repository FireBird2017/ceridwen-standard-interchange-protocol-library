/*******************************************************************************
 * Copyright (c) 2010 Matthew J. Dovey.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * <http://www.gnu.org/licenses/>.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Matthew J. Dovey - initial API and implementation
 ******************************************************************************/
package com.ceridwen.circulation.SIP.messages;

import java.beans.*;
import com.ceridwen.circulation.SIP.helpers.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class LoginBeanInfo extends SimpleBeanInfo {
  Class<Login> beanClass = Login.class;
  String iconColor16x16Filename;
  String iconColor32x32Filename;
  String iconMono16x16Filename;
  String iconMono32x32Filename;

  public LoginBeanInfo() {
  }
  public PropertyDescriptor[] getPropertyDescriptors() {
    try {
      PropertyDescriptor _UIDAlgorithm = new PropertyDescriptor("UIDAlgorithm", beanClass, "getUIDAlgorithm", "setUIDAlgorithm");
      PropertyDescriptor _PWDAlgorithm = new PropertyDescriptor("PWDAlgorithm", beanClass, "getPWDAlgorithm", "setPWDAlgorithm");
      PropertyDescriptor _loginUserId = new PropertyDescriptor("loginUserId", beanClass, "getLoginUserId", "setLoginUserId");
      PropertyDescriptor _loginPassword = new PropertyDescriptor("loginPassword", beanClass, "getLoginPassword", "setLoginPassword");
      PropertyDescriptor _locationCode = new PropertyDescriptor("locationCode", beanClass, "getLocationCode", "setLocationCode");

      _UIDAlgorithm.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(2,2));
      _PWDAlgorithm.setValue("SIPFieldDescriptor", new FixedFieldDescriptor(3,3));

      _loginUserId.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("CN"));
      _loginPassword.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("CO"));
      _locationCode.setValue("SIPFieldDescriptor", new VariableFieldDescriptor("CP"));

      PropertyDescriptor[] pds = new PropertyDescriptor[] {
        _UIDAlgorithm,
        _PWDAlgorithm,
        _loginUserId,
        _loginPassword,
        _locationCode};
      return pds;
    }
    catch(IntrospectionException ex) {
      ex.printStackTrace();
      return null;
    }
  }
  public java.awt.Image getIcon(int iconKind) {
    switch (iconKind) {
      case BeanInfo.ICON_COLOR_16x16:
        return iconColor16x16Filename != null ? loadImage(iconColor16x16Filename) : null;
      case BeanInfo.ICON_COLOR_32x32:
        return iconColor32x32Filename != null ? loadImage(iconColor32x32Filename) : null;
      case BeanInfo.ICON_MONO_16x16:
        return iconMono16x16Filename != null ? loadImage(iconMono16x16Filename) : null;
      case BeanInfo.ICON_MONO_32x32:
        return iconMono32x32Filename != null ? loadImage(iconMono32x32Filename) : null;
    }
    return null;
  }
}
