package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.ah */
/* compiled from: PG */
public final class C48800ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48800ah f126269b;

    /* renamed from: d */
    private static volatile C63010eb f126270d;

    /* renamed from: a */
    public C48851br f126271a;

    /* renamed from: c */
    private int f126272c;

    static {
        C48800ah ahVar = new C48800ah();
        f126269b = ahVar;
        C62942bv.registerDefaultInstance(C48800ah.class, ahVar);
    }

    private C48800ah() {
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
                return newMessageInfo(f126269b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C48800ah();
            case 4:
                return new C48799ag();
            case 5:
                return f126269b;
            case 6:
                C63010eb ebVar = f126270d;
                if (ebVar == null) {
                    synchronized (C48800ah.class) {
                        ebVar = f126270d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126269b);
                            f126270d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
