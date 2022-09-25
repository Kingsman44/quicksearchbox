package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.bo */
/* compiled from: PG */
public final class C48081bo extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48081bo f124437c;

    /* renamed from: d */
    private static volatile C63010eb f124438d;

    /* renamed from: a */
    public int f124439a = 0;

    /* renamed from: b */
    public Object f124440b;

    static {
        C48081bo boVar = new C48081bo();
        f124437c = boVar;
        C62942bv.registerDefaultInstance(C48081bo.class, boVar);
    }

    private C48081bo() {
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
                return newMessageInfo(f124437c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C48087bu.class, C48085bs.class});
            case 3:
                return new C48081bo();
            case 4:
                return new C48080bn();
            case 5:
                return f124437c;
            case 6:
                C63010eb ebVar = f124438d;
                if (ebVar == null) {
                    synchronized (C48081bo.class) {
                        ebVar = f124438d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124437c);
                            f124438d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
