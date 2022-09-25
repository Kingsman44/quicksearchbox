package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.ah */
/* compiled from: PG */
public final class C80416ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80416ah f220705a;

    /* renamed from: b */
    private static volatile C63010eb f220706b;

    static {
        C80416ah ahVar = new C80416ah();
        f220705a = ahVar;
        C62942bv.registerDefaultInstance(C80416ah.class, ahVar);
    }

    private C80416ah() {
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
                return newMessageInfo(f220705a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80416ah();
            case 4:
                return new C80415ag();
            case 5:
                return f220705a;
            case 6:
                C63010eb ebVar = f220706b;
                if (ebVar == null) {
                    synchronized (C80416ah.class) {
                        ebVar = f220706b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220705a);
                            f220706b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
