package com.google.protos.p4850an.p4855d.p4856a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.a.n */
/* compiled from: PG */
public final class C63461n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63461n f171500a;

    /* renamed from: g */
    private static volatile C63010eb f171501g;

    /* renamed from: b */
    private int f171502b;

    /* renamed from: c */
    private C63459l f171503c;

    /* renamed from: d */
    private C63459l f171504d;

    /* renamed from: e */
    private C63459l f171505e;

    /* renamed from: f */
    private byte f171506f = 2;

    static {
        C63461n nVar = new C63461n();
        f171500a = nVar;
        C62942bv.registerDefaultInstance(C63461n.class, nVar);
    }

    private C63461n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171506f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171506f = b;
                return null;
            case 2:
                return newMessageInfo(f171500a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63461n();
            case 4:
                return new C63460m();
            case 5:
                return f171500a;
            case 6:
                C63010eb ebVar = f171501g;
                if (ebVar == null) {
                    synchronized (C63461n.class) {
                        ebVar = f171501g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171500a);
                            f171501g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
