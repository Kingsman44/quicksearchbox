package com.google.android.gms.cast.framework.p10772a.p10773a;

import android.content.SharedPreferences;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.gms.cast.framework.C143409aq;
import com.google.android.gms.cast.framework.C143411as;
import com.google.android.gms.cast.framework.C143466m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.common.p4552o.p4566l.C60205e;
import com.google.common.p4552o.p4566l.C60206f;
import com.google.common.p4552o.p4566l.C60207g;
import com.google.common.p4552o.p4566l.C60208h;

/* renamed from: com.google.android.gms.cast.framework.a.a.c */
/* compiled from: PG */
public final class C143384c implements C143411as {

    /* renamed from: a */
    final /* synthetic */ C143386e f388849a;

    public C143384c(C143386e eVar) {
        this.f388849a = eVar;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo6038g(C143409aq aqVar, int i) {
        C143386e eVar = this.f388849a;
        eVar.f388857g = (C143466m) aqVar;
        eVar.mo118554e(i);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo6039h(C143409aq aqVar) {
        this.f388849a.f388857g = (C143466m) aqVar;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo6040i(C143409aq aqVar, int i) {
        C143386e eVar = this.f388849a;
        eVar.f388857g = (C143466m) aqVar;
        eVar.mo118554e(i);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo6041j(C143409aq aqVar, boolean z) {
        C143386e.f388851a.mo118884b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        C143386e eVar = this.f388849a;
        eVar.f388857g = (C143466m) aqVar;
        eVar.mo118552c();
        C143919bh.m233958a(this.f388849a.f388856f);
        C143386e eVar2 = this.f388849a;
        C60207g a = eVar2.f388853c.mo118559a(eVar2.f388856f);
        C143388g.m232661e(a, z);
        this.f388849a.f388852b.mo118567a((C60208h) a.build(), 227);
        this.f388849a.mo118555f();
        this.f388849a.mo118556g();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo6042k(C143409aq aqVar, String str) {
        C143386e.f388851a.mo118884b("onSessionResuming with sessionId = %s", str);
        C143386e eVar = this.f388849a;
        eVar.f388857g = (C143466m) aqVar;
        SharedPreferences sharedPreferences = eVar.f388855e;
        if (eVar.mo118558i(str)) {
            C143386e.f388851a.mo118884b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            C143919bh.m233958a(eVar.f388856f);
        } else {
            eVar.f388856f = C143387f.m232660b(sharedPreferences);
            if (eVar.mo118558i(str)) {
                C143386e.f388851a.mo118884b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                C143919bh.m233958a(eVar.f388856f);
                C143387f.f388863b = eVar.f388856f.f388866e + 1;
            } else {
                C143386e.f388851a.mo118884b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                eVar.f388856f = C143387f.m232659a(eVar.f388858h);
                eVar.f388856f.f388864c = C143386e.m232648a();
                eVar.f388856f.f388868g = str;
            }
        }
        C143919bh.m233958a(this.f388849a.f388856f);
        C143386e eVar2 = this.f388849a;
        C60207g a = eVar2.f388853c.mo118559a(eVar2.f388856f);
        C60206f fVar = ((C60208h) a.instance).f162900i;
        if (fVar == null) {
            fVar = C60206f.f162878k;
        }
        C60205e eVar3 = (C60205e) C60206f.f162878k.createBuilder(fVar);
        eVar3.copyOnWrite();
        C60206f fVar2 = (C60206f) eVar3.instance;
        fVar2.f162880a |= 64;
        fVar2.f162884e = 10;
        C60206f fVar3 = (C60206f) eVar3.build();
        a.copyOnWrite();
        C60208h hVar = (C60208h) a.instance;
        fVar3.getClass();
        hVar.f162900i = fVar3;
        hVar.f162892a |= LinearLayoutManager.INVALID_OFFSET;
        C143388g.m232661e(a, true);
        this.f388849a.f388852b.mo118567a((C60208h) a.build(), 226);
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo6043l(C143409aq aqVar, int i) {
        C143386e eVar = this.f388849a;
        eVar.f388857g = (C143466m) aqVar;
        eVar.mo118554e(i);
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo6044m(C143409aq aqVar, String str) {
        C143386e.f388851a.mo118884b("onSessionStarted with sessionId = %s", str);
        C143386e eVar = this.f388849a;
        eVar.f388857g = (C143466m) aqVar;
        eVar.mo118552c();
        C143386e eVar2 = this.f388849a;
        C143387f fVar = eVar2.f388856f;
        fVar.f388868g = str;
        this.f388849a.f388852b.mo118567a(eVar2.f388853c.mo118560b(fVar), 222);
        this.f388849a.mo118555f();
        this.f388849a.mo118556g();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ void mo6045n(C143409aq aqVar) {
        C143386e.f388851a.mo118884b("onSessionStarting", new Object[0]);
        C143386e eVar = this.f388849a;
        eVar.f388857g = (C143466m) aqVar;
        if (eVar.f388856f != null) {
            C143386e.f388851a.mo118889g("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.f388849a.mo118553d();
        C143386e eVar2 = this.f388849a;
        C143388g gVar = eVar2.f388853c;
        C143387f fVar = eVar2.f388856f;
        C60207g a = gVar.mo118559a(fVar);
        if (fVar.f388872k == 1) {
            C60206f fVar2 = ((C60208h) a.instance).f162900i;
            if (fVar2 == null) {
                fVar2 = C60206f.f162878k;
            }
            C60205e eVar3 = (C60205e) C60206f.f162878k.createBuilder(fVar2);
            eVar3.copyOnWrite();
            C60206f fVar3 = (C60206f) eVar3.instance;
            fVar3.f162880a |= 64;
            fVar3.f162884e = 17;
            C60206f fVar4 = (C60206f) eVar3.build();
            a.copyOnWrite();
            C60208h hVar = (C60208h) a.instance;
            fVar4.getClass();
            hVar.f162900i = fVar4;
            hVar.f162892a |= LinearLayoutManager.INVALID_OFFSET;
        }
        this.f388849a.f388852b.mo118567a((C60208h) a.build(), 221);
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ void mo6046o(C143409aq aqVar, int i) {
        C143386e.f388851a.mo118884b("onSessionSuspended with reason = %d", Integer.valueOf(i));
        C143386e eVar = this.f388849a;
        eVar.f388857g = (C143466m) aqVar;
        eVar.mo118552c();
        C143919bh.m233958a(this.f388849a.f388856f);
        C143386e eVar2 = this.f388849a;
        this.f388849a.f388852b.mo118567a(eVar2.f388853c.mo118561c(eVar2.f388856f, i), 225);
        this.f388849a.mo118555f();
        this.f388849a.mo118551b();
    }
}
