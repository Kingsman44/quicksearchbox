package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import com.google.android.gearhead.sdk.assistant.C142665k;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.l */
/* compiled from: PG */
public final /* synthetic */ class C11664l implements Function {

    /* renamed from: a */
    public final /* synthetic */ C11668p f37644a;

    /* renamed from: b */
    public final /* synthetic */ MessagingInfo f37645b;

    public /* synthetic */ C11664l(C11668p pVar, MessagingInfo messagingInfo) {
        this.f37644a = pVar;
        this.f37645b = messagingInfo;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C142665k kVar = (C142665k) obj;
        return this.f37644a.mo20105c(kVar.f387148c, kVar.f387146a, kVar.f387149d, false, this.f37645b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
