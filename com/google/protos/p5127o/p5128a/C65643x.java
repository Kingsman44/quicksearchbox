package com.google.protos.p5127o.p5128a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.a.x */
/* compiled from: PG */
public final class C65643x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65643x f178370a;

    /* renamed from: c */
    private static volatile C63010eb f178371c;

    /* renamed from: b */
    private byte f178372b = 2;

    static {
        C65643x xVar = new C65643x();
        f178370a = xVar;
        C62942bv.registerDefaultInstance(C65643x.class, xVar);
    }

    private C65643x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178372b);
            case 1:
                this.f178372b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f178370a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65643x();
            case 4:
                return new C65642w();
            case 5:
                return f178370a;
            case 6:
                C63010eb ebVar = f178371c;
                if (ebVar == null) {
                    synchronized (C65643x.class) {
                        ebVar = f178371c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178370a);
                            f178371c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
