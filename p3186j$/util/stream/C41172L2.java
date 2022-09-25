package p3186j$.util.stream;

import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.L2 */
public final /* synthetic */ class C41172L2 implements C41171L1 {

    /* renamed from: a */
    public final /* synthetic */ int f107761a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f107762b;

    public /* synthetic */ C41172L2(Consumer consumer, int i) {
        this.f107761a = i;
        this.f107762b = consumer;
    }

    public final /* synthetic */ void accept(double d) {
        switch (this.f107761a) {
            case 0:
                C41241e0.m72086c();
                throw null;
            default:
                C41241e0.m72086c();
                throw null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f107761a) {
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

    public final /* synthetic */ void accept(int i) {
        switch (this.f107761a) {
            case 0:
                C41241e0.m72093k();
                throw null;
            default:
                C41241e0.m72093k();
                throw null;
        }
    }

    public final /* synthetic */ void accept(long j) {
        switch (this.f107761a) {
            case 0:
                C41241e0.m72094l();
                throw null;
            default:
                C41241e0.m72094l();
                throw null;
        }
    }

    public final void accept(Object obj) {
        int i = this.f107761a;
        Consumer consumer = this.f107762b;
        switch (i) {
            case 0:
                ((C41247f2) consumer).accept(obj);
                return;
            default:
                consumer.accept(obj);
                return;
        }
    }
}
