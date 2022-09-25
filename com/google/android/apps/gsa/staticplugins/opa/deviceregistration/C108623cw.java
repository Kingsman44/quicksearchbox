package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3861at.C50138lz;
import com.google.assistant.p3861at.C50140ma;
import com.google.assistant.p3861at.C50143md;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.C50190nx;
import com.google.assistant.p3861at.C50191ny;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cw */
/* compiled from: PG */
public final class C108623cw {

    /* renamed from: a */
    public static final C59071e f302147a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cw");

    /* renamed from: b */
    public final String f302148b;

    /* renamed from: c */
    public final C108617cq f302149c;

    /* renamed from: d */
    public final C21370a f302150d;

    /* renamed from: e */
    public final C86124t f302151e;

    /* renamed from: f */
    public long f302152f = 0;

    /* renamed from: g */
    public boolean f302153g;

    /* renamed from: h */
    private C60870cx f302154h;

    /* renamed from: i */
    private C60870cx f302155i;

    /* renamed from: j */
    private final C22871g f302156j;

    /* renamed from: k */
    private final C22871g f302157k;

    public C108623cw(String str, C108617cq cqVar, C22871g gVar, C22871g gVar2, C86124t tVar, C21370a aVar) {
        this.f302148b = str;
        this.f302149c = cqVar;
        this.f302156j = gVar;
        this.f302157k = gVar2;
        this.f302151e = tVar;
        this.f302150d = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo97031a() {
        C58976aa aaVar = C58975e.f156826a;
        if (C58837ba.m90859h(this.f302148b)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return this.f302157k.mo28209i(mo97032b(), "get HA provider", new C108618cr(this));
    }

    /* renamed from: b */
    public final C60870cx mo97032b() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f302154h;
        if (cxVar != null && this.f302153g) {
            return cxVar;
        }
        C60870cx cxVar2 = this.f302155i;
        if (cxVar2 != null && !cxVar2.isDone()) {
            C59104x c = f302147a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceSetupRespCache");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(new IllegalStateException())).mo56372aa(24169)).mo56386p("Sync is in flight");
        }
        C108617cq cqVar = this.f302149c;
        C108616cp cpVar = new C108616cp(C108612cl.f302129a);
        acu acu = (acu) acv.f128920X.createBuilder();
        C50190nx nxVar = (C50190nx) C50191ny.f130478e.createBuilder();
        nxVar.copyOnWrite();
        C50191ny nyVar = (C50191ny) nxVar.instance;
        nyVar.f130480a |= 1;
        nyVar.f130481b = true;
        nxVar.copyOnWrite();
        C50191ny nyVar2 = (C50191ny) nxVar.instance;
        nyVar2.f130480a |= 4;
        nyVar2.f130483d = true;
        nxVar.copyOnWrite();
        C50191ny nyVar3 = (C50191ny) nxVar.instance;
        nyVar3.f130480a |= 2;
        nyVar3.f130482c = true;
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        C50191ny nyVar4 = (C50191ny) nxVar.build();
        nyVar4.getClass();
        acv.f128951g = nyVar4;
        acv.f128945a |= 64;
        C50143md mdVar = (C50143md) C50144me.f130361d.createBuilder();
        C50138lz lzVar = (C50138lz) C50140ma.f130352d.createBuilder();
        lzVar.copyOnWrite();
        C50140ma maVar = (C50140ma) lzVar.instance;
        maVar.f130354a |= 1;
        maVar.f130355b = true;
        lzVar.copyOnWrite();
        C50140ma maVar2 = (C50140ma) lzVar.instance;
        maVar2.f130354a |= 2;
        maVar2.f130356c = true;
        mdVar.copyOnWrite();
        C50144me meVar = (C50144me) mdVar.instance;
        C50140ma maVar3 = (C50140ma) lzVar.build();
        maVar3.getClass();
        meVar.f130365c = maVar3;
        meVar.f130363a |= 2;
        cqVar.f302138c.i((Account) ((C83893b) cqVar.f302137b.mo27525b()).mo77278a().mo56107c(), (acv) acu.build(), (C50144me) mdVar.build(), cpVar, (k) null, (String) null, cqVar.getClass().getSimpleName());
        C60870cx g = C60922j.m93044g(cpVar.f302134a, C108622cv.f302146a, C60826bg.f164896a);
        this.f302154h = g;
        this.f302153g = true;
        return g;
    }

    /* renamed from: c */
    public final C60870cx mo97033c() {
        String str = this.f302148b;
        str.getClass();
        C58838bb.m90868c(!C58837ba.m90859h(str));
        C22872h.m42742b(C0826b.class);
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f302155i;
        if (cxVar == null) {
            this.f302155i = this.f302149c.mo97029d(str);
            this.f302152f = this.f302150d.mo26871c();
        } else {
            C60870cx f = this.f302156j.mo28206f(cxVar, "Retry Failed HA provider sync", Exception.class, new C108620ct(this, str));
            this.f302155i = f;
            this.f302155i = this.f302156j.mo28210j(f, "Re-Sync HA provider", new C108621cu(this, str));
        }
        return this.f302155i;
    }
}
