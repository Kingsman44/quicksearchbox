package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.bb */
/* compiled from: PG */
public final class C83640bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83640bb f228003c;

    /* renamed from: d */
    private static volatile C63010eb f228004d;

    /* renamed from: a */
    public int f228005a;

    /* renamed from: b */
    public int f228006b;

    static {
        C83640bb bbVar = new C83640bb();
        f228003c = bbVar;
        C62942bv.registerDefaultInstance(C83640bb.class, bbVar);
    }

    private C83640bb() {
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
                return newMessageInfo(f228003c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C83640bb();
            case 4:
                return new C83639ba();
            case 5:
                return f228003c;
            case 6:
                C63010eb ebVar = f228004d;
                if (ebVar == null) {
                    synchronized (C83640bb.class) {
                        ebVar = f228004d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228003c);
                            f228004d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
