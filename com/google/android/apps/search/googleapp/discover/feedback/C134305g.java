package com.google.android.apps.search.googleapp.discover.feedback;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.g */
/* compiled from: PG */
public final class C134305g implements C47388b {

    /* renamed from: a */
    public final boolean f365829a;

    public C134305g(boolean z) {
        this.f365829a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134305g) && this.f365829a == ((C134305g) obj).f365829a;
    }

    public final int hashCode() {
        return this.f365829a ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f365829a;
        return "LogConsentDialogEvent(consentAccepted=" + z + ")";
    }
}
