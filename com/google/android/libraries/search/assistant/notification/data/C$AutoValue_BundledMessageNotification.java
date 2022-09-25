package com.google.android.libraries.search.assistant.notification.data;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.$AutoValue_BundledMessageNotification  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_BundledMessageNotification extends BundledMessageNotification {

    /* renamed from: a */
    public final C58485gu f92469a;

    public C$AutoValue_BundledMessageNotification(C58485gu guVar) {
        if (guVar != null) {
            this.f92469a = guVar;
            return;
        }
        throw new NullPointerException("Null notifications");
    }

    /* renamed from: a */
    public final C58485gu mo39538a() {
        return this.f92469a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BundledMessageNotification) {
            return C58597ky.m90218i(this.f92469a, ((BundledMessageNotification) obj).mo39538a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f92469a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f92469a.toString();
        return "BundledMessageNotification{notifications=" + obj + "}";
    }
}
