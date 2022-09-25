package kotlinx.coroutines.p5574b.p5575a;

import java.util.Arrays;
import kotlinx.coroutines.p5574b.C71571du;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.b */
/* compiled from: PG */
public abstract class C71445b {

    /* renamed from: a */
    private int f190664a;

    /* renamed from: b */
    private C71442an f190665b;

    /* renamed from: d */
    public C71447d[] f190666d;

    /* renamed from: e */
    public int f190667e;

    /* renamed from: b */
    public final C71571du mo62786b() {
        C71442an anVar;
        synchronized (this) {
            anVar = this.f190665b;
            if (anVar == null) {
                anVar = new C71442an(this.f190667e);
                this.f190665b = anVar;
            }
        }
        return anVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C71447d mo62787i();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C71447d[] mo62788l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C71447d mo62789m() {
        C71447d dVar;
        C71442an anVar;
        synchronized (this) {
            C71447d[] dVarArr = this.f190666d;
            if (dVarArr == null) {
                dVarArr = mo62788l();
                this.f190666d = dVarArr;
            } else {
                int i = this.f190667e;
                int length = dVarArr.length;
                if (i >= length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, length + length);
                    C69664n.m101060f(copyOf, "copyOf(this, newSize)");
                    dVarArr = (C71447d[]) copyOf;
                    this.f190666d = dVarArr;
                }
            }
            int i2 = this.f190664a;
            do {
                dVar = dVarArr[i2];
                if (dVar == null) {
                    dVar = mo62787i();
                    dVarArr[i2] = dVar;
                }
                i2++;
                if (i2 >= dVarArr.length) {
                    i2 = 0;
                }
                C69664n.m101059e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!dVar.mo62791a(this));
            this.f190664a = i2;
            this.f190667e++;
            anVar = this.f190665b;
        }
        if (anVar != null) {
            anVar.mo62785o(1);
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo62790n(C71447d dVar) {
        C71442an anVar;
        int i;
        C69577g[] b;
        C69664n.m101061g(dVar, "slot");
        synchronized (this) {
            int i2 = this.f190667e - 1;
            this.f190667e = i2;
            anVar = this.f190665b;
            if (i2 == 0) {
                this.f190664a = 0;
            }
            b = dVar.mo62792b(this);
        }
        for (C69577g gVar : b) {
            if (gVar != null) {
                gVar.mo61338mb(C69788q.f186170a);
            }
        }
        if (anVar != null) {
            anVar.mo62785o(-1);
        }
    }
}
