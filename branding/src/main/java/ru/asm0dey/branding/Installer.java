/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.asm0dey.branding;

import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        com.jidesoft.utils.Lm.verifyLicense("Paul M. Finkelshtein", "uTorrent-Client-MP", "bvRIkF2:shrMPvwXEJJqd7Z1Tu7HuMt2");
    }
}
