package com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.gsa.nga.api.a.m;
import com.google.android.apps.gsa.nga.engine.dictation.C75366d;
import com.google.android.apps.gsa.nga.engine.dictation.e;
import com.google.android.apps.gsa.nga.engine.dictation.h;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125072b;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125097by;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125106cg;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125158g;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125258n;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125390ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126299ah;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126301aj;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9484v.C126370c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63070h;
import com.google.protobuf.p4750c.C62950b;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64730i;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70987an;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70988ao;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70993at;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70994au;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70995av;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70996aw;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70997ax;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70998ay;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71009bi;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71010bj;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71011bk;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71015bo;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71020bt;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71021bu;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.p.g */
/* compiled from: PG */
public final class C126178g implements C126174c {

    /* renamed from: a */
    public static final C59071e f347682a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.p.g");

    /* renamed from: h */
    private static final C58528ij f347683h = C58528ij.m90012L(C63122a.SUCCESS_SEND, C63122a.SUCCESS_SEARCH, C63122a.SUCCESS_APP_SUBMITTED_CONTENTS);

    /* renamed from: b */
    public final C37215b f347684b;

    /* renamed from: c */
    public final C125390ar f347685c;

    /* renamed from: d */
    public final AtomicBoolean f347686d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicLong f347687e = new AtomicLong(0);

    /* renamed from: f */
    public final AtomicBoolean f347688f = new AtomicBoolean(false);

    /* renamed from: g */
    public final AtomicReference f347689g = new AtomicReference(af.w);

    /* renamed from: i */
    private final PackageManager f347690i;

    /* renamed from: j */
    private final C126370c f347691j;

    /* renamed from: k */
    private final Duration f347692k;

    /* renamed from: l */
    private final C60888db f347693l;

    /* renamed from: m */
    private final AtomicBoolean f347694m = new AtomicBoolean(false);

    /* renamed from: n */
    private final Object f347695n = new Object();

    /* renamed from: o */
    private C60870cx f347696o = C60866ct.f164955a;

    /* renamed from: p */
    private Runnable f347697p = C126175d.f347674a;

    /* renamed from: q */
    private final AtomicLong f347698q = new AtomicLong(0);

    /* renamed from: r */
    private final AtomicBoolean f347699r = new AtomicBoolean(false);

    /* renamed from: s */
    private final AtomicBoolean f347700s = new AtomicBoolean(false);

    /* renamed from: t */
    private final AtomicBoolean f347701t = new AtomicBoolean(false);

    /* renamed from: u */
    private final AtomicReference f347702u = new AtomicReference(C70994au.f189311p);

    public C126178g(C126173b bVar, Context context, C125390ar arVar, C126370c cVar, C62910ar arVar2, C60888db dbVar) {
        this.f347684b = bVar;
        this.f347690i = context.getPackageManager();
        this.f347685c = arVar;
        this.f347691j = cVar;
        this.f347692k = C62950b.m95473d(arVar2);
        this.f347693l = dbVar;
    }

    /* renamed from: D */
    public static C70988ao m206338D(C51809dy dyVar) {
        C70987an anVar = (C70987an) C70988ao.f189297d.createBuilder();
        anVar.copyOnWrite();
        C70988ao aoVar = (C70988ao) anVar.instance;
        aoVar.f189300b = 1;
        aoVar.f189299a = 1 | aoVar.f189299a;
        String str = dyVar.f135936b;
        anVar.copyOnWrite();
        C70988ao aoVar2 = (C70988ao) anVar.instance;
        str.getClass();
        aoVar2.f189299a |= 2;
        aoVar2.f189301c = str;
        return (C70988ao) anVar.build();
    }

    /* renamed from: G */
    public static boolean m206339G(C70988ao aoVar) {
        String str = aoVar.f189301c;
        return "send".equals(str) || "text.SEND".equals(str);
    }

