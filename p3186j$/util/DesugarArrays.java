package p3186j$.util;

import p3186j$.util.stream.DoubleStream;
import p3186j$.util.stream.IntStream;
import p3186j$.util.stream.LongStream;
import p3186j$.util.stream.Stream;
import p3186j$.util.stream.StreamSupport;

/* renamed from: j$.util.DesugarArrays */
public final /* synthetic */ class DesugarArrays {
    public static DoubleStream stream(double[] dArr) {
        return StreamSupport.m71937a(C41059a0.m71669j(dArr, 0, dArr.length));
    }

    public static IntStream stream(int[] iArr) {
        return StreamSupport.m71938b(C41059a0.m71670k(iArr, 0, iArr.length));
    }

    public static LongStream stream(long[] jArr) {
        return StreamSupport.m71939c(C41059a0.m71671l(jArr, 0, jArr.length));
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return StreamSupport.stream(C41059a0.m71672m(tArr, 0, tArr.length), false);
    }
}
