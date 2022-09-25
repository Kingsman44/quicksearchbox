package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.ap */
/* compiled from: PG */
public final class C80195ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80195ap f220022a;

    /* renamed from: b */
    private static volatile C63010eb f220023b;

    static {
        C80195ap apVar = new C80195ap();
        f220022a = apVar;
        C62942bv.registerDefaultInstance(C80195ap.class, apVar);
    }

    private C80195ap() {
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
                return newMessageInfo(f220022a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80195ap();
            case 4:
                return new C80194ao();
            case 5:
                return f220022a;
            case 6:
                C63010eb ebVar = f220023b;
                if (ebVar == null) {
                    synchronized (C80195ap.class) {
                        ebVar = f220023b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220022a);
                            f220023b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
