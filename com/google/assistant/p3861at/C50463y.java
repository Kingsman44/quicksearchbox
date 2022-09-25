package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.y */
/* compiled from: PG */
public final class C50463y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50463y f131328c;

    /* renamed from: d */
    private static volatile C63010eb f131329d;

    /* renamed from: a */
    public int f131330a = 0;

    /* renamed from: b */
    public Object f131331b;

    static {
        C50463y yVar = new C50463y();
        f131328c = yVar;
        C62942bv.registerDefaultInstance(C50463y.class, yVar);
    }

    private C50463y() {
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
                return newMessageInfo(f131328c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C49830ao.class, C49830ao.class, C49828am.class});
            case 3:
                return new C50463y();
            case 4:
                return new C50436x();
            case 5:
                return f131328c;
            case 6:
                C63010eb ebVar = f131329d;
                if (ebVar == null) {
                    synchronized (C50463y.class) {
                        ebVar = f131329d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131328c);
                            f131329d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
