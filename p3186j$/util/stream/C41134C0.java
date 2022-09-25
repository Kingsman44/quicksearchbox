package p3186j$.util.stream;

import p3186j$.util.C41038F;
import p3186j$.util.C41041I;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.C0 */
final class C41134C0 extends C41220Y1 implements C41261j0, C41245f0 {
    C41134C0() {
    }

    /* renamed from: a */
    public final C41273m0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final void accept(double d) {
        super.accept(d);
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43666k((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final Object mo43645b() {
        return (double[]) super.mo43645b();
    }

    public final C41261j0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final C41277n0 m241130build() {
        return this;
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        clear();
        mo43846r(j);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final void end() {
    }

    /* renamed from: f */
    public final void mo43647f(int i, Object obj) {
        super.mo43647f(i, (double[]) obj);
    }

    /* renamed from: g */
    public final void mo43649g(Object obj) {
        super.mo43649g((DoubleConsumer) obj);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo43666k(Double d) {
        C41241e0.m72087d(this, d);
    }

    /* renamed from: l */
    public final /* synthetic */ int mo43651l() {
        return 0;
    }

    /* renamed from: m */
    public final /* synthetic */ Object[] mo43652m(IntFunction intFunction) {
        return C41241e0.m72095m(this, intFunction);
    }

    /* renamed from: n */
    public final /* synthetic */ C41277n0 mo43653n(long j, long j2, IntFunction intFunction) {
        return C41241e0.m72102t(this, j, j2);
    }

    public final C41041I spliterator() {
        return super.mo43675u();
    }

    /* renamed from: u */
    public final C41038F mo43675u() {
        return super.mo43675u();
    }

    /* renamed from: v */
    public final /* synthetic */ void mo43650i(Double[] dArr, int i) {
        C41241e0.m72096n(this, dArr, i);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241131spliterator() {
        return super.mo43675u();
    }
}