    /* renamed from: H */
    private final C70995av m206340H() {
        String str;
        C70995av avVar = (C70995av) C70996aw.f189329s.createBuilder();
        try {
            str = this.f347690i.getPackageInfo("com.google.android.as", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "UNKNOWN";
        }
        avVar.copyOnWrite();
        C70996aw awVar = (C70996aw) avVar.instance;
        str.getClass();
        awVar.f189331a |= 32;
        awVar.f189336f = str;
        return avVar;
    }

    /* renamed from: I */
    private final C70995av m206341I(af afVar) {
        C70995av J = m206342J(afVar);
        String str = afVar.e;
        J.copyOnWrite();
        C70996aw awVar = (C70996aw) J.instance;
        C70996aw awVar2 = C70996aw.f189329s;
        str.getClass();
        awVar.f189331a |= 2;
        awVar.f189333c = str;
        boolean z = afVar.f;
        J.copyOnWrite();
        C70996aw awVar3 = (C70996aw) J.instance;
        awVar3.f189331a |= 16384;
        awVar3.f189346p = z;
        int i = afVar.d;
        J.copyOnWrite();
        C70996aw awVar4 = (C70996aw) J.instance;
        awVar4.f189331a |= 32768;
        awVar4.f189347q = i;
        return J;
    }

    /* renamed from: J */
    private final C70995av m206342J(af afVar) {
        C70995av H = m206340H();
        boolean z = afVar.j;
        H.copyOnWrite();
        C70996aw awVar = (C70996aw) H.instance;
        C70996aw awVar2 = C70996aw.f189329s;
        awVar.f189331a |= 64;
        awVar.f189337g = z;
        boolean z2 = afVar.o;
        H.copyOnWrite();
        C70996aw awVar3 = (C70996aw) H.instance;
        awVar3.f189331a |= 128;
        awVar3.f189338h = z2;
        boolean z3 = afVar.n;
        H.copyOnWrite();
        C70996aw awVar4 = (C70996aw) H.instance;
        awVar4.f189331a |= 256;
        awVar4.f189339i = z3;
        boolean z4 = afVar.p;
        H.copyOnWrite();
        C70996aw awVar5 = (C70996aw) H.instance;
        awVar5.f189331a |= 512;
        awVar5.f189340j = z4;
        C62971cq cqVar = afVar.a;
        H.copyOnWrite();
        C70996aw awVar6 = (C70996aw) H.instance;
        C62971cq cqVar2 = awVar6.f189342l;
        if (!cqVar2.mo58948c()) {
            awVar6.f189342l = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) awVar6.f189342l);
        long j = afVar.l;
        H.copyOnWrite();
        C70996aw awVar7 = (C70996aw) H.instance;
        awVar7.f189331a |= 8;
        awVar7.f189334d = j;
        String str = afVar.m;
        H.copyOnWrite();
        C70996aw awVar8 = (C70996aw) H.instance;
        str.getClass();
        awVar8.f189331a |= 16;
        awVar8.f189335e = str;
        String str2 = afVar.b;
        H.copyOnWrite();
        C70996aw awVar9 = (C70996aw) H.instance;
        str2.getClass();
        awVar9.f189331a |= 1024;
        awVar9.f189341k = str2;
        boolean z5 = this.f347691j.f348068c.get();
        H.copyOnWrite();
        C70996aw awVar10 = (C70996aw) H.instance;
        awVar10.f189331a |= 65536;
        awVar10.f189348r = z5;
        return H;
    }

    /* renamed from: A */
    public final void mo107399A() {
        if (this.f347700s.compareAndSet(false, true)) {
            ((C59052c) ((C59052c) f347682a.mo56224b()).mo56372aa(36865)).mo56386p("First audio level update received [SD]");
            this.f347684b.mo19974a(C37176a.f96899bQ);
        }
    }

    /* renamed from: B */
    public final void mo107400B() {
        if (this.f347701t.compareAndSet(false, true)) {
            ((C59052c) ((C59052c) f347682a.mo56224b()).mo56372aa(36866)).mo56386p("First text received [SD]");
            this.f347684b.mo19974a(C37176a.f96869an);
        }
    }

    /* renamed from: C */
    public final void mo107401C(int i) {
        C37215b bVar = this.f347684b;
        C37258g gVar = C37176a.f97266iM;
        C62940bt btVar = C70994au.f189312q;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70997ax axVar = (C70997ax) C70998ay.f189349c.createBuilder();
        axVar.copyOnWrite();
        C70998ay ayVar = (C70998ay) axVar.instance;
        ayVar.f189352b = i - 2;
        ayVar.f189351a |= 1;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70998ay ayVar2 = (C70998ay) axVar.build();
        ayVar2.getClass();
        auVar.f189328o = ayVar2;
        auVar.f189314a |= 8192;
        bVar.mo19974a(gVar.mo40812e(btVar, (C70994au) atVar.build()));
    }

