package com.google.p4184bj.p4204d.p4205a.p4210e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.d.a.e.d */
/* compiled from: PG */
public final class C56020d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56020d f149187a;

    /* renamed from: b */
    private static volatile C63010eb f149188b;

    static {
        C56020d dVar = new C56020d();
        f149187a = dVar;
        C62942bv.registerDefaultInstance(C56020d.class, dVar);
    }

    private C56020d() {
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
                return newMessageInfo(f149187a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56020d();
            case 4:
                return new C56019c();
            case 5:
                return f149187a;
            case 6:
                C63010eb ebVar = f149188b;
                if (ebVar == null) {
                    synchronized (C56020d.class) {
                        ebVar = f149188b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149187a);
                            f149188b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
