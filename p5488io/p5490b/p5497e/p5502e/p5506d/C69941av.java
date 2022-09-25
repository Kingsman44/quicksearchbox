package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.Arrays;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69812e;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: io.b.e.e.d.av */
/* compiled from: PG */
final class C69941av implements C70123o, C69803b {

    /* renamed from: a */
    final C70123o f186421a;

    /* renamed from: b */
    final C69822d f186422b;

    /* renamed from: c */
    C69803b f186423c;

    public C69941av(C70123o oVar, C69822d dVar) {
        this.f186421a = oVar;
        this.f186422b = dVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        this.f186421a.mo25986a();
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        try {
            Object a = this.f186422b.mo25875a(th);
            if (a == null) {
                NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th);
                this.f186421a.mo25987b(nullPointerException);
                return;
            }
            this.f186421a.mo25988lL(a);
            this.f186421a.mo25986a();
        } catch (Throwable th2) {
            C69813f.m101292a(th2);
            this.f186421a.mo25987b(new C69812e(Arrays.asList(new Throwable[]{th, th2})));
        }
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186423c, bVar)) {
            this.f186423c = bVar;
            this.f186421a.mo26850d(this);
        }
    }

    public final void dispose() {
        this.f186423c.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        this.f186421a.mo25988lL(obj);
    }
}
