package p3186j$.util.stream;

import p3186j$.util.OptionalLong;
import p3186j$.util.function.C41105q;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.u1 */
final class C41306u1 implements C41310v1, C41167K1 {

    /* renamed from: a */
    private boolean f108035a;

    /* renamed from: b */
    private long f108036b;

    /* renamed from: c */
    final /* synthetic */ C41105q f108037c;

    C41306u1(C41105q qVar) {
        this.f108037c = qVar;
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
        if (!this.f108035a) {
            long j2 = this.f108036b;
            switch (((C41129B) this.f108037c).f107714a) {
                case 5:
                    j = Math.max(j2, j);
                    break;
                default:
                    j = j2 + j;
                    break;
            }
        } else {
            this.f108035a = false;
        }
        this.f108036b = j;
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
        this.f108035a = true;
        this.f108036b = 0;
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    public final Object get() {
        return this.f108035a ? OptionalLong.empty() : OptionalLong.m71641of(this.f108036b);
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        C41306u1 u1Var = (C41306u1) v1Var;
        if (!u1Var.f108035a) {
            accept(u1Var.f108036b);
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo43738j(Long l) {
        C41241e0.m72091i(this, l);
    }
}
