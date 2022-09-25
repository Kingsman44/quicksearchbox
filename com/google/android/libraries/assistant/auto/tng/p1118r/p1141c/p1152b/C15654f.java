package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.b.f */
/* compiled from: PG */
public final class C15654f extends C15661m {

    /* renamed from: a */
    public C15663o f46775a;

    /* renamed from: b */
    public C15664p f46776b;

    /* renamed from: c */
    public C15660l f46777c;

    /* renamed from: d */
    public C60870cx f46778d;

    /* renamed from: e */
    public int f46779e;

    /* renamed from: a */
    public final C15666r mo22474a() {
        C15664p pVar;
        C15660l lVar;
        int i;
        C60870cx cxVar;
        C15663o oVar = this.f46775a;
        if (oVar != null && (pVar = this.f46776b) != null && (lVar = this.f46777c) != null && (i = this.f46779e) != 0 && (cxVar = this.f46778d) != null) {
            return new C15655g(oVar, pVar, lVar, i, cxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f46775a == null) {
            sb.append(" nluResult");
        }
        if (this.f46776b == null) {
            sb.append(" queryInfo");
        }
        if (this.f46777c == null) {
            sb.append(" accountInfo");
        }
        if (this.f46779e == 0) {
            sb.append(" vertical");
        }
        if (this.f46778d == null) {
            sb.append(" deviceCapabilitiesOptionalFuture");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
