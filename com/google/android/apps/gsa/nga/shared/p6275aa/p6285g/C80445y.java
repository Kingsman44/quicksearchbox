package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.y */
/* compiled from: PG */
public final class C80445y extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80445y f220795a;

    /* renamed from: b */
    private static volatile C63010eb f220796b;

    static {
        C80445y yVar = new C80445y();
        f220795a = yVar;
        C62942bv.registerDefaultInstance(C80445y.class, yVar);
    }

    private C80445y() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f220795a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80445y();
            case 4:
                return new C80444x();
            case 5:
                return f220795a;
            case 6:
                C63010eb ebVar = f220796b;
                if (ebVar == null) {
                    synchronized (C80445y.class) {
                        ebVar = f220796b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220795a);
                            f220796b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
