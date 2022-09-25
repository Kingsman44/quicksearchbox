package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.dm */
/* compiled from: PG */
public final class C66646dm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66646dm f181313a;

    /* renamed from: c */
    private static volatile C63010eb f181314c;

    /* renamed from: b */
    private C62995dn f181315b = C62995dn.f170057a;

    static {
        C66646dm dmVar = new C66646dm();
        f181313a = dmVar;
        C62942bv.registerDefaultInstance(C66646dm.class, dmVar);
    }

    private C66646dm() {
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
                return newMessageInfo(f181313a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C66645dl.f181312a});
            case 3:
                return new C66646dm();
            case 4:
                return new C66642di();
            case 5:
                return f181313a;
            case 6:
                C63010eb ebVar = f181314c;
                if (ebVar == null) {
                    synchronized (C66646dm.class) {
                        ebVar = f181314c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181313a);
                            f181314c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
