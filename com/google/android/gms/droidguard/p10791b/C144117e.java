package com.google.android.gms.droidguard.p10791b;

import android.os.Build;
import android.util.Log;
import java.util.Locale;
import p3186j$.nio.charset.StandardCharsets;
import p5304e.p5305a.p5306a.p5390n.p5399e.p5400a.C68853g;

/* renamed from: com.google.android.gms.droidguard.b.e */
/* compiled from: PG */
public final class C144117e {
    /* renamed from: a */
    public static byte[] m234325a(String str, int i, Throwable th) {
        String concat = "ERROR : ".concat(str);
        if (C68853g.f185058a.mo6453a().mo60653c()) {
            concat = concat.concat(String.valueOf(String.format(Locale.US, "\nAPI_LEVEL: %d\nGMSCORE_VERSION: %s", new Object[]{Integer.valueOf(i), "22.38.10-000"})));
        }
        if (C68853g.f185058a.mo6453a().mo60652b() && th != null) {
            concat = concat.concat(String.valueOf(String.format(Locale.US, "\nEXCEPTION: %s\nSTACK_TRACE: %s", new Object[]{th, Log.getStackTraceString(th)})));
        }
        if (C68853g.f185058a.mo6453a().mo60651a()) {
            concat = concat.concat(String.valueOf(String.format(Locale.US, "\nBuild.FINGERPRINT: %s", new Object[]{Build.FINGERPRINT})));
        }
        return concat.getBytes(StandardCharsets.UTF_8);
    }
}
