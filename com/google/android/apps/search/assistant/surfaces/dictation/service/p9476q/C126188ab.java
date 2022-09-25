package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.gsa.nga.api.a.at;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125129dc;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125931t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125936y;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126181j;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.common.p4526f.C59052c;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ab */
/* compiled from: PG */
public final /* synthetic */ class C126188ab implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347714a;

    /* renamed from: b */
    public final /* synthetic */ C125129dc f347715b;

    public /* synthetic */ C126188ab(C126208av avVar, C125129dc dcVar) {
        this.f347714a = avVar;
        this.f347715b = dcVar;
    }

    public final void run() {
        C126208av avVar = this.f347714a;
        C125129dc dcVar = this.f347715b;
        if (!avVar.f347769r) {
            bj bjVar = dcVar.f345197a;
            if (bjVar == null) {
                bjVar = bj.j;
            }
            af afVar = bjVar.a;
            if (afVar == null) {
                afVar = af.w;
            }
            avVar.f347767p = afVar;
            C125937z zVar = avVar.f347765n;
            af afVar2 = avVar.f347767p;
            C69664n.m101061g(afVar2, "configurationData");
            DesugarAtomicReference.updateAndGet(zVar.f347151a, new C125936y(afVar2));
            C125931t a = avVar.f347765n.mo107202a();
            C126181j jVar = avVar.f347755d;
            bj bjVar2 = dcVar.f345197a;
            if (bjVar2 == null) {
                bjVar2 = bj.j;
            }
            jVar.mo107437h(bjVar2);
            if (avVar.f347756e) {
                C125160i b = a.mo107183b();
                C126181j jVar2 = avVar.f347755d;
                bj bjVar3 = dcVar.f345197a;
                if (bjVar3 == null) {
                    bjVar3 = bj.j;
                }
                jVar2.mo107434e(bjVar3, b);
                if (!b.equals(C125160i.ELIGIBLE)) {
                    ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36918)).mo56389s("Stopping dictation due to FIELD_NOT_ELIGIBLE, eligibility=%s [SD]", C126288a.m206490b(b));
                    avVar.mo107461d(C126207au.FIELD_NOT_ELIGIBLE, (Throwable) null);
                    return;
                }
            }
            C126057bv bvVar = avVar.f347754c;
            bj bjVar4 = dcVar.f345197a;
            if (bjVar4 == null) {
                bjVar4 = bj.j;
            }
            at atVar = dcVar.f345198b;
            if (atVar == null) {
                atVar = at.b;
            }
            bvVar.mo107288l(bjVar4, atVar, avVar.f347771t);
            C126257cq cqVar = avVar.f347759h;
            bj bjVar5 = dcVar.f345197a;
            if (bjVar5 == null) {
                bjVar5 = bj.j;
            }
            cqVar.mo107487g(new C126244cd(cqVar, bjVar5));
            return;
        }
        ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36919)).mo56389s("%s stopped, ignoring handleInitParams [SD]", avVar.f347766o);
    }
}
