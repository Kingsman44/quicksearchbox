package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.dv */
/* compiled from: PG */
public final class C64066dv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64066dv f173213e;

    /* renamed from: f */
    private static volatile C63010eb f173214f;

    /* renamed from: a */
    public int f173215a;

    /* renamed from: b */
    public int f173216b;

    /* renamed from: c */
    public long f173217c;

    /* renamed from: d */
    public long f173218d;

    static {
        C64066dv dvVar = new C64066dv();
        f173213e = dvVar;
        C62942bv.registerDefaultInstance(C64066dv.class, dvVar);
    }

    private C64066dv() {
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
                return newMessageInfo(f173213e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64066dv();
            case 4:
                return new C64065du();
            case 5:
                return f173213e;
            case 6:
                C63010eb ebVar = f173214f;
                if (ebVar == null) {
                    synchronized (C64066dv.class) {
                        ebVar = f173214f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173213e);
                            f173214f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