    /* renamed from: E */
    public final C70995av mo107446E(bj bjVar) {
        af afVar = bjVar.a;
        if (afVar == null) {
            afVar = af.w;
        }
        C70995av I = m206341I(afVar);
        boolean z = false;
        boolean z2 = bjVar.c > 0;
        I.copyOnWrite();
        C70996aw awVar = (C70996aw) I.instance;
        C70996aw awVar2 = C70996aw.f189329s;
        awVar.f189331a |= 4096;
        awVar.f189344n = z2;
        e eVar = bjVar.e;
        if (eVar == null) {
            eVar = e.b;
        }
        int a = C75366d.m121807a(eVar.a);
        if (a != 0 && a == 3) {
            z = true;
        }
        I.copyOnWrite();
        C70996aw awVar3 = (C70996aw) I.instance;
        awVar3.f189331a |= 2048;
        awVar3.f189343m = !z;
        m a2 = m.a(bjVar.b);
        if (a2 == null) {
            a2 = m.h;
        }
        I.copyOnWrite();
        C70996aw awVar4 = (C70996aw) I.instance;
        awVar4.f189345o = a2.getNumber();
        awVar4.f189331a |= 8192;
        return I;
    }

    /* renamed from: F */
    public final void mo107447F(long j, C63122a aVar, C126292aa aaVar) {
        C37215b bVar = this.f347684b;
        C37252a d = C37176a.f96867al.mo40808f("dictation", String.valueOf(j)).mo40780d(aVar.getNumber(), "dictation");
        C62940bt btVar = C70994au.f189312q;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70995av I = m206341I((af) this.f347689g.get());
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70996aw awVar = (C70996aw) I.build();
        awVar.getClass();
        auVar.f189317d = awVar;
        auVar.f189314a |= 4;
        C119297s b = aaVar.mo107509b();
        atVar.copyOnWrite();
        C70994au auVar2 = (C70994au) atVar.instance;
        auVar2.f189316c = b.getNumber();
        auVar2.f189314a |= 2;
        C71020bt btVar2 = (C71020bt) C71021bu.f189399e.createBuilder();
        C119299u c = aaVar.mo107510c();
        btVar2.copyOnWrite();
        C71021bu buVar = (C71021bu) btVar2.instance;
        buVar.f189402b = c.getNumber();
        buVar.f189401a |= 1;
        boolean isEmpty = aaVar.mo107513f().isEmpty();
        btVar2.copyOnWrite();
        C71021bu buVar2 = (C71021bu) btVar2.instance;
        buVar2.f189401a |= 4;
        buVar2.f189404d = !isEmpty;
        atVar.copyOnWrite();
        C70994au auVar3 = (C70994au) atVar.instance;
        C71021bu buVar3 = (C71021bu) btVar2.build();
        buVar3.getClass();
        auVar3.f189318e = buVar3;
        auVar3.f189314a |= 8;
        ((C37253b) d).mo40792p(btVar, (C70994au) atVar.build());
        bVar.mo19974a(d);
        this.f347694m.set(false);
    }

    /* renamed from: a */
    public final C126181j mo107402a(long j, long j2) {
        return new C126177f(this, j, j2);
    }

    /* renamed from: b */
    public final void mo107403b(long j) {
        this.f347684b.mo19974a(C37176a.f96999dK.mo40816j("aiai_availability_check", String.valueOf(j)));
    }

    /* renamed from: c */
    public final void mo107404c(long j, C125258n nVar, C125072b bVar) {
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70995av H = m206340H();
        String languageTag = nVar.f345547a.toLanguageTag();
        H.copyOnWrite();
        C70996aw awVar = (C70996aw) H.instance;
        C70996aw awVar2 = C70996aw.f189329s;
        languageTag.getClass();
        awVar.f189331a |= 1024;
        awVar.f189341k = languageTag;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70996aw awVar3 = (C70996aw) H.build();
        awVar3.getClass();
        auVar.f189317d = awVar3;
        auVar.f189314a |= 4;
        C37215b bVar2 = this.f347684b;
        C37252a a = C37176a.f96994dF.mo40803a(bVar.getNumber(), "dictation-aiai-availability");
        C37253b bVar3 = (C37253b) a;
        bVar3.mo40792p(C70994au.f189312q, (C70994au) atVar.build());
        bVar3.mo40795s("aiai_availability_check", String.valueOf(j));
        bVar2.mo19974a(a);
    }

    /* renamed from: d */
    public final void mo107405d(long j) {
        this.f347684b.mo19974a(C37176a.f96998dJ.mo40816j("aiai_availability_check", String.valueOf(j)));
    }

    /* renamed from: e */
    public final void mo107406e(long j) {
        this.f347684b.mo19974a(C37176a.f96992dD.mo40816j("aiai_availability_check", String.valueOf(j)));
    }

