package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.ck */
/* compiled from: PG */
public final class C37462ck extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37462ck f99442c;

    /* renamed from: d */
    private static volatile C63010eb f99443d;

    /* renamed from: a */
    public int f99444a;

    /* renamed from: b */
    public C37467cp f99445b;

    static {
        C37462ck ckVar = new C37462ck();
        f99442c = ckVar;
        C62942bv.registerDefaultInstance(C37462ck.class, ckVar);
    }

    private C37462ck() {
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
                return newMessageInfo(f99442c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37462ck();
            case 4:
                return new C37461cj();
            case 5:
                return f99442c;
            case 6:
                C63010eb ebVar = f99443d;
                if (ebVar == null) {
                    synchronized (C37462ck.class) {
                        ebVar = f99443d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99442c);
                            f99443d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
