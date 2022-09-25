package com.google.android.gms.measurement.p10848a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.measurement.a.ab */
/* compiled from: PG */
public final class C145124ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C145124ab f392206d;

    /* renamed from: e */
    private static volatile C63010eb f392207e;

    /* renamed from: a */
    public int f392208a;

    /* renamed from: b */
    public int f392209b;

    /* renamed from: c */
    public long f392210c;

    static {
        C145124ab abVar = new C145124ab();
        f392206d = abVar;
        C62942bv.registerDefaultInstance(C145124ab.class, abVar);
    }

    private C145124ab() {
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
                return newMessageInfo(f392206d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C145124ab();
            case 4:
                return new C145123aa();
            case 5:
                return f392206d;
            case 6:
                C63010eb ebVar = f392207e;
                if (ebVar == null) {
                    synchronized (C145124ab.class) {
                        ebVar = f392207e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f392206d);
                            f392207e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
