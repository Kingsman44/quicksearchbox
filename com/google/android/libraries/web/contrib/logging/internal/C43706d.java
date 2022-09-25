package com.google.android.libraries.web.contrib.logging.internal;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.contrib.logging.C43693a;
import com.google.android.libraries.web.contrib.logging.C43695c;
import com.google.android.libraries.web.contrib.logging.C43696d;
import com.google.android.libraries.web.contrib.logging.C43699g;
import com.google.android.libraries.web.contrib.logging.C43700h;
import com.google.android.libraries.web.contrib.logging.C43712o;
import com.google.android.libraries.web.contrib.logging.C43713p;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3355b.C43324a;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.libraries.web.contrib.logging.internal.d */
/* compiled from: PG */
public final class C43706d implements C43324a {

    /* renamed from: a */
    public C43703a f114016a;

    /* renamed from: b */
    private final C43712o f114017b;

    public C43706d(C43712o oVar) {
        this.f114017b = oVar;
    }

    /* renamed from: a */
    public final void mo46422a(String str) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.f114011a.mo32324b(str, aVar.f114013c);
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: b */
    public final void mo46423b(String str) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.f114011a.mo32325c(str, aVar.f114013c);
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: c */
    public final void mo46424c(String str) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.f114011a.mo32326d(str, aVar.f114013c);
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: d */
    public final void mo46425d(C43376u uVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null && aVar.mo46742c()) {
            aVar.f114014d = uVar;
            aVar.f114011a.mo32328f(uVar.f113329b, aVar.f114013c);
        }
    }

    /* renamed from: e */
    public final void mo46426e(C43376u uVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null && aVar.mo46742c()) {
            aVar.f114014d = uVar;
            C43713p pVar = aVar.f114011a;
            String str = uVar.f113329b;
            pVar.mo32333k();
        }
    }

    /* renamed from: f */
    public final void mo46427f(C43376u uVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.mo46741b(uVar);
        }
    }

    /* renamed from: g */
    public final void mo46428g(C43376u uVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null && aVar.mo46742c()) {
            if ((uVar.f113328a & 4) != 0) {
                C43363h hVar = uVar.f113331d;
                if (hVar == null) {
                    hVar = C43363h.f113275f;
                }
                hVar.getClass();
                aVar.f114011a.mo32327e(uVar.f113329b, new C43699g(hVar), aVar.f114013c);
            } else {
                aVar.f114011a.mo32330h(uVar.f113329b, uVar.f113334g, aVar.f114013c);
            }
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: h */
    public final void mo46429h(C43376u uVar) {
        if (uVar.f113335h == null) {
            C43367l lVar = C43367l.f113293h;
        }
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            C43367l lVar2 = uVar.f113335h;
            if (lVar2 == null) {
                lVar2 = C43367l.f113293h;
            }
            aVar.f114013c = lVar2;
            aVar.f114011a.mo32331i(aVar.f114013c);
        }
    }

    /* renamed from: i */
    public final void mo46430i(C43376u uVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.f114014d = uVar;
            C43713p pVar = aVar.f114011a;
            String str = uVar.f113329b;
            pVar.mo32332j();
        }
    }

    /* renamed from: j */
    public final void mo46431j(C43367l lVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.f114011a.mo32323a(lVar.f113296b, C43693a.f113998a, lVar);
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: k */
    public final void mo46432k(String str) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.f114011a.mo32323a(str, C43695c.f114000a, aVar.f114013c);
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: l */
    public final void mo46433l(C43367l lVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.f114013c = lVar;
        }
    }

    /* renamed from: m */
    public final void mo46434m(C43367l lVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.mo46740a(lVar);
        }
        C43713p a = this.f114017b.mo32339a(lVar);
        if (a != null) {
            C43703a aVar2 = new C43703a(a, lVar, new C43705c(this));
            this.f114016a = aVar2;
            aVar2.f114011a.mo32329g(aVar2.f114013c);
        }
    }

    /* renamed from: n */
    public final void mo46435n() {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.f114011a.mo32323a(BuildConfig.FLAVOR, C43696d.f114001a, aVar.f114013c);
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: o */
    public final void mo46436o(Throwable th) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            th.getClass();
            aVar.f114011a.mo32327e(BuildConfig.FLAVOR, new C43700h(th), aVar.f114013c);
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: p */
    public final void mo46437p() {
        C43703a aVar = this.f114016a;
        if (aVar != null && aVar.mo46742c()) {
            C43376u uVar = aVar.f114014d;
            C58893dc.m90996a(uVar);
            aVar.f114011a.mo32330h(uVar.f113329b, uVar.f113334g, aVar.f114013c);
            ((C43705c) aVar.f114012b).f114015a.f114016a = null;
        }
    }

    /* renamed from: q */
    public final void mo46438q(C43376u uVar) {
        C43703a aVar = this.f114016a;
        if (aVar != null) {
            aVar.mo46741b(uVar);
        }
    }
}
