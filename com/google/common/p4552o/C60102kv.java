package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.kv */
/* compiled from: PG */
public final class C60102kv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60102kv f162504e;

    /* renamed from: f */
    private static volatile C63010eb f162505f;

    /* renamed from: a */
    public int f162506a;

    /* renamed from: b */
    public int f162507b;

    /* renamed from: c */
    public boolean f162508c;

    /* renamed from: d */
    public String f162509d = BuildConfig.FLAVOR;

    static {
        C60102kv kvVar = new C60102kv();
        f162504e = kvVar;
        C62942bv.registerDefaultInstance(C60102kv.class, kvVar);
    }

    private C60102kv() {
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
                return newMessageInfo(f162504e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", C60100kt.f162503a, C45240c.f118157a, "d"});
            case 3:
                return new C60102kv();
            case 4:
                return new C60099ks();
            case 5:
                return f162504e;
            case 6:
                C63010eb ebVar = f162505f;
                if (ebVar == null) {
                    synchronized (C60102kv.class) {
                        ebVar = f162505f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162504e);
                            f162505f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
