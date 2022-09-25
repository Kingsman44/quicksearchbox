package com.google.p4160bf.p4164b.p4165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.aa */
/* compiled from: PG */
public final class C55591aa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55591aa f146682a;

    /* renamed from: b */
    private static volatile C63010eb f146683b;

    static {
        C55591aa aaVar = new C55591aa();
        f146682a = aaVar;
        C62942bv.registerDefaultInstance(C55591aa.class, aaVar);
    }

    private C55591aa() {
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
                return newMessageInfo(f146682a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55591aa();
            case 4:
                return new C55686z();
            case 5:
                return f146682a;
            case 6:
                C63010eb ebVar = f146683b;
                if (ebVar == null) {
                    synchronized (C55591aa.class) {
                        ebVar = f146683b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146682a);
                            f146683b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
