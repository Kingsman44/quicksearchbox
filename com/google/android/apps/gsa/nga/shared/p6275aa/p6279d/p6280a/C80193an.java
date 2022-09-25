package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.an */
/* compiled from: PG */
public final class C80193an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80193an f220020a;

    /* renamed from: b */
    private static volatile C63010eb f220021b;

    static {
        C80193an anVar = new C80193an();
        f220020a = anVar;
        C62942bv.registerDefaultInstance(C80193an.class, anVar);
    }

    private C80193an() {
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
                return newMessageInfo(f220020a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80193an();
            case 4:
                return new C80192am();
            case 5:
                return f220020a;
            case 6:
                C63010eb ebVar = f220021b;
                if (ebVar == null) {
                    synchronized (C80193an.class) {
                        ebVar = f220021b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220020a);
                            f220021b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
