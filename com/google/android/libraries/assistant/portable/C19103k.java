package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4985f.p5030q.C65222gb;
import com.google.protos.p4985f.p5030q.C65229gi;
import com.google.protos.p4985f.p5030q.C65230gj;
import com.google.protos.p4985f.p5030q.C65232gl;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.portable.k */
/* compiled from: PG */
public final /* synthetic */ class C19103k implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ C46677o f53566a;

    public /* synthetic */ C19103k(C46677o oVar) {
        this.f53566a = oVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C46677o oVar = this.f53566a;
        C65222gb gbVar = (C65222gb) obj;
        C59071e eVar = PortableAssistant.f53431a;
        C65229gi giVar = (C65229gi) C65230gj.f176514c.createBuilder();
        boolean c = oVar.mo50699c();
        giVar.copyOnWrite();
        C65230gj gjVar = (C65230gj) giVar.instance;
        gjVar.f176516a |= 1;
        gjVar.f176517b = c;
        return gbVar.f176506a.mo23657a(C18231d.f51786a, gbVar.f176507b, "Dump", (C65230gj) giVar.build(), "type.googleapis.com/assistant.portable.DebugDataRequest", C65232gl.f176518b.getParserForType(), (C18238f) obj2);
    }
}
