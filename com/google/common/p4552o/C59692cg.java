package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.cg */
/* compiled from: PG */
public final class C59692cg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59692cg f160153c;

    /* renamed from: d */
    private static volatile C63010eb f160154d;

    /* renamed from: a */
    public int f160155a;

    /* renamed from: b */
    public int f160156b;

    static {
        C59692cg cgVar = new C59692cg();
        f160153c = cgVar;
        C62942bv.registerDefaultInstance(C59692cg.class, cgVar);
    }

    private C59692cg() {
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
                return newMessageInfo(f160153c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C59691cf.f160152a});
            case 3:
                return new C59692cg();
            case 4:
                return new C59690ce();
            case 5:
                return f160153c;
            case 6:
                C63010eb ebVar = f160154d;
                if (ebVar == null) {
                    synchronized (C59692cg.class) {
                        ebVar = f160154d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160153c);
                            f160154d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
