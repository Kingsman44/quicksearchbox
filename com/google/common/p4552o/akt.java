package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.akt */
/* compiled from: PG */
public final class akt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final akt f158984b;

    /* renamed from: c */
    private static volatile C63010eb f158985c;

    /* renamed from: a */
    public C62961ch f158986a = emptyIntList();

    static {
        akt akt = new akt();
        f158984b = akt;
        C62942bv.registerDefaultInstance(akt.class, akt);
    }

    private akt() {
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
                return newMessageInfo(f158984b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", akr.f158983a});
            case 3:
                return new akt();
            case 4:
                return new aks();
            case 5:
                return f158984b;
            case 6:
                C63010eb ebVar = f158985c;
                if (ebVar == null) {
                    synchronized (akt.class) {
                        ebVar = f158985c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158984b);
                            f158985c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
