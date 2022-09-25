package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.i.a.oc */
/* compiled from: PG */
public final class C51611oc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51611oc f134505d;

    /* renamed from: e */
    private static volatile C63010eb f134506e;

    /* renamed from: a */
    public int f134507a;

    /* renamed from: b */
    public C51615og f134508b;

    /* renamed from: c */
    public C63088z f134509c = C63088z.f170246b;

    static {
        C51611oc ocVar = new C51611oc();
        f134505d = ocVar;
        C62942bv.registerDefaultInstance(C51611oc.class, ocVar);
    }

    private C51611oc() {
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
                return newMessageInfo(f134505d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51611oc();
            case 4:
                return new C51610ob();
            case 5:
                return f134505d;
            case 6:
                C63010eb ebVar = f134506e;
                if (ebVar == null) {
                    synchronized (C51611oc.class) {
                        ebVar = f134506e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134505d);
                            f134506e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
