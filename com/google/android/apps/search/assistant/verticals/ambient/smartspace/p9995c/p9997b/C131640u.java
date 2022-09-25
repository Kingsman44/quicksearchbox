package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.u */
/* compiled from: PG */
final class C131640u implements C131638s {

    /* renamed from: a */
    public final Throwable f359681a;

    public /* synthetic */ C131640u(Throwable th) {
        this.f359681a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C131640u) && C69664n.m101066l(this.f359681a, ((C131640u) obj).f359681a);
    }

    public final int hashCode() {
        Throwable th = this.f359681a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        Throwable th = this.f359681a;
        return "Disconnected(error=" + th + ")";
    }
}
