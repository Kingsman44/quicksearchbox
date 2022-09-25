package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.t */
/* compiled from: PG */
public final class C48877t extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C48877t f126483b;

    /* renamed from: e */
    private static volatile C63010eb f126484e;

    /* renamed from: a */
    public int f126485a;

    /* renamed from: c */
    private int f126486c;

    /* renamed from: d */
    private byte f126487d = 2;

    static {
        C48877t tVar = new C48877t();
        f126483b = tVar;
        C62942bv.registerDefaultInstance(C48877t.class, tVar);
    }

    private C48877t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126487d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126487d = b;
                return null;
            case 2:
                return newMessageInfo(f126483b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C48875r.f126482a});
            case 3:
                return new C48877t();
            case 4:
                return new C48874q();
            case 5:
                return f126483b;
            case 6:
                C63010eb ebVar = f126484e;
                if (ebVar == null) {
                    synchronized (C48877t.class) {
                        ebVar = f126484e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126483b);
                            f126484e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
