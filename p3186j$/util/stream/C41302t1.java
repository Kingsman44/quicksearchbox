package p3186j$.util.stream;

import p3186j$.util.function.C41105q;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.t1 */
final class C41302t1 implements C41310v1, C41167K1 {

    /* renamed from: a */
    private long f108026a;

    /* renamed from: b */
    final /* synthetic */ long f108027b;

    /* renamed from: c */
    final /* synthetic */ C41105q f108028c;

    C41302t1(long j, C41105q qVar) {
        this.f108027b = j;
        this.f108028c = qVar;
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
        long j2;
        long j3 = this.f108026a;
        switch (((C41129B) this.f108028c).f107714a) {
            case 5:
                j2 = Math.max(j3, j);
                break;
            default:
                j2 = j + j3;
                break;
        }
        this.f108026a = j2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43738j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f108026a = this.f108027b;
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    public final Object get() {
        return Long.valueOf(this.f108026a);
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        accept(((C41302t1) v1Var).f108026a);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo43738j(Long l) {
        C41241e0.m72091i(this, l);
    }
}
