package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.abw */
/* compiled from: PG */
public final class abw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final abw f134777c;

    /* renamed from: d */
    private static volatile C63010eb f134778d;

    /* renamed from: a */
    public int f134779a;

    /* renamed from: b */
    public aco f134780b;

    static {
        abw abw = new abw();
        f134777c = abw;
        C62942bv.registerDefaultInstance(abw.class, abw);
    }

    private abw() {
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
                return newMessageInfo(f134777c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new abw();
            case 4:
                return new abv();
            case 5:
                return f134777c;
            case 6:
                C63010eb ebVar = f134778d;
                if (ebVar == null) {
                    synchronized (abw.class) {
                        ebVar = f134778d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134777c);
                            f134778d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
