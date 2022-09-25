package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.dw */
/* compiled from: PG */
public final class C57452dw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57452dw f153466c;

    /* renamed from: d */
    private static volatile C63010eb f153467d;

    /* renamed from: a */
    public int f153468a;

    /* renamed from: b */
    public C57450du f153469b;

    static {
        C57452dw dwVar = new C57452dw();
        f153466c = dwVar;
        C62942bv.registerDefaultInstance(C57452dw.class, dwVar);
    }

    private C57452dw() {
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
                return newMessageInfo(f153466c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C57452dw();
            case 4:
                return new C57451dv();
            case 5:
                return f153466c;
            case 6:
                C63010eb ebVar = f153467d;
                if (ebVar == null) {
                    synchronized (C57452dw.class) {
                        ebVar = f153467d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153466c);
                            f153467d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
