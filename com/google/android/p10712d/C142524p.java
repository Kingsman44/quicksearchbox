package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.p */
/* compiled from: PG */
public final class C142524p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142524p f386746c;

    /* renamed from: d */
    private static volatile C63010eb f386747d;

    /* renamed from: a */
    public int f386748a;

    /* renamed from: b */
    public C63088z f386749b = C63088z.f170246b;

    static {
        C142524p pVar = new C142524p();
        f386746c = pVar;
        C62942bv.registerDefaultInstance(C142524p.class, pVar);
    }

    private C142524p() {
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
                return newMessageInfo(f386746c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142524p();
            case 4:
                return new C142523o();
            case 5:
                return f386746c;
            case 6:
                C63010eb ebVar = f386747d;
                if (ebVar == null) {
                    synchronized (C142524p.class) {
                        ebVar = f386747d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386746c);
                            f386747d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
