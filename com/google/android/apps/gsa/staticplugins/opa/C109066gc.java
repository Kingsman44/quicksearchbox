package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.assistant.shared.d;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109790aj;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8316b.C107713b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113762ae;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114860dc;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58833ax;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gc */
/* compiled from: PG */
final class C109066gc {

    /* renamed from: A */
    private final C69464a f303652A;

    /* renamed from: a */
    private final C69464a f303653a;

    /* renamed from: b */
    private final C69464a f303654b;

    /* renamed from: c */
    private final C69464a f303655c;

    /* renamed from: d */
    private final C69464a f303656d;

    /* renamed from: e */
    private final C69464a f303657e;

    /* renamed from: f */
    private final C69464a f303658f;

    /* renamed from: g */
    private final C69464a f303659g;

    /* renamed from: h */
    private final C69464a f303660h;

    /* renamed from: i */
    private final C69464a f303661i;

    /* renamed from: j */
    private final C69464a f303662j;

    /* renamed from: k */
    private final C69464a f303663k;

    /* renamed from: l */
    private final C69464a f303664l;

    /* renamed from: m */
    private final C69464a f303665m;

    /* renamed from: n */
    private final C69464a f303666n;

    /* renamed from: o */
    private final C69464a f303667o;

    /* renamed from: p */
    private final C69464a f303668p;

    /* renamed from: q */
    private final C69464a f303669q;

    /* renamed from: r */
    private final C69464a f303670r;

    /* renamed from: s */
    private final C69464a f303671s;

    /* renamed from: t */
    private final C69464a f303672t;

    /* renamed from: u */
    private final C69464a f303673u;

    /* renamed from: v */
    private final C69464a f303674v;

    /* renamed from: w */
    private final C69464a f303675w;

    /* renamed from: x */
    private final C69464a f303676x;

    /* renamed from: y */
    private final C69464a f303677y;

    /* renamed from: z */
    private final C69464a f303678z;

