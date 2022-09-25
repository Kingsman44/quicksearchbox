package com.google.android.apps.gsa.opa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.x */
/* compiled from: PG */
public final class C83815x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83815x f228429c;

    /* renamed from: d */
    private static volatile C63010eb f228430d;

    /* renamed from: a */
    public C83813v f228431a;

    /* renamed from: b */
    public C83813v f228432b;

    static {
        C83815x xVar = new C83815x();
        f228429c = xVar;
        C62942bv.registerDefaultInstance(C83815x.class, xVar);
    }

    private C83815x() {
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
                return newMessageInfo(f228429c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C83815x();
            case 4:
                return new C83814w();
            case 5:
                return f228429c;
            case 6:
                C63010eb ebVar = f228430d;
                if (ebVar == null) {
                    synchronized (C83815x.class) {
                        ebVar = f228430d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228429c);
                            f228430d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
