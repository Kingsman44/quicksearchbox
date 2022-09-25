package com.google.protos.p4850an.p4855d.p4856a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.a.j */
/* compiled from: PG */
public final class C63457j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63457j f171489e;

    /* renamed from: f */
    private static volatile C63010eb f171490f;

    /* renamed from: a */
    public int f171491a;

    /* renamed from: b */
    public int f171492b;

    /* renamed from: c */
    public int f171493c;

    /* renamed from: d */
    public int f171494d;

    static {
        C63457j jVar = new C63457j();
        f171489e = jVar;
        C62942bv.registerDefaultInstance(C63457j.class, jVar);
    }

    private C63457j() {
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
                return newMessageInfo(f171489e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004င\u0003", new Object[]{"a", "b", C63453f.f171487a, C45240c.f118157a, C63455h.f171488a, "d"});
            case 3:
                return new C63457j();
            case 4:
                return new C63452e();
            case 5:
                return f171489e;
            case 6:
                C63010eb ebVar = f171490f;
                if (ebVar == null) {
                    synchronized (C63457j.class) {
                        ebVar = f171490f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171489e);
                            f171490f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
