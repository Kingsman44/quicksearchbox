package com.google.p4140ba.p4141a.p4142a;

import com.google.p375ai.p378b.C7746ik;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b */
/* compiled from: PG */
public final class C54780b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54780b f143718c;

    /* renamed from: d */
    private static volatile C63010eb f143719d;

    /* renamed from: a */
    public int f143720a;

    /* renamed from: b */
    public int f143721b = 48;

    static {
        C54780b bVar = new C54780b();
        f143718c = bVar;
        C62942bv.registerDefaultInstance(C54780b.class, bVar);
    }

    private C54780b() {
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
                return newMessageInfo(f143718c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C7746ik.m22835b()});
            case 3:
                return new C54780b();
            case 4:
                return new C54777a();
            case 5:
                return f143718c;
            case 6:
                C63010eb ebVar = f143719d;
                if (ebVar == null) {
                    synchronized (C54780b.class) {
                        ebVar = f143719d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143718c);
                            f143719d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
