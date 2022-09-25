package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.eg */
/* compiled from: PG */
public final class C142409eg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142409eg f386419c;

    /* renamed from: d */
    private static volatile C63010eb f386420d;

    /* renamed from: a */
    public int f386421a;

    /* renamed from: b */
    public boolean f386422b;

    static {
        C142409eg egVar = new C142409eg();
        f386419c = egVar;
        C62942bv.registerDefaultInstance(C142409eg.class, egVar);
    }

    private C142409eg() {
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
                return newMessageInfo(f386419c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142409eg();
            case 4:
                return new C142408ef();
            case 5:
                return f386419c;
            case 6:
                C63010eb ebVar = f386420d;
                if (ebVar == null) {
                    synchronized (C142409eg.class) {
                        ebVar = f386420d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386419c);
                            f386420d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