    /* renamed from: f */
    public final void mo107407f(long j) {
        this.f347684b.mo19974a(C37176a.f96993dE.mo40816j("aiai_availability_check", String.valueOf(j)));
    }

    /* renamed from: g */
    public final void mo107408g() {
        this.f347686d.set(true);
        this.f347684b.mo19974a(C37176a.f96886bD);
    }

    /* renamed from: h */
    public final void mo107409h(C125097by byVar) {
        C63070h hVar = byVar.f345098a;
        if (hVar == null) {
            hVar = C63070h.f170215c;
        }
        C125044j a = C126336m.m206590a(hVar);
        h hVar2 = h.a;
        C125044j jVar = C125044j.UNKNOWN;
        C63122a aVar = C63122a.UNKNOWN_STATUS;
        C125106cg cgVar = C125106cg.KEYBOARD_TIP_EVENT_UNSPECIFIED;
        String str = "unknown";
        switch (a.ordinal()) {
            case 1:
                str = "close";
                break;
            case 2:
                str = "clear";
                break;
            case 3:
                str = "send";
                break;
            case 4:
                str = "search";
                break;
            case 5:
                str = "undo";
                break;
            case 6:
                str = "next";
                break;
            case 7:
                str = "previous";
                break;
            case 8:
                str = "first one";
                break;
            case 9:
                str = "set subject";
                break;
            case 10:
                str = "set body";
                break;
            case 11:
                str = "add item";
                break;
            case 12:
                str = "save";
                break;
            case 13:
                str = "clear all";
                break;
            case 14:
            case 15:
                str = "new line";
                break;
            case 16:
                str = "discard";
                break;
            case 17:
                str = "emoji suggestion";
                break;
        }
        C70987an anVar = (C70987an) C70988ao.f189297d.createBuilder();
        anVar.copyOnWrite();
        C70988ao aoVar = (C70988ao) anVar.instance;
        aoVar.f189300b = 2;
        aoVar.f189299a |= 1;
        anVar.copyOnWrite();
        C70988ao aoVar2 = (C70988ao) anVar.instance;
        aoVar2.f189299a = 2 | aoVar2.f189299a;
        aoVar2.f189301c = str;
        C70988ao aoVar3 = (C70988ao) anVar.build();
        if (m206339G(aoVar3)) {
            this.f347686d.set(true);
        }
        C37215b bVar = this.f347684b;
        C37258g gVar = C37176a.f96872aq;
        C62940bt btVar = C70994au.f189312q;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        aoVar3.getClass();
        auVar.f189319f = aoVar3;
        auVar.f189314a |= 16;
        bVar.mo19974a(gVar.mo40812e(btVar, (C70994au) atVar.build()));
    }

    /* renamed from: i */
    public final void mo107410i() {
        this.f347684b.mo19974a(C37176a.f97100fF.mo40812e(C70994au.f189312q, C70994au.f189311p));
    }

    /* renamed from: j */
    public final void mo107411j() {
        this.f347684b.mo19974a(C37176a.f96868am);
    }

    /* renamed from: k */
    public final void mo107412k(long j, C125160i iVar) {
        C37215b bVar = this.f347684b;
        C37252a d = C37176a.f96866ak.mo40808f("dictation", String.valueOf(j)).mo40780d(C63122a.FAILURE_NOT_ELIGIBLE.getNumber(), "dictation");
        C62940bt btVar = C70994au.f189312q;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        String format = String.format("Eligibility=%s", new Object[]{Integer.valueOf(iVar.getNumber())});
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        format.getClass();
        auVar.f189314a |= 1;
        auVar.f189315b = format;
        C70995av I = m206341I((af) this.f347689g.get());
        C125158g gVar = (C125158g) C125161j.f345284g.createBuilder();
        gVar.copyOnWrite();
        C125161j jVar = (C125161j) gVar.instance;
        jVar.f345288c = iVar.getNumber();
        jVar.f345286a |= 1;
        I.copyOnWrite();
        C70996aw awVar = (C70996aw) I.instance;
        C125161j jVar2 = (C125161j) gVar.build();
        C70996aw awVar2 = C70996aw.f189329s;
        jVar2.getClass();
        awVar.f189332b = jVar2;
        awVar.f189331a = 1 | awVar.f189331a;
        atVar.copyOnWrite();
        C70994au auVar2 = (C70994au) atVar.instance;
        C70996aw awVar3 = (C70996aw) I.build();
        awVar3.getClass();
        auVar2.f189317d = awVar3;
        auVar2.f189314a |= 4;
        ((C37253b) d).mo40792p(btVar, (C70994au) atVar.build());
        bVar.mo19974a(d);
        this.f347694m.set(false);
    }

