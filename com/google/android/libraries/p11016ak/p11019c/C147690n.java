package com.google.android.libraries.p11016ak.p11019c;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.IntFunction;
import p5285d.p5290b.p5291a.p5292a.C68150am;

/* renamed from: com.google.android.libraries.ak.c.n */
/* compiled from: PG */
public final /* synthetic */ class C147690n implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ C147691o f398582a;

    public /* synthetic */ C147690n(C147691o oVar) {
        this.f398582a = oVar;
    }

    public final Object apply(int i) {
        C147691o oVar = this.f398582a;
        C68150am amVar = oVar.f398586c;
        int i2 = amVar.f184436a;
        if (i >= i2 && i < i2 + amVar.f184437b) {
            return (C60870cx) oVar.f398584a.get(Integer.valueOf(i));
        }
        return C60856cj.m92899h(new IllegalArgumentException("paragraphIndex " + i + " not in range."));
    }
}
