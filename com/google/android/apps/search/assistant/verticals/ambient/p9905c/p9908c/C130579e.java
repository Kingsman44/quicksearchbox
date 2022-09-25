package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9908c;

import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.c.e */
/* compiled from: PG */
public final /* synthetic */ class C130579e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C130582h f357652a;

    /* renamed from: b */
    public final /* synthetic */ String f357653b;

    /* renamed from: c */
    public final /* synthetic */ Consumer f357654c;

    public /* synthetic */ C130579e(C130582h hVar, String str, Consumer consumer) {
        this.f357652a = hVar;
        this.f357653b = str;
        this.f357654c = consumer;
    }

    public final C60870cx apply(Object obj) {
        C130582h hVar = this.f357652a;
        String str = this.f357653b;
        Consumer consumer = this.f357654c;
        C119207d dVar = (C119207d) obj;
        C119207d dVar2 = C119207d.FAILED_CONTENT_CAPTURE_MANAGER_NOT_ENABLED;
        int ordinal = dVar.ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 2:
                    ((C58970a) ((C58970a) hVar.f357664a.mo56225c()).mo56372aa(38928)).mo56386p("ContentCaptureManager is null");
                    hVar.mo109733c(C131177b.CONTENT_CAPTURE_MANAGER_IS_NULL, str);
                    return C60866ct.f164955a;
                case 3:
                    ((C58970a) ((C58970a) hVar.f357664a.mo56225c()).mo56372aa(38930)).mo56386p("Sending failed with IOException");
                    consumer.accept(C131177b.IO_EXCEPTION_ON_WRITE);
                    return C60856cj.m92899h(new C130575a("Data share error: ".concat(String.valueOf(String.valueOf(dVar)))));
                case 4:
                    ((C58970a) ((C58970a) hVar.f357664a.mo56225c()).mo56372aa(38931)).mo56386p("Sending failed with RuntimeException");
                    consumer.accept(C131177b.UNKNOWN_EXCEPTION_ON_WRITE);
                    return C60856cj.m92899h(new C130575a("Data share error: ".concat(String.valueOf(String.valueOf(dVar)))));
                case 5:
                    consumer.accept(C131177b.DATA_SHARE_ERROR_UNKNOWN);
                    return C60856cj.m92899h(new C130575a("Data share error: ".concat(String.valueOf(String.valueOf(dVar)))));
                case 6:
                    consumer.accept(C131177b.DATA_SHARE_ERROR_CONCURRENT_REQUEST);
                    return C60856cj.m92899h(new C130575a("Data share error: ".concat(String.valueOf(String.valueOf(dVar)))));
                case 7:
                    consumer.accept(C131177b.DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED);
                    return C60856cj.m92899h(new C130575a("Data share error: ".concat(String.valueOf(String.valueOf(dVar)))));
                case 8:
                    consumer.accept(C131177b.SHARE_REQUEST_REJECTED);
                    return C60856cj.m92899h(new C130575a("Data share error: ".concat(String.valueOf(String.valueOf(dVar)))));
                case 9:
                    ((C58970a) ((C58970a) hVar.f357664a.mo56224b()).mo56372aa(38932)).mo56389s("Update sent successfully. locusId: %s", str);
                    consumer.accept(C131177b.SUCCESS);
                    return C60866ct.f164955a;
                default:
                    return C60856cj.m92899h(new C130575a("Unknown task status: ".concat(String.valueOf(String.valueOf(dVar)))));
            }
        } else {
            ((C58970a) ((C58970a) hVar.f357664a.mo56225c()).mo56372aa(38929)).mo56386p("ContentCaptureManager is not enabled");
            hVar.mo109733c(C131177b.CONTENT_CAPTURE_MANAGER_NOT_ENABLED, str);
            return C60866ct.f164955a;
        }
    }
}
