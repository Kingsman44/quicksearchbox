package com.google.android.apps.gsa.smartspace.p7258b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131177b;
import com.google.assistant.p3886c.C50819dp;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.MessageLite;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.smartspace.b.h */
/* compiled from: PG */
public final /* synthetic */ class C92065h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92070m f256670a;

    /* renamed from: b */
    public final /* synthetic */ String f256671b;

    /* renamed from: c */
    public final /* synthetic */ Consumer f256672c;

    /* renamed from: d */
    public final /* synthetic */ MessageLite f256673d;

    public /* synthetic */ C92065h(C92070m mVar, String str, Consumer consumer, MessageLite messageLite) {
        this.f256670a = mVar;
        this.f256671b = str;
        this.f256672c = consumer;
        this.f256673d = messageLite;
    }

    public final Object apply(Object obj) {
        C92070m mVar = this.f256670a;
        String str = this.f256671b;
        Consumer consumer = this.f256672c;
        MessageLite messageLite = this.f256673d;
        C119207d dVar = (C119207d) obj;
        C119207d dVar2 = C119207d.FAILED_CONTENT_CAPTURE_MANAGER_NOT_ENABLED;
        int ordinal = dVar.ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 2:
                    ((C58970a) ((C58970a) mVar.f256684a.mo56225c()).mo56372aa(11994)).mo56386p("ContentCaptureManager is null");
                    mVar.mo86735h(C131177b.CONTENT_CAPTURE_MANAGER_IS_NULL, str);
                    return C118826c.f331422a;
                case 3:
                    consumer.accept(C131177b.IO_EXCEPTION_ON_WRITE);
                    throw new C92059b("Data share error: ".concat(String.valueOf(String.valueOf(dVar))));
                case 4:
                    consumer.accept(C131177b.UNKNOWN_EXCEPTION_ON_WRITE);
                    throw new C92059b("Data share error: ".concat(String.valueOf(String.valueOf(dVar))));
                case 5:
                    consumer.accept(C131177b.DATA_SHARE_ERROR_UNKNOWN);
                    throw new C92059b("Data share error: ".concat(String.valueOf(String.valueOf(dVar))));
                case 6:
                    consumer.accept(C131177b.DATA_SHARE_ERROR_CONCURRENT_REQUEST);
                    throw new C92059b("Data share error: ".concat(String.valueOf(String.valueOf(dVar))));
                case 7:
                    consumer.accept(C131177b.DATA_SHARE_ERROR_TIMEOUT_INTERRUPTED);
                    throw new C92059b("Data share error: ".concat(String.valueOf(String.valueOf(dVar))));
                case 8:
                    consumer.accept(C131177b.SHARE_REQUEST_REJECTED);
                    throw new C92059b("Data share error: ".concat(String.valueOf(String.valueOf(dVar))));
                case 9:
                    if (messageLite instanceof C50819dp) {
                        mVar.mo86734g((C50819dp) messageLite);
                    }
                    C92070m.m151109e(messageLite).ifPresent(new C92061d(mVar));
                    consumer.accept(C131177b.SUCCESS);
                    ((C58970a) ((C58970a) mVar.f256684a.mo56224b()).mo56372aa(11996)).mo56389s("Sending successful with locus ID %s", str);
                    return C118826c.f331422a;
                default:
                    throw new C92059b("Unknown task status: ".concat(String.valueOf(String.valueOf(dVar))));
            }
        } else {
            ((C58970a) ((C58970a) mVar.f256684a.mo56225c()).mo56372aa(11995)).mo56386p("ContentCaptureManager is not enabled");
            mVar.mo86735h(C131177b.CONTENT_CAPTURE_MANAGER_NOT_ENABLED, str);
            return C118826c.f331422a;
        }
    }
}
