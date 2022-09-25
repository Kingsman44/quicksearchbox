package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71692a;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.bt */
/* compiled from: PG */
public abstract class C71619bt extends C71414ao {

    /* renamed from: c */
    private long f191054c;

    /* renamed from: d */
    public C71692a f191055d;

    /* renamed from: e */
    private boolean f191056e;

    /* renamed from: c */
    private static final long m104572c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: j */
    public void mo62823j() {
        throw null;
    }

    /* renamed from: k */
    public long mo62843k() {
        throw null;
    }

    /* renamed from: l */
    public final void mo62844l(boolean z) {
        long c = this.f191054c - m104572c(z);
        this.f191054c = c;
        if (c <= 0) {
            boolean z2 = C71600ba.f191036a;
            if (this.f191056e) {
                mo62823j();
            }
        }
    }

    /* renamed from: m */
    public final void mo62845m(C71611bl blVar) {
        C69664n.m101061g(blVar, "task");
        C71692a aVar = this.f191055d;
        if (aVar == null) {
            aVar = new C71692a();
            this.f191055d = aVar;
        }
        C69664n.m101061g(blVar, "element");
        Object[] objArr = aVar.f191149a;
        int i = aVar.f191151c;
        objArr[i] = blVar;
        int length = objArr.length;
        int i2 = (i + 1) & (length - 1);
        aVar.f191151c = i2;
        int i3 = aVar.f191150b;
        if (i2 == i3) {
            Object[] objArr2 = new Object[(length + length)];
            C69531o.m100929g(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = aVar.f191149a;
            int length2 = objArr3.length;
            int i4 = aVar.f191150b;
            C69531o.m100929g(objArr3, objArr2, length2 - i4, 0, i4, 4);
            aVar.f191149a = objArr2;
            aVar.f191150b = 0;
            aVar.f191151c = length;
        }
    }

    /* renamed from: n */
    public final void mo62846n(boolean z) {
        this.f191054c += m104572c(z);
        if (!z) {
            this.f191056e = true;
        }
    }

    /* renamed from: o */
    public final boolean mo62847o() {
        return this.f191054c >= m104572c(true);
    }

    /* renamed from: p */
    public final boolean mo62848p() {
        C71692a aVar = this.f191055d;
        if (aVar != null) {
            return aVar.mo62929a();
        }
        return true;
    }

    /* renamed from: q */
    public final boolean mo62849q() {
        C71692a aVar = this.f191055d;
        if (aVar == null) {
            return false;
        }
        int i = aVar.f191150b;
        Object obj = null;
        if (i != aVar.f191151c) {
            Object[] objArr = aVar.f191149a;
            Object obj2 = objArr[i];
            objArr[i] = null;
            aVar.f191150b = (i + 1) & (objArr.length - 1);
            C69664n.m101059e(obj2, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            obj = obj2;
        }
        C71611bl blVar = (C71611bl) obj;
        if (blVar == null) {
            return false;
        }
        blVar.run();
        return true;
    }
}
