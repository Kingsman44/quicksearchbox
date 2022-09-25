package com.google.android.play.core.p3538g.p3539a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.g.a.a */
/* compiled from: PG */
public final class C45114a {

    /* renamed from: a */
    public static final Map f117796a;

    /* renamed from: b */
    public static final Map f117797b;

    /* renamed from: c */
    private static final Map f117798c = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f117796a = hashMap;
        HashMap hashMap2 = new HashMap();
        f117797b = hashMap2;
        hashMap.put(-1, "Too many sessions are running for current app, existing sessions must be resolved first.");
        hashMap.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        hashMap.put(-3, "Request is otherwise invalid.");
        hashMap.put(-4, "Requested session is not found.");
        hashMap.put(-5, "Split Install API is not available.");
        hashMap.put(-6, "Network error: unable to obtain split details.");
        hashMap.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        hashMap.put(-8, "Requested session contains modules from an existing active session and also new modules.");
        hashMap.put(-9, "Service handling split install has died.");
        hashMap.put(-10, "Install failed due to insufficient storage.");
        hashMap.put(-11, "Signature verification error when invoking SplitCompat.");
        hashMap.put(-12, "Error in SplitCompat emulation.");
        hashMap.put(-13, "Error in copying files for SplitCompat.");
        hashMap.put(-14, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        hashMap.put(-100, "Unknown error processing split install.");
        hashMap2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        hashMap2.put(-2, "MODULE_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(-4, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(-6, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        hashMap2.put(-9, "SERVICE_DIED");
        hashMap2.put(-10, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        hashMap2.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        hashMap2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        hashMap2.put(-14, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-15, "APP_NOT_OWNED");
        hashMap2.put(-100, "INTERNAL_ERROR");
        for (Map.Entry entry : hashMap2.entrySet()) {
            f117798c.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }

    /* renamed from: a */
    public static int m80305a(String str) {
        Integer num = (Integer) f117798c.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" is unknown error."));
    }
}
