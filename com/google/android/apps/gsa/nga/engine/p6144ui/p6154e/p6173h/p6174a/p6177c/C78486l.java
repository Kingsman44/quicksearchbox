package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.l */
/* compiled from: PG */
final class C78486l extends C78380bc {

    /* renamed from: a */
    private final Optional f216148a;

    /* renamed from: b */
    private final C78391bn f216149b;

    public C78486l(Optional optional, C78391bn bnVar) {
        this.f216148a = optional;
        this.f216149b = bnVar;
    }

    /* renamed from: a */
    public final C78391bn mo73320a() {
        return this.f216149b;
    }

    /* renamed from: b */
    public final Optional mo73321b() {
        return this.f216148a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78380bc) {
            C78380bc bcVar = (C78380bc) obj;
            return this.f216148a.equals(bcVar.mo73321b()) && this.f216149b.equals(bcVar.mo73320a());
        }
    }

    public final int hashCode() {
        return ((this.f216148a.hashCode() ^ 1000003) * 1000003) ^ this.f216149b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f216148a);
        String obj = this.f216149b.toString();
        return "ExecutingStageInput{lastTranscriptionChangeInstant=" + valueOf + ", baseStageInput=" + obj + "}";
    }
}
