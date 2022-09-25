package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.dm */
/* compiled from: PG */
public final class C82870dm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82870dm f225955a;

    /* renamed from: b */
    private static volatile C63010eb f225956b;

    static {
        C82870dm dmVar = new C82870dm();
        f225955a = dmVar;
        C62942bv.registerDefaultInstance(C82870dm.class, dmVar);
    }

    private C82870dm() {
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
                return newMessageInfo(f225955a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82870dm();
            case 4:
                return new C82869dl();
            case 5:
                return f225955a;
            case 6:
                C63010eb ebVar = f225956b;
                if (ebVar == null) {
                    synchronized (C82870dm.class) {
                        ebVar = f225956b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225955a);
                            f225956b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
