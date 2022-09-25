package com.google.lens.p4701g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.aa */
/* compiled from: PG */
public final class C62251aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62251aa f168060c;

    /* renamed from: d */
    private static volatile C63010eb f168061d;

    /* renamed from: a */
    public int f168062a;

    /* renamed from: b */
    public C62362y f168063b;

    static {
        C62251aa aaVar = new C62251aa();
        f168060c = aaVar;
        C62942bv.registerDefaultInstance(C62251aa.class, aaVar);
    }

    private C62251aa() {
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
                return newMessageInfo(f168060c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62251aa();
            case 4:
                return new C62363z();
            case 5:
                return f168060c;
            case 6:
                C63010eb ebVar = f168061d;
                if (ebVar == null) {
                    synchronized (C62251aa.class) {
                        ebVar = f168061d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168060c);
                            f168061d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
