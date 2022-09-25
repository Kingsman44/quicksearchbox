package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119271ag;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119274aj;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119275ak;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119277am;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119286h;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119287i;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119288j;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119300v;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119301w;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126322bc;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62912at;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.y */
/* compiled from: PG */
public final class C125884y implements C70862aj {

    /* renamed from: a */
    public static final C59071e f346948a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.j.y");

    /* renamed from: b */
    public final C126322bc f346949b;

    /* renamed from: c */
    public final C125860bx f346950c;

    /* renamed from: d */
    public final Executor f346951d;

    /* renamed from: e */
    public final AtomicReference f346952e = new AtomicReference();

    public C125884y(C70862aj ajVar, C125860bx bxVar, Executor executor) {
        this.f346949b = new C126322bc(ajVar);
        this.f346950c = bxVar;
        this.f346951d = executor;
    }

    /* renamed from: d */
    public static C119288j m205873d(C63122a aVar) {
        C119287i iVar = (C119287i) C119288j.f332642c.createBuilder();
        C119274aj ajVar = (C119274aj) C119275ak.f332621b.createBuilder();
        ajVar.copyOnWrite();
        ((C119275ak) ajVar.instance).f332623a = aVar.getNumber();
        iVar.copyOnWrite();
        C119288j jVar = (C119288j) iVar.instance;
        C119275ak akVar = (C119275ak) ajVar.build();
        akVar.getClass();
        jVar.f332645b = akVar;
        jVar.f332644a = 1;
        return (C119288j) iVar.build();
    }

    /* renamed from: e */
    public static C119288j m205874e(C63122a aVar) {
        C119287i iVar = (C119287i) C119288j.f332642c.createBuilder();
        C119300v vVar = (C119300v) C119301w.f332677b.createBuilder();
        vVar.copyOnWrite();
        ((C119301w) vVar.instance).f332679a = aVar.getNumber();
        iVar.copyOnWrite();
        C119288j jVar = (C119288j) iVar.instance;
        C119301w wVar = (C119301w) vVar.build();
        wVar.getClass();
        jVar.f332645b = wVar;
        jVar.f332644a = 2;
        return (C119288j) iVar.build();
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f346949b.mo107531a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f346948a.mo56226d()).mo56382g(th)).mo56372aa(36691)).mo56386p("Got a failure from the caller [SD]");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C119271ag agVar;
        C119277am amVar;
        C119286h hVar = (C119286h) obj;
        int i = hVar.f332640a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i == 1) {
                agVar = (C119271ag) hVar.f332641b;
            } else {
                agVar = C119271ag.f332613d;
            }
            C119287i iVar = (C119287i) C119288j.f332642c.createBuilder();
            C62912at atVar = C62912at.f169862a;
            iVar.copyOnWrite();
            C119288j jVar = (C119288j) iVar.instance;
            atVar.getClass();
            jVar.f332645b = atVar;
            jVar.f332644a = 3;
            this.f346949b.mo107532b((C119288j) iVar.build());
            C60856cj.m92911t(C126309ar.m206523b(new C125877r(this, agVar)), C47810es.m84974n(new C126308aq(new C125878s(this), new C125879t(this))), this.f346951d);
        } else if (i3 == 1) {
            if (i == 2) {
                amVar = (C119277am) hVar.f332641b;
            } else {
                amVar = C119277am.f332624b;
            }
            C46459k.m82829b(C126309ar.m206523b(new C125882w(this, amVar)), "Failed to stop dictation [SD]", new Object[0]);
        }
    }
}
