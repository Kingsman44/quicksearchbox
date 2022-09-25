package com.google.android.apps.gsa.speech.p7272e.p7274b;

import android.util.Base64;
import com.google.android.apps.gsa.languagepack.e.f;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.speech.e.b.p */
/* compiled from: PG */
public final /* synthetic */ class C92254p implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C92254p f257226a = new C92254p();

    private /* synthetic */ C92254p() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C92255q.f257227b;
        return Base64.encodeToString(((f) ((Map.Entry) obj).getValue()).toByteArray(), 3);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
