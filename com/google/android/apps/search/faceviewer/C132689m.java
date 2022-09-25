package com.google.android.apps.search.faceviewer;

import android.content.Intent;
import com.google.android.apps.search.faceviewer.p10090b.C132677a;
import com.google.android.apps.search.faceviewer.web.WebXFaceViewerWebImplementation;
import com.google.android.libraries.p579ar.faceviewer.C10661e;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.p579ar.faceviewer.p587b.C10647l;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.p363ad.p364a.C6669aa;
import com.google.p363ad.p364a.C6670ab;
import com.google.p363ad.p364a.C6671ac;
import com.google.p363ad.p364a.C6675ag;
import com.google.p363ad.p364a.C6676ah;
import com.google.p363ad.p364a.C6677ai;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.youtube.p5162a.p5163a.C65977ag;
import com.google.protos.youtube.p5162a.p5163a.C65978ah;
import com.google.protos.youtube.p5162a.p5163a.C65990g;
import com.google.protos.youtube.p5162a.p5163a.C65991h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.faceviewer.m */
/* compiled from: PG */
public final class C132689m {

    /* renamed from: a */
    public final C132686j f362073a;

    /* renamed from: b */
    public final Executor f362074b;

    /* renamed from: c */
    public final Executor f362075c;

    /* renamed from: d */
    public final Executor f362076d;

    /* renamed from: e */
    public final AccountId f362077e;

    /* renamed from: f */
    public final C10662f f362078f;

    /* renamed from: g */
    public final C69464a f362079g;

    /* renamed from: h */
    public final C10647l f362080h;

    /* renamed from: i */
    public C10661e f362081i;

    /* renamed from: j */
    public final WebXFaceViewerWebImplementation f362082j;

    public C132689m(C132686j jVar, C60888db dbVar, C60887da daVar, AccountId accountId, C60887da daVar2, WebXFaceViewerWebImplementation webXFaceViewerWebImplementation, C10662f fVar, C69464a aVar) {
        this.f362073a = jVar;
        this.f362074b = dbVar;
        this.f362075c = daVar;
        this.f362076d = daVar2;
        this.f362077e = accountId;
        this.f362078f = fVar;
        this.f362079g = aVar;
        this.f362080h = new C10647l(jVar);
        this.f362082j = webXFaceViewerWebImplementation;
        jVar.f362067a.mo5790b(webXFaceViewerWebImplementation);
    }

    /* renamed from: a */
    public static C6677ai m215691a(Intent intent) {
        C6669aa aaVar = (C6669aa) C6677ai.f19940j.createBuilder();
        int a = C132677a.m215667a(intent);
        aaVar.copyOnWrite();
        C6677ai aiVar = (C6677ai) aaVar.instance;
        aiVar.f19942a |= 256;
        aiVar.f19950i = a;
        C6675ag agVar = (C6675ag) C6676ah.f19935d.createBuilder();
        String e = C132677a.m215671e(intent);
        agVar.copyOnWrite();
        C6676ah ahVar = (C6676ah) agVar.instance;
        ahVar.f19937a |= 1;
        ahVar.f19938b = e;
        C65990g gVar = (C65990g) C65991h.f179478e.createBuilder();
        gVar.copyOnWrite();
        C65991h hVar = (C65991h) gVar.instance;
        hVar.f179480a |= 1;
        hVar.f179481b = false;
        C65977ag agVar2 = (C65977ag) C65978ah.f179448d.createBuilder();
        agVar2.copyOnWrite();
        C65978ah ahVar2 = (C65978ah) agVar2.instance;
        ahVar2.f179450a |= 1;
        ahVar2.f179451b = false;
        agVar2.copyOnWrite();
        C65978ah ahVar3 = (C65978ah) agVar2.instance;
        ahVar3.f179450a |= 2;
        ahVar3.f179452c = false;
        gVar.copyOnWrite();
        C65991h hVar2 = (C65991h) gVar.instance;
        C65978ah ahVar4 = (C65978ah) agVar2.build();
        ahVar4.getClass();
        hVar2.f179483d = ahVar4;
        hVar2.f179480a |= 4;
        agVar.copyOnWrite();
        C6676ah ahVar5 = (C6676ah) agVar.instance;
        C65991h hVar3 = (C65991h) gVar.build();
        hVar3.getClass();
        ahVar5.f19939c = hVar3;
        ahVar5.f19937a |= 2;
        aaVar.copyOnWrite();
        C6677ai aiVar2 = (C6677ai) aaVar.instance;
        C6676ah ahVar6 = (C6676ah) agVar.build();
        ahVar6.getClass();
        aiVar2.f19946e = ahVar6;
        aiVar2.f19945d = 5;
        int g = C132677a.m215673g(intent);
        aaVar.copyOnWrite();
        C6677ai aiVar3 = (C6677ai) aaVar.instance;
        int i = g - 1;
        if (g != 0) {
            aiVar3.f19948g = i;
            aiVar3.f19942a |= 32;
            aaVar.copyOnWrite();
            C6677ai aiVar4 = (C6677ai) aaVar.instance;
            aiVar4.f19942a |= 8;
            aiVar4.f19947f = "Base Experience";
            String[] f = C132677a.m215672f(intent);
            if (f.length > 0) {
                C6670ab abVar = (C6670ab) C6671ac.f19926b.createBuilder();
                List asList = Arrays.asList(f);
                abVar.copyOnWrite();
                C6671ac acVar = (C6671ac) abVar.instance;
                C62971cq cqVar = acVar.f19928a;
                if (!cqVar.mo58948c()) {
                    acVar.f19928a = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) asList, (List) acVar.f19928a);
                aaVar.copyOnWrite();
                C6677ai aiVar5 = (C6677ai) aaVar.instance;
                C6671ac acVar2 = (C6671ac) abVar.build();
                acVar2.getClass();
                aiVar5.f19944c = acVar2;
                aiVar5.f19943b = 6;
            } else {
                String d = C132677a.m215670d(intent);
                aaVar.copyOnWrite();
                C6677ai aiVar6 = (C6677ai) aaVar.instance;
                aiVar6.f19943b = 1;
                aiVar6.f19944c = d;
            }
            Optional c = C132677a.m215669c(intent);
            Objects.requireNonNull(aaVar);
            c.ifPresent(new C132687k(aaVar));
            return (C6677ai) aaVar.build();
        }
        throw null;
    }

    /* renamed from: b */
    public final int mo110879b() {
        return (this.f362073a.getContext().getResources().getConfiguration().uiMode & 48) == 32 ? 2 : 1;
    }
}
