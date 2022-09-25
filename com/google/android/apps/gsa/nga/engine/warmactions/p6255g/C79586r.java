package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.r */
/* compiled from: PG */
public final class C79586r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C79586r f218365a;

    /* renamed from: b */
    private static volatile C63010eb f218366b;

    static {
        C79586r rVar = new C79586r();
        f218365a = rVar;
        C62942bv.registerDefaultInstance(C79586r.class, rVar);
    }

    private C79586r() {
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
                return newMessageInfo(f218365a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C79586r();
            case 4:
                return new C79585q();
            case 5:
                return f218365a;
            case 6:
                C63010eb ebVar = f218366b;
                if (ebVar == null) {
                    synchronized (C79586r.class) {
                        ebVar = f218366b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218365a);
                            f218366b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
