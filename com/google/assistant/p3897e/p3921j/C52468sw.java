package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.sw */
/* compiled from: PG */
public final class C52468sw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52468sw f137732c;

    /* renamed from: d */
    private static volatile C63010eb f137733d;

    /* renamed from: a */
    public int f137734a;

    /* renamed from: b */
    public int f137735b;

    static {
        C52468sw swVar = new C52468sw();
        f137732c = swVar;
        C62942bv.registerDefaultInstance(C52468sw.class, swVar);
    }

    private C52468sw() {
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
                return newMessageInfo(f137732c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52467sv.f137731a});
            case 3:
                return new C52468sw();
            case 4:
                return new C52466su();
            case 5:
                return f137732c;
            case 6:
                C63010eb ebVar = f137733d;
                if (ebVar == null) {
                    synchronized (C52468sw.class) {
                        ebVar = f137733d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137732c);
                            f137733d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
