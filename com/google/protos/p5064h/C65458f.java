package com.google.protos.p5064h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.h.f */
/* compiled from: PG */
public final class C65458f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65458f f177938c;

    /* renamed from: e */
    private static volatile C63010eb f177939e;

    /* renamed from: a */
    public int f177940a;

    /* renamed from: b */
    public C65454b f177941b;

    /* renamed from: d */
    private byte f177942d = 2;

    static {
        C65458f fVar = new C65458f();
        f177938c = fVar;
        C62942bv.registerDefaultInstance(C65458f.class, fVar);
    }

    private C65458f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177942d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177942d = b;
                return null;
            case 2:
                return newMessageInfo(f177938c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65458f();
            case 4:
                return new C65457e();
            case 5:
                return f177938c;
            case 6:
                C63010eb ebVar = f177939e;
                if (ebVar == null) {
                    synchronized (C65458f.class) {
                        ebVar = f177939e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177938c);
                            f177939e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
