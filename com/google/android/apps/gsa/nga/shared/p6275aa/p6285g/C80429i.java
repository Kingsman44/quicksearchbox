package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.i */
/* compiled from: PG */
public final class C80429i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80429i f220744a;

    /* renamed from: b */
    private static volatile C63010eb f220745b;

    static {
        C80429i iVar = new C80429i();
        f220744a = iVar;
        C62942bv.registerDefaultInstance(C80429i.class, iVar);
    }

    private C80429i() {
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
                return newMessageInfo(f220744a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80429i();
            case 4:
                return new C80428h();
            case 5:
                return f220744a;
            case 6:
                C63010eb ebVar = f220745b;
                if (ebVar == null) {
                    synchronized (C80429i.class) {
                        ebVar = f220745b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220744a);
                            f220745b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
