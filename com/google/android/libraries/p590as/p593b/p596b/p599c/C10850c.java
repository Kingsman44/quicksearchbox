package com.google.android.libraries.p590as.p593b.p596b.p599c;

import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.as.b.b.c.c */
/* compiled from: PG */
public final /* synthetic */ class C10850c implements BinaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C10850c f35910a = new C10850c();

    private /* synthetic */ C10850c() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        ((C58970a) ((C58970a) C10852e.f35912a.mo56226d()).mo56372aa(54003)).mo56359L("Language display name config has duplicate locales: '%s' and '%s'. Choosing %s arbitrarily, but config may have an error.", str, (String) obj2, str);
        return str;
    }
}
