package com.google.android.libraries.gsa.conversation.p1852f;

import com.google.common.base.C58833ax;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.gsa.conversation.f.c */
/* compiled from: PG */
final class C22576c extends C22587n {

    /* renamed from: a */
    private final C63088z f62212a;

    /* renamed from: b */
    private final C58833ax f62213b;

    public C22576c(C63088z zVar, C58833ax axVar) {
        if (zVar != null) {
            this.f62212a = zVar;
            this.f62213b = axVar;
            return;
        }
        throw new NullPointerException("Null audioBytes");
    }

    /* renamed from: a */
    public final C58833ax mo27671a() {
        return this.f62213b;
    }

    /* renamed from: b */
    public final C63088z mo27672b() {
        return this.f62212a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22587n) {
            C22587n nVar = (C22587n) obj;
            return this.f62212a.equals(nVar.mo27672b()) && this.f62213b.equals(nVar.mo27671a());
        }
    }

    public final int hashCode() {
        return ((this.f62212a.hashCode() ^ 1000003) * 1000003) ^ this.f62213b.hashCode();
    }

    public final String toString() {
        String obj = this.f62212a.toString();
        String obj2 = this.f62213b.toString();
        return "SynthesizedTtsResult{audioBytes=" + obj + ", ttsTimepoints=" + obj2 + "}";
    }
}
