package p3186j$.util.stream;

import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.D */
abstract class C41137D implements C41203T2 {

    /* renamed from: a */
    boolean f107722a;

    /* renamed from: b */
    Object f107723b;

    C41137D() {
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    /* renamed from: accept */
    public final void mo43682d(Object obj) {
        if (!this.f107722a) {
            this.f107722a = true;
            this.f107723b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo43663c(long j) {
    }

    /* renamed from: e */
    public final boolean mo43664e() {
        return this.f107722a;
    }

    public final /* synthetic */ void end() {
    }
}
