package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.f */
/* compiled from: PG */
public final class C81471f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C81471f f222887a;

    /* renamed from: b */
    private static volatile C63010eb f222888b;

    static {
        C81471f fVar = new C81471f();
        f222887a = fVar;
        C62942bv.registerDefaultInstance(C81471f.class, fVar);
    }

    private C81471f() {
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
                return newMessageInfo(f222887a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C81471f();
            case 4:
                return new C81470e();
            case 5:
                return f222887a;
            case 6:
                C63010eb ebVar = f222888b;
                if (ebVar == null) {
                    synchronized (C81471f.class) {
                        ebVar = f222888b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222887a);
                            f222888b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
