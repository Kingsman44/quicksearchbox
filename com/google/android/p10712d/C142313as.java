package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.as */
/* compiled from: PG */
public final class C142313as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142313as f386082c;

    /* renamed from: d */
    private static volatile C63010eb f386083d;

    /* renamed from: a */
    public int f386084a;

    /* renamed from: b */
    public int f386085b;

    static {
        C142313as asVar = new C142313as();
        f386082c = asVar;
        C62942bv.registerDefaultInstance(C142313as.class, asVar);
    }

    private C142313as() {
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
                return newMessageInfo(f386082c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C142314at.f386086a});
            case 3:
                return new C142313as();
            case 4:
                return new C142312ar();
            case 5:
                return f386082c;
            case 6:
                C63010eb ebVar = f386083d;
                if (ebVar == null) {
                    synchronized (C142313as.class) {
                        ebVar = f386083d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386082c);
                            f386083d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
