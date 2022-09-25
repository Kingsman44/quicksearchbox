package com.google.android.libraries.search.p2871b.p2902o;

import com.google.android.libraries.search.p2871b.p2890e.C37234c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.b.o.d */
/* compiled from: PG */
public final class C37311d extends C37306a {

    /* renamed from: a */
    public C58528ij f99135a;

    /* renamed from: b */
    private C71189f f99136b;

    /* renamed from: c */
    private C37234c f99137c;

    /* renamed from: d */
    private boolean f99138d;

    /* renamed from: e */
    private byte f99139e;

    /* renamed from: a */
    public final C37309b mo40852a() {
        C71189f fVar;
        C58528ij ijVar;
        C37234c cVar;
        if (this.f99139e == 1 && (fVar = this.f99136b) != null && (ijVar = this.f99135a) != null && (cVar = this.f99137c) != null) {
            return new C37312e(fVar, ijVar, cVar, this.f99138d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f99136b == null) {
            sb.append(" appFlow");
        }
        if (this.f99135a == null) {
            sb.append(" testCodes");
        }
        if (this.f99137c == null) {
            sb.append(" appFlowType");
        }
        if (this.f99139e == 0) {
            sb.append(" sampledOut");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final C58833ax mo40854c() {
        C71189f fVar = this.f99136b;
        return fVar == null ? C58836b.f156633a : C58833ax.m90834k(fVar);
    }

    /* renamed from: d */
    public final void mo40855d(C71189f fVar) {
        if (fVar != null) {
            this.f99136b = fVar;
            return;
        }
        throw new NullPointerException("Null appFlow");
    }

    /* renamed from: e */
    public final void mo40856e(C37234c cVar) {
        if (cVar != null) {
            this.f99137c = cVar;
            return;
        }
        throw new NullPointerException("Null appFlowType");
    }

    /* renamed from: f */
    public final void mo40857f(boolean z) {
        this.f99138d = z;
        this.f99139e = 1;
    }
}
