package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.v */
/* compiled from: PG */
public final class C81326v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C81326v f222601b;

    /* renamed from: c */
    private static volatile C63010eb f222602c;

    /* renamed from: a */
    public C62995dn f222603a = C62995dn.f170057a;

    static {
        C81326v vVar = new C81326v();
        f222601b = vVar;
        C62942bv.registerDefaultInstance(C81326v.class, vVar);
    }

    private C81326v() {
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
                return newMessageInfo(f222601b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C81325u.f222600a});
            case 3:
                return new C81326v();
            case 4:
                return new C81324t();
            case 5:
                return f222601b;
            case 6:
                C63010eb ebVar = f222602c;
                if (ebVar == null) {
                    synchronized (C81326v.class) {
                        ebVar = f222602c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222601b);
                            f222602c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
