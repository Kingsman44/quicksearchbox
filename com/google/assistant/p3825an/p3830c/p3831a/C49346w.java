package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.w */
/* compiled from: PG */
public final class C49346w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49346w f127545b;

    /* renamed from: c */
    private static volatile C63010eb f127546c;

    /* renamed from: a */
    public C62971cq f127547a = emptyProtobufList();

    static {
        C49346w wVar = new C49346w();
        f127545b = wVar;
        C62942bv.registerDefaultInstance(C49346w.class, wVar);
    }

    private C49346w() {
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
                return newMessageInfo(f127545b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49344u.class});
            case 3:
                return new C49346w();
            case 4:
                return new C49345v();
            case 5:
                return f127545b;
            case 6:
                C63010eb ebVar = f127546c;
                if (ebVar == null) {
                    synchronized (C49346w.class) {
                        ebVar = f127546c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127545b);
                            f127546c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
