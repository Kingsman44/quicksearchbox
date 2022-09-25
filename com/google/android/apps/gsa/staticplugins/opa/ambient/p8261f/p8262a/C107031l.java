package com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f.p8262a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106595g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.f.a.l */
/* compiled from: PG */
public final /* synthetic */ class C107031l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C107035p f298049a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f298050b;

    /* renamed from: c */
    public final /* synthetic */ C106546e f298051c;

    public /* synthetic */ C107031l(C107035p pVar, MessageLite messageLite, C106546e eVar) {
        this.f298049a = pVar;
        this.f298050b = messageLite;
        this.f298051c = eVar;
    }

    public final C60870cx apply(Object obj) {
        C107035p pVar = this.f298049a;
        MessageLite messageLite = this.f298050b;
        C106546e eVar = this.f298051c;
        Optional optional = (Optional) obj;
        if (optional == null || optional.isEmpty()) {
            ((C58970a) ((C58970a) pVar.f298064f.mo56224b()).mo56372aa(23452)).mo56389s("Event %s did not generate a user context.", messageLite.getClass().getSimpleName());
            return C118826c.f331423b;
        } else if (eVar.mo95573e() == C106595g.MEDIA_SESSION) {
            return C118826c.f331423b;
        } else {
            return pVar.f298061c.mo95725a((C106596h) DesugarAtomicReference.updateAndGet(pVar.f298065g, new C107020a(optional)));
        }
    }
}
