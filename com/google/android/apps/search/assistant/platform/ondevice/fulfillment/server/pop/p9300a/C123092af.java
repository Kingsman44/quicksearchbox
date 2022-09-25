package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.common.util.concurrent.C60856cj;
import com.google.nlp.p4730a.C62799s;
import com.google.protos.p5127o.p5128a.C65639t;
import com.google.protos.p5127o.p5128a.C65644y;
import com.google.protos.p5127o.p5128a.C65645z;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.af */
/* compiled from: PG */
public final /* synthetic */ class C123092af implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123097ak f340702a;

    /* renamed from: b */
    public final /* synthetic */ C62799s f340703b;

    public /* synthetic */ C123092af(C123097ak akVar, C62799s sVar) {
        this.f340702a = akVar;
        this.f340703b = sVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123097ak akVar = this.f340702a;
        C62799s sVar = this.f340703b;
        GalliumIpc galliumIpc = (GalliumIpc) obj;
        akVar.f340709b.mo105882a();
        try {
            return C65645z.m96775b(galliumIpc, (C65639t) galliumIpc.f51690c.mo23693b(C65644y.f178373a)).mo59416a(akVar.f340708a.mo24256b(), sVar);
        } catch (C18218av e) {
            return C60856cj.m92899h(e);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
