package org.chromium.net;

import org.chromium.base.C72386l;
import org.chromium.net.GURLUtils;
import p000J.C0000N;

/* compiled from: PG */
public class GURLUtilsJni implements GURLUtils.Natives {
    public static final C72386l TEST_HOOKS = new C72434d();
    /* access modifiers changed from: private */
    public static GURLUtils.Natives testInstance;

    public static GURLUtils.Natives get() {
        return new GURLUtilsJni();
    }

    public String getOrigin(String str) {
        return C0000N.MpCt7siL(str);
    }
}
