package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.pv */
/* compiled from: PG */
public final class C52386pv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52386pv f137461c;

    /* renamed from: d */
    private static volatile C63010eb f137462d;

    /* renamed from: a */
    public int f137463a;

    /* renamed from: b */
    public boolean f137464b;

    static {
        C52386pv pvVar = new C52386pv();
        f137461c = pvVar;
        C62942bv.registerDefaultInstance(C52386pv.class, pvVar);
    }

    private C52386pv() {
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
                return newMessageInfo(f137461c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52386pv();
            case 4:
                return new C52385pu();
            case 5:
                return f137461c;
            case 6:
                C63010eb ebVar = f137462d;
                if (ebVar == null) {
                    synchronized (C52386pv.class) {
                        ebVar = f137462d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137461c);
                            f137462d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
