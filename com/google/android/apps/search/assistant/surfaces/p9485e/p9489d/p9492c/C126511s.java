package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c;

import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.c.s */
/* compiled from: PG */
final class C126511s extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C69644aa f348422a;

    /* renamed from: b */
    final /* synthetic */ StringBuilder f348423b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126511s(C69644aa aaVar, StringBuilder sb) {
        super(0);
        this.f348422a = aaVar;
        this.f348423b = sb;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        if (this.f348422a.f186023a) {
            return C69764m.m101188E(this.f348423b.toString(), new String[]{"\r\n"});
        }
        throw new IllegalStateException("Attempting streaming headers without headers being complete");
    }
}
