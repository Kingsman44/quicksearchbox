package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aja */
/* compiled from: PG */
public final class aja extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aja f135206c;

    /* renamed from: d */
    private static volatile C63010eb f135207d;

    /* renamed from: a */
    public int f135208a;

    /* renamed from: b */
    public boolean f135209b;

    static {
        aja aja = new aja();
        f135206c = aja;
        C62942bv.registerDefaultInstance(aja.class, aja);
    }

    private aja() {
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
                return newMessageInfo(f135206c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aja();
            case 4:
                return new aiz();
            case 5:
                return f135206c;
            case 6:
                C63010eb ebVar = f135207d;
                if (ebVar == null) {
                    synchronized (aja.class) {
                        ebVar = f135207d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135206c);
                            f135207d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
