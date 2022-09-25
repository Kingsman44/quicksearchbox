package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4985f.p5030q.C65181eo;
import com.google.protos.p4985f.p5030q.C65182ep;
import com.google.protos.p4985f.p5030q.C65184er;
import com.google.protos.p4985f.p5030q.C65191ey;
import com.google.protos.p4985f.p5030q.C65250hc;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.portable.j */
/* compiled from: PG */
public final /* synthetic */ class C19102j implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C61752n f53564a;

    /* renamed from: b */
    public final /* synthetic */ C65191ey f53565b;

    public /* synthetic */ C19102j(C61752n nVar, C65191ey eyVar) {
        this.f53564a = nVar;
        this.f53565b = eyVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C61752n nVar = this.f53564a;
        C65191ey eyVar = this.f53565b;
        C65250hc hcVar = (C65250hc) obj;
        C59071e eVar = PortableAssistant.f53431a;
        C65181eo eoVar = (C65181eo) C65182ep.f176392d.createBuilder();
        eoVar.copyOnWrite();
        C65182ep epVar = (C65182ep) eoVar.instance;
        nVar.getClass();
        epVar.f176396c = nVar;
        epVar.f176394a |= 2;
        eoVar.copyOnWrite();
        C65182ep epVar2 = (C65182ep) eoVar.instance;
        eyVar.getClass();
        epVar2.f176395b = eyVar;
        epVar2.f176394a |= 1;
        return hcVar.f176553a.mo23657a(C18231d.f51786a, hcVar.f176554b, "CallIGDP", (C65182ep) eoVar.build(), "type.googleapis.com/assistant.portable.IGDPRequest", C65184er.f176398e.getParserForType(), (C18238f) obj2);
    }
}
