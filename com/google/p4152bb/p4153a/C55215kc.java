package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.kc */
/* compiled from: PG */
public final class C55215kc extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C55215kc f145365c;

    /* renamed from: e */
    private static volatile C63010eb f145366e;

    /* renamed from: a */
    public int f145367a;

    /* renamed from: b */
    public int f145368b;

    /* renamed from: d */
    private byte f145369d = 2;

    static {
        C55215kc kcVar = new C55215kc();
        f145365c = kcVar;
        C62942bv.registerDefaultInstance(C55215kc.class, kcVar);
    }

    private C55215kc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145369d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145369d = b;
                return null;
            case 2:
                return newMessageInfo(f145365c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55215kc();
            case 4:
                return new C55214kb();
            case 5:
                return f145365c;
            case 6:
                C63010eb ebVar = f145366e;
                if (ebVar == null) {
                    synchronized (C55215kc.class) {
                        ebVar = f145366e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145365c);
                            f145366e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
