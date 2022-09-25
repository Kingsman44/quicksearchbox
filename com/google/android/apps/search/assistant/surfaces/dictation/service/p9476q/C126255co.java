package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125131de;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125132df;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125133dg;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.co */
/* compiled from: PG */
public final /* synthetic */ class C126255co implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C125131de f347879a;

    public /* synthetic */ C126255co(C125131de deVar) {
        this.f347879a = deVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C125131de deVar = this.f347879a;
        C126223bj bjVar = (C126223bj) obj;
        C47558bi a = C47831fm.m85006a("SD.OrationQueue.ProcessLatencyEvent");
        try {
            if (bjVar.f347816p) {
                ((C59052c) ((C59052c) C126223bj.f347801a.mo56226d()).mo56372aa(36956)).mo56386p("#onLatencyEvent - skipping on done [SD]");
                cxVar = C60866ct.f164955a;
            } else {
                C70862aj ajVar = bjVar.f347802b;
                C125132df dfVar = (C125132df) C125133dg.f345203c.createBuilder();
                dfVar.copyOnWrite();
                C125133dg dgVar = (C125133dg) dfVar.instance;
                deVar.getClass();
                dgVar.f345206b = deVar;
                dgVar.f345205a = 4;
                ajVar.mo20123c((C125133dg) dfVar.build());
                cxVar = C60866ct.f164955a;
            }
            a.mo51417a(cxVar);
            a.close();
            return cxVar;
        } catch (Throwable th) {
            C126251ck.m206437a(th, th);
        }
        throw th;
    }
}
