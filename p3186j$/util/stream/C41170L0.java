package p3186j$.util.stream;

import p3186j$.util.C41039G;
import p3186j$.util.C41041I;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.L0 */
final class C41170L0 extends C41227a2 implements C41265k0, C41249g0 {
    C41170L0() {
    }

    /* renamed from: a */
    public final C41273m0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final void accept(int i) {
        super.accept(i);
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43736d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final Object mo43645b() {
        return (int[]) super.mo43645b();
    }

    public final C41265k0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final C41277n0 m241136build() {
        return this;
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        clear();
        mo43846r(j);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final void end() {
    }

    /* renamed from: f */
    public final void mo43647f(int i, Object obj) {
        super.mo43647f(i, (int[]) obj);
    }

    /* renamed from: g */
    public final void mo43649g(Object obj) {
        super.mo43649g((IntConsumer) obj);
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
        return C41241e0.m72103u(this, j, j2);
    }

    public final C41041I spliterator() {
        return super.mo43771u();
    }

    /* renamed from: u */
    public final C41039G mo43771u() {
        return super.mo43771u();
    }

    /* renamed from: v */
    public final /* synthetic */ void mo43650i(Integer[] numArr, int i) {
        C41241e0.m72097o(this, numArr, i);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241137spliterator() {
        return super.mo43771u();
    }
}
