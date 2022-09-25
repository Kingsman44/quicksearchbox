package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c;

import android.os.RemoteException;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.C81496n;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81467b;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81474i;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81475j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5224k.p5225a.C67238p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.c.p */
/* compiled from: PG */
final class C103554p extends C57975a {

    /* renamed from: a */
    final /* synthetic */ C81496n f288513a;

    public C103554p(C81496n nVar) {
        this.f288513a = nVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C67238p pVar = (C67238p) obj;
        C81474i iVar = (C81474i) C81475j.f222893c.createBuilder();
        iVar.copyOnWrite();
        C81475j jVar = (C81475j) iVar.instance;
        pVar.getClass();
        jVar.f222896b = pVar;
        jVar.f222895a = 2;
        try {
            this.f288513a.mo72775a(((C81475j) iVar.build()).toByteArray());
        } catch (RemoteException e) {
            C59104x d = C103556r.f288515a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeechRecognitionEvent");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21610)).mo56386p("Unable to send recognizer event");
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C81474i iVar = (C81474i) C81475j.f222893c.createBuilder();
        C81467b bVar = C81467b.f222883a;
        iVar.copyOnWrite();
        C81475j jVar = (C81475j) iVar.instance;
        bVar.getClass();
        jVar.f222896b = bVar;
        jVar.f222895a = 1;
        try {
            this.f288513a.mo72775a(((C81475j) iVar.build()).toByteArray());
        } catch (RemoteException e) {
            C59104x d = C103556r.f288515a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeechRecognitionEvent");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(21609)).mo56386p("Unable to send end of stream event");
        }
    }
}
