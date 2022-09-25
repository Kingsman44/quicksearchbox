package p3186j$.util.stream;

import p3186j$.util.C41040H;
import p3186j$.util.C41041I;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.U0 */
final class C41205U0 extends C41235c2 implements C41269l0, C41253h0 {
    C41205U0() {
    }

    /* renamed from: a */
    public final C41273m0 mo43644a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final void accept(long j) {
        super.accept(j);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43738j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final Object mo43645b() {
        return (long[]) super.mo43645b();
    }

    public final C41269l0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final C41277n0 m241139build() {
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
        super.mo43647f(i, (long[]) obj);
    }

    /* renamed from: g */
    public final void mo43649g(Object obj) {
        super.mo43649g((LongConsumer) obj);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo43738j(Long l) {
        C41241e0.m72091i(this, l);
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
        return C41241e0.m72104v(this, j, j2);
    }

    public final C41041I spliterator() {
        return super.mo43796u();
    }

    /* renamed from: u */
    public final C41040H mo43796u() {
        return super.mo43796u();
    }

    /* renamed from: v */
    public final /* synthetic */ void mo43650i(Long[] lArr, int i) {
        C41241e0.m72098p(this, lArr, i);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m241140spliterator() {
        return super.mo43796u();
    }
}
