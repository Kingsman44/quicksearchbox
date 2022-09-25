package com.google.p4283bv.p4412k.p4415c.p4416a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.c.a.b */
/* compiled from: PG */
public final class C57844b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57844b f154545a;

    /* renamed from: d */
    private static volatile C63010eb f154546d;

    /* renamed from: b */
    private C57578av f154547b;

    /* renamed from: c */
    private byte f154548c = 2;

    static {
        C57844b bVar = new C57844b();
        f154545a = bVar;
        C62942bv.registerDefaultInstance(C57844b.class, bVar);
    }

    private C57844b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154548c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f154548c = b;
                return null;
            case 2:
                return newMessageInfo(f154545a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"b"});
            case 3:
                return new C57844b();
            case 4:
                return new C57843a();
            case 5:
                return f154545a;
            case 6:
                C63010eb ebVar = f154546d;
                if (ebVar == null) {
                    synchronized (C57844b.class) {
                        ebVar = f154546d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154545a);
                            f154546d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
