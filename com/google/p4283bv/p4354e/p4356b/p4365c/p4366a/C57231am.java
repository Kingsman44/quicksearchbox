package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.am */
/* compiled from: PG */
public final class C57231am extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C57231am f152780c;

    /* renamed from: f */
    private static volatile C63010eb f152781f;

    /* renamed from: a */
    public boolean f152782a;

    /* renamed from: b */
    public C62910ar f152783b;

    /* renamed from: d */
    private int f152784d;

    /* renamed from: e */
    private byte f152785e = 2;

    static {
        C57231am amVar = new C57231am();
        f152780c = amVar;
        C62942bv.registerDefaultInstance(C57231am.class, amVar);
    }

    private C57231am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152785e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152785e = b;
                return null;
            case 2:
                return newMessageInfo(f152780c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57231am();
            case 4:
                return new C57230al();
            case 5:
                return f152780c;
            case 6:
                C63010eb ebVar = f152781f;
                if (ebVar == null) {
                    synchronized (C57231am.class) {
                        ebVar = f152781f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152780c);
                            f152781f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
