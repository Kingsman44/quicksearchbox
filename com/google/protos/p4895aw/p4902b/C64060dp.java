package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.dp */
/* compiled from: PG */
public final class C64060dp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64060dp f173200c;

    /* renamed from: d */
    private static volatile C63010eb f173201d;

    /* renamed from: a */
    public int f173202a = 0;

    /* renamed from: b */
    public Object f173203b;

    static {
        C64060dp dpVar = new C64060dp();
        f173200c = dpVar;
        C62942bv.registerDefaultInstance(C64060dp.class, dpVar);
    }

    private C64060dp() {
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
                return newMessageInfo(f173200c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C64010bt.class, C64066dv.class, C64062dr.class});
            case 3:
                return new C64060dp();
            case 4:
                return new C64058dn();
            case 5:
                return f173200c;
            case 6:
                C63010eb ebVar = f173201d;
                if (ebVar == null) {
                    synchronized (C64060dp.class) {
                        ebVar = f173201d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173200c);
                            f173201d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
