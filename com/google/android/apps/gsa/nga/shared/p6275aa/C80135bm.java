package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bm */
/* compiled from: PG */
public final class C80135bm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80135bm f219913a;

    /* renamed from: b */
    private static volatile C63010eb f219914b;

    static {
        C80135bm bmVar = new C80135bm();
        f219913a = bmVar;
        C62942bv.registerDefaultInstance(C80135bm.class, bmVar);
    }

    private C80135bm() {
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
                return newMessageInfo(f219913a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80135bm();
            case 4:
                return new C80134bl();
            case 5:
                return f219913a;
            case 6:
                C63010eb ebVar = f219914b;
                if (ebVar == null) {
                    synchronized (C80135bm.class) {
                        ebVar = f219914b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219913a);
                            f219914b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
