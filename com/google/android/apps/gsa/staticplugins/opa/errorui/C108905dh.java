package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109856c;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.dh */
/* compiled from: PG */
public final class C108905dh extends C83870ad implements C83904bj {

    /* renamed from: a */
    private final C108934ej f302794a;

    /* renamed from: b */
    private final C108938en f302795b;

    /* renamed from: c */
    private final Context f302796c;

    /* renamed from: d */
    private final C68214a f302797d;

    /* renamed from: e */
    private final C58833ax f302798e;

    /* renamed from: f */
    private final C68214a f302799f;

    /* renamed from: g */
    private final C113787bc f302800g;

    /* renamed from: h */
    private final C86124t f302801h;

    /* renamed from: i */
    private StartupConfig f302802i;

    /* renamed from: j */
    private C83907bm f302803j;

    /* renamed from: k */
    private boolean f302804k;

    public C108905dh(StartupConfig startupConfig, C108934ej ejVar, C108938en enVar, Context context, C68214a aVar, C58833ax axVar, C68214a aVar2, C113787bc bcVar, C86124t tVar) {
        this.f302802i = startupConfig;
        this.f302794a = ejVar;
        this.f302795b = enVar;
        this.f302796c = context;
        this.f302797d = aVar;
        this.f302798e = axVar;
        this.f302799f = aVar2;
        this.f302800g = bcVar;
        this.f302801h = tVar;
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        int a = (!this.f302802i.mo97188g() || C87566i.m142274aV(this.f302802i.mo97184c()) == null) ? 2 : C87567j.m142328a(this.f302802i.mo97184c());
        if (!C87566i.m142270aR(this.f302802i.mo97184c()) || !this.f302801h.mo79746e(C90014bt.f247287eM)) {
            C87565h hVar = new C87565h(this.f302802i.mo97184c());
            hVar.f236560f = a;
            hVar.f236519W = C87566i.m142270aR(this.f302802i.mo97184c());
            hVar.f236564j = this.f302802i.mo97189h();
            hVar.f236513Q = true;
            Bundle a2 = hVar.mo81685a();
            ((C89859i) this.f302797d.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_RELAUNCH_FROM_ERROR);
            ((C87568k) this.f302798e.mo56107c()).mo81688b(this.f302796c, a2);
        } else {
            Context context = this.f302796c;
            C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
            hwVar.copyOnWrite();
            C53287ih ihVar = (C53287ih) hwVar.instance;
            ihVar.f139698d = 2;
            ihVar.f139695a |= 1;
            hwVar.copyOnWrite();
            C53287ih ihVar2 = (C53287ih) hwVar.instance;
            ihVar2.f139702h = 17;
            ihVar2.f139695a |= 64;
            hwVar.copyOnWrite();
            C53287ih ihVar3 = (C53287ih) hwVar.instance;
            ihVar3.f139703i = 42;
            ihVar3.f139695a |= 128;
            ((C87571n) this.f302799f.mo27525b()).mo81698j(context, (C53287ih) hwVar.build());
        }
        return C83903bi.m133649e(-1, (Intent) null);
    }

    /* renamed from: c */
    public final C58833ax mo77209c() {
        C83907bm bmVar = this.f302803j;
        if (bmVar instanceof C109856c) {
            this.f302804k = ((C109856c) bmVar).f306100h == 3;
        }
        C58833ax c = super.mo77209c();
        this.f302803j = (C83907bm) c.mo56111f();
        return c;
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return C83903bi.m133649e(1, (Intent) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C58833ax mo77210d() {
        if (this.f302803j != null) {
            C108940ep e = this.f302802i.mo97185e();
            if (this.f302803j instanceof C108849bf) {
                e.mo97297d(true);
            }
            if (this.f302804k && this.f302802i.mo97188g()) {
                Bundle c = this.f302802i.mo97184c();
                if (c != null) {
                    c.remove("client_input");
                    c.remove("opa_start_full_screen");
                }
                e.mo97298e(c);
                if (this.f302801h.mo79746e(C90014bt.f247701mC)) {
                    e.mo97296c(false);
                }
            }
            this.f302802i = e.mo97294a();
        }
        C58833ax b = this.f302794a.mo97285b(this.f302802i);
        if (b.mo56113h()) {
            C83956t a = this.f302795b.mo97291a(this.f302802i, (C108936el) b.mo56107c());
            if (((C108936el) b.mo56107c()) == C108936el.OMNICONSENT_REQUIRED && this.f302802i.mo97187f()) {
                C108940ep e2 = this.f302802i.mo97185e();
                e2.mo97295b(false);
                this.f302802i = e2.mo97294a();
            }
            return C58833ax.m90834k(a);
        }
        if (this.f302802i.mo97188g()) {
            this.f302800g.mo100625e();
        }
        return C58836b.f156633a;
    }
}
