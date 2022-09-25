package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.c.a.e.b */
/* compiled from: PG */
public final class C39497b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C39497b f104020a;

    /* renamed from: b */
    private static volatile C63010eb f104021b;

    static {
        C39497b bVar = new C39497b();
        f104020a = bVar;
        C62942bv.registerDefaultInstance(C39497b.class, bVar);
    }

    private C39497b() {
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
                return newMessageInfo(f104020a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C39497b();
            case 4:
                return new C39496a();
            case 5:
                return f104020a;
            case 6:
                C63010eb ebVar = f104021b;
                if (ebVar == null) {
                    synchronized (C39497b.class) {
                        ebVar = f104021b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104020a);
                            f104021b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
