package com.google.android.libraries.privatetelemetry.tqcobalt.worker;

import androidx.work.C4631l;
import androidx.work.C4645z;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32032e;
import com.google.android.p10713e.C142538d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.d */
/* compiled from: PG */
public final /* synthetic */ class C32042d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ LogWriter f86096a;

    /* renamed from: b */
    public final /* synthetic */ C142538d f86097b;

    /* renamed from: c */
    public final /* synthetic */ int f86098c;

    public /* synthetic */ C32042d(LogWriter logWriter, int i, C142538d dVar) {
        this.f86096a = logWriter;
        this.f86098c = i;
        this.f86097b = dVar;
    }

    public final Object apply(Object obj) {
        int i;
        LogWriter logWriter = this.f86096a;
        int i2 = this.f86098c;
        C142538d dVar = this.f86097b;
        C32032e eVar = (C32032e) obj;
        if (eVar.mo37813a() == 2) {
            ((C59052c) ((C59052c) LogWriter.f86065a.mo56225c()).mo56372aa(50502)).mo56386p("Cobalt: error while decoding experiment tokens");
            return LogWriter.f86066b;
        }
        try {
            try {
                byte[] byteArray = C32040b.m59703a(logWriter.f86070j, logWriter.f86067g, dVar, logWriter.f86068h, eVar.mo37817b().mo55229u()).toByteArray();
                int i3 = i2 - 1;
                if (i3 == 0) {
                    i = logWriter.f86069i.mo37809e(byteArray);
                } else if (i3 == 1) {
                    i = logWriter.f86069i.mo37808d(byteArray);
                } else if (i3 == 2) {
                    i = logWriter.f86069i.mo37810f(byteArray);
                } else if (i3 != 3) {
                    i = logWriter.f86069i.mo37806b(byteArray);
                } else {
                    i = logWriter.f86069i.mo37807c(byteArray);
                }
                ((C59052c) ((C59052c) LogWriter.f86065a.mo56224b()).mo56372aa(50499)).mo56359L("Cobalt: finish logging metric with status: %d for customerId = %d, projectId = %d", Integer.valueOf(i), Integer.valueOf(logWriter.f86067g.mo37777a()), Long.valueOf(logWriter.f86067g.mo37778b()));
                HashMap hashMap = new HashMap();
                C4631l.m13033d("com.google.android.libraries.privatetelemetry.tqcobalt.worker.STATUS", i, hashMap);
                return new C4645z(C4631l.m13030a(hashMap));
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) LogWriter.f86065a.mo56225c()).mo56382g(e)).mo56372aa(50500)).mo56386p("Cobalt: error while logging metric via C++ code");
                return LogWriter.f86066b;
            }
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) LogWriter.f86065a.mo56225c()).mo56382g(e2)).mo56372aa(50501)).mo56386p("Cobalt: couldn't read configuration for Cobalt Service");
            return LogWriter.f86066b;
        }
    }
}
