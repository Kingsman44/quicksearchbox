package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vr */
/* compiled from: PG */
public final class C52544vr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52544vr f137915c;

    /* renamed from: d */
    private static volatile C63010eb f137916d;

    /* renamed from: a */
    public double f137917a;

    /* renamed from: b */
    public double f137918b;

    static {
        C52544vr vrVar = new C52544vr();
        f137915c = vrVar;
        C62942bv.registerDefaultInstance(C52544vr.class, vrVar);
    }

    private C52544vr() {
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
                return newMessageInfo(f137915c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0000\u0003\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52544vr();
            case 4:
                return new C52543vq();
            case 5:
                return f137915c;
            case 6:
                C63010eb ebVar = f137916d;
                if (ebVar == null) {
                    synchronized (C52544vr.class) {
                        ebVar = f137916d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137915c);
                            f137916d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
