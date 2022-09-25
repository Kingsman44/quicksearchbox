package com.google.android.libraries.assistant.pcp.p1557g;

import com.google.common.p4526f.C59052c;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.pcp.g.b */
/* compiled from: PG */
public final /* synthetic */ class C18708b implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C18708b f52777a = new C18708b();

    private /* synthetic */ C18708b() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C18769h hVar = (C18769h) obj;
        C18769h hVar2 = (C18769h) obj2;
        ((C59052c) ((C59052c) C18768g.f52884a.mo56226d()).mo56372aa(47339)).mo56389s("Duplicate context suppliers found for key: %s", hVar2);
        return hVar2;
    }
}
