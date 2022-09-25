package com.google.protos.p4850an.p4854c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.c.p */
/* compiled from: PG */
public final class C63427p extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63427p f171410a;

    /* renamed from: e */
    private static volatile C63010eb f171411e;

    /* renamed from: b */
    private int f171412b;

    /* renamed from: c */
    private C63389bg f171413c;

    /* renamed from: d */
    private byte f171414d = 2;

    static {
        C63427p pVar = new C63427p();
        f171410a = pVar;
        C62942bv.registerDefaultInstance(C63427p.class, pVar);
    }

    private C63427p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171414d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171414d = b;
                return null;
            case 2:
                return newMessageInfo(f171410a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63427p();
            case 4:
                return new C63426o();
            case 5:
                return f171410a;
            case 6:
                C63010eb ebVar = f171411e;
                if (ebVar == null) {
                    synchronized (C63427p.class) {
                        ebVar = f171411e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171410a);
                            f171411e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
