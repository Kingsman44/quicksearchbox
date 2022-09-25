package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.m */
/* compiled from: PG */
public final class C56977m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56977m f152098a;

    /* renamed from: e */
    private static volatile C63010eb f152099e;

    /* renamed from: b */
    private int f152100b;

    /* renamed from: c */
    private C7718hj f152101c;

    /* renamed from: d */
    private byte f152102d = 2;

    static {
        C56977m mVar = new C56977m();
        f152098a = mVar;
        C62942bv.registerDefaultInstance(C56977m.class, mVar);
    }

    private C56977m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152102d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152102d = b;
                return null;
            case 2:
                return newMessageInfo(f152098a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56977m();
            case 4:
                return new C56976l();
            case 5:
                return f152098a;
            case 6:
                C63010eb ebVar = f152099e;
                if (ebVar == null) {
                    synchronized (C56977m.class) {
                        ebVar = f152099e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152098a);
                            f152099e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
