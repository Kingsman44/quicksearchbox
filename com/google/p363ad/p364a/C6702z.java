package com.google.p363ad.p364a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.z */
/* compiled from: PG */
public final class C6702z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C6702z f20007e;

    /* renamed from: f */
    private static volatile C63010eb f20008f;

    /* renamed from: a */
    public int f20009a;

    /* renamed from: b */
    public int f20010b = 0;

    /* renamed from: c */
    public Object f20011c;

    /* renamed from: d */
    public long f20012d;

    static {
        C6702z zVar = new C6702z();
        f20007e = zVar;
        C62942bv.registerDefaultInstance(C6702z.class, zVar);
    }

    private C6702z() {
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
                return newMessageInfo(f20007e, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C6692p.class, C6690n.class, C6694r.class, C6684h.class, C6701y.class, C6699w.class, C6697u.class});
            case 3:
                return new C6702z();
            case 4:
                return new C6685i();
            case 5:
                return f20007e;
            case 6:
                C63010eb ebVar = f20008f;
                if (ebVar == null) {
                    synchronized (C6702z.class) {
                        ebVar = f20008f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f20007e);
                            f20008f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
