package com.google.android.apps.gsa.shared.speech;

import com.google.common.base.C58833ax;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.shared.speech.b */
/* compiled from: PG */
public final class C90530b extends C90606n {

    /* renamed from: a */
    public final C63088z f253083a;

    /* renamed from: b */
    public final C58833ax f253084b;

    public C90530b(C63088z zVar, C58833ax axVar) {
        if (zVar != null) {
            this.f253083a = zVar;
            this.f253084b = axVar;
            return;
        }
        throw new NullPointerException("Null audioBytes");
    }

    /* renamed from: a */
    public final C58833ax mo84645a() {
        return this.f253084b;
    }

    /* renamed from: b */
    public final C63088z mo84646b() {
        return this.f253083a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C90606n) {
            C90606n nVar = (C90606n) obj;
            return this.f253083a.equals(nVar.mo84646b()) && this.f253084b.equals(nVar.mo84645a());
        }
    }

    public final int hashCode() {
        return ((this.f253083a.hashCode() ^ 1000003) * 1000003) ^ this.f253084b.hashCode();
    }

    public final String toString() {
        String obj = this.f253083a.toString();
        String obj2 = this.f253084b.toString();
        return "S3SynthesizedTtsResult{audioBytes=" + obj + ", ttsTimepoints=" + obj2 + "}";
    }
}
