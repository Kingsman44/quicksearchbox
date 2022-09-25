package com.google.android.apps.gsa.staticplugins.p8793w.p8795b.p8796a.p8799c.p8800a;

import com.google.android.apps.gsa.contacts.ap;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13261a;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13262b;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.b.a.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C117750b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C117750b f326833a = new C117750b();

    private /* synthetic */ C117750b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ap apVar = (ap) obj;
        C13261a aVar = (C13261a) C13262b.f40943e.createBuilder();
        String str = apVar.c;
        aVar.copyOnWrite();
        C13262b bVar = (C13262b) aVar.instance;
        str.getClass();
        bVar.f40945a |= 1;
        bVar.f40946b = str;
        double d = apVar.d;
        aVar.copyOnWrite();
        C13262b bVar2 = (C13262b) aVar.instance;
        bVar2.f40945a |= 2;
        bVar2.f40947c = d;
        String str2 = apVar.b;
        aVar.copyOnWrite();
        C13262b bVar3 = (C13262b) aVar.instance;
        str2.getClass();
        bVar3.f40945a |= 4;
        bVar3.f40948d = str2;
        return (C13262b) aVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