    public C109066gc(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C69464a aVar10, C69464a aVar11, C69464a aVar12, C69464a aVar13, C69464a aVar14, C69464a aVar15, C69464a aVar16, C69464a aVar17, C69464a aVar18, C69464a aVar19, C69464a aVar20, C69464a aVar21, C69464a aVar22, C69464a aVar23, C69464a aVar24, C69464a aVar25, C69464a aVar26, C69464a aVar27) {
        aVar.getClass();
        this.f303653a = aVar;
        aVar2.getClass();
        this.f303654b = aVar2;
        aVar3.getClass();
        this.f303655c = aVar3;
        aVar4.getClass();
        this.f303656d = aVar4;
        aVar5.getClass();
        this.f303657e = aVar5;
        aVar6.getClass();
        this.f303658f = aVar6;
        this.f303659g = aVar7;
        aVar8.getClass();
        this.f303660h = aVar8;
        this.f303661i = aVar9;
        this.f303662j = aVar10;
        aVar11.getClass();
        this.f303663k = aVar11;
        aVar12.getClass();
        this.f303664l = aVar12;
        aVar13.getClass();
        this.f303665m = aVar13;
        aVar14.getClass();
        this.f303666n = aVar14;
        aVar15.getClass();
        this.f303667o = aVar15;
        this.f303668p = aVar16;
        aVar17.getClass();
        this.f303669q = aVar17;
        this.f303670r = aVar18;
        aVar19.getClass();
        this.f303671s = aVar19;
        aVar20.getClass();
        this.f303672t = aVar20;
        aVar21.getClass();
        this.f303673u = aVar21;
        aVar22.getClass();
        this.f303674v = aVar22;
        aVar23.getClass();
        this.f303675w = aVar23;
        aVar24.getClass();
        this.f303676x = aVar24;
        aVar25.getClass();
        this.f303677y = aVar25;
        aVar26.getClass();
        this.f303678z = aVar26;
        this.f303652A = aVar27;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C109065gb mo97561a(C91097g gVar, C109051fu fuVar, C109049fs fsVar, C109050ft ftVar, C109064ga gaVar, C105977ab abVar, C107713b bVar, C90464f fVar, C106000ac acVar, C106071ad adVar, C109056fz fzVar) {
        gVar.getClass();
        bVar.getClass();
        fVar.getClass();
        Activity activity = (Activity) this.f303653a.mo17428b();
        Activity activity2 = activity;
        activity.getClass();
        C86124t tVar = (C86124t) this.f303654b.mo17428b();
        C86124t tVar2 = tVar;
        tVar.getClass();
        C107698i iVar = (C107698i) this.f303655c.mo17428b();
        C107698i iVar2 = iVar;
        iVar.getClass();
        C21370a aVar = (C21370a) this.f303656d.mo17428b();
        C21370a aVar2 = aVar;
        aVar.getClass();
        PackageManager packageManager = (PackageManager) this.f303657e.mo17428b();
        PackageManager packageManager2 = packageManager;
        packageManager.getClass();
        C86054o oVar = (C86054o) this.f303658f.mo17428b();
        C86054o oVar2 = oVar;
        oVar.getClass();
        C68219e.m98518a(((C68226l) this.f303659g).f184585a).getClass();
        C58833ax axVar = (C58833ax) this.f303660h.mo17428b();
        C58833ax axVar2 = axVar;
        axVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) this.f303661i).f184585a);
        C68214a aVar3 = a;
        a.getClass();
        C109790aj ajVar = (C109790aj) this.f303662j.mo17428b();
        C109790aj ajVar2 = ajVar;
        ajVar.getClass();
        ((C113762ae) this.f303663k.mo17428b()).getClass();
        C113812ca caVar = (C113812ca) this.f303664l.mo17428b();
        C113812ca caVar2 = caVar;
        caVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.f303665m.mo17428b();
        SharedPreferences sharedPreferences2 = sharedPreferences;
        sharedPreferences.getClass();
        C109739nm nmVar = (C109739nm) this.f303666n.mo17428b();
        C109739nm nmVar2 = nmVar;
        nmVar.getClass();
        C58833ax axVar3 = (C58833ax) this.f303667o.mo17428b();
        C58833ax axVar4 = axVar3;
        axVar3.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) this.f303668p).f184585a);
        C68214a aVar4 = a2;
        a2.getClass();
        C22871g gVar2 = (C22871g) this.f303669q.mo17428b();
        C22871g gVar3 = gVar2;
        gVar2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) this.f303670r).f184585a);
        C68214a aVar5 = a3;
        a3.getClass();
        C87571n nVar = (C87571n) this.f303671s.mo17428b();
        C87571n nVar2 = nVar;
        nVar.getClass();
        C114860dc dcVar = (C114860dc) this.f303672t.mo17428b();
        C114860dc dcVar2 = dcVar;
        dcVar.getClass();
        C114735e eVar = (C114735e) this.f303673u.mo17428b();
        C114735e eVar2 = eVar;
        eVar.getClass();
        Boolean bool = (Boolean) this.f303674v.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C58833ax axVar5 = (C58833ax) this.f303675w.mo17428b();
        C58833ax axVar6 = axVar5;
        axVar5.getClass();
        C87573b bVar2 = (C87573b) this.f303676x.mo17428b();
        C87573b bVar3 = bVar2;
        bVar2.getClass();
        d dVar = (d) this.f303677y.mo17428b();
        d dVar2 = dVar;
        dVar.getClass();
        C39141kp kpVar = (C39141kp) this.f303678z.mo17428b();
        C39141kp kpVar2 = kpVar;
        kpVar.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) this.f303652A).f184585a);
        a4.getClass();
        return new C109065gb(gVar, fuVar, fsVar, ftVar, gaVar, abVar, bVar, fVar, acVar, adVar, fzVar, activity2, tVar2, iVar2, aVar2, packageManager2, oVar2, axVar2, aVar3, ajVar2, caVar2, sharedPreferences2, nmVar2, axVar4, aVar4, gVar3, aVar5, nVar2, dcVar2, eVar2, booleanValue, axVar6, bVar3, dVar2, kpVar2, a4);
    }
}
