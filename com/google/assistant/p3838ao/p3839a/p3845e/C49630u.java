package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.u */
/* compiled from: PG */
public final class C49630u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49630u f128085b;

    /* renamed from: d */
    private static volatile C63010eb f128086d;

    /* renamed from: a */
    public int f128087a;

    /* renamed from: c */
    private int f128088c;

    static {
        C49630u uVar = new C49630u();
        f128085b = uVar;
        C62942bv.registerDefaultInstance(C49630u.class, uVar);
    }

    private C49630u() {
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
                return newMessageInfo(f128085b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C49632w.m85591b()});
            case 3:
                return new C49630u();
            case 4:
                return new C49629t();
            case 5:
                return f128085b;
            case 6:
                C63010eb ebVar = f128086d;
                if (ebVar == null) {
                    synchronized (C49630u.class) {
                        ebVar = f128086d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128085b);
                            f128086d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
