package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ub */
/* compiled from: PG */
public final class C88233ub extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88233ub f238478c;

    /* renamed from: d */
    private static volatile C63010eb f238479d;

    /* renamed from: a */
    public int f238480a;

    /* renamed from: b */
    public boolean f238481b;

    static {
        C88233ub ubVar = new C88233ub();
        f238478c = ubVar;
        C62942bv.registerDefaultInstance(C88233ub.class, ubVar);
    }

    private C88233ub() {
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
                return newMessageInfo(f238478c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88233ub();
            case 4:
                return new C88232ua();
            case 5:
                return f238478c;
            case 6:
                C63010eb ebVar = f238479d;
                if (ebVar == null) {
                    synchronized (C88233ub.class) {
                        ebVar = f238479d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238478c);
                            f238479d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
