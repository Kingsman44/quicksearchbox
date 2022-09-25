package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.h */
/* compiled from: PG */
public final class C67768h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67768h f183858d;

    /* renamed from: e */
    private static volatile C63010eb f183859e;

    /* renamed from: a */
    public int f183860a;

    /* renamed from: b */
    public C67778r f183861b;

    /* renamed from: c */
    public C67703cf f183862c;

    static {
        C67768h hVar = new C67768h();
        f183858d = hVar;
        C62942bv.registerDefaultInstance(C67768h.class, hVar);
    }

    private C67768h() {
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
                return newMessageInfo(f183858d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67768h();
            case 4:
                return new C67767g();
            case 5:
                return f183858d;
            case 6:
                C63010eb ebVar = f183859e;
                if (ebVar == null) {
                    synchronized (C67768h.class) {
                        ebVar = f183859e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183858d);
                            f183859e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
