package com.google.p3562ao.p3563a.p3568d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.al */
/* compiled from: PG */
public final class C45541al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C45541al f119025a;

    /* renamed from: b */
    private static volatile C63010eb f119026b;

    static {
        C45541al alVar = new C45541al();
        f119025a = alVar;
        C62942bv.registerDefaultInstance(C45541al.class, alVar);
    }

    private C45541al() {
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
                return newMessageInfo(f119025a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C45541al();
            case 4:
                return new C45540ak();
            case 5:
                return f119025a;
            case 6:
                C63010eb ebVar = f119026b;
                if (ebVar == null) {
                    synchronized (C45541al.class) {
                        ebVar = f119026b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119025a);
                            f119026b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
