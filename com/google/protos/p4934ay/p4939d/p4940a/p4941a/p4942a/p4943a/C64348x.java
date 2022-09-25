package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.x */
/* compiled from: PG */
public final class C64348x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64348x f173944c;

    /* renamed from: e */
    private static volatile C63010eb f173945e;

    /* renamed from: a */
    public int f173946a;

    /* renamed from: b */
    public C64298aq f173947b;

    /* renamed from: d */
    private byte f173948d = 2;

    static {
        C64348x xVar = new C64348x();
        f173944c = xVar;
        C62942bv.registerDefaultInstance(C64348x.class, xVar);
    }

    private C64348x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173948d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173948d = b;
                return null;
            case 2:
                return newMessageInfo(f173944c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64348x();
            case 4:
                return new C64347w();
            case 5:
                return f173944c;
            case 6:
                C63010eb ebVar = f173945e;
                if (ebVar == null) {
                    synchronized (C64348x.class) {
                        ebVar = f173945e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173944c);
                            f173945e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
