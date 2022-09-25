package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.am */
/* compiled from: PG */
public final class C53978am extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53978am f141633b;

    /* renamed from: c */
    private static volatile C63010eb f141634c;

    /* renamed from: a */
    public int f141635a;

    static {
        C53978am amVar = new C53978am();
        f141633b = amVar;
        C62942bv.registerDefaultInstance(C53978am.class, amVar);
    }

    private C53978am() {
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
                return newMessageInfo(f141633b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C53978am();
            case 4:
                return new C53977al();
            case 5:
                return f141633b;
            case 6:
                C63010eb ebVar = f141634c;
                if (ebVar == null) {
                    synchronized (C53978am.class) {
                        ebVar = f141634c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141633b);
                            f141634c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
