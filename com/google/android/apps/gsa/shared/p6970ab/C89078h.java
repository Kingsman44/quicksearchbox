package com.google.android.apps.gsa.shared.p6970ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ab.h */
/* compiled from: PG */
public final class C89078h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C89078h f241405b;

    /* renamed from: c */
    private static volatile C63010eb f241406c;

    /* renamed from: a */
    public C62971cq f241407a = emptyProtobufList();

    static {
        C89078h hVar = new C89078h();
        f241405b = hVar;
        C62942bv.registerDefaultInstance(C89078h.class, hVar);
    }

    private C89078h() {
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
                return newMessageInfo(f241405b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C89076f.class});
            case 3:
                return new C89078h();
            case 4:
                return new C89077g();
            case 5:
                return f241405b;
            case 6:
                C63010eb ebVar = f241406c;
                if (ebVar == null) {
                    synchronized (C89078h.class) {
                        ebVar = f241406c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241405b);
                            f241406c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
