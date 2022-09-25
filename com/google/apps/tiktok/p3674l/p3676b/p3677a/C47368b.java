package com.google.apps.tiktok.p3674l.p3676b.p3677a;

import com.google.apps.tiktok.p3674l.p3676b.C47384n;
import java.util.logging.Level;
import org.chromium.net.NetworkException;

/* renamed from: com.google.apps.tiktok.l.b.a.b */
/* compiled from: PG */
public final class C47368b implements C47384n {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Level mo51240a(Throwable th) {
        int errorCode = ((NetworkException) th).getErrorCode();
        if (!(errorCode == 1 || errorCode == 2 || errorCode == 5)) {
            if (errorCode == 7) {
                return Level.WARNING;
            }
            if (errorCode != 8) {
                return Level.SEVERE;
            }
        }
        return Level.INFO;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo51241b(Throwable th) {
        NetworkException networkException = (NetworkException) th;
        return false;
    }
}
