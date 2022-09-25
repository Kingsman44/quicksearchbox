package androidx.media3.p132b;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: androidx.media3.b.w */
/* compiled from: PG */
final class C2519w {
    /* renamed from: a */
    public static boolean m6645a(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
