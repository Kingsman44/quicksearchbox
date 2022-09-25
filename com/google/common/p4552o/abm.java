package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.abm */
/* compiled from: PG */
public final class abm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final abm f158210e;

    /* renamed from: f */
    private static volatile C63010eb f158211f;

    /* renamed from: a */
    public int f158212a;

    /* renamed from: b */
    public C62910ar f158213b;

    /* renamed from: c */
    public int f158214c;

    /* renamed from: d */
    public int f158215d;

    static {
        abm abm = new abm();
        f158210e = abm;
        C62942bv.registerDefaultInstance(abm.class, abm);
    }

    private abm() {
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
                return newMessageInfo(f158210e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, abl.f158209a, "d", abj.f158208a});
            case 3:
                return new abm();
            case 4:
                return new abi();
            case 5:
                return f158210e;
            case 6:
                C63010eb ebVar = f158211f;
                if (ebVar == null) {
                    synchronized (abm.class) {
                        ebVar = f158211f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158210e);
                            f158211f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
