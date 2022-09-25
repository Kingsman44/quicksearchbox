package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c */
/* compiled from: PG */
public final /* synthetic */ class C111886c implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f310896a;

    public /* synthetic */ C111886c(C58495hd hdVar) {
        this.f310896a = hdVar;
    }

    public final void accept(Object obj, Object obj2) {
        C58495hd hdVar = this.f310896a;
        C60870cx cxVar = (C60870cx) hdVar.get(C48672ag.m85259b(((Integer) obj).intValue()));
        C60870cx cxVar2 = (C60870cx) hdVar.get(C48672ag.m85259b(((Integer) obj2).intValue()));
        if (cxVar != null && cxVar2 != null) {
            cxVar2.mo4106b(new C111996d(cxVar), C60826bg.f164896a);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
