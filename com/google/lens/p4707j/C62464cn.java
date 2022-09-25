package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.cn */
/* compiled from: PG */
public final class C62464cn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62464cn f168661a;

    /* renamed from: b */
    private static volatile C63010eb f168662b;

    static {
        C62464cn cnVar = new C62464cn();
        f168661a = cnVar;
        C62942bv.registerDefaultInstance(C62464cn.class, cnVar);
    }

    private C62464cn() {
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
                return newMessageInfo(f168661a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62464cn();
            case 4:
                return new C62463cm();
            case 5:
                return f168661a;
            case 6:
                C63010eb ebVar = f168662b;
                if (ebVar == null) {
                    synchronized (C62464cn.class) {
                        ebVar = f168662b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168661a);
                            f168662b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
