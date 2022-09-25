package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fu */
/* compiled from: PG */
public final class C82932fu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82932fu f226253a;

    /* renamed from: d */
    private static volatile C63010eb f226254d;

    /* renamed from: b */
    private int f226255b;

    /* renamed from: c */
    private C83001j f226256c;

    static {
        C82932fu fuVar = new C82932fu();
        f226253a = fuVar;
        C62942bv.registerDefaultInstance(C82932fu.class, fuVar);
    }

    private C82932fu() {
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
                return newMessageInfo(f226253a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C82932fu();
            case 4:
                return new C82931ft();
            case 5:
                return f226253a;
            case 6:
                C63010eb ebVar = f226254d;
                if (ebVar == null) {
                    synchronized (C82932fu.class) {
                        ebVar = f226254d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226253a);
                            f226254d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
