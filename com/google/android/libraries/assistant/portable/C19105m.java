package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.protos.p4985f.p5030q.C65191ey;
import com.google.protos.p4985f.p5030q.C65196fc;
import com.google.protos.p4985f.p5030q.C65250hc;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.portable.m */
/* compiled from: PG */
public final /* synthetic */ class C19105m implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C65191ey f53568a;

    public /* synthetic */ C19105m(C65191ey eyVar) {
        this.f53568a = eyVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C65250hc hcVar = (C65250hc) obj;
        return hcVar.f176553a.mo23657a(C18231d.f51786a, hcVar.f176554b, "GetResponse", this.f53568a, "type.googleapis.com/assistant.portable.PortableAssistantRequest", C65196fc.f176453l.getParserForType(), (C18238f) obj2);
    }
}
