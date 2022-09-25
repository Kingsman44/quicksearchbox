package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.b */
/* compiled from: PG */
public final class C64578b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64578b f175086f;

    /* renamed from: g */
    private static volatile C63010eb f175087g;

    /* renamed from: a */
    public int f175088a;

    /* renamed from: b */
    public int f175089b;

    /* renamed from: c */
    public double f175090c;

    /* renamed from: d */
    public double f175091d;

    /* renamed from: e */
    public double f175092e;

    static {
        C64578b bVar = new C64578b();
        f175086f = bVar;
        C62942bv.registerDefaultInstance(C64578b.class, bVar);
    }

    private C64578b() {
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
                return newMessageInfo(f175086f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64578b();
            case 4:
                return new C64551a();
            case 5:
                return f175086f;
            case 6:
                C63010eb ebVar = f175087g;
                if (ebVar == null) {
                    synchronized (C64578b.class) {
                        ebVar = f175087g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175086f);
                            f175087g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
