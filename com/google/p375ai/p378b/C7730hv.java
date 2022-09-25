package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.hv */
/* compiled from: PG */
public final class C7730hv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7730hv f27019e;

    /* renamed from: g */
    private static volatile C63010eb f27020g;

    /* renamed from: a */
    public int f27021a;

    /* renamed from: b */
    public C7799kj f27022b;

    /* renamed from: c */
    public long f27023c;

    /* renamed from: d */
    public C8174yg f27024d;

    /* renamed from: f */
    private byte f27025f = 2;

    static {
        C7730hv hvVar = new C7730hv();
        f27019e = hvVar;
        C62942bv.registerDefaultInstance(C7730hv.class, hvVar);
    }

    private C7730hv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27025f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27025f = b;
                return null;
            case 2:
                return newMessageInfo(f27019e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C7730hv();
            case 4:
                return new C7729hu();
            case 5:
                return f27019e;
            case 6:
                C63010eb ebVar = f27020g;
                if (ebVar == null) {
                    synchronized (C7730hv.class) {
                        ebVar = f27020g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27019e);
                            f27020g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
