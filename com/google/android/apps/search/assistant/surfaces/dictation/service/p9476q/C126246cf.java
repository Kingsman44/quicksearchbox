package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a;
import java.util.concurrent.CancellationException;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.cf */
/* compiled from: PG */
public final /* synthetic */ class C126246cf implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C126257cq f347864a;

    public /* synthetic */ C126246cf(C126257cq cqVar) {
        this.f347864a = cqVar;
    }

    public final void accept(Object obj) {
        C126257cq cqVar = this.f347864a;
        Throwable th = (Throwable) obj;
        if (!(th instanceof CancellationException)) {
            C59052c cVar = (C59052c) C126257cq.f347882a.mo56225c();
            cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.ASSISTANT_DICTATION_ORATION_PROCESSOR_ERROR_VALUE));
            ((C59052c) ((C59052c) cVar.mo56382g(th)).mo56372aa(36992)).mo56389s("Failure in %s, ending Dictation [SD]", cqVar.f347889h);
            C125422z zVar = cqVar.f347897p;
            C46459k.m82829b(zVar.f345896a.mo106939b(C63122a.FAILURE_ORATION_PROCESSOR_ERROR), "Failed to end dictation [SD]", new Object[0]);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
