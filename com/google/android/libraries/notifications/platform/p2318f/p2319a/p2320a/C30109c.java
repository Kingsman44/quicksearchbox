package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a;

import com.google.android.gms.auth.UserRecoverableAuthException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.c */
/* compiled from: PG */
public final class C30109c extends C30112f {

    /* renamed from: a */
    public final UserRecoverableAuthException f81456a;

    public C30109c(UserRecoverableAuthException userRecoverableAuthException) {
        this.f81456a = userRecoverableAuthException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30109c) && C69664n.m101066l(this.f81456a, ((C30109c) obj).f81456a);
    }

    public final int hashCode() {
        return this.f81456a.hashCode();
    }

    public final String toString() {
        UserRecoverableAuthException userRecoverableAuthException = this.f81456a;
        return "RecoverableFailure(cause=" + userRecoverableAuthException + ")";
    }
}
