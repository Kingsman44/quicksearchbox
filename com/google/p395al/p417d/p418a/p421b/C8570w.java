package com.google.p395al.p417d.p418a.p421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.b.w */
/* compiled from: PG */
public final class C8570w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8570w f29681a;

    /* renamed from: b */
    private static volatile C63010eb f29682b;

    static {
        C8570w wVar = new C8570w();
        f29681a = wVar;
        C62942bv.registerDefaultInstance(C8570w.class, wVar);
    }

    private C8570w() {
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
                return newMessageInfo(f29681a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8570w();
            case 4:
                return new C8569v();
            case 5:
                return f29681a;
            case 6:
                C63010eb ebVar = f29682b;
                if (ebVar == null) {
                    synchronized (C8570w.class) {
                        ebVar = f29682b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29681a);
                            f29682b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
