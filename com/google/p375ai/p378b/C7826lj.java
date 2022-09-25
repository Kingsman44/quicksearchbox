package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.lj */
/* compiled from: PG */
public final class C7826lj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C7826lj f27448f;

    /* renamed from: g */
    private static volatile C63010eb f27449g;

    /* renamed from: a */
    public int f27450a;

    /* renamed from: b */
    public C8150xj f27451b;

    /* renamed from: c */
    public int f27452c;

    /* renamed from: d */
    public boolean f27453d;

    /* renamed from: e */
    public boolean f27454e;

    static {
        C7826lj ljVar = new C7826lj();
        f27448f = ljVar;
        C62942bv.registerDefaultInstance(C7826lj.class, ljVar);
    }

    private C7826lj() {
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
                return newMessageInfo(f27448f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဆ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C7826lj();
            case 4:
                return new C7825li();
            case 5:
                return f27448f;
            case 6:
                C63010eb ebVar = f27449g;
                if (ebVar == null) {
                    synchronized (C7826lj.class) {
                        ebVar = f27449g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27448f);
                            f27449g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
