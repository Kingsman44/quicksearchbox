package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.an */
/* compiled from: PG */
public final class C67657an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67657an f183615c;

    /* renamed from: d */
    private static volatile C63010eb f183616d;

    /* renamed from: a */
    public int f183617a;

    /* renamed from: b */
    public C63088z f183618b = C63088z.f170246b;

    static {
        C67657an anVar = new C67657an();
        f183615c = anVar;
        C62942bv.registerDefaultInstance(C67657an.class, anVar);
    }

    private C67657an() {
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
                return newMessageInfo(f183615c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"a", "b"});
            case 3:
                return new C67657an();
            case 4:
                return new C67656am();
            case 5:
                return f183615c;
            case 6:
                C63010eb ebVar = f183616d;
                if (ebVar == null) {
                    synchronized (C67657an.class) {
                        ebVar = f183616d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183615c);
                            f183616d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
