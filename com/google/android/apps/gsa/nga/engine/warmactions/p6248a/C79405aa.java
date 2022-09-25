package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C79405aa implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C79405aa f218043a = new C79405aa();

    private /* synthetic */ C79405aa() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C58974d dVar = C79418an.f218059a;
        int i = ((C79570b) obj).f218339o;
        String str = true != ((C79455m) obj2).f218133a.get() ? "uninitialized" : "initialized";
        return i + " " + str;
    }
}
