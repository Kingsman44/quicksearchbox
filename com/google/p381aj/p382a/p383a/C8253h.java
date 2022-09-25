package com.google.p381aj.p382a.p383a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.aj.a.a.h */
/* compiled from: PG */
public final class C8253h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8253h f28987a;

    /* renamed from: e */
    private static volatile C63010eb f28988e;

    /* renamed from: b */
    private int f28989b;

    /* renamed from: c */
    private C8251f f28990c;

    /* renamed from: d */
    private byte f28991d = 2;

    static {
        C8253h hVar = new C8253h();
        f28987a = hVar;
        C62942bv.registerDefaultInstance(C8253h.class, hVar);
    }

    private C8253h() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28991d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28991d = b;
                return null;
            case 2:
                return newMessageInfo(f28987a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8253h();
            case 4:
                return new C8252g();
            case 5:
                return f28987a;
            case 6:
                C63010eb ebVar = f28988e;
                if (ebVar == null) {
                    synchronized (C8253h.class) {
                        ebVar = f28988e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28987a);
                            f28988e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
