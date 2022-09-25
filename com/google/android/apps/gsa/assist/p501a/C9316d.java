package com.google.android.apps.gsa.assist.p501a;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90077eb;

/* renamed from: com.google.android.apps.gsa.assist.a.d */
/* compiled from: PG */
public abstract class C9316d {

    /* renamed from: a */
    public static final C9316d f32330a;

    static {
        C9327o oVar = new C9327o();
        oVar.mo17509e(false);
        oVar.mo17510f(false);
        oVar.mo17511g(0);
        oVar.mo17512h(1);
        oVar.mo17506b(0);
        oVar.mo17513i(0);
        oVar.mo17507c(false);
        oVar.mo17508d(true);
        f32330a = oVar.mo17505a();
    }

    /* renamed from: e */
    public static C9316d m23756e(C90021c cVar, C9318f fVar, boolean z) {
        long j;
        long j2;
        int i;
        long j3;
        boolean b = C9324l.m23780b(fVar);
        C9327o oVar = new C9327o();
        oVar.mo17509e(b);
        boolean z2 = true;
        oVar.mo17510f(fVar == C9318f.LIGHTWEIGHT);
        if (C9324l.m23780b(fVar)) {
            j = cVar.mo79743a(C90077eb.f249794h);
        } else {
            j = cVar.mo79743a(C90077eb.f249788b);
        }
        oVar.mo17511g((int) j);
        if (C9324l.m23780b(fVar)) {
            j2 = cVar.mo79743a(C90077eb.f249795i);
        } else {
            j2 = cVar.mo79743a(C90077eb.f249790d);
        }
        oVar.mo17512h((int) j2);
        int i2 = Integer.MAX_VALUE;
        if (fVar == C9318f.VOICE) {
            i = Integer.MAX_VALUE;
        } else {
            i = (int) cVar.mo79743a(C90077eb.f249787a);
        }
        oVar.mo17506b(i);
        if (fVar != C9318f.VOICE) {
            if (C9324l.m23780b(fVar)) {
                j3 = cVar.mo79743a(C90077eb.f249796j);
            } else {
                j3 = cVar.mo79743a(C90077eb.f249791e);
            }
            i2 = (int) j3;
        }
        oVar.mo17513i(i2);
        oVar.mo17507c(z);
        if (fVar == C9318f.LIGHTWEIGHT) {
            z2 = false;
        }
        oVar.mo17508d(z2);
        return oVar.mo17505a();
    }

    /* renamed from: a */
    public abstract int mo17514a();

    /* renamed from: b */
    public abstract int mo17515b();

    /* renamed from: c */
    public abstract int mo17516c();

    /* renamed from: d */
    public abstract int mo17517d();

    /* renamed from: f */
    public abstract boolean mo17518f();

    /* renamed from: g */
    public abstract boolean mo17519g();

    /* renamed from: h */
    public abstract boolean mo17520h();

    /* renamed from: i */
    public abstract boolean mo17521i();
}
