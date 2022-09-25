package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vw */
/* compiled from: PG */
public final class C52549vw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52549vw f137922c;

    /* renamed from: d */
    private static volatile C63010eb f137923d;

    /* renamed from: a */
    public C52556wc f137924a;

    /* renamed from: b */
    public long f137925b;

    static {
        C52549vw vwVar = new C52549vw();
        f137922c = vwVar;
        C62942bv.registerDefaultInstance(C52549vw.class, vwVar);
    }

    private C52549vw() {
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
                return newMessageInfo(f137922c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new C52549vw();
            case 4:
                return new C52548vv();
            case 5:
                return f137922c;
            case 6:
                C63010eb ebVar = f137923d;
                if (ebVar == null) {
                    synchronized (C52549vw.class) {
                        ebVar = f137923d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137922c);
                            f137923d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
