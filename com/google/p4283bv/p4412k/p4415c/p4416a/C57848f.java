package com.google.p4283bv.p4412k.p4415c.p4416a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.k.c.a.f */
/* compiled from: PG */
public final class C57848f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57848f f154551c;

    /* renamed from: f */
    private static volatile C63010eb f154552f;

    /* renamed from: a */
    public C57578av f154553a;

    /* renamed from: b */
    public boolean f154554b;

    /* renamed from: d */
    private C57578av f154555d;

    /* renamed from: e */
    private byte f154556e = 2;

    static {
        C57848f fVar = new C57848f();
        f154551c = fVar;
        C62942bv.registerDefaultInstance(C57848f.class, fVar);
    }

    private C57848f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154556e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154556e = b;
                return null;
            case 2:
                return newMessageInfo(f154551c, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0002\u0001Љ\u0002Љ\u0005\u0007", new Object[]{"d", "a", "b"});
            case 3:
                return new C57848f();
            case 4:
                return new C57847e();
            case 5:
                return f154551c;
            case 6:
                C63010eb ebVar = f154552f;
                if (ebVar == null) {
                    synchronized (C57848f.class) {
                        ebVar = f154552f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154551c);
                            f154552f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
