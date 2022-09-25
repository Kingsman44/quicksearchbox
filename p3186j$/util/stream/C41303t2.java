package p3186j$.util.stream;

import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.t2 */
public final /* synthetic */ class C41303t2 implements C41163J1 {

    /* renamed from: a */
    public final /* synthetic */ int f108029a;

    /* renamed from: b */
    public final /* synthetic */ IntConsumer f108030b;

    public /* synthetic */ C41303t2(IntConsumer intConsumer, int i) {
        this.f108029a = i;
        this.f108030b = intConsumer;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f108029a) {
            case 0:
                C41241e0.m72086c();
                throw null;
            default:
                C41241e0.m72086c();
                throw null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f108029a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo43663c(long j) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        switch (this.f108029a) {
            case 0:
                C41241e0.m72089g(this, num);
                return;
            default:
                C41241e0.m72089g(this, num);
                return;
        }
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    public final void accept(int i) {
        int i2 = this.f108029a;
        IntConsumer intConsumer = this.f108030b;
        switch (i2) {
            case 0:
                ((C41227a2) intConsumer).accept(i);
                return;
            default:
                intConsumer.accept(i);
                return;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f108029a) {
            case 0:
                return IntConsumer.CC.$default$andThen(this, intConsumer);
            default:
                return IntConsumer.CC.$default$andThen(this, intConsumer);
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f108029a) {
            case 0:
                C41241e0.m72094l();
                throw null;
            default:
                C41241e0.m72094l();
                throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f108029a) {
            case 0:
                mo43736d((Integer) obj);
                return;
            default:
                mo43736d((Integer) obj);
                return;
        }
    }
}
