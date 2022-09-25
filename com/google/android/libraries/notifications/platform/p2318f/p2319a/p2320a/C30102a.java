package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a;

import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.a */
/* compiled from: PG */
public final class C30102a {
    /* renamed from: a */
    public static final C30112f m55932a(Throwable th) {
        if (th instanceof UserRecoverableAuthException) {
            return new C30109c((UserRecoverableAuthException) th);
        }
        return th instanceof IOException ? new C30111e((IOException) th) : new C30108b(th);
    }
}
