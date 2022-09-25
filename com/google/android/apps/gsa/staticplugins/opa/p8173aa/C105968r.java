package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.r */
/* compiled from: PG */
public final class C105968r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105968r f295859c;

    /* renamed from: d */
    private static volatile C63010eb f295860d;

    /* renamed from: a */
    public int f295861a;

    /* renamed from: b */
    public boolean f295862b;

    static {
        C105968r rVar = new C105968r();
        f295859c = rVar;
        C62942bv.registerDefaultInstance(C105968r.class, rVar);
    }

    private C105968r() {
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
                return newMessageInfo(f295859c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105968r();
            case 4:
                return new C105967q();
            case 5:
                return f295859c;
            case 6:
                C63010eb ebVar = f295860d;
                if (ebVar == null) {
                    synchronized (C105968r.class) {
                        ebVar = f295860d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295859c);
                            f295860d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
