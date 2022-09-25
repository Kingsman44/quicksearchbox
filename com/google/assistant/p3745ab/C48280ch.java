package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ch */
/* compiled from: PG */
public final class C48280ch extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48280ch f124871c;

    /* renamed from: d */
    private static volatile C63010eb f124872d;

    /* renamed from: a */
    public int f124873a;

    /* renamed from: b */
    public int f124874b;

    static {
        C48280ch chVar = new C48280ch();
        f124871c = chVar;
        C62942bv.registerDefaultInstance(C48280ch.class, chVar);
    }

    private C48280ch() {
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
                return newMessageInfo(f124871c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C48279cg.f124870a});
            case 3:
                return new C48280ch();
            case 4:
                return new C48278cf();
            case 5:
                return f124871c;
            case 6:
                C63010eb ebVar = f124872d;
                if (ebVar == null) {
                    synchronized (C48280ch.class) {
                        ebVar = f124872d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124871c);
                            f124872d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
