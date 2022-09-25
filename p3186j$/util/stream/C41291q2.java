package p3186j$.util.stream;

import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.q2 */
public final /* synthetic */ class C41291q2 implements C41159I1 {

    /* renamed from: a */
    public final /* synthetic */ int f108009a;

    /* renamed from: b */
    public final /* synthetic */ DoubleConsumer f108010b;

    public /* synthetic */ C41291q2(DoubleConsumer doubleConsumer, int i) {
        this.f108009a = i;
        this.f108010b = doubleConsumer;
    }

    public final void accept(double d) {
        int i = this.f108009a;
        DoubleConsumer doubleConsumer = this.f108010b;
        switch (i) {
            case 0:
                ((C41220Y1) doubleConsumer).accept(d);
                return;
            default:
                doubleConsumer.accept(d);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f108009a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo43663c(long j) {
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: k */
    public final /* synthetic */ void mo43666k(Double d) {
        switch (this.f108009a) {
            case 0:
                C41241e0.m72087d(this, d);
                return;
            default:
                C41241e0.m72087d(this, d);
                return;
        }
    }

    public final /* synthetic */ void accept(int i) {
        switch (this.f108009a) {
            case 0:
                C41241e0.m72093k();
                throw null;
            default:
                C41241e0.m72093k();
                throw null;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f108009a) {
            case 0:
                return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
            default:
                return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f108009a) {
            case 0:
                C41241e0.m72094l();
                throw null;
            default:
                C41241e0.m72094l();
                throw null;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f108009a) {
            case 0:
                mo43666k((Double) obj);
                return;
            default:
                mo43666k((Double) obj);
                return;
        }
    }
}
