package com.google.android.apps.gsa.nga.engine.p6026f.p6028b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.b.j */
/* compiled from: PG */
public final class C76015j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76015j f210850c;

    /* renamed from: d */
    private static volatile C63010eb f210851d;

    /* renamed from: a */
    public C76017l f210852a;

    /* renamed from: b */
    public C62971cq f210853b = emptyProtobufList();

    static {
        C76015j jVar = new C76015j();
        f210850c = jVar;
        C62942bv.registerDefaultInstance(C76015j.class, jVar);
    }

    private C76015j() {
    }

    /* renamed from: a */
    public final void mo72007a() {
        C62971cq cqVar = this.f210853b;
        if (!cqVar.mo58948c()) {
            this.f210853b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f210850c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"b", C76013h.class, "a"});
            case 3:
                return new C76015j();
            case 4:
                return new C76014i();
            case 5:
                return f210850c;
            case 6:
                C63010eb ebVar = f210851d;
                if (ebVar == null) {
                    synchronized (C76015j.class) {
                        ebVar = f210851d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f210850c);
                            f210851d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
