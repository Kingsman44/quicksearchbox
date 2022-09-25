package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4985f.p5030q.C65256hi;
import com.google.protos.p4985f.p5030q.C65257hj;
import com.google.protos.p4985f.p5030q.C65266hs;
import com.google.protos.p4985f.p5030q.C65275ia;
import com.google.protos.p4985f.p5030q.C65277ic;
import com.google.protos.p5127o.C65682h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C123094ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123097ak f340705a;

    /* renamed from: b */
    public final /* synthetic */ C65275ia f340706b;

    public /* synthetic */ C123094ah(C123097ak akVar, C65275ia iaVar) {
        this.f340705a = akVar;
        this.f340706b = iaVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C123097ak akVar = this.f340705a;
        C65275ia iaVar = this.f340706b;
        GalliumIpc galliumIpc = (GalliumIpc) obj;
        akVar.f340709b.mo105882a();
        try {
            int i = C65257hj.f176563a;
            C65682h hVar = ((C65266hs) galliumIpc.f51690c.mo23693b(C65256hi.f176562a)).f176574b;
            if (hVar == null) {
                hVar = C65682h.f178459f;
            }
            C18238f fVar = new C18238f();
            return galliumIpc.mo23657a(C18231d.f51786a, hVar, "LookupProvider", iaVar, "type.googleapis.com/assistant.portable.ProviderLookupRequest", C65277ic.f176587a.getParserForType(), fVar);
        } catch (C18218av e) {
            return C60856cj.m92899h(e);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
