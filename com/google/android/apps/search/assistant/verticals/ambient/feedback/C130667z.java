package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import com.google.assistant.p4016z.C53691ap;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53708bf;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.z */
/* compiled from: PG */
public final /* synthetic */ class C130667z implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130667z f357824a = new C130667z();

    private /* synthetic */ C130667z() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C53692aq aqVar = ((C53708bf) obj).f140996c;
        if (aqVar == null) {
            aqVar = C53692aq.f140937k;
        }
        C53691ap a = C53691ap.m86884a(aqVar.f140943e);
        if (a == null) {
            a = C53691ap.UNSPECIFIED;
        }
        return new C130614b(a, aqVar.f140944f);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
