package com.google.apps.tiktok.p3633d.p3634a;

import com.google.protobuf.C63088z;

/* renamed from: com.google.apps.tiktok.d.a.a */
/* compiled from: PG */
public final class C46663a extends C46668f {

    /* renamed from: a */
    public C63088z f121916a;

    /* renamed from: b */
    private C46667e f121917b;

    /* renamed from: c */
    private boolean f121918c;

    /* renamed from: d */
    private byte f121919d;

    /* renamed from: a */
    public final C46669g mo50683a() {
        C63088z zVar;
        C46667e eVar;
        if (this.f121919d == 1 && (zVar = this.f121916a) != null && (eVar = this.f121917b) != null) {
            return new C46664b(zVar, eVar, this.f121918c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f121916a == null) {
            sb.append(" data");
        }
        if (this.f121917b == null) {
            sb.append(" type");
        }
        if (this.f121919d == 0) {
            sb.append(" containsPii");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo50684b(boolean z) {
        this.f121918c = z;
        this.f121919d = 1;
    }

    /* renamed from: c */
    public final void mo50685c(C63088z zVar) {
        if (zVar != null) {
            this.f121916a = zVar;
            return;
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: d */
    public final void mo50686d(C46667e eVar) {
        if (eVar != null) {
            this.f121917b = eVar;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
