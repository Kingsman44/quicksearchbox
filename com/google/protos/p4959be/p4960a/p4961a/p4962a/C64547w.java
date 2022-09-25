package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.w */
/* compiled from: PG */
public final class C64547w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64547w f175048b;

    /* renamed from: c */
    private static volatile C63010eb f175049c;

    /* renamed from: a */
    public boolean f175050a;

    static {
        C64547w wVar = new C64547w();
        f175048b = wVar;
        C62942bv.registerDefaultInstance(C64547w.class, wVar);
    }

    private C64547w() {
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
                return newMessageInfo(f175048b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C64547w();
            case 4:
                return new C64546v();
            case 5:
                return f175048b;
            case 6:
                C63010eb ebVar = f175049c;
                if (ebVar == null) {
                    synchronized (C64547w.class) {
                        ebVar = f175049c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175048b);
                            f175049c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
