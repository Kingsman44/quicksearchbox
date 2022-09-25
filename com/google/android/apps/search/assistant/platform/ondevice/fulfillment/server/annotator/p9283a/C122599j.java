package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80054ah;
import com.google.android.apps.gsa.nga.shared.p6274a.C80055ai;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.a.j */
/* compiled from: PG */
public final /* synthetic */ class C122599j implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C122599j f339770a = new C122599j();

    private /* synthetic */ C122599j() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80055ai aiVar = (C80055ai) obj;
        C80054ah ahVar = (C80054ah) C80055ai.f219682c.createBuilder();
        String str = aiVar.f219684a;
        ahVar.copyOnWrite();
        str.getClass();
        ((C80055ai) ahVar.instance).f219684a = str;
        String str2 = aiVar.f219685b;
        ahVar.copyOnWrite();
        str2.getClass();
        ((C80055ai) ahVar.instance).f219685b = str2;
        return (C80055ai) ahVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
