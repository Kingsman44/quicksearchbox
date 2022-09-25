package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.binaries.satin.app.C74276sg;
import com.google.android.apps.gsa.binaries.satin.app.apr;
import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125088bp;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125089bq;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125133dg;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125135di;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9478r.C126286d;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.al */
/* compiled from: PG */
public final /* synthetic */ class C126198al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347732a;

    /* renamed from: b */
    public final /* synthetic */ C70862aj f347733b;

    public /* synthetic */ C126198al(C126208av avVar, C70862aj ajVar) {
        this.f347732a = avVar;
        this.f347733b = ajVar;
    }

    public final C60870cx apply(Object obj) {
        C126208av avVar = this.f347732a;
        C70862aj ajVar = this.f347733b;
        C60888db dbVar = avVar.f347753b;
        C126181j jVar = avVar.f347755d;
        Object a = ((C126286d) obj).f347950b.mo5768a();
        C69664n.m101060f(a, "<get-stub>(...)");
        C125088bp bpVar = (C125088bp) a;
        C70888j jVar2 = bpVar.f189039a;
        C70338di diVar = C125089bq.f345079a;
        if (diVar == null) {
            synchronized (C125089bq.class) {
                diVar = C125089bq.f345079a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "PerformOration");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C125133dg.f345203c);
                    d.f187486b = C70850d.m103697c(C125135di.f345207c);
                    diVar = d.mo62040a();
                    C125089bq.f345079a = diVar;
                }
            }
        }
        avVar.f347770s = new C17602l(dbVar, jVar.mo107430a(C70876o.m103761b(jVar2.mo39510a(diVar, bpVar.f189040b), ajVar, true)));
        C126257cq cqVar = avVar.f347759h;
        cqVar.mo107487g(new C126248ch(cqVar, avVar.f347770s));
        C74276sg sgVar = avVar.f347772u;
        C126278v vVar = avVar.f347757f;
        af afVar = avVar.f347767p;
        C125422z c = avVar.f347762k.mo107527c();
        Objects.requireNonNull(c);
        C126208av avVar2 = avVar;
        C126276t tVar = new C126276t(vVar, avVar2, afVar, new C126200an(c), avVar.f347770s, (apr) sgVar.f207990a.b.f198027a.f199627ib.mo17428b(), (C126273q) sgVar.f207990a.b.f198027a.f199628ic.mo17428b(), (C126174c) sgVar.f207990a.b.f198027a.f199305cX.mo17428b(), (Executor) sgVar.f207990a.a.n.mo17428b(), (C21370a) sgVar.f207990a.a.i.mo17428b());
        avVar.f347768q = tVar;
        ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36904)).mo56354G("Set %s on %s [SD]", tVar.f347939k, avVar.f347766o);
        if (!avVar.f347762k.mo107525a().isEmpty()) {
            avVar.mo107459b("Handling prefix text", new C126194ah(avVar, avVar.f347762k.mo107525a()));
        }
        return tVar.mo107502a();
    }
}
