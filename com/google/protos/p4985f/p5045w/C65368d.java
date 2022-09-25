package com.google.protos.p4985f.p5045w;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.w.d */
/* compiled from: PG */
public final class C65368d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65368d f177762a;

    /* renamed from: b */
    private static volatile C63010eb f177763b;

    static {
        C65368d dVar = new C65368d();
        f177762a = dVar;
        C62942bv.registerDefaultInstance(C65368d.class, dVar);
    }

    private C65368d() {
        emptyIntList();
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(f177762a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65368d();
            case 4:
                return new C65367c();
            case 5:
                return f177762a;
            case 6:
                C63010eb ebVar = f177763b;
                if (ebVar == null) {
                    synchronized (C65368d.class) {
                        ebVar = f177763b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177762a);
                            f177763b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
