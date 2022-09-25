package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.aa */
/* compiled from: PG */
public final class C83612aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83612aa f227947c;

    /* renamed from: d */
    private static volatile C63010eb f227948d;

    /* renamed from: a */
    public int f227949a;

    /* renamed from: b */
    public long f227950b;

    static {
        C83612aa aaVar = new C83612aa();
        f227947c = aaVar;
        C62942bv.registerDefaultInstance(C83612aa.class, aaVar);
    }

    private C83612aa() {
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
                return newMessageInfo(f227947c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83612aa();
            case 4:
                return new C83674z();
            case 5:
                return f227947c;
            case 6:
                C63010eb ebVar = f227948d;
                if (ebVar == null) {
                    synchronized (C83612aa.class) {
                        ebVar = f227948d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227947c);
                            f227948d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
