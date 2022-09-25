package com.google.p4017at.p4027c.p4028a.p4029a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.q */
/* compiled from: PG */
public final class C53857q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53857q f141344a;

    /* renamed from: b */
    private static volatile C63010eb f141345b;

    static {
        C53857q qVar = new C53857q();
        f141344a = qVar;
        C62942bv.registerDefaultInstance(C53857q.class, qVar);
    }

    private C53857q() {
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
                return newMessageInfo(f141344a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C53857q();
            case 4:
                return new C53856p();
            case 5:
                return f141344a;
            case 6:
                C63010eb ebVar = f141345b;
                if (ebVar == null) {
                    synchronized (C53857q.class) {
                        ebVar = f141345b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141344a);
                            f141345b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
