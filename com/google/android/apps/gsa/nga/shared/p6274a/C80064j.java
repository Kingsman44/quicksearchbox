package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.j */
/* compiled from: PG */
public final class C80064j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80064j f219708a;

    /* renamed from: b */
    private static volatile C63010eb f219709b;

    static {
        C80064j jVar = new C80064j();
        f219708a = jVar;
        C62942bv.registerDefaultInstance(C80064j.class, jVar);
    }

    private C80064j() {
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
                return newMessageInfo(f219708a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80064j();
            case 4:
                return new C80063i();
            case 5:
                return f219708a;
            case 6:
                C63010eb ebVar = f219709b;
                if (ebVar == null) {
                    synchronized (C80064j.class) {
                        ebVar = f219709b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219708a);
                            f219709b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
