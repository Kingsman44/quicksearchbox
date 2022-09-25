package com.google.android.apps.gsa.nga.engine.p6034i.p6037c;

import p3186j$.util.function.IntUnaryOperator;

/* renamed from: com.google.android.apps.gsa.nga.engine.i.c.d */
/* compiled from: PG */
public final /* synthetic */ class C76159d implements IntUnaryOperator {

    /* renamed from: a */
    public static final /* synthetic */ C76159d f211136a = new C76159d();

    private /* synthetic */ C76159d() {
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator.CC.$default$andThen(this, intUnaryOperator);
    }

    public final int applyAsInt(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new IllegalStateException("Maximum lock count exceeded");
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return IntUnaryOperator.CC.$default$compose(this, intUnaryOperator);
    }
}
