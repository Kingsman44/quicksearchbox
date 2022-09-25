package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.v */
/* compiled from: PG */
final class C78496v extends C78464ef {

    /* renamed from: a */
    private final boolean f216179a;

    /* renamed from: b */
    private final boolean f216180b;

    /* renamed from: c */
    private final C78391bn f216181c;

    public C78496v(boolean z, boolean z2, C78391bn bnVar) {
        this.f216179a = z;
        this.f216180b = z2;
        this.f216181c = bnVar;
    }

    /* renamed from: a */
    public final C78391bn mo73384a() {
        return this.f216181c;
    }

    /* renamed from: b */
    public final boolean mo73385b() {
        return this.f216180b;
    }

    /* renamed from: c */
    public final boolean mo73386c() {
        return this.f216179a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78464ef) {
            C78464ef efVar = (C78464ef) obj;
            return this.f216179a == efVar.mo73386c() && this.f216180b == efVar.mo73385b() && this.f216181c.equals(efVar.mo73384a());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f216179a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f216180b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.f216181c.hashCode();
    }

    public final String toString() {
        boolean z = this.f216179a;
        boolean z2 = this.f216180b;
        String obj = this.f216181c.toString();
        return "PreInvocationStageInput{shouldFetchContent=" + z + ", proceedToNotListeningStage=" + z2 + ", baseStageInput=" + obj + "}";
    }
}