    /* renamed from: l */
    public final void mo107413l(long j, C63122a aVar, Throwable th) {
        C37215b bVar = this.f347684b;
        C37252a d = C37176a.f96866ak.mo40808f("dictation", String.valueOf(j)).mo40780d(aVar.getNumber(), "dictation");
        C62940bt btVar = C70994au.f189312q;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        String th2 = th.toString();
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        th2.getClass();
        auVar.f189314a |= 1;
        auVar.f189315b = th2;
        C70995av I = m206341I((af) this.f347689g.get());
        atVar.copyOnWrite();
        C70994au auVar2 = (C70994au) atVar.instance;
        C70996aw awVar = (C70996aw) I.build();
        awVar.getClass();
        auVar2.f189317d = awVar;
        auVar2.f189314a |= 4;
        ((C37253b) d).mo40792p(btVar, (C70994au) atVar.build());
        bVar.mo19974a(d);
        this.f347694m.set(false);
    }

    /* renamed from: m */
    public final void mo107414m(long j, C63122a aVar) {
        C37252a aVar2;
        h hVar = h.a;
        C125044j jVar = C125044j.UNKNOWN;
        C63122a aVar3 = C63122a.UNKNOWN_STATUS;
        C125106cg cgVar = C125106cg.KEYBOARD_TIP_EVENT_UNSPECIFIED;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            this.f347686d.set(false);
            this.f347700s.set(false);
            this.f347701t.set(false);
            this.f347688f.set(false);
            aVar2 = C37176a.f96865aj.mo40810a(aVar.getNumber(), "dictation");
        } else if (ordinal != 27) {
            aVar2 = C37176a.f96866ak.mo40803a(aVar.getNumber(), "dictation");
            C62940bt btVar = C70994au.f189312q;
            C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
            C70995av I = m206341I((af) this.f347689g.get());
            atVar.copyOnWrite();
            C70994au auVar = (C70994au) atVar.instance;
            C70996aw awVar = (C70996aw) I.build();
            awVar.getClass();
            auVar.f189317d = awVar;
            auVar.f189314a |= 4;
            ((C37253b) aVar2).mo40792p(btVar, (C70994au) atVar.build());
            this.f347694m.set(false);
        } else {
            aVar2 = C37176a.f96895bM.mo40803a(aVar.getNumber(), "dictation");
            C62940bt btVar2 = C70994au.f189312q;
            C70993at atVar2 = (C70993at) C70994au.f189311p.createBuilder();
            C70995av I2 = m206341I((af) this.f347689g.get());
            atVar2.copyOnWrite();
            C70994au auVar2 = (C70994au) atVar2.instance;
            C70996aw awVar2 = (C70996aw) I2.build();
            awVar2.getClass();
            auVar2.f189317d = awVar2;
            auVar2.f189314a |= 4;
            ((C37253b) aVar2).mo40792p(btVar2, (C70994au) atVar2.build());
        }
        C37215b bVar = this.f347684b;
        ((C37253b) aVar2).mo40795s("dictation", String.valueOf(j));
        bVar.mo19974a(aVar2);
    }

    /* renamed from: n */
    public final void mo107415n(long j, C63122a aVar, C126292aa aaVar) {
        if (!f347683h.contains(aVar)) {
            h hVar = h.a;
            C125044j jVar = C125044j.UNKNOWN;
            C63122a aVar2 = C63122a.UNKNOWN_STATUS;
            C125106cg cgVar = C125106cg.KEYBOARD_TIP_EVENT_UNSPECIFIED;
            switch (aVar.ordinal()) {
                case 0:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    if (this.f347688f.get()) {
                        this.f347687e.set(j);
                        C37215b bVar = this.f347684b;
                        C37252a j2 = C37176a.f96978cq.mo40816j("dictation", String.valueOf(j));
                        j2.mo40780d(aVar.getNumber(), "dictation");
                        bVar.mo19974a(j2);
                        synchronized (this.f347695n) {
                            C126176e eVar = new C126176e(this, j, aVar, aaVar);
                            this.f347697p = eVar;
                            this.f347696o = C126309ar.m206524c(new C126299ah(new C126301aj(eVar)), this.f347692k, this.f347693l);
                        }
                        return;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
        mo107447F(j, aVar, aaVar);
    }

    /* renamed from: o */
    public final void mo107416o(af afVar, C125161j jVar) {
        C37252a aVar;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70995av J = m206342J(afVar);
        J.copyOnWrite();
        C70996aw awVar = (C70996aw) J.instance;
        C70996aw awVar2 = C70996aw.f189329s;
        jVar.getClass();
        awVar.f189332b = jVar;
        awVar.f189331a |= 1;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70996aw awVar3 = (C70996aw) J.build();
        awVar3.getClass();
        auVar.f189317d = awVar3;
        auVar.f189314a |= 4;
        C70994au auVar2 = (C70994au) atVar.build();
        if (!((C70994au) this.f347702u.getAndSet(auVar2)).equals(auVar2)) {
            String valueOf = String.valueOf(this.f347698q.incrementAndGet());
            this.f347684b.mo19974a(C37176a.f96900bR.mo40816j("eligibility_check", valueOf));
            C125160i a = C125160i.m205013a(jVar.f345288c);
            if (a == null) {
                a = C125160i.UNRECOGNIZED;
            }
            if (a.equals(C125160i.ELIGIBLE)) {
                aVar = C37176a.f96901bS.mo40804b();
            } else {
                aVar = C37176a.f96902bT.mo40804b();
            }
            C37215b bVar = this.f347684b;
            C37253b bVar2 = (C37253b) aVar;
            bVar2.mo40795s("eligibility_check", valueOf);
            bVar2.mo40792p(C70994au.f189312q, auVar2);
            bVar.mo19974a(aVar);
        }
    }

    /* renamed from: p */
    public final void mo107417p(int i, boolean z) {
        C37215b bVar = this.f347684b;
        C37258g gVar = C37176a.f97010dV;
        C62940bt btVar = C70994au.f189312q;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C71009bi biVar = (C71009bi) C71015bo.f189387c.createBuilder();
        C71010bj bjVar = (C71010bj) C71011bk.f189375d.createBuilder();
        bjVar.copyOnWrite();
        C71011bk bkVar = (C71011bk) bjVar.instance;
        bkVar.f189377a |= 1;
        bkVar.f189378b = i;
        bjVar.copyOnWrite();
        C71011bk bkVar2 = (C71011bk) bjVar.instance;
        bkVar2.f189377a |= 2;
        bkVar2.f189379c = z;
        biVar.copyOnWrite();
        C71015bo boVar = (C71015bo) biVar.instance;
        C71011bk bkVar3 = (C71011bk) bjVar.build();
        bkVar3.getClass();
        boVar.f189390b = bkVar3;
        boVar.f189389a = 2;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C71015bo boVar2 = (C71015bo) biVar.build();
        boVar2.getClass();
        auVar.f189324k = boVar2;
        auVar.f189314a |= 512;
        bVar.mo19974a(gVar.mo40812e(btVar, (C70994au) atVar.build()));
    }

    /* renamed from: q */
    public final void mo107418q() {
        if (this.f347694m.get()) {
            this.f347684b.mo19974a(C37176a.f96859ad);
        }
    }

    /* renamed from: r */
    public final void mo107419r(af afVar, C125160i iVar) {
        this.f347689g.set(afVar);
        if (this.f347694m.get()) {
            C37215b bVar = this.f347684b;
            C37258g gVar = C37176a.f97251hy;
            C62940bt btVar = C70994au.f189312q;
            C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
            C70995av I = m206341I(afVar);
            C125158g gVar2 = (C125158g) C125161j.f345284g.createBuilder();
            gVar2.copyOnWrite();
            ((C125161j) gVar2.instance).f345287b = iVar.getNumber();
            I.copyOnWrite();
            C70996aw awVar = (C70996aw) I.instance;
            C125161j jVar = (C125161j) gVar2.build();
            C70996aw awVar2 = C70996aw.f189329s;
            jVar.getClass();
            awVar.f189332b = jVar;
            awVar.f189331a |= 1;
            atVar.copyOnWrite();
            C70994au auVar = (C70994au) atVar.instance;
            C70996aw awVar3 = (C70996aw) I.build();
            awVar3.getClass();
            auVar.f189317d = awVar3;
            auVar.f189314a |= 4;
            bVar.mo19974a(gVar.mo40812e(btVar, (C70994au) atVar.build()));
        }
    }

    /* renamed from: s */
    public final void mo107420s() {
        if (this.f347694m.get()) {
            this.f347684b.mo19974a(C37176a.f96881az);
        }
    }

    /* renamed from: t */
    public final void mo107421t(af afVar, C125160i iVar) {
        this.f347689g.set(afVar);
        if (this.f347694m.get()) {
            C37215b bVar = this.f347684b;
            C37258g gVar = C37176a.f96858ac;
            C62940bt btVar = C70994au.f189312q;
            C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
            C70995av I = m206341I(afVar);
            C125158g gVar2 = (C125158g) C125161j.f345284g.createBuilder();
            gVar2.copyOnWrite();
            ((C125161j) gVar2.instance).f345287b = iVar.getNumber();
            I.copyOnWrite();
            C70996aw awVar = (C70996aw) I.instance;
            C125161j jVar = (C125161j) gVar2.build();
            C70996aw awVar2 = C70996aw.f189329s;
            jVar.getClass();
            awVar.f189332b = jVar;
            awVar.f189331a |= 1;
            atVar.copyOnWrite();
            C70994au auVar = (C70994au) atVar.instance;
            C70996aw awVar3 = (C70996aw) I.build();
            awVar3.getClass();
            auVar.f189317d = awVar3;
            auVar.f189314a |= 4;
            bVar.mo19974a(gVar.mo40812e(btVar, (C70994au) atVar.build()));
        }
    }

    /* renamed from: u */
    public final void mo107422u(long j) {
        this.f347684b.mo19974a(C37176a.f97055eN.mo40816j("dictation", String.valueOf(j)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.ACTION_BUTTONS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.VOICE_CORRECTION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.STICKY_MIC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.HEYG_TYPE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.TRY_DICTATION;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.SPELL_IT_OUT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.OVERLAY_LEARNING_CENTER;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107423v(com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125106cg r6) {
        /*
            r5 = this;
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96829a
            com.google.protos.ad.a.a.a.a.b.a.b.a.a.b r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.UNKNOWN
            com.google.android.apps.gsa.nga.engine.dictation.h r2 = com.google.android.apps.gsa.nga.engine.dictation.h.a
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.UNKNOWN
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r2 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a.UNKNOWN_STATUS
            com.google.android.apps.search.assistant.surfaces.dictation.a.cg r2 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125106cg.KEYBOARD_TIP_EVENT_UNSPECIFIED
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L_0x004c;
                case 1: goto L_0x0047;
                case 2: goto L_0x0044;
                case 3: goto L_0x0044;
                case 4: goto L_0x003f;
                case 5: goto L_0x003c;
                case 6: goto L_0x0037;
                case 7: goto L_0x0034;
                case 8: goto L_0x002f;
                case 9: goto L_0x002c;
                case 10: goto L_0x0027;
                case 11: goto L_0x0024;
                case 12: goto L_0x001f;
                case 13: goto L_0x001c;
                case 14: goto L_0x0017;
                case 15: goto L_0x0014;
                case 16: goto L_0x004c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x004d
        L_0x0014:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96864ai
            goto L_0x0019
        L_0x0017:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96863ah
        L_0x0019:
            com.google.protos.ad.a.a.a.a.b.a.b.a.a.b r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.SPELL_IT_OUT
            goto L_0x004d
        L_0x001c:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96864ai
            goto L_0x0021
        L_0x001f:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96863ah
        L_0x0021:
            com.google.protos.ad.a.a.a.a.b.a.b.a.a.b r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.OVERLAY_LEARNING_CENTER
            goto L_0x004d
        L_0x0024:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96864ai
            goto L_0x0029
        L_0x0027:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96863ah
        L_0x0029:
            com.google.protos.ad.a.a.a.a.b.a.b.a.a.b r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.ACTION_BUTTONS
            goto L_0x004d
        L_0x002c:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96864ai
            goto L_0x0031
        L_0x002f:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96863ah
        L_0x0031:
            com.google.protos.ad.a.a.a.a.b.a.b.a.a.b r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.VOICE_CORRECTION
            goto L_0x004d
        L_0x0034:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96864ai
            goto L_0x0039
        L_0x0037:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96863ah
        L_0x0039:
            com.google.protos.ad.a.a.a.a.b.a.b.a.a.b r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.STICKY_MIC
            goto L_0x004d
        L_0x003c:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96864ai
            goto L_0x0041
        L_0x003f:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96863ah
        L_0x0041:
            com.google.protos.ad.a.a.a.a.b.a.b.a.a.b r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.HEYG_TYPE
            goto L_0x004d
        L_0x0044:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96864ai
            goto L_0x0049
        L_0x0047:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96863ah
        L_0x0049:
            com.google.protos.ad.a.a.a.a.b.a.b.a.a.b r1 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4772b.p4773a.p4774a.C63124b.TRY_DICTATION
            goto L_0x004d
        L_0x004c:
            return
        L_0x004d:
            com.google.android.libraries.search.b.b r6 = r5.f347684b
            com.google.protobuf.bt r2 = p5535j.p5536a.p5545c.p5548c.p5549a.C70994au.f189312q
            j.a.c.c.a.au r3 = p5535j.p5536a.p5545c.p5548c.p5549a.C70994au.f189311p
            com.google.protobuf.bn r3 = r3.createBuilder()
            j.a.c.c.a.at r3 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70993at) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            j.a.c.c.a.au r4 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70994au) r4
            int r1 = r1.getNumber()
            r4.f189321h = r1
            int r1 = r4.f189314a
            r1 = r1 | 64
            r4.f189314a = r1
            com.google.protobuf.bv r1 = r3.build()
            j.a.c.c.a.au r1 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70994au) r1
            com.google.android.libraries.search.b.i.a r0 = r0.mo40812e(r2, r1)
            r6.mo19974a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126178g.mo107423v(com.google.android.apps.search.assistant.surfaces.dictation.a.cg):void");
    }

    /* renamed from: w */
    public final void mo107424w() {
        this.f347684b.mo19974a(C37176a.f96933by);
    }

    /* renamed from: x */
    public final void mo107425x(long j, C119297s sVar, Duration duration, C64730i iVar, C119299u uVar, boolean z) {
        C37258g gVar;
        if (this.f347694m.get()) {
            synchronized (this.f347695n) {
                this.f347696o.cancel(false);
                this.f347697p.run();
            }
        }
        this.f347694m.set(true);
        this.f347699r.set(false);
        if (sVar.equals(C119297s.REQUESTER_KEYBOARD_MIC_BUTTON) || sVar.equals(C119297s.REQUESTER_KEYBOARD_ONBOARDING_HEADER)) {
            gVar = C37176a.f96861af;
        } else {
            gVar = C37176a.f96860ae;
        }
        C37252a j2 = gVar.mo40816j("dictation", String.valueOf(j));
        C62940bt btVar = C70994au.f189312q;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70995av H = m206340H();
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70996aw awVar = (C70996aw) H.build();
        awVar.getClass();
        auVar.f189317d = awVar;
        auVar.f189314a |= 4;
        atVar.copyOnWrite();
        C70994au auVar2 = (C70994au) atVar.instance;
        auVar2.f189316c = sVar.getNumber();
        auVar2.f189314a |= 2;
        C71020bt btVar2 = (C71020bt) C71021bu.f189399e.createBuilder();
        btVar2.copyOnWrite();
        C71021bu buVar = (C71021bu) btVar2.instance;
        buVar.f189403c = iVar.getNumber();
        buVar.f189401a |= 2;
        btVar2.copyOnWrite();
        C71021bu buVar2 = (C71021bu) btVar2.instance;
        buVar2.f189402b = uVar.getNumber();
        buVar2.f189401a |= 1;
        btVar2.copyOnWrite();
        C71021bu buVar3 = (C71021bu) btVar2.instance;
        buVar3.f189401a |= 4;
        buVar3.f189404d = z;
        atVar.copyOnWrite();
        C70994au auVar3 = (C70994au) atVar.instance;
        C71021bu buVar4 = (C71021bu) btVar2.build();
        buVar4.getClass();
        auVar3.f189318e = buVar4;
        auVar3.f189314a |= 8;
        C37253b bVar = (C37253b) j2;
        bVar.mo40792p(btVar, (C70994au) atVar.build());
        if (duration != null) {
            bVar.mo40791o(duration.toNanos());
        }
        this.f347684b.mo19974a(j2);
    }

    /* renamed from: y */
    public final void mo107426y(C119297s sVar) {
        C37258g gVar = C37176a.f96862ag;
        C37215b bVar = this.f347684b;
        C62940bt btVar = C70994au.f189312q;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        auVar.f189316c = sVar.getNumber();
        auVar.f189314a |= 2;
        bVar.mo19974a(gVar.mo40812e(btVar, (C70994au) atVar.build()));
    }

    /* renamed from: z */
    public final void mo107427z() {
        if (this.f347699r.compareAndSet(false, true)) {
            ((C59052c) ((C59052c) f347682a.mo56224b()).mo56372aa(36864)).mo56386p("First ASR start request issued [SD]");
            this.f347684b.mo19974a(C37176a.f96995dG);
        }
    }
}
