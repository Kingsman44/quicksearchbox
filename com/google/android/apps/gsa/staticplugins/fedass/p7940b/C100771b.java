package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100741g;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100743i;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.speech.p5199c.p5200a.C66456a;
import com.google.speech.p5199c.p5200a.C66457b;
import com.google.speech.p5199c.p5200a.C66460e;
import com.google.speech.p5199c.p5200a.C66461f;
import com.google.speech.p5199c.p5200a.C66477v;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.b */
/* compiled from: PG */
public final /* synthetic */ class C100771b implements C100741g {

    /* renamed from: a */
    public final /* synthetic */ C100777h f281676a;

    public /* synthetic */ C100771b(C100777h hVar) {
        this.f281676a = hVar;
    }

    /* renamed from: a */
    public final void mo92032a(Object obj) {
        C100777h hVar = this.f281676a;
        C132800h hVar2 = (C132800h) obj;
        C100784o oVar = (C100784o) hVar.f281683b.mo17428b();
        C66456a aVar = (C66456a) C66457b.f180706c.createBuilder();
        C132798f fVar = hVar2.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        boolean z = fVar.f362318b;
        aVar.copyOnWrite();
        C66457b bVar = (C66457b) aVar.instance;
        bVar.f180708a |= 1;
        bVar.f180709b = z;
        C66477v a = C100743i.m166953a(hVar.mo92045a(hVar2), (C66457b) aVar.build());
        C19435g gVar = (C19435g) hVar.f281685d.mo17428b();
        C66457b bVar2 = a.f180758b;
        if (bVar2 == null) {
            bVar2 = C66457b.f180706c;
        }
        if (bVar2.f180709b) {
            C66460e eVar = (C66460e) C66461f.f180719g.createBuilder();
            eVar.mo59632a(a);
            gVar.mo24624f((C66461f) eVar.build());
        }
        if (a.f180760d > 0 || a.f180762f > 0) {
            gVar.mo24621c("Ekho.NumAudioRecords", a.f180762f);
            gVar.mo24621c("Ekho.NumNonAudioRecords", (int) a.f180760d);
            gVar.mo24621c("Ekho.NumSessions", a.f180761e);
        }
    }
}
