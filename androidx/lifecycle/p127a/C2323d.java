package androidx.lifecycle.p127a;

import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2363bk;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.a.d */
/* compiled from: PG */
public final class C2323d implements C2363bk {

    /* renamed from: a */
    private final C2325f[] f6517a;

    public C2323d(C2325f... fVarArr) {
        C69664n.m101061g(fVarArr, "initializers");
        this.f6517a = fVarArr;
    }

    /* renamed from: a */
    public final /* synthetic */ C2358bf mo634a(Class cls) {
        C69664n.m101061g(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public final C2358bf mo635b(Class cls, C2322c cVar) {
        C69664n.m101061g(cls, "modelClass");
        C2358bf bfVar = null;
        for (C2325f fVar : this.f6517a) {
            if (C69664n.m101066l(fVar.f6518a, cls)) {
                Object a = fVar.f6519b.mo5761a(cVar);
                bfVar = a instanceof C2358bf ? (C2358bf) a : null;
            }
        }
        if (bfVar != null) {
            return bfVar;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(String.valueOf(cls.getName())));
    }
}
