package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.r */
/* compiled from: PG */
public final class C104522r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C104522r f290723d;

    /* renamed from: e */
    private static volatile C63010eb f290724e;

    /* renamed from: a */
    public int f290725a;

    /* renamed from: b */
    public int f290726b;

    /* renamed from: c */
    public int f290727c;

    static {
        C104522r rVar = new C104522r();
        f290723d = rVar;
        C62942bv.registerDefaultInstance(C104522r.class, rVar);
    }

    private C104522r() {
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
                return newMessageInfo(f290723d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C104522r();
            case 4:
                return new C104521q();
            case 5:
                return f290723d;
            case 6:
                C63010eb ebVar = f290724e;
                if (ebVar == null) {
                    synchronized (C104522r.class) {
                        ebVar = f290724e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290723d);
                            f290724e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
