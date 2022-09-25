package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.rn */
/* compiled from: PG */
public final class C55415rn extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C55415rn f146023d;

    /* renamed from: f */
    private static volatile C63010eb f146024f;

    /* renamed from: a */
    public int f146025a;

    /* renamed from: b */
    public C54969b f146026b;

    /* renamed from: c */
    public C54969b f146027c;

    /* renamed from: e */
    private byte f146028e = 2;

    static {
        C55415rn rnVar = new C55415rn();
        f146023d = rnVar;
        C62942bv.registerDefaultInstance(C55415rn.class, rnVar);
    }

    private C55415rn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f146028e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f146028e = b;
                return null;
            case 2:
                return newMessageInfo(f146023d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55415rn();
            case 4:
                return new C55414rm();
            case 5:
                return f146023d;
            case 6:
                C63010eb ebVar = f146024f;
                if (ebVar == null) {
                    synchronized (C55415rn.class) {
                        ebVar = f146024f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146023d);
                            f146024f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
