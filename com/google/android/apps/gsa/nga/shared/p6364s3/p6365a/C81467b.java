package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.b */
/* compiled from: PG */
public final class C81467b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C81467b f222883a;

    /* renamed from: b */
    private static volatile C63010eb f222884b;

    static {
        C81467b bVar = new C81467b();
        f222883a = bVar;
        C62942bv.registerDefaultInstance(C81467b.class, bVar);
    }

    private C81467b() {
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
                return newMessageInfo(f222883a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C81467b();
            case 4:
                return new C81466a();
            case 5:
                return f222883a;
            case 6:
                C63010eb ebVar = f222884b;
                if (ebVar == null) {
                    synchronized (C81467b.class) {
                        ebVar = f222884b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222883a);
                            f222884b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
