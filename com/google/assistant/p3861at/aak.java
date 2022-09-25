package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aak */
/* compiled from: PG */
public final class aak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aak f128703c;

    /* renamed from: d */
    private static volatile C63010eb f128704d;

    /* renamed from: a */
    public int f128705a = 0;

    /* renamed from: b */
    public Object f128706b;

    static {
        aak aak = new aak();
        f128703c = aak;
        C62942bv.registerDefaultInstance(aak.class, aak);
    }

    private aak() {
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
                return newMessageInfo(f128703c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", aag.class, aad.class});
            case 3:
                return new aak();
            case 4:
                return new aaj();
            case 5:
                return f128703c;
            case 6:
                C63010eb ebVar = f128704d;
                if (ebVar == null) {
                    synchronized (aak.class) {
                        ebVar = f128704d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128703c);
                            f128704d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
