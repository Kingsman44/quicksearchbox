package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.dp */
/* compiled from: PG */
public final class C59731dp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59731dp f160326c;

    /* renamed from: d */
    private static volatile C63010eb f160327d;

    /* renamed from: a */
    public int f160328a;

    /* renamed from: b */
    public C60675yr f160329b;

    static {
        C59731dp dpVar = new C59731dp();
        f160326c = dpVar;
        C62942bv.registerDefaultInstance(C59731dp.class, dpVar);
    }

    private C59731dp() {
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
                return newMessageInfo(f160326c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59731dp();
            case 4:
                return new C59730do();
            case 5:
                return f160326c;
            case 6:
                C63010eb ebVar = f160327d;
                if (ebVar == null) {
                    synchronized (C59731dp.class) {
                        ebVar = f160327d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160326c);
                            f160327d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
