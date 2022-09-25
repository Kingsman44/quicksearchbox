package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.ct */
/* compiled from: PG */
public final class C50796ct extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50796ct f132223c;

    /* renamed from: d */
    private static volatile C63010eb f132224d;

    /* renamed from: a */
    public int f132225a;

    /* renamed from: b */
    public long f132226b;

    static {
        C50796ct ctVar = new C50796ct();
        f132223c = ctVar;
        C62942bv.registerDefaultInstance(C50796ct.class, ctVar);
    }

    private C50796ct() {
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
                return newMessageInfo(f132223c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50796ct();
            case 4:
                return new C50795cs();
            case 5:
                return f132223c;
            case 6:
                C63010eb ebVar = f132224d;
                if (ebVar == null) {
                    synchronized (C50796ct.class) {
                        ebVar = f132224d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132223c);
                            f132224d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
