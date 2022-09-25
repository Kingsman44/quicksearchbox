package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.rn */
/* compiled from: PG */
public final class C52432rn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52432rn f137634c;

    /* renamed from: d */
    private static volatile C63010eb f137635d;

    /* renamed from: a */
    public int f137636a;

    /* renamed from: b */
    public int f137637b;

    static {
        C52432rn rnVar = new C52432rn();
        f137634c = rnVar;
        C62942bv.registerDefaultInstance(C52432rn.class, rnVar);
    }

    private C52432rn() {
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
                return newMessageInfo(f137634c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C52431rm.m86629c()});
            case 3:
                return new C52432rn();
            case 4:
                return new C52429rk();
            case 5:
                return f137634c;
            case 6:
                C63010eb ebVar = f137635d;
                if (ebVar == null) {
                    synchronized (C52432rn.class) {
                        ebVar = f137635d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137634c);
                            f137635d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
