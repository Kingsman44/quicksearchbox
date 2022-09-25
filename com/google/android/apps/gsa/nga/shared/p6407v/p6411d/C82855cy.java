package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.cy */
/* compiled from: PG */
public final class C82855cy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82855cy f225927a;

    /* renamed from: b */
    private static volatile C63010eb f225928b;

    static {
        C82855cy cyVar = new C82855cy();
        f225927a = cyVar;
        C62942bv.registerDefaultInstance(C82855cy.class, cyVar);
    }

    private C82855cy() {
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
                return newMessageInfo(f225927a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82855cy();
            case 4:
                return new C82854cx();
            case 5:
                return f225927a;
            case 6:
                C63010eb ebVar = f225928b;
                if (ebVar == null) {
                    synchronized (C82855cy.class) {
                        ebVar = f225928b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225927a);
                            f225928b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
