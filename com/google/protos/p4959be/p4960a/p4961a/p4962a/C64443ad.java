package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ad */
/* compiled from: PG */
public final class C64443ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64443ad f174815b;

    /* renamed from: c */
    private static volatile C63010eb f174816c;

    /* renamed from: a */
    public C64445af f174817a;

    static {
        C64443ad adVar = new C64443ad();
        f174815b = adVar;
        C62942bv.registerDefaultInstance(C64443ad.class, adVar);
    }

    private C64443ad() {
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
                return newMessageInfo(f174815b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C64443ad();
            case 4:
                return new C64442ac();
            case 5:
                return f174815b;
            case 6:
                C63010eb ebVar = f174816c;
                if (ebVar == null) {
                    synchronized (C64443ad.class) {
                        ebVar = f174816c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174815b);
                            f174816c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
