package p5488io.p5490b.p5497e.p5502e.p5506d;

import com.google.android.libraries.elements.p1714d.p1724f.p1725a.C21085i;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5497e.p5501d.C69848a;

/* renamed from: io.b.e.e.d.j */
/* compiled from: PG */
final class C69980j extends C69848a {

    /* renamed from: e */
    Object f186523e;

    /* renamed from: f */
    boolean f186524f;

    public C69980j(C70123o oVar) {
        super(oVar);
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186217d) {
            try {
                if (this.f186524f) {
                    boolean a = C21085i.m39619a(this.f186523e, obj);
                    this.f186523e = obj;
                    if (a) {
                        return;
                    }
                } else {
                    this.f186524f = true;
                    this.f186523e = obj;
                }
                this.f186214a.mo25988lL(obj);
            } catch (Throwable th) {
                mo61487f(th);
            }
        }
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        return 0;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        Object lN;
        boolean a;
        do {
            lN = this.f186216c.mo61479lN();
            if (lN == null) {
                return null;
            }
            if (!this.f186524f) {
                this.f186524f = true;
                this.f186523e = lN;
                return lN;
            }
            a = C21085i.m39619a(this.f186523e, lN);
            this.f186523e = lN;
        } while (a);
        return lN;
    }
}
