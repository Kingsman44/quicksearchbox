package com.google.android.apps.gsa.staticplugins.opa.p8340bi.p8341a;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.opa.p8340bi.C108072a;
import com.google.knowledge.p4671b.C61824q;
import com.google.knowledge.p4671b.C61826s;
import p3186j$.util.Optional;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71136w;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71137x;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71138y;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71139z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bi.a.a */
/* compiled from: PG */
public final class C108073a implements C108072a {

    /* renamed from: a */
    final Optional f300646a;

    /* renamed from: b */
    private final C85664bo f300647b;

    /* renamed from: c */
    private final C89994f f300648c;

    /* renamed from: d */
    private final C86054o f300649d;

    /* renamed from: e */
    private final C9684l f300650e;

    public C108073a(C85664bo boVar, Optional optional, C89994f fVar, C86054o oVar, C9684l lVar) {
        this.f300647b = boVar;
        this.f300646a = optional;
        this.f300648c = fVar;
        this.f300649d = oVar;
        this.f300650e = lVar;
    }

    /* renamed from: a */
    public final C71137x mo96427a() {
        Boolean bool;
        Boolean bool2;
        C71138y yVar = (C71138y) C71139z.f189768f.createBuilder();
        boolean z = false;
        boolean z2 = C85664bo.m137517g((C9855w) this.f300647b.f231557b.get()) == C61826s.OPA_OPT_IN_STATUS_ENABLED;
        yVar.copyOnWrite();
        C71139z zVar = (C71139z) yVar.instance;
        zVar.f189770a |= 2;
        zVar.f189772c = z2;
        boolean z3 = this.f300647b.mo79194i() == C61826s.OPA_OPT_IN_STATUS_ENABLED;
        yVar.copyOnWrite();
        C71139z zVar2 = (C71139z) yVar.instance;
        zVar2.f189770a |= 1;
        zVar2.f189771b = z3;
        boolean z4 = C85664bo.m137518h(this.f300647b.f231558c.get()) == C61826s.OPA_OPT_IN_STATUS_ENABLED;
        yVar.copyOnWrite();
        C71139z zVar3 = (C71139z) yVar.instance;
        zVar3.f189770a |= 4;
        zVar3.f189773d = z4;
        if (this.f300646a.isPresent()) {
            boolean f = ((C73798aa) this.f300646a.get()).mo65282f();
            yVar.copyOnWrite();
            C71139z zVar4 = (C71139z) yVar.instance;
            zVar4.f189770a |= 8;
            zVar4.f189774e = f;
        }
        C71136w wVar = (C71136w) C71137x.f189760g.createBuilder();
        C9684l lVar = this.f300650e;
        Account a = this.f300649d.mo79668a();
        if (a == null || (bool2 = (Boolean) lVar.f33473c.get(a.name)) == null) {
            bool = Boolean.valueOf(lVar.mo17958g());
        } else {
            bool = bool2;
        }
        boolean booleanValue = bool.booleanValue();
        wVar.copyOnWrite();
        C71137x xVar = (C71137x) wVar.instance;
        xVar.f189762a |= 4;
        xVar.f189765d = booleanValue;
        boolean l = this.f300647b.mo79197l(C85662bm.DEVICE_CONTACTS);
        wVar.copyOnWrite();
        C71137x xVar2 = (C71137x) wVar.instance;
        xVar2.f189762a |= 8;
        xVar2.f189766e = l;
        if (this.f300647b.mo79193f() == C61824q.OPA_EXPERIENCE_TRY_BEFORE_YOU_BUY) {
            z = true;
        }
        wVar.copyOnWrite();
        C71137x xVar3 = (C71137x) wVar.instance;
        xVar3.f189762a |= 16;
        xVar3.f189767f = z;
        boolean h = this.f300648c.mo83819h();
        wVar.copyOnWrite();
        C71137x xVar4 = (C71137x) wVar.instance;
        xVar4.f189762a |= 2;
        xVar4.f189764c = h;
        C71139z zVar5 = (C71139z) yVar.build();
        wVar.copyOnWrite();
        C71137x xVar5 = (C71137x) wVar.instance;
        zVar5.getClass();
        xVar5.f189763b = zVar5;
        xVar5.f189762a |= 1;
        return (C71137x) wVar.build();
    }
}
