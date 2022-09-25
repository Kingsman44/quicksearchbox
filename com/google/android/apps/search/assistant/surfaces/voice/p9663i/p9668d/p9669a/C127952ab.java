package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.IntToDoubleFunction;
import p3186j$.util.stream.DoubleStream;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C127952ab implements IntToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f352192a;

    public /* synthetic */ C127952ab(C58485gu guVar) {
        this.f352192a = guVar;
    }

    public final double applyAsDouble(int i) {
        double[] array = Collection.EL.stream(this.f352192a).mapToDouble(new C127957ag(i)).toArray();
        int length = array.length;
        if (length != 0) {
            double sum = DoubleStream.CC.m71796of(array).map(new C127956af(DoubleStream.CC.m71796of(array).average().getAsDouble())).sum();
            double d = (double) length;
            Double.isNaN(d);
            return Math.sqrt(sum / d);
        }
        throw new IllegalArgumentException("standardDeviation needs at least one value");
    }
}
