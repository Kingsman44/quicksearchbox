package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.h */
/* compiled from: PG */
final class C16692h extends C16681an {

    /* renamed from: a */
    private final boolean f48858a;

    /* renamed from: b */
    private final boolean f48859b;

    /* renamed from: c */
    private final boolean f48860c;

    public C16692h(boolean z, boolean z2, boolean z3) {
        this.f48858a = z;
        this.f48859b = z2;
        this.f48860c = z3;
    }

    /* renamed from: a */
    public final boolean mo22970a() {
        return this.f48860c;
    }

    /* renamed from: b */
    public final boolean mo22971b() {
        return this.f48859b;
    }

    /* renamed from: c */
    public final boolean mo22972c() {
        return this.f48858a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16681an) {
            C16681an anVar = (C16681an) obj;
            return this.f48858a == anVar.mo22972c() && this.f48859b == anVar.mo22971b() && this.f48860c == anVar.mo22970a();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.f48858a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f48859b ? 1237 : 1231)) * 1000003;
        if (true == this.f48860c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.f48858a;
        boolean z2 = this.f48859b;
        boolean z3 = this.f48860c;
        return "ContactSelectedStage{isValidSendChange=" + z + ", isValidReply=" + z2 + ", hasSmartActions=" + z3 + "}";
    }
}
