package org.chromium.net;

import org.chromium.base.ApplicationStatus;
import org.chromium.base.C72377c;
import org.chromium.base.C72390p;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy implements C72377c {
    private boolean mDestroyed;

    /* access modifiers changed from: protected */
    public void destroy() {
        if (!this.mDestroyed) {
            C72390p pVar = ApplicationStatus.f192474c;
            if (pVar != null) {
                pVar.mo63851c(this);
            }
            this.mDestroyed = true;
        }
    }

    /* access modifiers changed from: protected */
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        ApplicationStatus.m107011a(this);
        onApplicationStateChange(0);
    }

    public void onApplicationStateChange(int i) {
        ApplicationStatus.hasVisibleActivities();
        unregister();
    }
}
