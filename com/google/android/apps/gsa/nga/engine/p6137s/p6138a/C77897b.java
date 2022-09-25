package com.google.android.apps.gsa.nga.engine.p6137s.p6138a;

import com.google.android.apps.gsa.nga.engine.d.a.fg;
import com.google.android.apps.gsa.nga.engine.p5903ai.p5904a.C74834a;
import com.google.android.apps.gsa.nga.engine.p6044n.C76248a;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.engine.p6056o.C77422p;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6137s.C77895a;
import com.google.android.apps.gsa.nga.engine.p6137s.C77906d;
import com.google.android.apps.gsa.nga.engine.p6137s.C77907e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82919fh;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.s.a.b */
/* compiled from: PG */
public final class C77897b implements C77907e, C77422p, C74834a {

    /* renamed from: a */
    private Optional f214602a = Optional.empty();

    /* renamed from: b */
    private final fg f214603b;

    public C77897b(fg fgVar) {
        this.f214603b = fgVar;
    }

    /* renamed from: i */
    private final synchronized void m125019i() {
        this.f214602a = Optional.empty();
        this.f214603b.d(C52091ex.f136710b);
    }

    /* renamed from: a */
    public final synchronized C52091ex mo72873a() {
        return (C52091ex) mo72874b().map(C77896a.f214601a).orElse(C52091ex.f136710b);
    }

    /* renamed from: b */
    public final synchronized Optional mo72874b() {
        return this.f214602a;
    }

    /* renamed from: c */
    public final synchronized void mo71390c(C76401e eVar) {
        C77426t tVar = ((C76248a) eVar).f211268a;
        int a = C82919fh.m132428a(tVar.mo72527d().f225877b);
        if (a == 0) {
            a = 1;
        }
        if (a == 1011) {
            C65196fc fcVar = tVar.mo72528e().f220666i;
            if (fcVar == null) {
                fcVar = C65196fc.f176453l;
            }
            C52081en enVar = fcVar.f176461g;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            C52091ex exVar = enVar.f136685e;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            C77895a aVar = new C77895a();
            aVar.mo72872b(exVar);
            aVar.f214599a = 2;
            this.f214602a = Optional.m71637of(aVar.mo72871a());
            this.f214603b.d(exVar);
        } else if (a == 1013) {
            C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
            ewVar.mo53790c(((C76248a) eVar).f211268a.mo72528e().f220659b);
            C52091ex exVar2 = (C52091ex) ewVar.build();
            C77895a aVar2 = new C77895a();
            aVar2.mo72872b(exVar2);
            aVar2.f214599a = 3;
            this.f214602a = Optional.m71637of(aVar2.mo72871a());
            this.f214603b.d(exVar2);
        } else {
            m125019i();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo71391d(C76401e eVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo71392e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo71393f() {
    }

    /* renamed from: g */
    public final synchronized void mo72875g(C77906d dVar) {
        this.f214602a = Optional.m71637of(dVar);
        this.f214603b.d(dVar.mo72888a());
    }

    /* renamed from: h */
    public final synchronized void mo71230h() {
        m125019i();
    }
}
