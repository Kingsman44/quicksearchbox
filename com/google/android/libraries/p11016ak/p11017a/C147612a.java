package com.google.android.libraries.p11016ak.p11017a;

import java.util.List;
import p3186j$.util.function.Function;
import p5285d.p5290b.p5291a.p5292a.C68169be;
import p5285d.p5290b.p5291a.p5292a.C68172bh;

/* renamed from: com.google.android.libraries.ak.a.a */
/* compiled from: PG */
public final /* synthetic */ class C147612a implements Function {

    /* renamed from: a */
    public final /* synthetic */ List f398425a;

    public /* synthetic */ C147612a(List list) {
        this.f398425a = list;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C68169be beVar = ((C68172bh) this.f398425a.get(((Integer) obj).intValue())).f184476b;
        if (beVar == null) {
            beVar = C68169be.f184463c;
        }
        return Long.valueOf((long) beVar.f184466b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
