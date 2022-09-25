package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.p098j.C2069cc;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p507f.p508a.C9413b;
import com.google.android.apps.gsa.assist.p507f.p508a.C9414c;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.a.a;
import com.google.android.apps.gsa.assistant.settings.shared.ai;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.assistant.shared.C73799ab;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.assistant.shared.p5829r.C73906a;
import com.google.android.apps.gsa.assistant.shared.q.m;
import com.google.android.apps.gsa.binaries.satin.app.C74256rf;
import com.google.android.apps.gsa.binaries.satin.app.rh;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.opa.C83578ai;
import com.google.android.apps.gsa.opa.C83580ak;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6941ui.C88506a;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88514h;
import com.google.android.apps.gsa.search.shared.service.C87681ai;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88076og;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88077oh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88080ok;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88081ol;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88082om;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88083on;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88105pi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88106pj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88107pk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88108pl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88109pm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88110pn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88134qk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88263ve;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88264vf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88265vg;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p6983ah.C89150g;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90065dq;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.immersiveactions.C102403aj;
import com.google.android.apps.gsa.staticplugins.immersiveactions.C102420j;
import com.google.android.apps.gsa.staticplugins.immersiveactions.C102421k;
import com.google.android.apps.gsa.staticplugins.immersiveactions.C102424n;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.chathead.C108135a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108215am;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108227ay;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108303dt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108934ej;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109106c;
import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.C109291b;
import com.google.android.apps.gsa.staticplugins.opa.p8179ac.C106062r;
import com.google.android.apps.gsa.staticplugins.opa.p8182af.C106148y;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106163d;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106171l;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106174o;
import com.google.android.apps.gsa.staticplugins.opa.p8186ai.C106176a;
import com.google.android.apps.gsa.staticplugins.opa.p8186ai.p8187a.C106178b;
import com.google.android.apps.gsa.staticplugins.opa.p8282ap.C107145l;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107379c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107463ab;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107464ac;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107467af;
import com.google.android.apps.gsa.staticplugins.opa.p8310av.C107621a;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107656ap;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107657aq;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107659as;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107703n;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107709t;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107952c;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107955f;
import com.google.android.apps.gsa.staticplugins.opa.p8336bf.C108052g;
import com.google.android.apps.gsa.staticplugins.opa.p8344bk.C108093b;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.apps.gsa.staticplugins.opa.p8371i.C109263a;
import com.google.android.apps.gsa.staticplugins.opa.p8371i.C109264b;
import com.google.android.apps.gsa.staticplugins.opa.p8408q.C109951a;
import com.google.android.apps.gsa.staticplugins.opa.p8591u.C113711a;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114514b;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114524l;
import com.google.android.apps.gsa.staticplugins.opa.promo.C109935l;
import com.google.android.apps.gsa.staticplugins.opa.translator.offline.C113629h;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.apps.gsa.staticplugins.opa.util.C113868cw;
import com.google.android.apps.gsa.staticplugins.opa.util.C113894y;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114073ei;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114074ej;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113988g;
import com.google.android.apps.gsa.staticplugins.opa.widget.impl.C114250c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114748b;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ly */
/* compiled from: PG */
public final class C109452ly implements C90991b, C109264b, C109263a, C109716mu {

    /* renamed from: a */
    public static final C59071e f304788a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ly");

    /* renamed from: A */
    public final C68214a f304789A;

    /* renamed from: B */
    public final C68214a f304790B;

    /* renamed from: C */
    public final C58833ax f304791C;

    /* renamed from: D */
    public final C68214a f304792D;

    /* renamed from: E */
    public final C68214a f304793E;

    /* renamed from: F */
    public final C68214a f304794F;

    /* renamed from: G */
    public final C68214a f304795G;

    /* renamed from: H */
    public final C114748b f304796H;

    /* renamed from: I */
    public final C108934ej f304797I;

    /* renamed from: J */
    public final C68214a f304798J;

    /* renamed from: K */
    public final C58833ax f304799K;

    /* renamed from: L */
    final C83578ai f304800L;

    /* renamed from: M */
    public boolean f304801M = true;

    /* renamed from: N */
    public boolean f304802N = false;

    /* renamed from: O */
    public final C73799ab f304803O;

    /* renamed from: P */
    private final Window f304804P;

    /* renamed from: Q */
    private final C58833ax f304805Q;

    /* renamed from: R */
    private final C88499t f304806R;

    /* renamed from: S */
    private final C88499t f304807S;

    /* renamed from: T */
    private final C68214a f304808T;

    /* renamed from: U */
    private final C68214a f304809U;

    /* renamed from: V */
    private final Optional f304810V;

    /* renamed from: W */
    private final C21370a f304811W;

    /* renamed from: X */
    private long f304812X;

    /* renamed from: Y */
    private int f304813Y = 1;

    /* renamed from: Z */
    private final C106174o f304814Z;

    /* renamed from: b */
    public final Activity f304815b;

    /* renamed from: c */
    public final C109739nm f304816c;

    /* renamed from: d */
    public final C68214a f304817d;

    /* renamed from: e */
    public final C86124t f304818e;

    /* renamed from: f */
    public final SharedPreferences f304819f;

    /* renamed from: g */
    public final C109042fl f304820g;

    /* renamed from: h */
    public final C113894y f304821h;

    /* renamed from: i */
    public final C9388a f304822i;

    /* renamed from: j */
    public final C113863cr f304823j;

    /* renamed from: k */
    public final C86054o f304824k;

    /* renamed from: l */
    public final C107709t f304825l;

    /* renamed from: m */
    public final C68214a f304826m;

    /* renamed from: n */
    public final C109040fj f304827n;

    /* renamed from: o */
    public final C88514h f304828o;

    /* renamed from: p */
    public final FrameLayout f304829p;

    /* renamed from: q */
    final C114073ei f304830q;

    /* renamed from: r */
    final C91097g f304831r;

    /* renamed from: s */
    final C58833ax f304832s;

    /* renamed from: t */
    public C88134qk f304833t = C88134qk.UNINITIALIZED;

    /* renamed from: u */
    public long f304834u;

    /* renamed from: v */
    public final C68214a f304835v;

    /* renamed from: w */
    Bundle f304836w;

    /* renamed from: x */
    public final C107659as f304837x;

    /* renamed from: y */
    public final bm f304838y;

    /* renamed from: z */
    public final bo f304839z;

