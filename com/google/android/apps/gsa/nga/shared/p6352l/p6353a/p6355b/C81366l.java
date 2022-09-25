package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.b.l */
/* compiled from: PG */
public final class C81366l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81366l f222697c;

    /* renamed from: d */
    private static volatile C63010eb f222698d;

    /* renamed from: a */
    public int f222699a;

    /* renamed from: b */
    public C63042fg f222700b;

    static {
        C81366l lVar = new C81366l();
        f222697c = lVar;
        C62942bv.registerDefaultInstance(C81366l.class, lVar);
    }

    private C81366l() {
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
                return newMessageInfo(f222697c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C81366l();
            case 4:
                return new C81365k();
            case 5:
                return f222697c;
            case 6:
                C63010eb ebVar = f222698d;
                if (ebVar == null) {
                    synchronized (C81366l.class) {
                        ebVar = f222698d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222697c);
                            f222698d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
