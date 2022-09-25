package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3977m.p3978a.p3979a.C52996c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.jy */
/* compiled from: PG */
public final class C53331jy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53331jy f139836a;

    /* renamed from: e */
    private static volatile C63010eb f139837e;

    /* renamed from: b */
    private int f139838b;

    /* renamed from: c */
    private C52996c f139839c;

    /* renamed from: d */
    private byte f139840d = 2;

    static {
        C53331jy jyVar = new C53331jy();
        f139836a = jyVar;
        C62942bv.registerDefaultInstance(C53331jy.class, jyVar);
    }

    private C53331jy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139840d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139840d = b;
                return null;
            case 2:
                return newMessageInfo(f139836a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C53331jy();
            case 4:
                return new C53330jx();
            case 5:
                return f139836a;
            case 6:
                C63010eb ebVar = f139837e;
                if (ebVar == null) {
                    synchronized (C53331jy.class) {
                        ebVar = f139837e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139836a);
                            f139837e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
