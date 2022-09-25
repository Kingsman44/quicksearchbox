package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vs */
/* compiled from: PG */
public final class C52545vs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52545vs f137919b;

    /* renamed from: c */
    private static volatile C63010eb f137920c;

    /* renamed from: a */
    public C52544vr f137921a;

    static {
        C52545vs vsVar = new C52545vs();
        f137919b = vsVar;
        C62942bv.registerDefaultInstance(C52545vs.class, vsVar);
    }

    private C52545vs() {
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
                return newMessageInfo(f137919b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C52545vs();
            case 4:
                return new C52542vp();
            case 5:
                return f137919b;
            case 6:
                C63010eb ebVar = f137920c;
                if (ebVar == null) {
                    synchronized (C52545vs.class) {
                        ebVar = f137920c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137919b);
                            f137920c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
