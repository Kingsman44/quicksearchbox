package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5501d.C69850c;

/* renamed from: io.b.e.e.d.ah */
/* compiled from: PG */
final class C69927ah extends C69850c {

    /* renamed from: a */
    final C70123o f186384a;

    /* renamed from: b */
    final Object[] f186385b;

    /* renamed from: c */
    int f186386c;

    /* renamed from: d */
    boolean f186387d;

    /* renamed from: e */
    volatile boolean f186388e;

    public C69927ah(C70123o oVar, Object[] objArr) {
        this.f186384a = oVar;
        this.f186385b = objArr;
    }

    /* renamed from: c */
    public final void mo61475c() {
        this.f186386c = 2;
    }

    public final void dispose() {
        this.f186388e = true;
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186386c == 2;
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        this.f186387d = true;
        return 1;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        int i = this.f186386c;
        Object[] objArr = this.f186385b;
        if (i == 2) {
            return null;
        }
        this.f186386c = i + 1;
        Object obj = objArr[i];
        C69841j.m101337b(obj, "The array element is null");
        return obj;
    }
}
