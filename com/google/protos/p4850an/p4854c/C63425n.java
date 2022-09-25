package com.google.protos.p4850an.p4854c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.n */
/* compiled from: PG */
public final class C63425n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63425n f171403a;

    /* renamed from: g */
    private static volatile C63010eb f171404g;

    /* renamed from: b */
    private int f171405b;

    /* renamed from: c */
    private C63427p f171406c;

    /* renamed from: d */
    private C63423l f171407d;

    /* renamed from: e */
    private C63408ai f171408e;

    /* renamed from: f */
    private byte f171409f = 2;

    static {
        C63425n nVar = new C63425n();
        f171403a = nVar;
        C62942bv.registerDefaultInstance(C63425n.class, nVar);
    }

    private C63425n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171409f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171409f = b;
                return null;
            case 2:
                return newMessageInfo(f171403a, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0000\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63425n();
            case 4:
                return new C63424m();
            case 5:
                return f171403a;
            case 6:
                C63010eb ebVar = f171404g;
                if (ebVar == null) {
                    synchronized (C63425n.class) {
                        ebVar = f171404g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171403a);
                            f171404g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
