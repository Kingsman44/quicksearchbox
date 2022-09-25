package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.cu */
/* compiled from: PG */
public final class C59939cu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59939cu f161993f;

    /* renamed from: g */
    private static volatile C63010eb f161994g;

    /* renamed from: a */
    public int f161995a;

    /* renamed from: b */
    public int f161996b;

    /* renamed from: c */
    public long f161997c;

    /* renamed from: d */
    public long f161998d;

    /* renamed from: e */
    public int f161999e;

    static {
        C59939cu cuVar = new C59939cu();
        f161993f = cuVar;
        C62942bv.registerDefaultInstance(C59939cu.class, cuVar);
    }

    private C59939cu() {
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
                return newMessageInfo(f161993f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0002\u0006ဂ\u0006\u0007ဌ\u0007", new Object[]{"a", "b", C59974x.f162090a, C45240c.f118157a, "d", "e", C59953dh.f162038a});
            case 3:
                return new C59939cu();
            case 4:
                return new C59938ct();
            case 5:
                return f161993f;
            case 6:
                C63010eb ebVar = f161994g;
                if (ebVar == null) {
                    synchronized (C59939cu.class) {
                        ebVar = f161994g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161993f);
                            f161994g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
