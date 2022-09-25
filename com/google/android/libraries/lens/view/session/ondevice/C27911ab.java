package com.google.android.libraries.lens.view.session.ondevice;

import android.util.Size;
import com.google.p4172bg.p4174b.C55721j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.ab */
/* compiled from: PG */
public final /* synthetic */ class C27911ab implements Function {

    /* renamed from: a */
    public final /* synthetic */ Size f76033a;

    public /* synthetic */ C27911ab(Size size) {
        this.f76033a = size;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C27912ac.m51961a((C55721j) obj, this.f76033a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
