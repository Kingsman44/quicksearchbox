package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62912at;
import com.google.protos.p4985f.p5030q.C65222gb;
import com.google.protos.p4985f.p5030q.C65235go;
import com.google.protos.p4985f.p5030q.C65236gp;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.portable.c */
/* compiled from: PG */
public final /* synthetic */ class C19095c implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ String f53556a;

    public /* synthetic */ C19095c(String str) {
        this.f53556a = str;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        String str = this.f53556a;
        C65222gb gbVar = (C65222gb) obj;
        C59071e eVar = PortableAssistant.f53431a;
        C65235go goVar = (C65235go) C65236gp.f176526c.createBuilder();
        goVar.copyOnWrite();
        C65236gp gpVar = (C65236gp) goVar.instance;
        str.getClass();
        gpVar.f176528a |= 1;
        gpVar.f176529b = str;
        return gbVar.f176506a.mo23657a(C18231d.f51786a, gbVar.f176507b, "UpdateUser", (C65236gp) goVar.build(), "type.googleapis.com/assistant.portable.UserUpdateRequest", C62912at.f169862a.getParserForType(), (C18238f) obj2);
    }
}
