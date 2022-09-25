package com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c;

import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.c.a */
/* compiled from: PG */
public final class C40108a extends C40111d {

    /* renamed from: a */
    public final C63088z f105349a;

    public C40108a(C63088z zVar) {
        if (zVar != null) {
            this.f105349a = zVar;
            return;
        }
        throw new NullPointerException("Null bubbleId");
    }

    /* renamed from: a */
    public final C63088z mo42184a() {
        return this.f105349a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40111d) {
            return this.f105349a.equals(((C40111d) obj).mo42184a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f105349a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f105349a.toString();
        return "BubbleId{bubbleId=" + obj + "}";
    }
}
