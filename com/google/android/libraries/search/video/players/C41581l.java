package com.google.android.libraries.search.video.players;

import android.view.ViewGroup;
import com.google.android.libraries.search.video.conductor.C41478a;
import com.google.android.libraries.search.video.lightbox.C41533l;
import com.google.android.libraries.search.video.p3191a.C41452k;
import com.google.android.libraries.search.video.p3195e.C41506e;
import com.google.android.libraries.search.video.thirdparty.C41607i;
import com.google.common.p4522b.C58557jl;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57181l;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57189t;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57190u;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.players.l */
/* compiled from: PG */
public final class C41581l implements C41592w {

    /* renamed from: a */
    final C41586q f108698a;

    /* renamed from: b */
    public final String f108699b;

    /* renamed from: c */
    public final Optional f108700c;

    public C41581l(C41587r rVar, ViewGroup viewGroup, C57194y yVar, Duration duration, C41452k kVar, boolean z, String str, Optional optional) {
        C57190u uVar;
        boolean z2;
        C57190u uVar2;
        boolean z3;
        C57190u uVar3;
        boolean z4;
        C57190u uVar4;
        C57190u uVar5;
        Optional of;
        C57190u uVar6;
        Optional optional2;
        C57190u uVar7;
        C57190u uVar8;
        C57190u uVar9;
        C57194y yVar2 = yVar;
        if (yVar2.f152695b == 2) {
            uVar = (C57190u) yVar2.f152696c;
        } else {
            uVar = C57190u.f152680g;
        }
        if ((uVar.f152682a & 8) != 0) {
            if (yVar2.f152695b == 2) {
                uVar9 = (C57190u) yVar2.f152696c;
            } else {
                uVar9 = C57190u.f152680g;
            }
            C57189t tVar = uVar9.f152687f;
            z2 = (tVar == null ? C57189t.f152674d : tVar).f152676a;
        } else {
            z2 = !z;
        }
        int i = yVar2.f152695b;
        if (i == 2) {
            uVar2 = (C57190u) yVar2.f152696c;
        } else {
            uVar2 = C57190u.f152680g;
        }
        if ((uVar2.f152682a & 8) != 0) {
            if (i == 2) {
                uVar8 = (C57190u) yVar2.f152696c;
            } else {
                uVar8 = C57190u.f152680g;
            }
            C57189t tVar2 = uVar8.f152687f;
            z3 = (tVar2 == null ? C57189t.f152674d : tVar2).f152677b;
        } else {
            z3 = z;
        }
        int i2 = yVar2.f152695b;
        if (i2 == 2) {
            uVar3 = (C57190u) yVar2.f152696c;
        } else {
            uVar3 = C57190u.f152680g;
        }
        if ((uVar3.f152682a & 8) != 0) {
            if (i2 == 2) {
                uVar7 = (C57190u) yVar2.f152696c;
            } else {
                uVar7 = C57190u.f152680g;
            }
            C57189t tVar3 = uVar7.f152687f;
            z4 = (tVar3 == null ? C57189t.f152674d : tVar3).f152678c;
        } else {
            z4 = z;
        }
        C41580k kVar2 = new C41580k(this);
        int i3 = yVar2.f152695b;
        if (i3 == 2) {
            uVar4 = (C57190u) yVar2.f152696c;
        } else {
            uVar4 = C57190u.f152680g;
        }
        String str2 = uVar4.f152683b;
        float f = yVar2.f152697d;
        if (z) {
            of = Optional.empty();
        } else {
            if (i3 == 2) {
                uVar5 = (C57190u) yVar2.f152696c;
            } else {
                uVar5 = C57190u.f152680g;
            }
            String str3 = uVar5.f152685d;
            of = !str3.isEmpty() ? Optional.m71637of(str3) : Optional.empty();
        }
        Optional optional3 = of;
        if (yVar2.f152695b == 2) {
            uVar6 = (C57190u) yVar2.f152696c;
        } else {
            uVar6 = C57190u.f152680g;
        }
        C57181l lVar = (C57181l) C58557jl.m90130k(uVar6.f152684c, (Object) null);
        if (lVar == null || lVar.f152662b.isEmpty()) {
            optional2 = Optional.empty();
        } else {
            optional2 = Optional.m71637of(lVar);
        }
        C41567b bVar = new C41567b(str2, duration, z, f, optional3, optional2, z2, z4, z3);
        C41587r rVar2 = rVar;
        ViewGroup viewGroup2 = viewGroup;
        this.f108698a = rVar.mo44152a(kVar2, viewGroup, bVar, kVar);
        this.f108699b = str;
        this.f108700c = optional;
    }

    /* renamed from: a */
    public final void mo43993a(C41478a aVar) {
        this.f108698a.mo44140f();
    }

    /* renamed from: b */
    public final void mo43994b(C41478a aVar) {
        this.f108698a.mo44150p();
    }

    /* renamed from: e */
    public final Duration mo44082e() {
        return this.f108698a.mo44135a();
    }

    /* renamed from: f */
    public final Optional mo44083f() {
        return this.f108698a.mo44136b();
    }

    /* renamed from: g */
    public final void mo44084g(C41590u uVar) {
        this.f108698a.mo44137c(uVar);
    }

    /* renamed from: h */
    public final void mo44085h(C41591v vVar) {
        this.f108698a.mo44138d(vVar);
    }

    /* renamed from: i */
    public final void mo44086i() {
        this.f108698a.mo44139e();
    }

    /* renamed from: j */
    public final void mo44087j() {
        this.f108698a.mo44140f();
    }

    /* renamed from: k */
    public final void mo44088k() {
        this.f108698a.mo44141h();
    }

    /* renamed from: l */
    public final void mo44089l(C41591v vVar) {
        this.f108698a.mo44146l(vVar);
    }

    /* renamed from: m */
    public final void mo44090m(Duration duration) {
        C41607i iVar = this.f108698a.f108708b;
        if (iVar != null) {
            iVar.mo44174H(duration);
        }
    }

    /* renamed from: n */
    public final void mo44091n(boolean z) {
        this.f108698a.mo44147m(z);
    }

    /* renamed from: o */
    public final void mo44092o() {
        this.f108698a.mo44148n();
    }

    /* renamed from: p */
    public final /* synthetic */ void mo44093p() {
    }

    /* renamed from: q */
    public final int mo44094q() {
        return this.f108698a.f108709c;
    }

    /* renamed from: r */
    public final void mo44095r(C41533l lVar) {
        this.f108698a.f108711e = lVar;
    }

    /* renamed from: s */
    public final C41506e mo43990s() {
        return this.f108698a.mo44151q();
    }
}
