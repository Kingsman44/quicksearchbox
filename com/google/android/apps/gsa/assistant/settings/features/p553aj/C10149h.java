package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110425l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.h */
/* compiled from: PG */
public final class C10149h {

    /* renamed from: a */
    public final C110425l f34523a;

    /* renamed from: b */
    private final C92597d f34524b;

    /* renamed from: c */
    private final C89994f f34525c;

    /* renamed from: d */
    private final C86124t f34526d;

    /* renamed from: e */
    private final C9684l f34527e;

    /* renamed from: f */
    private final h f34528f;

    /* renamed from: g */
    private final C89656k f34529g;

    /* renamed from: h */
    private final C110402b f34530h;

    public C10149h(C92597d dVar, C89994f fVar, C86124t tVar, C110425l lVar, h hVar, C9684l lVar2, C110402b bVar, C89656k kVar) {
        this.f34524b = dVar;
        this.f34525c = fVar;
        this.f34526d = tVar;
        this.f34523a = lVar;
        this.f34528f = hVar;
        this.f34527e = lVar2;
        this.f34530h = bVar;
        this.f34529g = kVar;
    }

    /* renamed from: a */
    public final C10100ad mo18289a() {
        C10097aa aaVar = (C10097aa) C10098ab.f34383d.createBuilder();
        C9684l lVar = this.f34527e;
        Account a = this.f34528f.a();
        a.getClass();
        boolean h = lVar.mo17959h(a);
        aaVar.copyOnWrite();
        C10098ab abVar = (C10098ab) aaVar.instance;
        abVar.f34385a |= 1;
        abVar.f34386b = h;
        aaVar.copyOnWrite();
        C10098ab abVar2 = (C10098ab) aaVar.instance;
        abVar2.f34385a |= 2;
        abVar2.f34387c = true;
        C10098ab abVar3 = (C10098ab) aaVar.build();
        boolean e = this.f34526d.mo79746e(C90014bt.f247232dK);
        C10097aa aaVar2 = (C10097aa) C10098ab.f34383d.createBuilder();
        boolean A = this.f34525c.mo83835A();
        aaVar2.copyOnWrite();
        C10098ab abVar4 = (C10098ab) aaVar2.instance;
        abVar4.f34385a |= 1;
        abVar4.f34386b = A;
        boolean z = false;
        boolean z2 = e && abVar3.f34386b;
        aaVar2.copyOnWrite();
        C10098ab abVar5 = (C10098ab) aaVar2.instance;
        abVar5.f34385a |= 2;
        abVar5.f34387c = z2;
        C10098ab abVar6 = (C10098ab) aaVar2.build();
        C10097aa aaVar3 = (C10097aa) C10098ab.f34383d.createBuilder();
        boolean b = this.f34523a.mo98664b();
        aaVar3.copyOnWrite();
        C10098ab abVar7 = (C10098ab) aaVar3.instance;
        abVar7.f34385a |= 1;
        abVar7.f34386b = b;
        boolean z3 = e && abVar6.f34386b && abVar6.f34387c && this.f34530h.mo98629a();
        aaVar3.copyOnWrite();
        C10098ab abVar8 = (C10098ab) aaVar3.instance;
        abVar8.f34385a |= 2;
        abVar8.f34387c = z3;
        C10098ab abVar9 = (C10098ab) aaVar3.build();
        C10097aa aaVar4 = (C10097aa) C10098ab.f34383d.createBuilder();
        boolean z4 = this.f34525c.mo83840z();
        aaVar4.copyOnWrite();
        C10098ab abVar10 = (C10098ab) aaVar4.instance;
        abVar10.f34385a |= 1;
        abVar10.f34386b = z4;
        if (this.f34529g.mo83561p() && abVar3.f34386b) {
            z = true;
        }
        aaVar4.copyOnWrite();
        C10098ab abVar11 = (C10098ab) aaVar4.instance;
        abVar11.f34385a |= 2;
        abVar11.f34387c = z;
        C10098ab abVar12 = (C10098ab) aaVar4.build();
        C10099ac acVar = (C10099ac) C10100ad.f34388f.createBuilder();
        acVar.copyOnWrite();
        C10100ad adVar = (C10100ad) acVar.instance;
        abVar3.getClass();
        adVar.f34391b = abVar3;
        adVar.f34390a |= 1;
        acVar.copyOnWrite();
        C10100ad adVar2 = (C10100ad) acVar.instance;
        abVar6.getClass();
        adVar2.f34392c = abVar6;
        adVar2.f34390a |= 2;
        acVar.copyOnWrite();
        C10100ad adVar3 = (C10100ad) acVar.instance;
        abVar9.getClass();
        adVar3.f34393d = abVar9;
        adVar3.f34390a |= 4;
        acVar.copyOnWrite();
        C10100ad adVar4 = (C10100ad) acVar.instance;
        abVar12.getClass();
        adVar4.f34394e = abVar12;
        adVar4.f34390a |= 8;
        return (C10100ad) acVar.build();
    }

    /* renamed from: b */
    public final void mo18290b(boolean z) {
        C89994f fVar = this.f34525c;
        EventForDump.m147676e(5, "LSHPRChange");
        fVar.mo83836B(z);
    }

    /* renamed from: c */
    public final void mo18291c(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f34524b.mo87372f();
        C89994f fVar = this.f34525c;
        EventForDump.m147676e(5, "LSPRChange");
        fVar.mo83837C(z);
        this.f34523a.mo98663a(z);
    }

    /* renamed from: d */
    public final void mo18292d(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C9684l lVar = this.f34527e;
        Account a = this.f34528f.a();
        a.getClass();
        lVar.mo17957f(a, z);
        if (!z) {
            mo18291c(false);
            this.f34523a.mo98663a(false);
            mo18290b(false);
        }
    }
}
