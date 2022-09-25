package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.cb */
/* compiled from: PG */
public final class C103876cb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C103876cb f289161b;

    /* renamed from: c */
    private static volatile C63010eb f289162c;

    /* renamed from: a */
    public C62995dn f289163a = C62995dn.f170057a;

    static {
        C103876cb cbVar = new C103876cb();
        f289161b = cbVar;
        C62942bv.registerDefaultInstance(C103876cb.class, cbVar);
    }

    private C103876cb() {
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
                return newMessageInfo(f289161b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C103875ca.f289160a});
            case 3:
                return new C103876cb();
            case 4:
                return new C103873bz();
            case 5:
                return f289161b;
            case 6:
                C63010eb ebVar = f289162c;
                if (ebVar == null) {
                    synchronized (C103876cb.class) {
                        ebVar = f289162c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f289161b);
                            f289162c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
