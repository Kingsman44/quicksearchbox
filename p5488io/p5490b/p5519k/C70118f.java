package p5488io.p5490b.p5519k;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.k.f */
/* compiled from: PG */
public final class C70118f extends C70119g {

    /* renamed from: a */
    static final C70117e[] f186884a = new C70117e[0];

    /* renamed from: b */
    static final C70117e[] f186885b = new C70117e[0];

    /* renamed from: c */
    final AtomicReference f186886c = new AtomicReference(f186885b);

    /* renamed from: d */
    Throwable f186887d;

    /* renamed from: a */
    public final void mo25986a() {
        Object obj = this.f186886c.get();
        Object obj2 = f186884a;
        if (obj != obj2) {
            for (C70117e eVar : (C70117e[]) this.f186886c.getAndSet(obj2)) {
                if (!eVar.get()) {
                    eVar.f186882a.mo25986a();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        C69841j.m101337b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f186886c.get();
        Object obj2 = f186884a;
        if (obj == obj2) {
            C70101a.m102023e(th);
            return;
        }
        this.f186887d = th;
        for (C70117e eVar : (C70117e[]) this.f186886c.getAndSet(obj2)) {
            if (eVar.get()) {
                C70101a.m102023e(th);
            } else {
                eVar.f186882a.mo25987b(th);
            }
        }
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (this.f186886c.get() == f186884a) {
            bVar.dispose();
        }
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        C69841j.m101337b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C70117e eVar : (C70117e[]) this.f186886c.get()) {
            if (!eVar.get()) {
                eVar.f186882a.mo25988lL(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        C70117e[] eVarArr;
        C70117e[] eVarArr2;
        C70117e eVar = new C70117e(oVar, this);
        oVar.mo26850d(eVar);
        do {
            eVarArr = (C70117e[]) this.f186886c.get();
            if (eVarArr == f186884a) {
                Throwable th = this.f186887d;
                if (th != null) {
                    oVar.mo25987b(th);
                    return;
                } else {
                    oVar.mo25986a();
                    return;
                }
            } else {
                int length = eVarArr.length;
                eVarArr2 = new C70117e[(length + 1)];
                System.arraycopy(eVarArr, 0, eVarArr2, 0, length);
                eVarArr2[length] = eVar;
            }
        } while (!C70116d.m102038a(this.f186886c, eVarArr, eVarArr2));
        if (eVar.get()) {
            mo61649u(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo61649u(C70117e eVar) {
        C70117e[] eVarArr;
        C70117e[] eVarArr2;
        do {
            eVarArr = (C70117e[]) this.f186886c.get();
            if (eVarArr != f186884a && eVarArr != f186885b) {
                int length = eVarArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (eVarArr[i] == eVar) {
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
                        eVarArr2 = f186885b;
                    } else {
                        C70117e[] eVarArr3 = new C70117e[(length - 1)];
                        System.arraycopy(eVarArr, 0, eVarArr3, 0, i);
                        System.arraycopy(eVarArr, i + 1, eVarArr3, i, (length - i) - 1);
                        eVarArr2 = eVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C70116d.m102038a(this.f186886c, eVarArr, eVarArr2));
    }
}
