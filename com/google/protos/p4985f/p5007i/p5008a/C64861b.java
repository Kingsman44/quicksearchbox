package com.google.protos.p4985f.p5007i.p5008a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.f.i.a.b */
/* compiled from: PG */
public final class C64861b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64861b f175760c;

    /* renamed from: e */
    private static volatile C63010eb f175761e;

    /* renamed from: a */
    public int f175762a;

    /* renamed from: b */
    public long f175763b;

    /* renamed from: d */
    private int f175764d;

    static {
        C64861b bVar = new C64861b();
        f175760c = bVar;
        C62942bv.registerDefaultInstance(C64861b.class, bVar);
    }

    private C64861b() {
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
                return newMessageInfo(f175760c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", C65753ak.m96798c(), "b"});
            case 3:
                return new C64861b();
            case 4:
                return new C64860a();
            case 5:
                return f175760c;
            case 6:
                C63010eb ebVar = f175761e;
                if (ebVar == null) {
                    synchronized (C64861b.class) {
                        ebVar = f175761e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175760c);
                            f175761e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
