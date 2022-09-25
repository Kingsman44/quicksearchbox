package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.j */
/* compiled from: PG */
public final class C64605j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64605j f175155a;

    /* renamed from: b */
    private static volatile C63010eb f175156b;

    static {
        C64605j jVar = new C64605j();
        f175155a = jVar;
        C62942bv.registerDefaultInstance(C64605j.class, jVar);
    }

    private C64605j() {
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
                return newMessageInfo(f175155a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64605j();
            case 4:
                return new C64604i();
            case 5:
                return f175155a;
            case 6:
                C63010eb ebVar = f175156b;
                if (ebVar == null) {
                    synchronized (C64605j.class) {
                        ebVar = f175156b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175155a);
                            f175156b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
