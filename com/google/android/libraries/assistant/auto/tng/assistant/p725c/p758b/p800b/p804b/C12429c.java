package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.b.c */
/* compiled from: PG */
final class C12429c extends C12433g {

    /* renamed from: a */
    private final C60870cx f39297a;

    public C12429c(C60870cx cxVar) {
        this.f39297a = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo20604a() {
        return this.f39297a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12433g) {
            return this.f39297a.equals(((C12433g) obj).mo20604a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f39297a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f39297a.toString();
        return "FollowOnInteractionData{deltaHandlingResult=" + obj + "}";
    }
}
