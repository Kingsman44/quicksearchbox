package android.support.p033v7.widget;

import androidx.p060c.C0981k;

/* renamed from: android.support.v7.widget.hs */
/* compiled from: PG */
final class C0711hs implements C0717hy {

    /* renamed from: a */
    final /* synthetic */ C0712ht f2545a;

    /* renamed from: b */
    private final C0981k f2546b = new C0981k(10);

    public C0711hs(C0712ht htVar) {
        this.f2545a = htVar;
    }

    /* renamed from: a */
    public final long mo3200a(long j) {
        Long l = (Long) this.f2546b.mo3678e(j);
        if (l == null) {
            C0712ht htVar = this.f2545a;
            long j2 = htVar.f2547a;
            htVar.f2547a = 1 + j2;
            l = Long.valueOf(j2);
            this.f2546b.mo3682i(j, l);
        }
        return l.longValue();
    }
}
