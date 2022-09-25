package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.l */
/* compiled from: PG */
public final class C83003l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C83003l f226505a;

    /* renamed from: b */
    private static volatile C63010eb f226506b;

    static {
        C83003l lVar = new C83003l();
        f226505a = lVar;
        C62942bv.registerDefaultInstance(C83003l.class, lVar);
    }

    private C83003l() {
        emptyProtobufList();
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
                return newMessageInfo(f226505a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C83003l();
            case 4:
                return new C83002k();
            case 5:
                return f226505a;
            case 6:
                C63010eb ebVar = f226506b;
                if (ebVar == null) {
                    synchronized (C83003l.class) {
                        ebVar = f226506b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226505a);
                            f226506b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
