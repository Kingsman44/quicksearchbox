package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.e */
/* compiled from: PG */
public final class C81309e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C81309e f222570b;

    /* renamed from: c */
    private static volatile C63010eb f222571c;

    /* renamed from: a */
    public C62995dn f222572a = C62995dn.f170057a;

    static {
        C81309e eVar = new C81309e();
        f222570b = eVar;
        C62942bv.registerDefaultInstance(C81309e.class, eVar);
    }

    private C81309e() {
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
                return newMessageInfo(f222570b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C81308d.f222569a});
            case 3:
                return new C81309e();
            case 4:
                return new C81296c();
            case 5:
                return f222570b;
            case 6:
                C63010eb ebVar = f222571c;
                if (ebVar == null) {
                    synchronized (C81309e.class) {
                        ebVar = f222571c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222570b);
                            f222571c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
