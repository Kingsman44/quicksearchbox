package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.e */
/* compiled from: PG */
public final class C88455e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88455e f239127d;

    /* renamed from: e */
    private static volatile C63010eb f239128e;

    /* renamed from: a */
    public int f239129a;

    /* renamed from: b */
    public int f239130b;

    /* renamed from: c */
    public long f239131c;

    static {
        C88455e eVar = new C88455e();
        f239127d = eVar;
        C62942bv.registerDefaultInstance(C88455e.class, eVar);
    }

    private C88455e() {
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
                return newMessageInfo(f239127d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88455e();
            case 4:
                return new C88454d();
            case 5:
                return f239127d;
            case 6:
                C63010eb ebVar = f239128e;
                if (ebVar == null) {
                    synchronized (C88455e.class) {
                        ebVar = f239128e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239127d);
                            f239128e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
