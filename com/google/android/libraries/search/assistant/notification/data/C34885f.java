package com.google.android.libraries.search.assistant.notification.data;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.f */
/* compiled from: PG */
public final class C34885f extends C34890k {

    /* renamed from: a */
    private final C58485gu f92548a;

    public C34885f(C58485gu guVar) {
        if (guVar != null) {
            this.f92548a = guVar;
            return;
        }
        throw new NullPointerException("Null notifications");
    }

    /* renamed from: a */
    public final C58485gu mo39602a() {
        return this.f92548a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34890k) {
            return C58597ky.m90218i(this.f92548a, ((C34890k) obj).mo39602a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f92548a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f92548a.toString();
        return "BundledMessageNotificationSnapshot{notifications=" + obj + "}";
    }
}
