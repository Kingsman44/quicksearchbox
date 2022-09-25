package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.eb */
/* compiled from: PG */
public final class C67753eb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67753eb f183817e;

    /* renamed from: f */
    private static volatile C63010eb f183818f;

    /* renamed from: a */
    public int f183819a;

    /* renamed from: b */
    public C67748dx f183820b;

    /* renamed from: c */
    public C63088z f183821c = C63088z.f170246b;

    /* renamed from: d */
    public C63088z f183822d = C63088z.f170246b;

    static {
        C67753eb ebVar = new C67753eb();
        f183817e = ebVar;
        C62942bv.registerDefaultInstance(C67753eb.class, ebVar);
    }

    private C67753eb() {
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
                return newMessageInfo(f183817e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67753eb();
            case 4:
                return new C67752ea();
            case 5:
                return f183817e;
            case 6:
                C63010eb ebVar = f183818f;
                if (ebVar == null) {
                    synchronized (C67753eb.class) {
                        ebVar = f183818f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183817e);
                            f183818f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
