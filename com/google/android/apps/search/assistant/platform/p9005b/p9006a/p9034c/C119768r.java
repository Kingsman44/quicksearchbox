package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9034c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119799au;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119800av;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119938a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.c.r */
/* compiled from: PG */
final class C119768r implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C119769s f333622a;

    public C119768r(C119769s sVar) {
        this.f333622a = sVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C119770t.f333628a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvEngine.Execution");
        C59052c cVar = (C59052c) d;
        cVar.mo56378ag(C119938a.f334012b, Long.valueOf(this.f333622a.f333623a));
        C119769s sVar = this.f333622a;
        ((C59052c) ((C59052c) cVar.mo56382g(th)).mo56372aa(34581)).mo56354G("Client op commit failed session %s (clientOp=%s)", sVar.f333625c, sVar.f333624b.f135936b);
        C119769s sVar2 = this.f333622a;
        C119770t tVar = sVar2.f333627e;
        C119799au auVar = (C119799au) C119800av.f333693d.createBuilder();
        C34822b b = C34830d.m63595b(th);
        auVar.copyOnWrite();
        C119800av avVar = (C119800av) auVar.instance;
        b.getClass();
        avVar.f333696b = b;
        avVar.f333695a = 3;
        tVar.mo104513a(sVar2, auVar);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C52070ec ecVar = (C52070ec) obj;
        C59104x b = C119770t.f333628a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.Execution");
        C59052c cVar = (C59052c) b;
        cVar.mo56378ag(C119938a.f334012b, Long.valueOf(this.f333622a.f333623a));
        C59052c cVar2 = (C59052c) cVar.mo56372aa(34582);
        C119769s sVar = this.f333622a;
        C119908e eVar = sVar.f333625c;
        String str = sVar.f333624b.f135936b;
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        cVar2.mo56359L("Client op commit finished session %s (clientOp=%s, result=%s)", eVar, str, a.name());
        C119769s sVar2 = this.f333622a;
        C119770t tVar = sVar2.f333627e;
        C119799au auVar = (C119799au) C119800av.f333693d.createBuilder();
        auVar.copyOnWrite();
        C119800av avVar = (C119800av) auVar.instance;
        ecVar.getClass();
        avVar.f333696b = ecVar;
        avVar.f333695a = 2;
        tVar.mo104513a(sVar2, auVar);
    }
}
