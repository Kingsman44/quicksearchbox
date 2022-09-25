package com.google.common.p4552o.p4570p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.q */
/* compiled from: PG */
public final class C60396q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60396q f163440d;

    /* renamed from: e */
    private static volatile C63010eb f163441e;

    /* renamed from: a */
    public int f163442a;

    /* renamed from: b */
    public int f163443b;

    /* renamed from: c */
    public int f163444c;

    static {
        C60396q qVar = new C60396q();
        f163440d = qVar;
        C62942bv.registerDefaultInstance(C60396q.class, qVar);
    }

    private C60396q() {
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
                return newMessageInfo(f163440d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C60395p.f163439a});
            case 3:
                return new C60396q();
            case 4:
                return new C60394o();
            case 5:
                return f163440d;
            case 6:
                C63010eb ebVar = f163441e;
                if (ebVar == null) {
                    synchronized (C60396q.class) {
                        ebVar = f163441e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163440d);
                            f163441e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
