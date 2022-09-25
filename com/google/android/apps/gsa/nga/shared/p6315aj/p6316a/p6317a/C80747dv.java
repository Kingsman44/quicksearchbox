package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.dv */
/* compiled from: PG */
public final class C80747dv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80747dv f221644a;

    /* renamed from: b */
    private static volatile C63010eb f221645b;

    static {
        C80747dv dvVar = new C80747dv();
        f221644a = dvVar;
        C62942bv.registerDefaultInstance(C80747dv.class, dvVar);
    }

    private C80747dv() {
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
                return newMessageInfo(f221644a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80747dv();
            case 4:
                return new C80746du();
            case 5:
                return f221644a;
            case 6:
                C63010eb ebVar = f221645b;
                if (ebVar == null) {
                    synchronized (C80747dv.class) {
                        ebVar = f221645b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221644a);
                            f221645b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
