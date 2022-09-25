package org.chromium.net;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
public class RegistrationPolicyAlwaysRegister extends NetworkChangeNotifierAutoDetect.RegistrationPolicy {
    /* access modifiers changed from: protected */
    public void destroy() {
    }

    /* access modifiers changed from: protected */
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        register();
    }
}
