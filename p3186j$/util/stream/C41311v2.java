package p3186j$.util.stream;

import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.v2 */
public final /* synthetic */ class C41311v2 implements C41167K1 {

    /* renamed from: a */
    public final /* synthetic */ int f108040a;

    /* renamed from: b */
    public final /* synthetic */ LongConsumer f108041b;

    public /* synthetic */ C41311v2(LongConsumer longConsumer, int i) {
        this.f108040a = i;
        this.f108041b = longConsumer;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f108040a) {
            case 0:
                C41241e0.m72086c();
                throw null;
            default:
                C41241e0.m72086c();
                throw null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f108040a) {
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

    /* renamed from: j */
    public final /* synthetic */ void mo43738j(Long l) {
        switch (this.f108040a) {
            case 0:
                C41241e0.m72091i(this, l);
                return;
            default:
                C41241e0.m72091i(this, l);
                return;
        }
    }

    public final /* synthetic */ void accept(int i) {
        switch (this.f108040a) {
            case 0:
                C41241e0.m72093k();
                throw null;
            default:
                C41241e0.m72093k();
                throw null;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f108040a) {
            case 0:
                return LongConsumer.CC.$default$andThen(this, longConsumer);
            default:
                return LongConsumer.CC.$default$andThen(this, longConsumer);
        }
    }

    public final void accept(long j) {
        int i = this.f108040a;
        LongConsumer longConsumer = this.f108041b;
        switch (i) {
            case 0:
                ((C41235c2) longConsumer).accept(j);
                return;
            default:
                longConsumer.accept(j);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f108040a) {
            case 0:
                mo43738j((Long) obj);
                return;
            default:
                mo43738j((Long) obj);
                return;
        }
    }
}
