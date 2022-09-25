package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.em */
/* compiled from: PG */
public final class C51933em extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51933em f136210b;

    /* renamed from: d */
    private static volatile C63010eb f136211d;

    /* renamed from: a */
    public int f136212a;

    /* renamed from: c */
    private int f136213c;

    static {
        C51933em emVar = new C51933em();
        f136210b = emVar;
        C62942bv.registerDefaultInstance(C51933em.class, emVar);
    }

    private C51933em() {
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
                return newMessageInfo(f136210b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C51930ej.f136209a});
            case 3:
                return new C51933em();
            case 4:
                return new C51932el();
            case 5:
                return f136210b;
            case 6:
                C63010eb ebVar = f136211d;
                if (ebVar == null) {
                    synchronized (C51933em.class) {
                        ebVar = f136211d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136210b);
                            f136211d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
