package com.google.android.apps.gsa.staticplugins.p7401ao;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.ao.f */
/* compiled from: PG */
public final class C94029f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C94029f f262665e;

    /* renamed from: f */
    private static volatile C63010eb f262666f;

    /* renamed from: a */
    public int f262667a;

    /* renamed from: b */
    public long f262668b;

    /* renamed from: c */
    public long f262669c;

    /* renamed from: d */
    public int f262670d;

    static {
        C94029f fVar = new C94029f();
        f262665e = fVar;
        C62942bv.registerDefaultInstance(C94029f.class, fVar);
    }

    private C94029f() {
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
                return newMessageInfo(f262665e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C94029f();
            case 4:
                return new C94028e();
            case 5:
                return f262665e;
            case 6:
                C63010eb ebVar = f262666f;
                if (ebVar == null) {
                    synchronized (C94029f.class) {
                        ebVar = f262666f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f262665e);
                            f262666f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
