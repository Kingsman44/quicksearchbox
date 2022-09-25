package com.facebook.litho.p329g;

import com.facebook.litho.C6103an;
import com.facebook.litho.C6106aq;
import com.facebook.litho.C6145bz;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6242ep;
import com.facebook.litho.C6279fv;
import com.facebook.litho.C6411u;

/* renamed from: com.facebook.litho.g.p */
/* compiled from: PG */
public class C6337p implements C6145bz {
    /* renamed from: m */
    public static void m17002m(C6336o oVar, int i) {
        C6154cb cbVar;
        C6335n n = oVar.mo13351n();
        if (n == null) {
            cbVar = null;
        } else {
            while (true) {
                C6335n nVar = n.f18730a;
                if (nVar == null) {
                    break;
                }
                C6154cb cbVar2 = n.f18733d;
                n = nVar;
            }
            cbVar = oVar.f18744n;
        }
        if (cbVar != null) {
            C6332k kVar = new C6332k();
            kVar.f18726a = false;
            kVar.f18727b = i;
            cbVar.mo13111fD(kVar);
        }
    }

    /* renamed from: o */
    protected static C6154cb m17003o(Class cls, C6336o oVar, int i, Object[] objArr) {
        if (oVar == null || oVar.mo13351n() == null) {
            C6106aq.m15891b(3, "SectionContext:NoScopeEventHandler", "Creating event handler without scope.");
            return C6242ep.f18460a;
        }
        if (oVar.mo13351n().getClass() != cls) {
            C6106aq.m15891b(2, "SectionLifecycle:WrongContextForEventHandler:".concat(oVar.mo13351n().f18735f), String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a SectionContext from its Section.", new Object[]{"DataDrivenCollectionSection", oVar.mo13351n().f18735f}));
        }
        C6335n nVar = (C6335n) oVar.f18743m.get();
        if (nVar != null) {
            C6154cb cbVar = new C6154cb(nVar, i, objArr);
            C6346y yVar = oVar.f18742l;
            if (yVar != null) {
                yVar.f18775h.mo13140d(oVar.mo13351n().f18740k, cbVar);
            }
            return cbVar;
        }
        throw new IllegalStateException("Called newEventHandler on a released Section");
    }

    /* renamed from: q */
    static final boolean m17004q(C6335n nVar, C6335n nVar2) {
        C6279fv fvVar;
        if (nVar2 != null && nVar2.f18731b) {
            return true;
        }
        if (nVar == nVar2) {
            return false;
        }
        if (nVar == null) {
            return true;
        }
        C6279fv fvVar2 = nVar.f18736g;
        if (nVar2 == null) {
            fvVar = null;
        } else {
            fvVar = nVar2.f18736g;
        }
        return !nVar.mo13290f(nVar2) || !C6103an.m15880g(fvVar2, fvVar);
    }

    /* renamed from: N */
    public final Object mo12795N(C6154cb cbVar, Object obj) {
        try {
            return mo13353h(cbVar, obj);
        } catch (Exception e) {
            Object[] objArr = cbVar.f18199d;
            if (objArr != null) {
                Object obj2 = objArr[0];
                if (obj2 instanceof C6411u) {
                    throw C6103an.m15874a((C6411u) obj2, e);
                }
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C6330i mo13352g(C6336o oVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Object mo13353h(C6154cb cbVar, Object obj) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo13354i(C6336o oVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo13355j(C6279fv fvVar, C6279fv fvVar2) {
    }

    /* renamed from: k */
    public boolean mo13291k() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo13292n(C6336o oVar, C6326e eVar, C6335n nVar, C6335n nVar2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo13356p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo13357r(int i, int i2) {
    }
}
