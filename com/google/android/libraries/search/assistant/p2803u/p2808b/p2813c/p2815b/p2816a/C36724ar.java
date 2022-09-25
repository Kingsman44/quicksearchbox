package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.aee;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.ar */
/* compiled from: PG */
public final class C36724ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36724ar f95682d;

    /* renamed from: e */
    private static volatile C63010eb f95683e;

    /* renamed from: a */
    public int f95684a;

    /* renamed from: b */
    public int f95685b;

    /* renamed from: c */
    public C63088z f95686c = C63088z.f170246b;

    static {
        C36724ar arVar = new C36724ar();
        f95682d = arVar;
        C62942bv.registerDefaultInstance(C36724ar.class, arVar);
    }

    private C36724ar() {
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
                return newMessageInfo(f95682d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ည\u0001\u0003ဌ\u0000", new Object[]{"a", C45240c.f118157a, "b", aee.f129104a});
            case 3:
                return new C36724ar();
            case 4:
                return new C36723aq();
            case 5:
                return f95682d;
            case 6:
                C63010eb ebVar = f95683e;
                if (ebVar == null) {
                    synchronized (C36724ar.class) {
                        ebVar = f95683e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95682d);
                            f95683e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
