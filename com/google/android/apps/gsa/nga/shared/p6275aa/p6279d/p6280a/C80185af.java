package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.af */
/* compiled from: PG */
public final class C80185af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80185af f220005a;

    /* renamed from: b */
    private static volatile C63010eb f220006b;

    static {
        C80185af afVar = new C80185af();
        f220005a = afVar;
        C62942bv.registerDefaultInstance(C80185af.class, afVar);
    }

    private C80185af() {
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
                return newMessageInfo(f220005a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80185af();
            case 4:
                return new C80184ae();
            case 5:
                return f220005a;
            case 6:
                C63010eb ebVar = f220006b;
                if (ebVar == null) {
                    synchronized (C80185af.class) {
                        ebVar = f220006b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220005a);
                            f220006b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
