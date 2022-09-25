package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ud */
/* compiled from: PG */
public final class C52503ud extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52503ud f137830c;

    /* renamed from: d */
    private static volatile C63010eb f137831d;

    /* renamed from: a */
    public int f137832a;

    /* renamed from: b */
    public boolean f137833b;

    static {
        C52503ud udVar = new C52503ud();
        f137830c = udVar;
        C62942bv.registerDefaultInstance(C52503ud.class, udVar);
    }

    private C52503ud() {
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
                return newMessageInfo(f137830c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52503ud();
            case 4:
                return new C52502uc();
            case 5:
                return f137830c;
            case 6:
                C63010eb ebVar = f137831d;
                if (ebVar == null) {
                    synchronized (C52503ud.class) {
                        ebVar = f137831d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137830c);
                            f137831d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
