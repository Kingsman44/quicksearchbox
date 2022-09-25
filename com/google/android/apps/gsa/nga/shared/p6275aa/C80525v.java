package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.v */
/* compiled from: PG */
public final class C80525v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80525v f221055c;

    /* renamed from: d */
    private static volatile C63010eb f221056d;

    /* renamed from: a */
    public int f221057a;

    /* renamed from: b */
    public int f221058b;

    static {
        C80525v vVar = new C80525v();
        f221055c = vVar;
        C62942bv.registerDefaultInstance(C80525v.class, vVar);
    }

    private C80525v() {
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
                return newMessageInfo(f221055c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C80522s.f221054a});
            case 3:
                return new C80525v();
            case 4:
                return new C80524u();
            case 5:
                return f221055c;
            case 6:
                C63010eb ebVar = f221056d;
                if (ebVar == null) {
                    synchronized (C80525v.class) {
                        ebVar = f221056d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221055c);
                            f221056d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
