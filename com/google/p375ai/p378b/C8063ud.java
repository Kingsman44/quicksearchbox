package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ud */
/* compiled from: PG */
public final class C8063ud extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8063ud f28370c;

    /* renamed from: e */
    private static volatile C63010eb f28371e;

    /* renamed from: a */
    public int f28372a;

    /* renamed from: b */
    public int f28373b;

    /* renamed from: d */
    private int f28374d;

    static {
        C8063ud udVar = new C8063ud();
        f28370c = udVar;
        C62942bv.registerDefaultInstance(C8063ud.class, udVar);
    }

    private C8063ud() {
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
                return newMessageInfo(f28370c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C8063ud();
            case 4:
                return new C8062uc();
            case 5:
                return f28370c;
            case 6:
                C63010eb ebVar = f28371e;
                if (ebVar == null) {
                    synchronized (C8063ud.class) {
                        ebVar = f28371e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28370c);
                            f28371e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
