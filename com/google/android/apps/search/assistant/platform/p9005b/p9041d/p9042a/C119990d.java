package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.d */
/* compiled from: PG */
public final class C119990d extends C119981bh {

    /* renamed from: a */
    public final C119789ak f334111a;

    /* renamed from: b */
    public final C70862aj f334112b;

    public C119990d(C119789ak akVar, C70862aj ajVar) {
        if (akVar != null) {
            this.f334111a = akVar;
            this.f334112b = ajVar;
            return;
        }
        throw new NullPointerException("Null clientConfiguration");
    }

    /* renamed from: a */
    public final C119789ak mo104599a() {
        return this.f334111a;
    }

    /* renamed from: b */
    public final C70862aj mo104600b() {
        return this.f334112b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C119981bh) {
            C119981bh bhVar = (C119981bh) obj;
            return this.f334111a.equals(bhVar.mo104599a()) && this.f334112b.equals(bhVar.mo104600b());
        }
    }

    public final int hashCode() {
        return ((this.f334111a.hashCode() ^ 1000003) * 1000003) ^ this.f334112b.hashCode();
    }

    public final String toString() {
        String obj = this.f334111a.toString();
        String obj2 = this.f334112b.toString();
        return "InternalConfigurationArgs{clientConfiguration=" + obj + ", platformToClientStreamObserver=" + obj2 + "}";
    }
}
