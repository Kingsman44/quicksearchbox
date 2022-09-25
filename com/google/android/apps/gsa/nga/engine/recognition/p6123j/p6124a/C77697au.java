package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.au */
/* compiled from: PG */
public final /* synthetic */ class C77697au implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77701ay f214022a;

    /* renamed from: b */
    public final /* synthetic */ ac f214023b;

    public /* synthetic */ C77697au(C77701ay ayVar, ac acVar) {
        this.f214022a = ayVar;
        this.f214023b = acVar;
    }

    public final void run() {
        C77701ay ayVar = this.f214022a;
        ac acVar = this.f214023b;
        C77687ak akVar = ayVar.f214031c;
        if (akVar != null && akVar.f213977e.f218924a.equals(acVar)) {
            ((C58970a) ((C58970a) C77701ay.f214029a.mo56224b()).mo56372aa(4403)).mo56389s("Stop listening S3 session %s, but keep session open to keep receiving events", acVar.c());
            ((C58970a) ((C58970a) C77687ak.f213973a.mo56224b()).mo56372aa(4388)).mo56389s("#closeAudioSession %s", akVar.f213977e.f218924a.c());
            synchronized (akVar.f213975c) {
                akVar.mo72776a();
            }
        }
    }
}
