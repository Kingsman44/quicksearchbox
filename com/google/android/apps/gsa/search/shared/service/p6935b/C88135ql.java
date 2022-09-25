package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ql */
/* compiled from: PG */
public final class C88135ql extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88135ql f238252c;

    /* renamed from: d */
    private static volatile C63010eb f238253d;

    /* renamed from: a */
    public int f238254a;

    /* renamed from: b */
    public int f238255b;

    static {
        C88135ql qlVar = new C88135ql();
        f238252c = qlVar;
        C62942bv.registerDefaultInstance(C88135ql.class, qlVar);
    }

    private C88135ql() {
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
                return newMessageInfo(f238252c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C88134qk.m142788b()});
            case 3:
                return new C88135ql();
            case 4:
                return new C88132qi();
            case 5:
                return f238252c;
            case 6:
                C63010eb ebVar = f238253d;
                if (ebVar == null) {
                    synchronized (C88135ql.class) {
                        ebVar = f238253d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238252c);
                            f238253d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
