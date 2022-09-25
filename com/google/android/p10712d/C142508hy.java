package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hy */
/* compiled from: PG */
public final class C142508hy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142508hy f386712a;

    /* renamed from: b */
    private static volatile C63010eb f386713b;

    static {
        C142508hy hyVar = new C142508hy();
        f386712a = hyVar;
        C62942bv.registerDefaultInstance(C142508hy.class, hyVar);
    }

    private C142508hy() {
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
                return newMessageInfo(f386712a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C142508hy();
            case 4:
                return new C142507hx();
            case 5:
                return f386712a;
            case 6:
                C63010eb ebVar = f386713b;
                if (ebVar == null) {
                    synchronized (C142508hy.class) {
                        ebVar = f386713b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386712a);
                            f386713b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
