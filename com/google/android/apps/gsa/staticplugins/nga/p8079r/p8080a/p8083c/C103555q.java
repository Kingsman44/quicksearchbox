package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80539a;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6299b.C80542d;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81496n;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81471f;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81474i;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81475j;
import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.q */
/* compiled from: PG */
final class C103555q extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C81496n f288514a;

    public C103555q(C81496n nVar) {
        this.f288514a = nVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C81475j jVar;
        C90532c cVar = (C90532c) obj;
        if ((cVar.f253085a.f183358a & 1) != 0) {
            C81474i iVar = (C81474i) C81475j.f222893c.createBuilder();
            C67464l lVar = cVar.f253085a;
            iVar.copyOnWrite();
            C81475j jVar2 = (C81475j) iVar.instance;
            lVar.getClass();
            jVar2.f222896b = lVar;
            jVar2.f222895a = 4;
            jVar = (C81475j) iVar.build();
        } else {
            C81474i iVar2 = (C81474i) C81475j.f222893c.createBuilder();
            C80539a aVar = (C80539a) C80542d.f221083f.createBuilder();
            aVar.copyOnWrite();
            C80542d dVar = (C80542d) aVar.instance;
            dVar.f221089e = 2;
            dVar.f221085a |= 8;
            long j = cVar.f253086b.f253281b;
            aVar.copyOnWrite();
            C80542d dVar2 = (C80542d) aVar.instance;
            dVar2.f221085a = 4 | dVar2.f221085a;
            dVar2.f221088d = j;
            iVar2.copyOnWrite();
            C81475j jVar3 = (C81475j) iVar2.instance;
            C80542d dVar3 = (C80542d) aVar.build();
            dVar3.getClass();
            jVar3.f222896b = dVar3;
            jVar3.f222895a = 6;
            jVar = (C81475j) iVar2.build();
        }
        try {
            this.f288514a.mo72775a(jVar.toByteArray());
        } catch (RemoteException e) {
            C59104x d = C103556r.f288515a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeechRecognitionEvent");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21612)).mo56386p("Unable to send recognizer event");
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C81474i iVar = (C81474i) C81475j.f222893c.createBuilder();
        C81471f fVar = C81471f.f222887a;
        iVar.copyOnWrite();
        C81475j jVar = (C81475j) iVar.instance;
        fVar.getClass();
        jVar.f222896b = fVar;
        jVar.f222895a = 5;
        try {
            this.f288514a.mo72775a(((C81475j) iVar.build()).toByteArray());
        } catch (RemoteException e) {
            C59104x d = C103556r.f288515a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeechRecognitionEvent");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21611)).mo56386p("Unable to send offline endpointer finished");
        }
    }
}
