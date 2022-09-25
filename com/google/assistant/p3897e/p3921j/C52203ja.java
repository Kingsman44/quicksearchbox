package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ja */
/* compiled from: PG */
public final class C52203ja extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52203ja f137003d;

    /* renamed from: e */
    private static volatile C63010eb f137004e;

    /* renamed from: a */
    public int f137005a;

    /* renamed from: b */
    public C52159hk f137006b;

    /* renamed from: c */
    public int f137007c;

    static {
        C52203ja jaVar = new C52203ja();
        f137003d = jaVar;
        C62942bv.registerDefaultInstance(C52203ja.class, jaVar);
    }

    private C52203ja() {
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
                return newMessageInfo(f137003d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52200iy.f137002a});
            case 3:
                return new C52203ja();
            case 4:
                return new C52199ix();
            case 5:
                return f137003d;
            case 6:
                C63010eb ebVar = f137004e;
                if (ebVar == null) {
                    synchronized (C52203ja.class) {
                        ebVar = f137004e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137003d);
                            f137004e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
