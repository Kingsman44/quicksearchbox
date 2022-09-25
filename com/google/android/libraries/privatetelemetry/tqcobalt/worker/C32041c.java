package com.google.android.libraries.privatetelemetry.tqcobalt.worker;

import android.util.Pair;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32031d;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32032e;
import com.google.android.p10713e.C142537c;
import com.google.android.p10713e.C142538d;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.c */
/* compiled from: PG */
public final /* synthetic */ class C32041c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ LogWriter f86094a;

    /* renamed from: b */
    public final /* synthetic */ C142538d f86095b;

    public /* synthetic */ C32041c(LogWriter logWriter, C142538d dVar) {
        this.f86094a = logWriter;
        this.f86095b = dVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar;
        LogWriter logWriter = this.f86094a;
        C142538d dVar = this.f86095b;
        C32032e eVar = (C32032e) obj;
        C32031d.f86083a.put(Pair.create(Integer.valueOf(logWriter.f86067g.mo37777a()), Long.valueOf(logWriter.f86067g.mo37778b())), eVar);
        C142537c cVar = (C142537c) C142538d.f386774q.createBuilder();
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386778c = 299999;
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386779d = 1;
        cVar.copyOnWrite();
        ((C142538d) cVar.instance).f386780e = 4;
        cVar.mo117140a(dVar.f386778c);
        cVar.mo117140a((int) dVar.f386779d);
        cVar.mo117140a(eVar.mo37813a() == 1 ? 0 : 1);
        cVar.copyOnWrite();
        C142538d dVar2 = (C142538d) cVar.instance;
        dVar2.f386776a = 11;
        dVar2.f386777b = 1L;
        C142538d dVar3 = (C142538d) cVar.build();
        if (eVar.mo37813a() == 1) {
            guVar = eVar.mo37817b().mo55229u();
        } else {
            guVar = C58485gu.m89845m();
        }
        ((C59052c) ((C59052c) LogWriter.f86065a.mo56224b()).mo56372aa(50509)).mo56389s("Cobalt: start logging %s internal metric", "CobaltExperimentTokensDecodingAttempt");
        try {
            try {
                if (logWriter.f86069i.mo37809e(C32040b.m59703a(logWriter.f86070j, logWriter.f86067g, dVar3, logWriter.f86068h, guVar).toByteArray()) > 0) {
                    ((C59052c) ((C59052c) LogWriter.f86065a.mo56226d()).mo56372aa(50510)).mo56359L("Cobalt: couldn't log %s metric for customer id = %d, project id = %d", "CobaltExperimentTokensDecodingAttempt", Integer.valueOf(logWriter.f86067g.mo37777a()), Long.valueOf(logWriter.f86067g.mo37778b()));
                }
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) LogWriter.f86065a.mo56226d()).mo56382g(th)).mo56372aa(50512)).mo56359L("Cobalt: error while logging %s metric for customer id = %d, project id = %d", "CobaltExperimentTokensDecodingAttempt", Integer.valueOf(logWriter.f86067g.mo37777a()), Long.valueOf(logWriter.f86067g.mo37778b()));
            }
            ((C59052c) ((C59052c) LogWriter.f86065a.mo56224b()).mo56372aa(50511)).mo56389s("Cobalt: finish logging %s internal metric", "CobaltExperimentTokensDecodingAttempt");
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) LogWriter.f86065a.mo56225c()).mo56382g(e)).mo56372aa(50513)).mo56389s("Cobalt: couldn't read configuration for Cobalt Service while logging %s", "CobaltExperimentTokensDecodingAttempt");
        }
        return eVar;
    }
}
