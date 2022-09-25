package com.google.android.apps.gsa.notificationlistener;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.notificationlistener.b */
/* compiled from: PG */
final class C83385b extends C83405u {

    /* renamed from: b */
    private final C58485gu f227267b;

    public C83385b(C58485gu guVar) {
        this.f227267b = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo76685a() {
        return this.f227267b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83405u) {
            return C58597ky.m90218i(this.f227267b, ((C83405u) obj).mo76685a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f227267b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f227267b);
        return "NotificationFilter{filters=" + valueOf + "}";
    }
}
