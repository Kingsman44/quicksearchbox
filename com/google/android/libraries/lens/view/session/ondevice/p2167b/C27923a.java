package com.google.android.libraries.lens.view.session.ondevice.p2167b;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.b.a */
/* compiled from: PG */
public final /* synthetic */ class C27923a implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f76070a;

    /* renamed from: b */
    public final /* synthetic */ int f76071b;

    public /* synthetic */ C27923a(int i, int i2) {
        this.f76070a = i;
        this.f76071b = i2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = this.f76070a;
        return Integer.valueOf((((Integer) obj).intValue() * i) / this.f76071b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
