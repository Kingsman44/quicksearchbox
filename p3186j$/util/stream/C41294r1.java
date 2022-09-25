package p3186j$.util.stream;

import p3186j$.util.OptionalInt;
import p3186j$.util.function.C41100l;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.r1 */
final class C41294r1 implements C41310v1, C41163J1 {

    /* renamed from: a */
    private boolean f108013a;

    /* renamed from: b */
    private int f108014b;

    /* renamed from: c */
    final /* synthetic */ C41100l f108015c;

    C41294r1(C41100l lVar) {
        this.f108015c = lVar;
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final void accept(int i) {
        if (!this.f108013a) {
            int i2 = this.f108014b;
            switch (((C41129B) this.f108015c).f107714a) {
                case 1:
                    i = Math.min(i2, i);
                    break;
                case 2:
                    i = i2 + i;
                    break;
                default:
                    i = Math.max(i2, i);
                    break;
            }
        } else {
            this.f108013a = false;
        }
        this.f108014b = i;
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        this.f108013a = true;
        this.f108014b = 0;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }

    public final Object get() {
        return this.f108013a ? OptionalInt.empty() : OptionalInt.m71640of(this.f108014b);
    }

    /* renamed from: h */
    public final void mo43853h(C41310v1 v1Var) {
        C41294r1 r1Var = (C41294r1) v1Var;
        if (!r1Var.f108013a) {
            accept(r1Var.f108014b);
        }
    }
}
