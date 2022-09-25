package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.di */
/* compiled from: PG */
public final class C82866di extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82866di f225951a;

    /* renamed from: b */
    private static volatile C63010eb f225952b;

    static {
        C82866di diVar = new C82866di();
        f225951a = diVar;
        C62942bv.registerDefaultInstance(C82866di.class, diVar);
    }

    private C82866di() {
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
                return newMessageInfo(f225951a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82866di();
            case 4:
                return new C82865dh();
            case 5:
                return f225951a;
            case 6:
                C63010eb ebVar = f225952b;
                if (ebVar == null) {
                    synchronized (C82866di.class) {
                        ebVar = f225952b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225951a);
                            f225952b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
