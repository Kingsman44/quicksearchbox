package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.x */
/* compiled from: PG */
public final class C142532x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142532x f386761c;

    /* renamed from: d */
    private static volatile C63010eb f386762d;

    /* renamed from: a */
    public int f386763a;

    /* renamed from: b */
    public C142531w f386764b;

    static {
        C142532x xVar = new C142532x();
        f386761c = xVar;
        C62942bv.registerDefaultInstance(C142532x.class, xVar);
    }

    private C142532x() {
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
                return newMessageInfo(f386761c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142532x();
            case 4:
                return new C142529u();
            case 5:
                return f386761c;
            case 6:
                C63010eb ebVar = f386762d;
                if (ebVar == null) {
                    synchronized (C142532x.class) {
                        ebVar = f386762d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386761c);
                            f386762d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
