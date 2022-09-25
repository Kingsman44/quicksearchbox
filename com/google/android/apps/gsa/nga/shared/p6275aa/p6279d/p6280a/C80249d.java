package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.d */
/* compiled from: PG */
public final class C80249d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80249d f220172a;

    /* renamed from: b */
    private static volatile C63010eb f220173b;

    static {
        C80249d dVar = new C80249d();
        f220172a = dVar;
        C62942bv.registerDefaultInstance(C80249d.class, dVar);
    }

    private C80249d() {
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
                return newMessageInfo(f220172a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80249d();
            case 4:
                return new C80233c();
            case 5:
                return f220172a;
            case 6:
                C63010eb ebVar = f220173b;
                if (ebVar == null) {
                    synchronized (C80249d.class) {
                        ebVar = f220173b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220172a);
                            f220173b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
