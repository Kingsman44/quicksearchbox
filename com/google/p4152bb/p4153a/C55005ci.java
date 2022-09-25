package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ci */
/* compiled from: PG */
public final class C55005ci extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C55005ci f144714d;

    /* renamed from: f */
    private static volatile C63010eb f144715f;

    /* renamed from: a */
    public int f144716a;

    /* renamed from: b */
    public int f144717b;

    /* renamed from: c */
    public boolean f144718c = true;

    /* renamed from: e */
    private byte f144719e = 2;

    static {
        C55005ci ciVar = new C55005ci();
        f144714d = ciVar;
        C62942bv.registerDefaultInstance(C55005ci.class, ciVar);
    }

    private C55005ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144719e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144719e = b;
                return null;
            case 2:
                return newMessageInfo(f144714d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55005ci();
            case 4:
                return new C55004ch();
            case 5:
                return f144714d;
            case 6:
                C63010eb ebVar = f144715f;
                if (ebVar == null) {
                    synchronized (C55005ci.class) {
                        ebVar = f144715f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144714d);
                            f144715f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
