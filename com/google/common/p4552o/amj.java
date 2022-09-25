package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.amj */
/* compiled from: PG */
public final class amj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final amj f159149e;

    /* renamed from: f */
    private static volatile C63010eb f159150f;

    /* renamed from: a */
    public int f159151a;

    /* renamed from: b */
    public int f159152b;

    /* renamed from: c */
    public long f159153c;

    /* renamed from: d */
    public boolean f159154d;

    static {
        amj amj = new amj();
        f159149e = amj;
        C62942bv.registerDefaultInstance(amj.class, amj);
    }

    private amj() {
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
                return newMessageInfo(f159149e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0004ဇ\u0003", new Object[]{"a", "b", ami.f159148a, C45240c.f118157a, "d"});
            case 3:
                return new amj();
            case 4:
                return new amh();
            case 5:
                return f159149e;
            case 6:
                C63010eb ebVar = f159150f;
                if (ebVar == null) {
                    synchronized (amj.class) {
                        ebVar = f159150f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159149e);
                            f159150f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
