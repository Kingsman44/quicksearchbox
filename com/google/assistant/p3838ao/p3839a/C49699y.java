package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3845e.C49539aw;
import com.google.assistant.p3838ao.p3839a.p3845e.C49541ay;
import com.google.assistant.p3838ao.p3839a.p3845e.C49542az;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.assistant.ao.a.y */
/* compiled from: PG */
public final /* synthetic */ class C49699y implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C49699y f128276a = new C49699y();

    private /* synthetic */ C49699y() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49542az azVar = (C49542az) obj;
        C58974d dVar = C49429af.f127673a;
        int a = C49541ay.m85577a(azVar.f127832d);
        if (a != 0 && a != 1) {
            return azVar;
        }
        C49539aw awVar = (C49539aw) azVar.toBuilder();
        awVar.copyOnWrite();
        C49542az azVar2 = (C49542az) awVar.instance;
        azVar2.f127832d = 1;
        azVar2.f127829a |= 4;
        return (C49542az) awVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
