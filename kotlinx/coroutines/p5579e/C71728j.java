package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71397ad;
import kotlinx.coroutines.C71400ag;
import kotlinx.coroutines.C71414ao;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71601bb;
import kotlinx.coroutines.C71611bl;
import kotlinx.coroutines.C71619bt;
import kotlinx.coroutines.C71687dw;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.j */
/* compiled from: PG */
public final class C71728j extends C71611bl implements C69566d, C69577g {

    /* renamed from: a */
    public final C71414ao f191202a;

    /* renamed from: b */
    public final C69577g f191203b;

    /* renamed from: c */
    public Object f191204c = C71729k.f191207a;

    /* renamed from: d */
    public final Object f191205d = C71715aw.m104855a(mo61340lY());

    /* renamed from: e */
    public final C71342e f191206e = new C71342e((Object) null, C71343f.f190534a);

    public C71728j(C71414ao aoVar, C69577g gVar) {
        super(-1);
        this.f191202a = aoVar;
        this.f191203b = gVar;
    }

    /* renamed from: a */
    public final void mo62982a(C69585o oVar, Object obj) {
        C69664n.m101061g(oVar, "context");
        this.f191204c = obj;
        this.f191046f = 1;
        this.f191202a.mo62773e(oVar, this);
    }

    /* renamed from: eL */
    public final StackTraceElement mo61335eL() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [h.c.g, h.c.b.a.d] */
    /* renamed from: eM */
    public final C69566d mo61336eM() {
        return this.f191203b;
    }

    /* renamed from: lY */
    public final C69585o mo61340lY() {
        return this.f191203b.mo61340lY();
    }

    /* renamed from: mb */
    public final void mo61338mb(Object obj) {
        C69585o lY;
        Object b;
        C69585o lY2 = this.f191203b.mo61340lY();
        Object b2 = C71400ag.m104165b(obj, (C69626l) null);
        if (this.f191202a.mo62768f(lY2)) {
            this.f191204c = b2;
            this.f191046f = 0;
            this.f191202a.mo62766d(lY2, this);
            return;
        }
        boolean z = C71600ba.f191036a;
        ThreadLocal threadLocal = C71687dw.f191139a;
        C71619bt a = C71687dw.m104785a();
        if (a.mo62847o()) {
            this.f191204c = b2;
            this.f191046f = 0;
            a.mo62845m(this);
            return;
        }
        a.mo62846n(true);
        try {
            lY = mo61340lY();
            b = C71715aw.m104856b(lY, this.f191205d);
            this.f191203b.mo61338mb(obj);
            C71715aw.m104857c(lY, b);
            do {
            } while (a.mo62849q());
            a.mo62844l(true);
        } catch (Throwable th) {
            try {
                mo62831C(th, (Throwable) null);
            } finally {
                a.mo62844l(true);
            }
        }
    }

    /* renamed from: p */
    public final Object mo62833p() {
        Object obj = this.f191204c;
        boolean z = C71600ba.f191036a;
        this.f191204c = C71729k.f191207a;
        return obj;
    }

    /* renamed from: t */
    public final C69577g mo62836t() {
        return this;
    }

    public final String toString() {
        C71414ao aoVar = this.f191202a;
        String c = C71601bb.m104528c(this.f191203b);
        return "DispatchedContinuation[" + aoVar + ", " + c + "]";
    }

    /* renamed from: w */
    public final void mo62837w(Object obj, Throwable th) {
        C69664n.m101061g(th, "cause");
        if (obj instanceof C71397ad) {
            ((C71397ad) obj).f190607b.mo5761a(th);
        }
    }
}
