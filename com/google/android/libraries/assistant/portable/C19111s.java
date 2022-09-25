package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.protobuf.C62912at;
import com.google.protos.p4985f.p5030q.C65222gb;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.portable.s */
/* compiled from: PG */
public final /* synthetic */ class C19111s implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C19111s f53574a = new C19111s();

    private /* synthetic */ C19111s() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C65222gb gbVar = (C65222gb) obj;
        C62912at atVar = C62912at.f169862a;
        return gbVar.f176506a.mo23657a(C18231d.f51786a, gbVar.f176507b, "WarmUp", atVar, "type.googleapis.com/google.protobuf.Empty", C62912at.f169862a.getParserForType(), (C18238f) obj2);
    }
}
