package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.r */
/* compiled from: PG */
public final class C81322r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C81322r f222596c;

    /* renamed from: d */
    private static volatile C63010eb f222597d;

    /* renamed from: a */
    public int f222598a;

    /* renamed from: b */
    public long f222599b;

    static {
        C81322r rVar = new C81322r();
        f222596c = rVar;
        C62942bv.registerDefaultInstance(C81322r.class, rVar);
    }

    private C81322r() {
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
                return newMessageInfo(f222596c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C81322r();
            case 4:
                return new C81321q();
            case 5:
                return f222596c;
            case 6:
                C63010eb ebVar = f222597d;
                if (ebVar == null) {
                    synchronized (C81322r.class) {
                        ebVar = f222597d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222596c);
                            f222597d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
