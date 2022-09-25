package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.d */
/* compiled from: PG */
public final class C81469d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C81469d f222885a;

    /* renamed from: b */
    private static volatile C63010eb f222886b;

    static {
        C81469d dVar = new C81469d();
        f222885a = dVar;
        C62942bv.registerDefaultInstance(C81469d.class, dVar);
    }

    private C81469d() {
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
                return newMessageInfo(f222885a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C81469d();
            case 4:
                return new C81468c();
            case 5:
                return f222885a;
            case 6:
                C63010eb ebVar = f222886b;
                if (ebVar == null) {
                    synchronized (C81469d.class) {
                        ebVar = f222886b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222885a);
                            f222886b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
