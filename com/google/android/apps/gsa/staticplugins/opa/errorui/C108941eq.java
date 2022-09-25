package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.bq;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opaonboarding.C83870ad;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87567j;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109856c;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.eq */
/* compiled from: PG */
public final class C108941eq extends C83870ad implements C83904bj {

    /* renamed from: a */
    private final C108934ej f302941a;

    /* renamed from: b */
    private final C108938en f302942b;

    /* renamed from: c */
    private final Context f302943c;

    /* renamed from: d */
    private final C68214a f302944d;

    /* renamed from: e */
    private final C58833ax f302945e;

    /* renamed from: f */
    private final C58833ax f302946f;

    /* renamed from: g */
    private final C58833ax f302947g;

    /* renamed from: h */
    private final C68214a f302948h;

    /* renamed from: i */
    private final C113787bc f302949i;

    /* renamed from: j */
    private final C86124t f302950j;

    /* renamed from: k */
    private final C58881cr f302951k;

    /* renamed from: l */
    private final C68214a f302952l;

    /* renamed from: m */
    private StartupConfig f302953m;

    /* renamed from: n */
    private C83907bm f302954n;

    /* renamed from: o */
    private boolean f302955o;

    /* renamed from: p */
    private boolean f302956p;

    public C108941eq(StartupConfig startupConfig, C108934ej ejVar, C108938en enVar, Context context, C68214a aVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C68214a aVar2, C113787bc bcVar, C86124t tVar, C58881cr crVar, C68214a aVar3) {
        this.f302953m = startupConfig;
        this.f302941a = ejVar;
        this.f302942b = enVar;
        this.f302943c = context;
        this.f302944d = aVar;
        this.f302945e = axVar;
        this.f302946f = axVar2;
        this.f302947g = axVar3;
        this.f302948h = aVar2;
        this.f302949i = bcVar;
        this.f302950j = tVar;
        this.f302951k = crVar;
        this.f302952l = aVar3;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        if (!this.f302956p) {
            if (!((Boolean) this.f302951k.mo6453a()).booleanValue() || !this.f302953m.mo97188g()) {
                int a = (!this.f302953m.mo97188g() || C87566i.m142274aV(this.f302953m.mo97184c()) == null) ? 2 : C87567j.m142328a(this.f302953m.mo97184c());
                if (!C87566i.m142270aR(this.f302953m.mo97184c()) || !this.f302950j.mo79746e(C90014bt.f247287eM)) {
                    C87565h hVar = new C87565h(this.f302953m.mo97184c());
                    hVar.f236560f = a;
                    hVar.f236519W = C87566i.m142270aR(this.f302953m.mo97184c());
                    hVar.f236564j = this.f302953m.mo97189h();
                    hVar.f236513Q = true;
                    Bundle a2 = hVar.mo81685a();
                    C58833ax axVar = this.f302946f;
                    if (!axVar.mo56113h() || !((C74720bx) axVar.mo56107c()).mo71089f().b()) {
                        ((C87568k) this.f302945e.mo56107c()).mo81688b(this.f302943c, a2);
                    } else {
                        ((bq) this.f302947g.mo56107c()).p(a2.getString("source", "One off restart"));
                    }
                } else {
                    Context context = this.f302943c;
                    C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
                    hwVar.copyOnWrite();
                    C53287ih ihVar = (C53287ih) hwVar.instance;
                    ihVar.f139698d = 2;
                    ihVar.f139695a = 1 | ihVar.f139695a;
                    hwVar.copyOnWrite();
                    C53287ih ihVar2 = (C53287ih) hwVar.instance;
                    ihVar2.f139702h = 17;
                    ihVar2.f139695a |= 64;
                    hwVar.copyOnWrite();
                    C53287ih ihVar3 = (C53287ih) hwVar.instance;
                    ihVar3.f139703i = 44;
                    ihVar3.f139695a |= 128;
                    ((C87571n) this.f302948h.mo27525b()).mo81698j(context, (C53287ih) hwVar.build());
                }
            } else {
                C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
                e eVar = e.p;
                abVar.copyOnWrite();
                C83614ac acVar = (C83614ac) abVar.instance;
                acVar.f227955c = eVar.ca;
                acVar.f227953a = 2 | acVar.f227953a;
                abVar.copyOnWrite();
                C83614ac acVar2 = (C83614ac) abVar.instance;
                acVar2.f227954b = 1;
                acVar2.f227953a = 1 | acVar2.f227953a;
                ((C107759j) this.f302952l.mo27525b()).mo96272h((C83614ac) abVar.build());
            }
            ((C89859i) this.f302944d.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_RELAUNCH_FROM_ERROR);
        }
        return C83903bi.m133649e(-1, (Intent) null);
    }

    /* renamed from: c */
    public final C58833ax mo77209c() {
        C83907bm bmVar = this.f302954n;
        if (bmVar instanceof C109856c) {
            this.f302955o = ((C109856c) bmVar).f306100h == 3;
        }
        if (bmVar instanceof C108836at) {
            this.f302956p = ((C108836at) bmVar).f302615b;
        } else if (bmVar instanceof C108988i) {
            this.f302956p = ((C108988i) bmVar).f303065b;
        } else if (bmVar instanceof C108998s) {
            this.f302956p = ((C108998s) bmVar).f303090b;
        }
        C58833ax c = super.mo77209c();
        this.f302954n = (C83907bm) c.mo56111f();
        return c;
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return C83903bi.m133649e(1, (Intent) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        if (this.f302954n != null) {
            C108940ep e = this.f302953m.mo97185e();
            if (this.f302954n instanceof C108849bf) {
                e.mo97297d(true);
            }
            if (this.f302955o && this.f302953m.mo97188g()) {
                Bundle c = this.f302953m.mo97184c();
                if (c != null) {
                    c.remove("client_input");
                    c.remove("opa_start_full_screen");
                }
                e.mo97298e(c);
                if (this.f302950j.mo79746e(C90014bt.f247701mC)) {
                    e.mo97296c(false);
                }
            }
            this.f302953m = e.mo97294a();
        }
        if (this.f302950j.mo79746e(C90037cp.f248583da) && (this.f302954n instanceof C108988i)) {
            return C58836b.f156633a;
        }
        if (this.f302950j.mo79746e(C90037cp.f248574cw) && (this.f302954n instanceof C108998s)) {
            return C58836b.f156633a;
        }
        C58833ax a = this.f302941a.mo97284a(this.f302953m);
        if (a.mo56113h()) {
            C83956t a2 = this.f302942b.mo97291a(this.f302953m, (C108936el) a.mo56107c());
            if (((C108936el) a.mo56107c()) == C108936el.OMNICONSENT_REQUIRED && this.f302953m.mo97187f()) {
                C108940ep e2 = this.f302953m.mo97185e();
                e2.mo97295b(false);
                this.f302953m = e2.mo97294a();
            }
            return C58833ax.m90834k(a2);
        }
        if (this.f302953m.mo97188g()) {
            this.f302949i.mo100625e();
        }
        return C58836b.f156633a;
    }
}
