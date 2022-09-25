package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68124q;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68125r;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68127t;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68129v;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ai */
/* compiled from: PG */
final class C115212ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C68127t f319735a;

    /* renamed from: b */
    final /* synthetic */ C70862aj f319736b;

    /* renamed from: c */
    final /* synthetic */ C115214ak f319737c;

    public C115212ai(C115214ak akVar, C68127t tVar, C70862aj ajVar) {
        this.f319737c = akVar;
        this.f319735a = tVar;
        this.f319736b = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C115214ak.f319741a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SpeakrReadSU");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(29780)).mo56386p("Failed to connect to Speakr users data service.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C68124q qVar = (C68124q) obj;
        qVar.getClass();
        C68124q qVar2 = (C68124q) qVar.mo62575n((long) this.f319737c.f319743c, TimeUnit.SECONDS);
        C68127t tVar = this.f319735a;
        C70862aj ajVar = this.f319736b;
        C70888j jVar = qVar2.f189039a;
        C70338di diVar = C68125r.f184385b;
        if (diVar == null) {
            synchronized (C68125r.class) {
                diVar = C68125r.f184385b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.speakr.api.v1.SpeakrUsersDataService", "UpdateListItemState");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C68127t.f184386c);
                    d.f187486b = C70850d.m103697c(C68129v.f184390a);
                    diVar = d.mo62040a();
                    C68125r.f184385b = diVar;
                }
            }
        }
        C70876o.m103763d(jVar.mo39510a(diVar, qVar2.f189040b), tVar, ajVar, false);
    }
}
