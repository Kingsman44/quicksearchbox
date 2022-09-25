package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.n */
/* compiled from: PG */
public final class C80259n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80259n f220196a;

    /* renamed from: b */
    private static volatile C63010eb f220197b;

    static {
        C80259n nVar = new C80259n();
        f220196a = nVar;
        C62942bv.registerDefaultInstance(C80259n.class, nVar);
    }

    private C80259n() {
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
                return newMessageInfo(f220196a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80259n();
            case 4:
                return new C80258m();
            case 5:
                return f220196a;
            case 6:
                C63010eb ebVar = f220197b;
                if (ebVar == null) {
                    synchronized (C80259n.class) {
                        ebVar = f220197b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220196a);
                            f220197b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
