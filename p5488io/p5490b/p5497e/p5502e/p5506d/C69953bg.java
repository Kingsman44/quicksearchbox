package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5513j.C70089j;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.bg */
/* compiled from: PG */
final class C69953bg extends AtomicReference implements C70123o, C69803b {

    /* renamed from: a */
    static final C69949bc[] f186448a = new C69949bc[0];

    /* renamed from: b */
    static final C69949bc[] f186449b = new C69949bc[0];
    private static final long serialVersionUID = -533785617179540163L;

    /* renamed from: c */
    final C69951be f186450c;

    /* renamed from: d */
    boolean f186451d;

    /* renamed from: e */
    final AtomicReference f186452e = new AtomicReference(f186448a);

    /* renamed from: f */
    final AtomicBoolean f186453f = new AtomicBoolean();

    public C69953bg(C69951be beVar) {
        this.f186450c = beVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186451d) {
            this.f186451d = true;
            C69948bb bbVar = (C69948bb) this.f186450c;
            bbVar.mo61532a(new C69950bd(C70089j.f186819a));
            bbVar.mo61534c();
            mo61538h();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (!this.f186451d) {
            this.f186451d = true;
            C69948bb bbVar = (C69948bb) this.f186450c;
            bbVar.mo61532a(new C69950bd(C70089j.m101988a(th)));
            bbVar.mo61534c();
            mo61538h();
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101307c(this, bVar)) {
            mo61537g();
        }
    }

    public final void dispose() {
        this.f186452e.set(f186449b);
        C69828d.m101309f(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo61536f(C69949bc bcVar) {
        C69949bc[] bcVarArr;
        C69949bc[] bcVarArr2;
        do {
            bcVarArr = (C69949bc[]) this.f186452e.get();
            int length = bcVarArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (bcVarArr[i].equals(bcVar)) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        bcVarArr2 = f186448a;
                    } else {
                        C69949bc[] bcVarArr3 = new C69949bc[(length - 1)];
                        System.arraycopy(bcVarArr, 0, bcVarArr3, 0, i);
                        System.arraycopy(bcVarArr, i + 1, bcVarArr3, i, (length - i) - 1);
                        bcVarArr2 = bcVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C69952bf.m101648a(this.f186452e, bcVarArr, bcVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo61537g() {
        for (C69949bc b : (C69949bc[]) this.f186452e.get()) {
            this.f186450c.mo61533b(b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo61538h() {
        for (C69949bc b : (C69949bc[]) this.f186452e.getAndSet(f186449b)) {
            this.f186450c.mo61533b(b);
        }
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186451d) {
            C69951be beVar = this.f186450c;
            C70089j jVar = C70089j.f186819a;
            C69948bb bbVar = (C69948bb) beVar;
            bbVar.mo61532a(new C69950bd(obj));
            bbVar.mo61535d();
            mo61537g();
        }
    }
}
