package com.google.android.apps.gsa.nga.engine.p6026f.p6028b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.b.p */
/* compiled from: PG */
public final class C76021p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76021p f210860b;

    /* renamed from: c */
    private static volatile C63010eb f210861c;

    /* renamed from: a */
    public int f210862a;

    static {
        C76021p pVar = new C76021p();
        f210860b = pVar;
        C62942bv.registerDefaultInstance(C76021p.class, pVar);
    }

    private C76021p() {
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
                return newMessageInfo(f210860b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C76021p();
            case 4:
                return new C76020o();
            case 5:
                return f210860b;
            case 6:
                C63010eb ebVar = f210861c;
                if (ebVar == null) {
                    synchronized (C76021p.class) {
                        ebVar = f210861c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f210860b);
                            f210861c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
