package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125112cm;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125127da;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126057bv;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.common.p4526f.C59052c;
import com.google.frameworks.client.p4624a.p4625a.C61301b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ag */
/* compiled from: PG */
public final /* synthetic */ class C126193ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126208av f347721a;

    /* renamed from: b */
    public final /* synthetic */ C125127da f347722b;

    public /* synthetic */ C126193ag(C126208av avVar, C125127da daVar) {
        this.f347721a = avVar;
        this.f347722b = daVar;
    }

    public final void run() {
        C126207au auVar;
        C126208av avVar = this.f347721a;
        C125127da daVar = this.f347722b;
        if (!avVar.f347769r) {
            C125112cm a = C125112cm.m205002a(daVar.f345194a);
            if (a == null) {
                a = C125112cm.UNRECOGNIZED;
            }
            if (a.equals(C125112cm.NEW_ORATION_STARTED)) {
                auVar = C126207au.KICKED_OUT_BY_OTHER_ORATION;
            } else {
                auVar = C126207au.FINISHED_NORMALLY;
            }
            C59052c cVar = (C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36915);
            C61301b bVar = avVar.f347766o;
            C125112cm a2 = C125112cm.m205002a(daVar.f345194a);
            if (a2 == null) {
                a2 = C125112cm.UNRECOGNIZED;
            }
            cVar.mo56354G("Stopping %s due to OrationFinalParams: %s [SD]", bVar, C126288a.m206491c(a2));
            avVar.mo107461d(auVar, (Throwable) null);
            C126057bv bvVar = avVar.f347754c;
            C125112cm a3 = C125112cm.m205002a(daVar.f345194a);
            if (a3 == null) {
                a3 = C125112cm.UNRECOGNIZED;
            }
            bvVar.mo107283g(a3);
            return;
        }
        ((C59052c) ((C59052c) C126208av.f347752a.mo56224b()).mo56372aa(36916)).mo56389s("%s stopped, ignoring handleFinalParams [SD]", avVar.f347766o);
    }
}