    /* JADX WARNING: type inference failed for: r3v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    public C109452ly(C91097g gVar, Window window, C109042fl flVar, C58833ax axVar, Activity activity, C109041fk fkVar, C58833ax axVar2, C68214a aVar, C109739nm nmVar, C86124t tVar, C68214a aVar2, SharedPreferences sharedPreferences, C113894y yVar, C68214a aVar3, C114074ej ejVar, C107709t tVar2, C9388a aVar4, C113863cr crVar, C86054o oVar, bm bmVar, bo boVar, C68214a aVar5, C68214a aVar6, C58833ax axVar3, C58833ax axVar4, C106174o oVar2, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C114748b bVar, C58833ax axVar5, C68214a aVar11, C68214a aVar12, C108934ej ejVar2, C68214a aVar13, C68214a aVar14, C68214a aVar15, C58833ax axVar6, Optional optional, C21370a aVar16, C73799ab abVar) {
        C83578ai aiVar;
        ? r3;
        char c;
        C91097g gVar2 = gVar;
        Window window2 = window;
        Activity activity2 = activity;
        C109041fk fkVar2 = fkVar;
        C86124t tVar3 = tVar;
        C107709t tVar4 = tVar2;
        this.f304826m = aVar14;
        C58838bb.m90866a(gVar2, "intentStarter");
        this.f304831r = gVar2;
        if (!gVar.mo65092d()) {
            C59104x d = f304788a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaController");
            ((C59052c) ((C59052c) d).mo56372aa(22924)).mo56386p("OpaController is using the wrong IntentStarter!");
            int i = C90755l.f253831a;
        }
        this.f304815b = activity2;
        this.f304804P = window2;
        C68219e.m98518a(((C68226l) ejVar.f316060a).f184585a).getClass();
        C114073ei eiVar = new C114073ei(this, this);
        this.f304830q = eiVar;
        this.f304825l = tVar4;
        if (tVar4.f299726c) {
            C107705p pVar = (C107705p) tVar4.f299725b.mo27525b();
            C58976aa aaVar = C58975e.f156826a;
            ((C107703n) pVar.f299712a.mo27525b()).f299704i.f299695a = eiVar;
            pVar.mo96230c();
        } else {
            tVar4.f299724a.mo98048b(eiVar);
        }
        if (tVar4.f299726c) {
            ((C107705p) tVar4.f299725b.mo27525b()).mo96230c();
        } else {
            tVar4.f299724a.mo98047a().mo81932c();
        }
        tVar4.mo81940l(eiVar, C114073ei.f316058i);
        this.f304818e = tVar3;
        this.f304820g = flVar;
        this.f304821h = yVar;
        this.f304822i = aVar4;
        this.f304823j = crVar;
        this.f304824k = oVar;
        this.f304838y = bmVar;
        this.f304839z = boVar;
        this.f304789A = aVar5;
        this.f304790B = aVar6;
        this.f304832s = axVar3;
        this.f304791C = axVar4;
        this.f304814Z = oVar2;
        this.f304792D = aVar7;
        this.f304793E = aVar8;
        this.f304795G = aVar10;
        this.f304796H = bVar;
        this.f304805Q = axVar5;
        this.f304808T = aVar11;
        this.f304797I = ejVar2;
        this.f304798J = aVar13;
        this.f304809U = aVar15;
        this.f304799K = axVar6;
        this.f304810V = optional;
        this.f304811W = aVar16;
        if (((Boolean) aVar10.mo27525b()).booleanValue()) {
            aiVar = new C109326jq();
        } else {
            aiVar = new C109325jp(tVar3);
        }
        this.f304800L = aiVar;
        C107657aq aqVar = (C107657aq) aVar.mo27525b();
        C107710u uVar = (C107710u) aqVar.f299625a.mo17428b();
        C107710u uVar2 = uVar;
        uVar.getClass();
        C107698i iVar = (C107698i) aqVar.f299626b.mo17428b();
        C107698i iVar2 = iVar;
        iVar.getClass();
        C87681ai aiVar2 = (C87681ai) aqVar.f299627c.mo17428b();
        C87681ai aiVar3 = aiVar2;
        aiVar2.getClass();
        Activity activity3 = (Activity) aqVar.f299628d.mo17428b();
        Activity activity4 = activity3;
        activity3.getClass();
        SharedPreferences sharedPreferences2 = (SharedPreferences) aqVar.f299629e.mo17428b();
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        sharedPreferences2.getClass();
        C86124t tVar5 = (C86124t) aqVar.f299630f.mo17428b();
        C86124t tVar6 = tVar5;
        tVar5.getClass();
        C104149a aVar17 = (C104149a) aqVar.f299631g.mo17428b();
        C104149a aVar18 = aVar17;
        aVar17.getClass();
        C21370a aVar19 = (C21370a) aqVar.f299632h.mo17428b();
        C21370a aVar20 = aVar19;
        aVar19.getClass();
        C90931ca caVar = (C90931ca) aqVar.f299633i.mo17428b();
        C90931ca caVar2 = caVar;
        caVar.getClass();
        C22871g gVar3 = (C22871g) aqVar.f299634j.mo17428b();
        C22871g gVar4 = gVar3;
        gVar3.getClass();
        C22871g gVar5 = (C22871g) aqVar.f299635k.mo17428b();
        C22871g gVar6 = gVar5;
        gVar5.getClass();
        C109712mq mqVar = (C109712mq) aqVar.f299636l.mo17428b();
        C109712mq mqVar2 = mqVar;
        mqVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) aqVar.f299637m).f184585a);
        C68214a aVar21 = a;
        a.getClass();
        C58833ax axVar7 = (C58833ax) aqVar.f299638n.mo17428b();
        C58833ax axVar8 = axVar7;
        axVar7.getClass();
        C58833ax axVar9 = (C58833ax) aqVar.f299639o.mo17428b();
        C58833ax axVar10 = axVar9;
        axVar9.getClass();
        C58833ax axVar11 = (C58833ax) aqVar.f299640p.mo17428b();
        C58833ax axVar12 = axVar11;
        axVar11.getClass();
        C107619d dVar = (C107619d) aqVar.f299641q.mo17428b();
        C107619d dVar2 = dVar;
        dVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) aqVar.f299642r).f184585a);
        C68214a aVar22 = a2;
        a2.getClass();
        C113916t tVar7 = (C113916t) aqVar.f299643s.mo17428b();
        C113916t tVar8 = tVar7;
        tVar7.getClass();
        C114524l lVar = (C114524l) aqVar.f299644t.mo17428b();
        C114524l lVar2 = lVar;
        lVar.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) aqVar.f299645u).f184585a);
        C68214a aVar23 = a3;
        a3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) aqVar.f299646v).f184585a);
        C68214a aVar24 = a4;
        a4.getClass();
        C58833ax axVar13 = (C58833ax) aqVar.f299647w.mo17428b();
        C58833ax axVar14 = axVar13;
        axVar13.getClass();
        C107379c cVar = (C107379c) aqVar.f299648x.mo17428b();
        C107379c cVar2 = cVar;
        cVar.getClass();
        C2391v vVar = (C2391v) aqVar.f299649y.mo17428b();
        C2391v vVar2 = vVar;
        vVar.getClass();
        Boolean bool = (Boolean) aqVar.f299650z.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C58833ax axVar15 = (C58833ax) aqVar.f299604A.mo17428b();
        C58833ax axVar16 = axVar15;
        axVar15.getClass();
        Boolean bool2 = (Boolean) aqVar.f299605B.mo17428b();
        bool2.getClass();
        boolean booleanValue2 = bool2.booleanValue();
        C68214a a5 = C68219e.m98518a(((C68226l) aqVar.f299606C).f184585a);
        C68214a aVar25 = a5;
        a5.getClass();
        C91097g gVar7 = (C91097g) ((C68221g) aqVar.f299607D).f184583a;
        C91097g gVar8 = gVar7;
        gVar7.getClass();
        C108093b bVar2 = (C108093b) aqVar.f299608E.mo17428b();
        C108093b bVar3 = bVar2;
        bVar2.getClass();
        C68214a a6 = C68219e.m98518a(((C68226l) aqVar.f299609F).f184585a);
        C68214a aVar26 = a6;
        a6.getClass();
        C68214a a7 = C68219e.m98518a(((C68226l) aqVar.f299610G).f184585a);
        C68214a aVar27 = a7;
        a7.getClass();
        C68214a a8 = C68219e.m98518a(((C68226l) aqVar.f299611H).f184585a);
        C68214a aVar28 = a8;
        a8.getClass();
        C58833ax axVar17 = (C58833ax) aqVar.f299612I.mo17428b();
        C58833ax axVar18 = axVar17;
        axVar17.getClass();
        C68214a a9 = C68219e.m98518a(((C68226l) aqVar.f299613J).f184585a);
        C68214a aVar29 = a9;
        a9.getClass();
        C68214a a10 = C68219e.m98518a(((C68226l) aqVar.f299614K).f184585a);
        C68214a aVar30 = a10;
        a10.getClass();
        C68214a a11 = C68219e.m98518a(((C68226l) aqVar.f299615L).f184585a);
        C68214a aVar31 = a11;
        a11.getClass();
        C68214a a12 = C68219e.m98518a(((C68226l) aqVar.f299616M).f184585a);
        C68214a aVar32 = a12;
        a12.getClass();
        C68214a a13 = C68219e.m98518a(((C68226l) aqVar.f299617N).f184585a);
        C68214a aVar33 = a13;
        a13.getClass();
        C91142g gVar9 = (C91142g) aqVar.f299618O.mo17428b();
        C91142g gVar10 = gVar9;
        gVar9.getClass();
        m mVar = (m) aqVar.f299619P.mo17428b();
        m mVar2 = mVar;
        mVar.getClass();
        C58833ax axVar19 = (C58833ax) aqVar.f299620Q.mo17428b();
        C58833ax axVar20 = axVar19;
        axVar19.getClass();
        C58833ax axVar21 = (C58833ax) aqVar.f299621R.mo17428b();
        C58833ax axVar22 = axVar21;
        axVar21.getClass();
        C68214a a14 = C68219e.m98518a(((C68226l) aqVar.f299622S).f184585a);
        C68214a aVar34 = a14;
        a14.getClass();
        Boolean bool3 = (Boolean) aqVar.f299623T.mo17428b();
        bool3.getClass();
        boolean booleanValue3 = bool3.booleanValue();
        C108321ej ejVar3 = (C108321ej) aqVar.f299624U.mo17428b();
        ejVar3.getClass();
        C107656ap apVar = new C107656ap(aiVar, uVar2, iVar2, aiVar3, activity4, sharedPreferences3, tVar6, aVar18, aVar20, caVar2, gVar4, gVar6, mqVar2, aVar21, axVar8, axVar10, axVar12, dVar2, aVar22, tVar8, lVar2, aVar23, aVar24, axVar14, cVar2, vVar2, booleanValue, axVar16, booleanValue2, aVar25, gVar8, bVar3, aVar26, aVar27, aVar28, axVar18, aVar29, aVar30, aVar31, aVar32, aVar33, gVar10, mVar2, axVar20, axVar22, aVar34, booleanValue3, ejVar3);
        this.f304837x = apVar;
        C58838bb.m90883r(axVar2.mo56113h());
        Resources a15 = ((C73841bf) aVar12.mo27525b()).mo65322a();
        C58838bb.m90884s(gVar.mo65092d(), "support startActivityForResult");
        C74256rf rfVar = (C74256rf) ((C102421k) axVar2.mo56107c()).f285847a.mo17428b();
        tVar2.getClass();
        rfVar.f207699b = tVar4;
        gVar.getClass();
        rfVar.f207700c = gVar2;
        activity.getClass();
        rfVar.f207701d = activity2;
        a15.getClass();
        rfVar.f207702e = a15;
        axVar.getClass();
        rfVar.f207703f = axVar;
        C68225k.m98529a(rfVar.f207699b, C87681ai.class);
        C68225k.m98529a(rfVar.f207700c, C91097g.class);
        C68225k.m98529a(rfVar.f207701d, Context.class);
        C68225k.m98529a(rfVar.f207702e, Resources.class);
        C68225k.m98529a(rfVar.f207703f, C58833ax.class);
        rh rhVar = new rh(rfVar.f207698a, rfVar.f207699b, rfVar.f207700c, rfVar.f207701d, rfVar.f207702e, rfVar.f207703f);
        C102424n nVar = r158;
        C102424n nVar2 = new C102424n((C86124t) rhVar.f.a.f202006C.mo17428b(), rhVar.a, rhVar.b, (C102403aj) rhVar.n.mo17428b(), (C102420j) rhVar.h.mo17428b());
        this.f304828o = nVar2;
        C102424n nVar3 = nVar2;
        C102403aj ajVar = nVar2.f285852a;
        this.f304807S = ajVar;
        gVar.getClass();
        window.getClass();
        flVar.getClass();
        aVar14.getClass();
        Activity activity5 = (Activity) fkVar2.f303488a.mo17428b();
        Activity activity6 = activity5;
        activity5.getClass();
        C68214a a16 = C68219e.m98518a(((C68226l) fkVar2.f303541b).f184585a);
        C68214a aVar35 = a16;
        a16.getClass();
        C107710u uVar3 = (C107710u) fkVar2.f303568c.mo17428b();
        C107710u uVar4 = uVar3;
        uVar3.getClass();
        C107698i iVar3 = (C107698i) fkVar2.f303569d.mo17428b();
        C114073ei eiVar2 = eiVar;
        C107698i iVar4 = iVar3;
        iVar3.getClass();
        C113863cr crVar2 = (C113863cr) fkVar2.f303570e.mo17428b();
        C113863cr crVar3 = crVar2;
        crVar2.getClass();
        C89911f fVar = (C89911f) fkVar2.f303571f.mo17428b();
        C107656ap apVar2 = apVar;
        C89911f fVar2 = fVar;
        fVar.getClass();
        C58833ax axVar23 = (C58833ax) fkVar2.f303572g.mo17428b();
        C58833ax axVar24 = axVar23;
        axVar23.getClass();
        C90931ca caVar3 = (C90931ca) fkVar2.f303573h.mo17428b();
        C90931ca caVar4 = caVar3;
        caVar3.getClass();
        C22871g gVar11 = (C22871g) fkVar2.f303574i.mo17428b();
        C22871g gVar12 = gVar11;
        gVar11.getClass();
        C22871g gVar13 = (C22871g) fkVar2.f303575j.mo17428b();
        C22871g gVar14 = gVar13;
        gVar13.getClass();
        C22871g gVar15 = (C22871g) fkVar2.f303576k.mo17428b();
        C22871g gVar16 = gVar15;
        gVar15.getClass();
        C86124t tVar9 = (C86124t) fkVar2.f303577l.mo17428b();
        C86124t tVar10 = tVar9;
        tVar9.getClass();
        C104149a aVar36 = (C104149a) fkVar2.f303578m.mo17428b();
        C104149a aVar37 = aVar36;
        aVar36.getClass();
        C109871p pVar2 = (C109871p) fkVar2.f303579n.mo17428b();
        C109871p pVar3 = pVar2;
        pVar2.getClass();
        C108115c cVar3 = (C108115c) fkVar2.f303580o.mo17428b();
        C108115c cVar4 = cVar3;
        cVar3.getClass();
        C68214a a17 = C68219e.m98518a(((C68226l) fkVar2.f303581p).f184585a);
        C68214a aVar38 = a17;
        a17.getClass();
        C9388a aVar39 = (C9388a) fkVar2.f303582q.mo17428b();
        C9388a aVar40 = aVar39;
        aVar39.getClass();
        C68214a a18 = C68219e.m98518a(((C68226l) fkVar2.f303583r).f184585a);
        C68214a aVar41 = a18;
        a18.getClass();
        C68214a a19 = C68219e.m98518a(((C68226l) fkVar2.f303584s).f184585a);
        C68214a aVar42 = a19;
        a19.getClass();
        C68214a a20 = C68219e.m98518a(((C68226l) fkVar2.f303585t).f184585a);
        C68214a aVar43 = a20;
        a20.getClass();
        C90465g gVar17 = (C90465g) fkVar2.f303586u.mo17428b();
        C90465g gVar18 = gVar17;
        gVar17.getClass();
        C9413b bVar4 = (C9413b) fkVar2.f303587v.mo17428b();
        C9413b bVar5 = bVar4;
        bVar4.getClass();
        C9414c cVar5 = (C9414c) fkVar2.f303588w.mo17428b();
        C9414c cVar6 = cVar5;
        cVar5.getClass();
        C109760of ofVar = (C109760of) fkVar2.f303589x.mo17428b();
        C109760of ofVar2 = ofVar;
        ofVar.getClass();
        C109066gc gcVar = (C109066gc) fkVar2.f303590y.mo17428b();
        C109066gc gcVar2 = gcVar;
        gcVar.getClass();
        C108303dt dtVar = (C108303dt) fkVar2.f303591z.mo17428b();
        C108303dt dtVar2 = dtVar;
        dtVar.getClass();
        C113710u uVar5 = (C113710u) fkVar2.f303462A.mo17428b();
        C113710u uVar6 = uVar5;
        uVar5.getClass();
        C107952c cVar7 = (C107952c) fkVar2.f303463B.mo17428b();
        C107952c cVar8 = cVar7;
        cVar7.getClass();
        C107955f fVar3 = (C107955f) fkVar2.f303464C.mo17428b();
        C107955f fVar4 = fVar3;
        fVar3.getClass();
        C21370a aVar44 = (C21370a) fkVar2.f303465D.mo17428b();
        C21370a aVar45 = aVar44;
        aVar44.getClass();
        C58833ax axVar25 = (C58833ax) fkVar2.f303466E.mo17428b();
        C58833ax axVar26 = axVar25;
        axVar25.getClass();
        C58833ax axVar27 = (C58833ax) fkVar2.f303467F.mo17428b();
        C58833ax axVar28 = axVar27;
        axVar27.getClass();
        C108227ay ayVar = (C108227ay) fkVar2.f303468G.mo17428b();
        C108227ay ayVar2 = ayVar;
        ayVar.getClass();
        C114514b bVar6 = (C114514b) fkVar2.f303469H.mo17428b();
        C114514b bVar7 = bVar6;
        bVar6.getClass();
        C107145l lVar3 = (C107145l) fkVar2.f303470I.mo17428b();
        C107145l lVar4 = lVar3;
        lVar3.getClass();
        C68214a a21 = C68219e.m98518a(((C68226l) fkVar2.f303471J).f184585a);
        C68214a aVar46 = a21;
        a21.getClass();
        C113629h hVar = (C113629h) fkVar2.f303472K.mo17428b();
        C113629h hVar2 = hVar;
        hVar.getClass();
        C58833ax axVar29 = (C58833ax) fkVar2.f303473L.mo17428b();
        C58833ax axVar30 = axVar29;
        axVar29.getClass();
        C106174o oVar3 = (C106174o) fkVar2.f303474M.mo17428b();
        C106174o oVar4 = oVar3;
        oVar3.getClass();
        C109951a aVar47 = (C109951a) fkVar2.f303475N.mo17428b();
        C109951a aVar48 = aVar47;
        aVar47.getClass();
        C58833ax axVar31 = (C58833ax) fkVar2.f303476O.mo17428b();
        C58833ax axVar32 = axVar31;
        axVar31.getClass();
        C68214a a22 = C68219e.m98518a(((C68226l) fkVar2.f303477P).f184585a);
        C68214a aVar49 = a22;
        a22.getClass();
        C68214a a23 = C68219e.m98518a(((C68226l) fkVar2.f303478Q).f184585a);
        C68214a aVar50 = a23;
        a23.getClass();
        C86054o oVar5 = (C86054o) fkVar2.f303479R.mo17428b();
        C86054o oVar6 = oVar5;
        oVar5.getClass();
        C68214a a24 = C68219e.m98518a(((C68226l) fkVar2.f303480S).f184585a);
        C68214a aVar51 = a24;
        a24.getClass();
        C83580ak akVar = (C83580ak) fkVar2.f303481T.mo17428b();
        C83580ak akVar2 = akVar;
        akVar.getClass();
        C68214a a25 = C68219e.m98518a(((C68226l) fkVar2.f303482U).f184585a);
        C68214a aVar52 = a25;
        a25.getClass();
        C68214a a26 = C68219e.m98518a(((C68226l) fkVar2.f303483V).f184585a);
        C68214a aVar53 = a26;
        a26.getClass();
        C58833ax axVar33 = (C58833ax) fkVar2.f303484W.mo17428b();
        C58833ax axVar34 = axVar33;
        axVar33.getClass();
        C109329jt jtVar = (C109329jt) fkVar2.f303485X.mo17428b();
        C109329jt jtVar2 = jtVar;
        jtVar.getClass();
        a aVar54 = (a) fkVar2.f303486Y.mo17428b();
        a aVar55 = aVar54;
        aVar54.getClass();
        C107619d dVar3 = (C107619d) fkVar2.f303487Z.mo17428b();
        C107619d dVar4 = dVar3;
        dVar3.getClass();
        C68219e.m98518a(((C68226l) fkVar2.f303515aa).f184585a).getClass();
        Boolean bool4 = (Boolean) fkVar2.f303516ab.mo17428b();
        bool4.getClass();
        boolean booleanValue4 = bool4.booleanValue();
        C118561t tVar11 = (C118561t) fkVar2.f303517ac.mo17428b();
        C118561t tVar12 = tVar11;
        tVar11.getClass();
        C109738nl nlVar = (C109738nl) fkVar2.f303518ad.mo17428b();
        C109738nl nlVar2 = nlVar;
        nlVar.getClass();
        C106163d dVar5 = (C106163d) fkVar2.f303519ae.mo17428b();
        C106163d dVar6 = dVar5;
        dVar5.getClass();
        C109291b bVar8 = (C109291b) fkVar2.f303520af.mo17428b();
        C109291b bVar9 = bVar8;
        bVar8.getClass();
        C109275ij ijVar = (C109275ij) fkVar2.f303521ag.mo17428b();
        C109275ij ijVar2 = ijVar;
        ijVar.getClass();
        C68214a a27 = C68219e.m98518a(((C68226l) fkVar2.f303522ah).f184585a);
        C68214a aVar56 = a27;
        a27.getClass();
        C68214a a28 = C68219e.m98518a(((C68226l) fkVar2.f303523ai).f184585a);
        C68214a aVar57 = a28;
        a28.getClass();
        C68214a a29 = C68219e.m98518a(((C68226l) fkVar2.f303524aj).f184585a);
        C68214a aVar58 = a29;
        a29.getClass();
        C113711a aVar59 = (C113711a) fkVar2.f303525ak.mo17428b();
        C113711a aVar60 = aVar59;
        aVar59.getClass();
        Query query = (Query) fkVar2.f303526al.mo17428b();
        Query query2 = query;
        query.getClass();
        C108052g gVar19 = (C108052g) fkVar2.f303527am.mo17428b();
        C108052g gVar20 = gVar19;
        gVar19.getClass();
        C68214a a30 = C68219e.m98518a(((C68226l) fkVar2.f303528an).f184585a);
        C68214a aVar61 = a30;
        a30.getClass();
        C106062r rVar = (C106062r) fkVar2.f303529ao.mo17428b();
        C106062r rVar2 = rVar;
        rVar.getClass();
        C113812ca caVar5 = (C113812ca) fkVar2.f303530ap.mo17428b();
        C113812ca caVar6 = caVar5;
        caVar5.getClass();
        C58833ax axVar35 = (C58833ax) fkVar2.f303531aq.mo17428b();
        C58833ax axVar36 = axVar35;
        axVar35.getClass();
        C114748b bVar10 = (C114748b) fkVar2.f303532ar.mo17428b();
        C114748b bVar11 = bVar10;
        bVar10.getClass();
        C58833ax axVar37 = (C58833ax) fkVar2.f303533as.mo17428b();
        C58833ax axVar38 = axVar37;
        axVar37.getClass();
        C68214a a31 = C68219e.m98518a(((C68226l) fkVar2.f303534at).f184585a);
        C68214a aVar62 = a31;
        a31.getClass();
        C68214a a32 = C68219e.m98518a(((C68226l) fkVar2.f303535au).f184585a);
        C68214a aVar63 = a32;
        a32.getClass();
        C109734nh nhVar = (C109734nh) fkVar2.f303536av.mo17428b();
        C109734nh nhVar2 = nhVar;
        nhVar.getClass();
        C113916t tVar13 = (C113916t) fkVar2.f303537aw.mo17428b();
        C113916t tVar14 = tVar13;
        tVar13.getClass();
        C68214a a33 = C68219e.m98518a(((C68226l) fkVar2.f303538ax).f184585a);
        C68214a aVar64 = a33;
        a33.getClass();
        C68214a a34 = C68219e.m98518a(((C68226l) fkVar2.f303539ay).f184585a);
        C68214a aVar65 = a34;
        a34.getClass();
        C108215am amVar = (C108215am) fkVar2.f303540az.mo17428b();
        C108215am amVar2 = amVar;
        amVar.getClass();
        C108321ej ejVar4 = (C108321ej) fkVar2.f303489aA.mo17428b();
        C108321ej ejVar5 = ejVar4;
        ejVar4.getClass();
        C114524l lVar5 = (C114524l) fkVar2.f303490aB.mo17428b();
        C114524l lVar6 = lVar5;
        lVar5.getClass();
        C68219e.m98518a(((C68226l) fkVar2.f303491aC).f184585a).getClass();
        C108093b bVar12 = (C108093b) fkVar2.f303492aD.mo17428b();
        C108093b bVar13 = bVar12;
        bVar12.getClass();
        C109106c cVar9 = (C109106c) fkVar2.f303493aE.mo17428b();
        C109106c cVar10 = cVar9;
        cVar9.getClass();
        C106148y yVar2 = (C106148y) fkVar2.f303494aF.mo17428b();
        C106148y yVar3 = yVar2;
        yVar2.getClass();
        C68214a a35 = C68219e.m98518a(((C68226l) fkVar2.f303495aG).f184585a);
        C68214a aVar66 = a35;
        a35.getClass();
        Boolean bool5 = (Boolean) fkVar2.f303496aH.mo17428b();
        bool5.getClass();
        boolean booleanValue5 = bool5.booleanValue();
        Boolean bool6 = (Boolean) fkVar2.f303497aI.mo17428b();
        bool6.getClass();
        boolean booleanValue6 = bool6.booleanValue();
        Boolean bool7 = (Boolean) fkVar2.f303498aJ.mo17428b();
        bool7.getClass();
        boolean booleanValue7 = bool7.booleanValue();
        Integer num = (Integer) fkVar2.f303499aK.mo17428b();
        num.getClass();
        int intValue = num.intValue();
        Boolean bool8 = (Boolean) fkVar2.f303500aL.mo17428b();
        bool8.getClass();
        boolean booleanValue8 = bool8.booleanValue();
        C68214a a36 = C68219e.m98518a(((C68226l) fkVar2.f303501aM).f184585a);
        C68214a aVar67 = a36;
        a36.getClass();
        C68214a a37 = C68219e.m98518a(((C68226l) fkVar2.f303502aN).f184585a);
        C68214a aVar68 = a37;
        a37.getClass();
        C68214a a38 = C68219e.m98518a(((C68226l) fkVar2.f303503aO).f184585a);
        C68214a aVar69 = a38;
        a38.getClass();
        C68214a a39 = C68219e.m98518a(((C68226l) fkVar2.f303504aP).f184585a);
        C68214a aVar70 = a39;
        a39.getClass();
        C68214a a40 = C68219e.m98518a(((C68226l) fkVar2.f303505aQ).f184585a);
        C68214a aVar71 = a40;
        a40.getClass();
        C68214a a41 = C68219e.m98518a(((C68226l) fkVar2.f303506aR).f184585a);
        C68214a aVar72 = a41;
        a41.getClass();
        C68214a a42 = C68219e.m98518a(((C68226l) fkVar2.f303507aS).f184585a);
        C68214a aVar73 = a42;
        a42.getClass();
        C68214a a43 = C68219e.m98518a(((C68226l) fkVar2.f303508aT).f184585a);
        C68214a aVar74 = a43;
        a43.getClass();
        C58833ax axVar39 = (C58833ax) fkVar2.f303509aU.mo17428b();
        C58833ax axVar40 = axVar39;
        axVar39.getClass();
        C73906a aVar75 = (C73906a) fkVar2.f303510aV.mo17428b();
        C73906a aVar76 = aVar75;
        aVar75.getClass();
        C89150g gVar21 = (C89150g) fkVar2.f303511aW.mo17428b();
        C89150g gVar22 = gVar21;
        gVar21.getClass();
        C68214a a44 = C68219e.m98518a(((C68226l) fkVar2.f303512aX).f184585a);
        C68214a aVar77 = a44;
        a44.getClass();
        C68214a a45 = C68219e.m98518a(((C68226l) fkVar2.f303513aY).f184585a);
        C68214a aVar78 = a45;
        a45.getClass();
        C109267ib ibVar = (C109267ib) fkVar2.f303514aZ.mo17428b();
        C109267ib ibVar2 = ibVar;
        ibVar.getClass();
        C68214a a46 = C68219e.m98518a(((C68226l) fkVar2.f303542ba).f184585a);
        C68214a aVar79 = a46;
        a46.getClass();
        C68214a a47 = C68219e.m98518a(((C68226l) fkVar2.f303543bb).f184585a);
        C68214a aVar80 = a47;
        a47.getClass();
        C68214a a48 = C68219e.m98518a(((C68226l) fkVar2.f303544bc).f184585a);
        C68214a aVar81 = a48;
        a48.getClass();
        C68214a a49 = C68219e.m98518a(((C68226l) fkVar2.f303545bd).f184585a);
        C68214a aVar82 = a49;
        a49.getClass();
        C68214a a50 = C68219e.m98518a(((C68226l) fkVar2.f303546be).f184585a);
        C68214a aVar83 = a50;
        a50.getClass();
        C68214a a51 = C68219e.m98518a(((C68226l) fkVar2.f303547bf).f184585a);
        C68214a aVar84 = a51;
        a51.getClass();
        C68214a a52 = C68219e.m98518a(((C68226l) fkVar2.f303548bg).f184585a);
        C68214a aVar85 = a52;
        a52.getClass();
        C68214a a53 = C68219e.m98518a(((C68226l) fkVar2.f303549bh).f184585a);
        C68214a aVar86 = a53;
        a53.getClass();
        C0167am amVar3 = (C0167am) ((C68221g) fkVar2.f303550bi).f184583a;
        C0167am amVar4 = amVar3;
        amVar3.getClass();
        C107621a aVar87 = (C107621a) fkVar2.f303551bj.mo17428b();
        C107621a aVar88 = aVar87;
        aVar87.getClass();
        C68214a a54 = C68219e.m98518a(((C68226l) fkVar2.f303552bk).f184585a);
        C68214a aVar89 = a54;
        a54.getClass();
        C68214a a55 = C68219e.m98518a(((C68226l) fkVar2.f303553bl).f184585a);
        C68214a aVar90 = a55;
        a55.getClass();
        C113868cw cwVar = (C113868cw) fkVar2.f303554bm.mo17428b();
        C113868cw cwVar2 = cwVar;
        cwVar.getClass();
        C58833ax axVar41 = (C58833ax) fkVar2.f303555bn.mo17428b();
        C58833ax axVar42 = axVar41;
        axVar41.getClass();
        C68214a a56 = C68219e.m98518a(((C68226l) fkVar2.f303556bo).f184585a);
        C68214a aVar91 = a56;
        a56.getClass();
        C108135a aVar92 = (C108135a) fkVar2.f303557bp.mo17428b();
        C108135a aVar93 = aVar92;
        aVar92.getClass();
        ai aiVar4 = (ai) fkVar2.f303558bq.mo17428b();
        ai aiVar5 = aiVar4;
        aiVar4.getClass();
        C114250c cVar11 = (C114250c) fkVar2.f303559br.mo17428b();
        C114250c cVar12 = cVar11;
        cVar11.getClass();
        C109935l lVar7 = (C109935l) fkVar2.f303560bs.mo17428b();
        C109935l lVar8 = lVar7;
        lVar7.getClass();
        C68214a a57 = C68219e.m98518a(((C68226l) fkVar2.f303561bt).f184585a);
        C68214a aVar94 = a57;
        a57.getClass();
        C108429ij ijVar3 = (C108429ij) fkVar2.f303562bu.mo17428b();
        C108429ij ijVar4 = ijVar3;
        ijVar3.getClass();
        C68214a a58 = C68219e.m98518a(((C68226l) fkVar2.f303563bv).f184585a);
        C68214a aVar95 = a58;
        a58.getClass();
        C68214a a59 = C68219e.m98518a(((C68226l) fkVar2.f303564bw).f184585a);
        C68214a aVar96 = a59;
        a59.getClass();
        C68214a a60 = C68219e.m98518a(((C68226l) fkVar2.f303565bx).f184585a);
        C68214a aVar97 = a60;
        a60.getClass();
        C68214a a61 = C68219e.m98518a(((C68226l) fkVar2.f303566by).f184585a);
        C68214a aVar98 = a61;
        a61.getClass();
        C81517a aVar99 = (C81517a) fkVar2.f303567bz.mo17428b();
        aVar99.getClass();
        C109040fj fjVar = r1;
        C109040fj fjVar2 = new C109040fj(gVar, apVar2, nVar, window, flVar, axVar, aVar14, activity6, aVar35, uVar4, iVar4, crVar3, fVar2, axVar24, caVar4, gVar12, gVar14, gVar16, tVar10, aVar37, pVar3, cVar4, aVar38, aVar40, aVar41, aVar42, aVar43, gVar18, bVar5, cVar6, ofVar2, gcVar2, dtVar2, uVar6, cVar8, fVar4, aVar45, axVar26, axVar28, ayVar2, bVar7, lVar4, aVar46, hVar2, axVar30, oVar4, aVar48, axVar32, aVar49, aVar50, oVar6, aVar51, akVar2, aVar52, aVar53, axVar34, jtVar2, aVar55, dVar4, booleanValue4, tVar12, nlVar2, dVar6, bVar9, ijVar2, aVar56, aVar57, aVar58, aVar60, query2, gVar20, aVar61, rVar2, caVar6, axVar36, bVar11, axVar38, aVar62, aVar63, nhVar2, tVar14, aVar64, aVar65, amVar2, ejVar5, lVar6, bVar13, cVar10, yVar3, aVar66, booleanValue5, booleanValue6, booleanValue7, intValue, booleanValue8, aVar67, aVar68, aVar69, aVar70, aVar71, aVar72, aVar73, aVar74, axVar40, aVar76, gVar22, aVar77, aVar78, ibVar2, aVar79, aVar80, aVar81, aVar82, aVar83, aVar84, aVar85, aVar86, amVar4, aVar88, aVar89, aVar90, cwVar2, axVar42, aVar91, aVar93, aiVar5, cVar12, lVar8, aVar94, ijVar4, aVar95, aVar96, aVar97, aVar98, aVar99);
        C109040fj fjVar3 = fjVar;
        this.f304827n = fjVar3;
        fjVar3.f303260aT = this;
        C88499t tVar15 = fjVar3.f303451p;
        this.f304806R = tVar15;
        C88523c cVar13 = fjVar3.f303392cx;
        C107656ap apVar3 = apVar2;
        C107656ap apVar4 = apVar3;
        apVar3.f299545ab = cVar13;
        ((C109711mp) apVar3.f299588k).f305661k = cVar13;
        apVar3.f299595r = fjVar3.f303453r;
        C114073ei eiVar3 = eiVar2;
        eiVar3.f304368e = tVar15;
        eiVar3.f304367d = ajVar;
        C102424n nVar4 = nVar2;
        eiVar3.f304369f = nVar4;
        C102424n nVar5 = nVar4;
        nVar4.f285855d = fjVar3;
        C108230ba baVar = fjVar3.f303450o;
        if ((baVar instanceof C113988g) && ((C113988g) baVar).mo100830bc().mo56113h()) {
            C102424n nVar6 = nVar4;
            nVar4.f285852a.f285821h = (C88506a) ((C113988g) fjVar3.f303450o).mo100830bc().mo56107c();
        }
        this.f304816c = nmVar;
        this.f304819f = sharedPreferences;
        this.f304835v = aVar3;
        this.f304817d = aVar2;
        this.f304794F = aVar9;
        this.f304803O = abVar;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(activity).inflate(R.layout.opa_container, (ViewGroup) null);
        this.f304829p = frameLayout;
        if (axVar.mo56113h()) {
            r3 = 0;
            frameLayout.setFitsSystemWindows(false);
        } else {
            r3 = 0;
        }
        if (!fjVar3.mo97528bv() || Build.VERSION.SDK_INT < 30) {
            c = 1;
        } else {
            C2069cc.m5650a(window, r3);
            c = 1;
            fjVar3.mo97471ag(true);
            frameLayout.setOnApplyWindowInsetsListener(new C109447lt(this, tVar));
        }
        frameLayout.addView(fjVar3.mo97536h());
        C109451lx lxVar = new C109451lx(this);
        C88244um[] umVarArr = new C88244um[4];
        umVarArr[r3] = C88244um.COMMIT_TO_TOUCH_ON_PAUSE;
        umVarArr[c] = C88244um.DO_NOT_COMMIT_TO_TOUCH_ON_PAUSE;
        umVarArr[2] = C88244um.NO_SPEECH_DETECTED;
        umVarArr[3] = C88244um.OPA_SESSION_SERVICE_EVENT;
        tVar2.mo81940l(lxVar, umVarArr);
        this.f304812X = aVar16.mo26871c() - Duration.ofDays(1).toMillis();
    }

    /* renamed from: b */
    public static C28293k m182133b(View view) {
        List list;
        int i;
        C28292j a = C28295m.m52915a(view);
        if (!(view instanceof ViewGroup) || (a != null && ((C60214n) a.f76973a.instance).f162918c == 27049)) {
            list = Collections.emptyList();
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            list = new ArrayList(viewGroup.getChildCount());
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                C28293k b = m182133b(viewGroup.getChildAt(i2));
                C28292j jVar = ((C28257a) b).f76908a;
                if (jVar == null || !((i = ((C60214n) jVar.f76973a.instance).f162918c) == 50601 || i == 50602 || i == 49852 || i == 43321 || i == 27225 || i == 137448 || i == 141563 || i == 51771 || i == 51772 || i == 51773 || i == 97415 || i == 69720 || i == 86558 || i == 87971)) {
                    list.add(b);
                }
            }
        }
        return C28293k.m52907d(a, list);
    }

    /* JADX WARNING: type inference failed for: r7v14, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01f2  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95148A(int r7, int r8, android.content.Intent r9, android.os.Bundle r10) {
        /*
            r6 = this;
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L_0x0180
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r9 != 0) goto L_0x001b
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.C109298iu.f304476a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "Null intent data"
            r9 = 22833(0x5931, float:3.1996E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x0118
        L_0x001b:
            java.lang.String r7 = "assistant_handoff_result_request"
            android.os.Parcelable r7 = r9.getParcelableExtra(r7)
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r7 = (com.google.android.libraries.gsa.monet.shared.ProtoParcelable) r7
            if (r7 != 0) goto L_0x0028
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x003c
        L_0x0028:
            com.google.assistant.au.f r8 = com.google.assistant.p3862au.C50522f.f131501d
            com.google.protobuf.eb r8 = r8.getParserForType()
            com.google.protobuf.ba r9 = com.google.protobuf.C62921ba.m95368a()
            com.google.protobuf.bv r7 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43557b(r7, r8, r9, r1)
            com.google.assistant.au.f r7 = (com.google.assistant.p3862au.C50522f) r7
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90833j(r7)
        L_0x003c:
            boolean r8 = r7.mo56113h()
            if (r8 != 0) goto L_0x0053
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.C109298iu.f304476a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "Null handoff result request"
            r9 = 22832(0x5930, float:3.1994E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            goto L_0x0118
        L_0x0053:
            java.lang.Object r8 = r7.mo56107c()
            com.google.assistant.au.f r8 = (com.google.assistant.p3862au.C50522f) r8
            java.lang.String r8 = r8.f131504b
            java.lang.Object r7 = r7.mo56107c()
            com.google.assistant.au.f r7 = (com.google.assistant.p3862au.C50522f) r7
            com.google.protobuf.dn r7 = r7.f131505c
            java.util.Map r7 = java.util.Collections.unmodifiableMap(r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0109
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x0075
            goto L_0x0109
        L_0x0075:
            com.google.assistant.e.j.du r9 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.ds r9 = (com.google.assistant.p3897e.p3921j.C51803ds) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.du r10 = (com.google.assistant.p3897e.p3921j.C51805du) r10
            r8.getClass()
            int r2 = r10.f135926a
            r2 = r2 | r1
            r10.f135926a = r2
            r10.f135927b = r8
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0096:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00fe
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            java.lang.String r10 = (java.lang.String) r10
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.jz r2 = (com.google.assistant.p3897e.p3921j.C52228jz) r2
            java.lang.Object r3 = r8.getValue()
            com.google.protobuf.h r3 = (com.google.protobuf.C63070h) r3
            java.lang.String r3 = r3.f170217a
            r4 = 47
            int r4 = r3.lastIndexOf(r4)
            if (r4 >= 0) goto L_0x00c3
            java.lang.String r3 = ""
            goto L_0x00c9
        L_0x00c3:
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
        L_0x00c9:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            r3.getClass()
            int r5 = r4.f137059a
            r5 = r5 | r1
            r4.f137059a = r5
            r4.f137060b = r3
            java.lang.Object r8 = r8.getValue()
            com.google.protobuf.h r8 = (com.google.protobuf.C63070h) r8
            com.google.protobuf.z r8 = r8.f170218b
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3
            r8.getClass()
            int r4 = r3.f137059a
            r4 = r4 | 2
            r3.f137059a = r4
            r3.f137061c = r8
            com.google.protobuf.bv r8 = r2.build()
            com.google.assistant.e.j.ka r8 = (com.google.assistant.p3897e.p3921j.C52230ka) r8
            r9.mo53729a(r10, r8)
            goto L_0x0096
        L_0x00fe:
            com.google.protobuf.bv r7 = r9.build()
            com.google.assistant.e.j.du r7 = (com.google.assistant.p3897e.p3921j.C51805du) r7
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r7)
            goto L_0x0118
        L_0x0109:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.C109298iu.f304476a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "No input name or params provided"
            r9 = 22834(0x5932, float:3.1997E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
        L_0x0118:
            com.google.android.apps.gsa.staticplugins.opa.fj r8 = r6.f304827n
            r8.mo97545r()
            boolean r8 = r7.mo56113h()
            if (r8 != 0) goto L_0x014c
            com.google.common.f.e r7 = f304788a
            com.google.common.f.x r7 = r7.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r9 = "OpaController"
            r7.mo56378ag(r8, r9)
            java.lang.String r8 = "No client input created: failed to resume, displaying error message in chat"
            r9 = 22936(0x5998, float:3.214E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r6.f304827n
            android.content.Context r8 = r6.mo97827a()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2132090627(0x7f151f03, float:1.98216E38)
            java.lang.CharSequence r8 = r8.getText(r9)
            r7.mo97451aM(r8, r0)
            return
        L_0x014c:
            com.google.android.apps.gsa.search.shared.service.b.oy r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy.f238174g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ox r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox) r8
            java.lang.Object r7 = r7.mo56107c()
            com.google.assistant.e.j.du r7 = (com.google.assistant.p3897e.p3921j.C51805du) r7
            com.google.protobuf.z r7 = r7.toByteString()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.search.shared.service.b.oy r9 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r9
            r7.getClass()
            int r10 = r9.f238176a
            r10 = r10 | r1
            r9.f238176a = r10
            r9.f238177b = r7
            com.google.protobuf.bv r7 = r8.build()
            com.google.android.apps.gsa.search.shared.service.b.oy r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r7
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r7)
            com.google.android.apps.gsa.staticplugins.opa.fj r7 = r6.f304827n
            r7.mo97452aN(r0)
            goto L_0x029f
        L_0x0180:
            if (r7 != r1) goto L_0x029f
            java.lang.String r7 = "opacallback.EXTRA_GAME_ID"
            java.lang.String r7 = r10.getString(r7)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r9 = 0
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x029e
            if (r7 == 0) goto L_0x01a9
            int r10 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x019b }
            goto L_0x01aa
        L_0x019b:
            r10 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.p8347bn.C108102a.f300706a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Couldn't parse String gameId to int: %s."
            r4 = 28771(0x7063, float:4.0317E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r10)).mo56372aa(r4)).mo56389s(r3, r7)
        L_0x01a9:
            r10 = 0
        L_0x01aa:
            if (r10 != 0) goto L_0x01ae
            goto L_0x0299
        L_0x01ae:
            java.lang.String r9 = "sessionHighScore"
            boolean r2 = r8.containsKey(r9)
            if (r2 == 0) goto L_0x01d1
            java.lang.Object r8 = r8.get(r9)     // Catch:{ NumberFormatException -> 0x01c3 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01c3 }
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01c3 }
            r7 = r0
            r0 = 1
            goto L_0x01d2
        L_0x01c3:
            r8 = move-exception
            com.google.common.f.e r9 = com.google.android.apps.gsa.staticplugins.opa.p8347bn.C108102a.f300706a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r2 = "Couldn't parse String score to int: %s."
            r3 = 28770(0x7062, float:4.0315E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r8)).mo56372aa(r3)).mo56389s(r2, r7)
        L_0x01d1:
            r7 = 0
        L_0x01d2:
            com.google.android.apps.gsa.search.shared.service.b.oy r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy.f238174g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.ox r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox) r8
            com.google.assistant.e.j.up r9 = com.google.assistant.p3897e.p3921j.C52515up.f137853d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.uo r9 = (com.google.assistant.p3897e.p3921j.C52514uo) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.assistant.e.j.up r2 = (com.google.assistant.p3897e.p3921j.C52515up) r2
            int r3 = r2.f137855a
            r3 = r3 | r1
            r2.f137855a = r3
            r2.f137856b = r10
            if (r0 == 0) goto L_0x0220
            com.google.assistant.e.j.ur r10 = com.google.assistant.p3897e.p3921j.C52517ur.f137858c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.j.uq r10 = (com.google.assistant.p3897e.p3921j.C52516uq) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.assistant.e.j.ur r0 = (com.google.assistant.p3897e.p3921j.C52517ur) r0
            int r2 = r0.f137860a
            r2 = r2 | r1
            r0.f137860a = r2
            r0.f137861b = r7
            com.google.protobuf.bv r7 = r10.build()
            com.google.assistant.e.j.ur r7 = (com.google.assistant.p3897e.p3921j.C52517ur) r7
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.up r10 = (com.google.assistant.p3897e.p3921j.C52515up) r10
            r7.getClass()
            r10.f137857c = r7
            int r7 = r10.f137855a
            r7 = r7 | 2
            r10.f137855a = r7
        L_0x0220:
            com.google.assistant.e.j.ka r7 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.jz r7 = (com.google.assistant.p3897e.p3921j.C52228jz) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.e.j.ka r10 = (com.google.assistant.p3897e.p3921j.C52230ka) r10
            int r0 = r10.f137059a
            r0 = r0 | r1
            r10.f137059a = r0
            java.lang.String r0 = "assistant.api.client_input.GameClosedInput"
            r10.f137060b = r0
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.e.j.up r9 = (com.google.assistant.p3897e.p3921j.C52515up) r9
            com.google.protobuf.z r9 = r9.toByteString()
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.e.j.ka r10 = (com.google.assistant.p3897e.p3921j.C52230ka) r10
            r9.getClass()
            int r0 = r10.f137059a
            r0 = r0 | 2
            r10.f137059a = r0
            r10.f137061c = r9
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.ka r7 = (com.google.assistant.p3897e.p3921j.C52230ka) r7
            com.google.assistant.e.j.du r9 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.ds r9 = (com.google.assistant.p3897e.p3921j.C51803ds) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.du r10 = (com.google.assistant.p3897e.p3921j.C51805du) r10
            int r0 = r10.f135926a
            r0 = r0 | r1
            r10.f135926a = r0
            java.lang.String r0 = "game.CLOSED"
            r10.f135927b = r0
            java.lang.String r10 = "game_closed_input"
            r9.mo53729a(r10, r7)
            com.google.protobuf.bv r7 = r9.build()
            com.google.assistant.e.j.du r7 = (com.google.assistant.p3897e.p3921j.C51805du) r7
            com.google.protobuf.z r7 = r7.toByteString()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.search.shared.service.b.oy r9 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r9
            r7.getClass()
            int r10 = r9.f238176a
            r10 = r10 | r1
            r9.f238176a = r10
            r9.f238177b = r7
            com.google.protobuf.bv r7 = r8.build()
            r9 = r7
            com.google.android.apps.gsa.search.shared.service.b.oy r9 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r9
        L_0x0299:
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90833j(r9)
            goto L_0x029f
        L_0x029e:
            throw r9
        L_0x029f:
            boolean r7 = r8.mo56113h()
            if (r7 == 0) goto L_0x02c0
            com.google.android.apps.gsa.staticplugins.opa.az.t r7 = r6.f304825l
            com.google.android.apps.gsa.search.shared.service.j r9 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.OPA_CLIENT_INPUT
            r9.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r10)
            com.google.protobuf.bt r10 = com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow.f238173a
            java.lang.Object r8 = r8.mo56107c()
            com.google.android.apps.gsa.search.shared.service.b.oy r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy) r8
            r9.mo82014b(r10, r8)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r8 = r9.mo82013a()
            r7.mo81937i(r8)
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109452ly.mo95148A(int, int, android.content.Intent, android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo97827a() {
        return ((C102424n) this.f304828o).f285853b;
    }

    /* renamed from: c */
    public final void mo97727c() {
        if (this.f304832s.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            if (((C106171l) this.f304832s.mo56107c()).f296304b.f230023b.isDeviceLocked()) {
                ((C106171l) this.f304832s.mo56107c()).mo95343g(1, this.f304815b, new C108808el(this.f304827n, false, (C22869e) null), this.f304831r);
            } else if (((C106171l) this.f304832s.mo56107c()).f296304b.mo78228b()) {
                ((C106171l) this.f304832s.mo56107c()).mo95343g(1, this.f304815b, new C108808el(this.f304827n, true, (C22869e) null), this.f304831r);
            }
        } else if (this.f304804P != null) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f304804P.clearFlags(524288);
            this.f304804P.addFlags(4194304);
        } else {
            C59104x d = f304788a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaController");
            ((C59052c) ((C59052c) d).mo56372aa(22927)).mo56386p("#forceUserUnlock: cannot force unlock without a Window.");
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: e */
    public final void mo97828e(Bundle bundle) {
        C106176a aVar;
        if (!this.f304810V.isEmpty()) {
            if (C87566i.m142283ag(bundle)) {
                aVar = C106176a.NGA_CLOUD_HANDOVER;
            } else if (C87566i.m142284ah(bundle)) {
                aVar = C106176a.VOICE_INTERACTION_SESSION;
            } else if (C87566i.m142279ac(bundle)) {
                aVar = C106176a.OUTSIDE_AGSA;
            } else {
                return;
            }
            long c = this.f304811W.mo26871c();
            long min = Math.min(c - this.f304812X, 2147483647L);
            this.f304812X = c;
            int[] iArr = {250, 500, 1000, SimpleSnackbar.LENGTH_SHORT, 3000, 5000, 10000, 20000};
            int orElse = DesugarArrays.stream(iArr).filter(new C109450lw((int) min)).findFirst().orElse(iArr[7]);
            C106178b bVar = (C106178b) this.f304810V.get();
            String a = bVar.mo95345a();
            Integer valueOf = Integer.valueOf(orElse);
            C39141kp kpVar = bVar.f296323a;
            ((C19567d) kpVar.f102795F.mo6453a()).mo24822a(1, bVar.f296324b, bVar.f296325c, a, aVar.f296321d, valueOf);
        }
    }

    /* renamed from: f */
    public final void mo97728f() {
        if (!((Boolean) this.f304808T.mo27525b()).booleanValue() && this.f304814Z.f296314a && this.f304832s.mo56113h() && ((C106171l) this.f304832s.mo56107c()).f296306d && ((C106171l) this.f304832s.mo56107c()).f296304b.mo78228b()) {
            if (this.f304805Q.mo56113h() && ((C73798aa) this.f304805Q.mo56107c()).mo65282f()) {
                return;
            }
            if ((!((Boolean) this.f304795G.mo27525b()).booleanValue() || (!C87566i.m142295as(this.f304836w) && C87566i.m142309h(this.f304836w) != 6)) && !C90721ae.f253798g.contains(C87566i.m142234I(this.f304836w))) {
                C58976aa aaVar = C58975e.f156826a;
                ((C106171l) this.f304832s.mo56107c()).mo95343g(1, this.f304815b, new C108808el(this.f304827n, true, (C22869e) null), this.f304831r);
            }
        }
    }

    /* renamed from: g */
    public final void mo97829g() {
        DisplayMetrics displayMetrics = this.f304815b.getResources().getDisplayMetrics();
        mo97830h(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("OpaController");
        fVar.mo85279c("OpaUiMode").mo85276a(C90752i.m148231e(this.f304833t));
        fVar.mo85279c("FromLPH").mo85276a(C90752i.m148228b(Boolean.valueOf(C87566i.m142282af(this.f304836w))));
        fVar.mo85279c("FromElmyra").mo85276a(C90752i.m148228b(Boolean.valueOf(C87566i.m142294ar(this.f304836w))));
        fVar.mo85279c("FromAssistLayer").mo85276a(C90752i.m148228b(Boolean.valueOf(C87566i.m142279ac(this.f304836w))));
        fVar.mo85279c("FromHotword").mo85276a(C90752i.m148228b(Boolean.valueOf(C87566i.m142297au(this.f304836w))));
        fVar.mo85279c("FromLockscreen").mo85276a(C90752i.m148228b(Boolean.valueOf(C87566i.m142298av(this.f304836w))));
        fVar.mo85286m(this.f304825l);
        fVar.mo85286m(this.f304827n);
        fVar.mo85286m(this.f304828o);
        fVar.mo85286m(this.f304837x);
    }

    /* renamed from: h */
    public final void mo97830h(int i, int i2) {
        C107709t tVar = this.f304825l;
        C88489j jVar = new C88489j(C87739bu.OPA_ACTIVITY_SIZE);
        C62940bt btVar = C88081ol.f238151a;
        C88082om omVar = (C88082om) C88083on.f238152d.createBuilder();
        omVar.copyOnWrite();
        C88083on onVar = (C88083on) omVar.instance;
        onVar.f238154a |= 1;
        onVar.f238155b = i;
        omVar.copyOnWrite();
        C88083on onVar2 = (C88083on) omVar.instance;
        onVar2.f238154a |= 2;
        onVar2.f238156c = i2;
        jVar.mo82014b(btVar, (C88083on) omVar.build());
        tVar.mo81937i(jVar.mo82013a());
    }

    /* renamed from: i */
    public final void mo97831i(C88079oj ojVar) {
        boolean equals = C88079oj.RESUMED.equals(ojVar);
        if (this.f304799K.mo56113h()) {
            if (equals && this.f304827n.mo97528bv()) {
                C109040fj fjVar = this.f304827n;
                if (fjVar.mo97528bv() && fjVar.f303455t.mo79746e(C90029ch.f248282bp) && C109040fj.m181378bx(fjVar.f303450o)) {
                    C58976aa aaVar = C58975e.f156826a;
                    if (fjVar.f303275ai == C109026ey.UNINITIALIZED) {
                        C59104x b = f304788a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "OpaController");
                        ((C59052c) ((C59052c) b).mo56372aa(22949)).mo56386p("setOpaActivityInForeground=false");
                        equals = false;
                    }
                }
            }
            ((C108100a) this.f304799K.mo56107c()).mo96445j(equals);
        }
        Query F = C87566i.m142231F(this.f304836w);
        if (F == null) {
            F = C87566i.m142230E(this.f304836w);
        }
        long j = F == null ? 0 : F.f252749G;
        C107709t tVar = this.f304825l;
        C88489j jVar = new C88489j(C87739bu.OPA_ACTIVITY_LIFECYCLE_STATE);
        C62940bt btVar = C88076og.f238138a;
        C88077oh ohVar = (C88077oh) C88080ok.f238146d.createBuilder();
        ohVar.copyOnWrite();
        C88080ok okVar = (C88080ok) ohVar.instance;
        okVar.f238149b = ojVar.f238145e;
        okVar.f238148a |= 1;
        ohVar.copyOnWrite();
        C88080ok okVar2 = (C88080ok) ohVar.instance;
        okVar2.f238148a |= 2;
        okVar2.f238150c = j;
        jVar.mo82014b(btVar, (C88080ok) ohVar.build());
        tVar.mo81937i(jVar.mo82013a());
        this.f304810V.ifPresent(new C109449lv(equals));
    }

    /* renamed from: j */
    public final void mo97832j(boolean z) {
        if (this.f304799K.mo56113h()) {
            ((C108100a) this.f304799K.mo56107c()).mo96444i(z);
        }
    }

    /* renamed from: k */
    public final void mo97833k(boolean z) {
        C107709t tVar = this.f304825l;
        C88489j jVar = new C88489j(C87739bu.SET_HOTWORD_DETECTION_ENABLED);
        C62940bt btVar = C88263ve.f238733a;
        C88264vf vfVar = (C88264vf) C88265vg.f238734c.createBuilder();
        vfVar.copyOnWrite();
        C88265vg vgVar = (C88265vg) vfVar.instance;
        vgVar.f238736a |= 1;
        vgVar.f238737b = z;
        jVar.mo82014b(btVar, (C88265vg) vfVar.build());
        tVar.mo81937i(jVar.mo82013a());
    }

    /* renamed from: l */
    public final void mo97834l(boolean z, Intent intent) {
        mo97727c();
        if (z) {
            this.f304825l.mo96239a((Bundle) null);
        }
        this.f304831r.mo65089a(intent);
        this.f304820g.mo95151b();
    }

    /* renamed from: m */
    public final void mo97835m(boolean z, String str) {
        C88106pj pjVar = (C88106pj) C88107pk.f238199h.createBuilder();
        pjVar.copyOnWrite();
        C88107pk pkVar = (C88107pk) pjVar.instance;
        pkVar.f238201a |= 1;
        pkVar.f238202b = z;
        if (z) {
            pjVar.copyOnWrite();
            C88107pk pkVar2 = (C88107pk) pjVar.instance;
            pkVar2.f238201a |= 2;
            pkVar2.f238203c = false;
            pjVar.copyOnWrite();
            C88107pk pkVar3 = (C88107pk) pjVar.instance;
            pkVar3.f238201a |= 4;
            pkVar3.f238204d = false;
        }
        C107709t tVar = this.f304825l;
        C88489j jVar = new C88489j(C87739bu.OPA_DISPLAY_CONTEXT_UPDATED);
        jVar.mo82014b(C88105pi.f238198a, (C88107pk) pjVar.build());
        tVar.mo81937i(jVar.mo82013a());
        if (z) {
            C107464ac acVar = (C107464ac) C107467af.f299043c.createBuilder();
            acVar.copyOnWrite();
            C107467af afVar = (C107467af) acVar.instance;
            afVar.f299046b = 0;
            afVar.f299045a |= 1;
            C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
            C107502c cVar = C107502c.OPA_UI_RENDERING_STATUS;
            dVar.copyOnWrite();
            C107504e eVar = (C107504e) dVar.instance;
            eVar.f299118b = cVar.f299114n;
            eVar.f299117a |= 1;
            dVar.mo58885m(C107463ab.f299041a, (C107467af) acVar.build());
            C88489j jVar2 = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
            jVar2.mo82014b(C107460a.f299029a, (C107504e) dVar.build());
            this.f304825l.mo81937i(jVar2.mo82013a());
        }
        C88109pm pmVar = (C88109pm) C88110pn.f238210c.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            pmVar.copyOnWrite();
            C88110pn pnVar = (C88110pn) pmVar.instance;
            str.getClass();
            pnVar.f238212a |= 1;
            pnVar.f238213b = str;
        }
        C107709t tVar2 = this.f304825l;
        C88489j jVar3 = new C88489j(C87739bu.OPA_FOREGROUND_APP_UPDATED);
        jVar3.mo82014b(C88108pl.f238209a, (C88110pn) pmVar.build());
        tVar2.mo81937i(jVar3.mo82013a());
    }

    /* renamed from: n */
    public final boolean mo97836n() {
        return this.f304837x.mo96131aD();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[ADDED_TO_REGION] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97729o(int r7) {
        /*
            r6 = this;
            int r0 = r6.f304813Y
            if (r0 != r7) goto L_0x0005
            return
        L_0x0005:
            r6.f304813Y = r7
            r1 = 3
            if (r7 != r1) goto L_0x001a
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ei r2 = r6.f304830q
            com.google.android.apps.gsa.search.shared.service.t r3 = r6.f304807S
            r2.f304366c = r3
            android.view.Window r2 = r6.f304804P
            if (r2 == 0) goto L_0x0029
            r3 = 32
            r2.setSoftInputMode(r3)
            goto L_0x0029
        L_0x001a:
            com.google.android.apps.gsa.staticplugins.opa.valyrian.ei r2 = r6.f304830q
            com.google.android.apps.gsa.search.shared.service.t r3 = r6.f304806R
            r2.f304366c = r3
            android.view.Window r2 = r6.f304804P
            if (r2 == 0) goto L_0x0029
            r3 = 16
            r2.setSoftInputMode(r3)
        L_0x0029:
            com.google.android.apps.gsa.search.core.i.t r2 = r6.f304818e
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247760nI
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x00bb
            dagger.a r2 = r6.f304795G
            java.lang.Object r2 = r2.mo27525b()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x00bb
            com.google.android.apps.gsa.staticplugins.opa.ay.as r2 = r6.f304837x
            boolean r2 = r2.mo96130aC()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0053
            if (r7 != r1) goto L_0x005d
            com.google.android.apps.gsa.staticplugins.opa.ay.as r2 = r6.f304837x
            r2.mo96163ao(r3)
            goto L_0x005d
        L_0x0053:
            com.google.android.apps.gsa.staticplugins.opa.ay.as r2 = r6.f304837x
            int r2 = r2.mo96177e()
            if (r2 != r4) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            android.os.Bundle r5 = r6.f304836w
            if (r5 == 0) goto L_0x0068
            boolean r5 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142258aF(r5)
            if (r5 != 0) goto L_0x006a
        L_0x0068:
            if (r7 != r1) goto L_0x006c
        L_0x006a:
            r7 = 1
            goto L_0x006d
        L_0x006c:
            r7 = 0
        L_0x006d:
            com.google.android.apps.gsa.search.core.i.t r1 = r6.f304818e
            boolean r1 = com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f.m188690a(r1)
            if (r1 == 0) goto L_0x009c
            if (r0 != r4) goto L_0x009c
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f304818e
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249528fI
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x0090
            dagger.a r0 = r6.f304809U
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.cv r0 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv) r0
            boolean r0 = r0.mo99907c()
            if (r0 != 0) goto L_0x009c
            goto L_0x009a
        L_0x0090:
            com.google.android.apps.gsa.search.core.i.t r0 = r6.f304818e
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249527fH
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x009c
        L_0x009a:
            r0 = 1
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r7 != 0) goto L_0x00a4
            if (r0 == 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r0 = 0
            goto L_0x00a5
        L_0x00a4:
            r0 = 1
        L_0x00a5:
            com.google.android.apps.gsa.staticplugins.opa.ay.as r1 = r6.f304837x
            if (r0 != 0) goto L_0x00ac
            if (r2 != 0) goto L_0x00ac
            r3 = 1
        L_0x00ac:
            r1.mo96153ae(r3)
            com.google.android.apps.gsa.staticplugins.opa.ay.as r1 = r6.f304837x
            r0 = r0 ^ r4
            r1.mo96149aa(r0)
            com.google.android.apps.gsa.staticplugins.opa.ay.as r0 = r6.f304837x
            r7 = r7 ^ r4
            r0.mo96150ab(r7)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109452ly.mo97729o(int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo97837p() {
        if (this.f304818e.mo79746e(C90065dq.f249657d)) {
            this.f304803O.f195096a.set(true);
        } else {
            this.f304802N = true;
        }
    }
}
