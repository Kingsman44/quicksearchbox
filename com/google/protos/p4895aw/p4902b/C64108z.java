package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.z */
/* compiled from: PG */
public final class C64108z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64108z f173317c;

    /* renamed from: d */
    private static volatile C63010eb f173318d;

    /* renamed from: a */
    public int f173319a = 0;

    /* renamed from: b */
    public Object f173320b;

    static {
        C64108z zVar = new C64108z();
        f173317c = zVar;
        C62942bv.registerDefaultInstance(C64108z.class, zVar);
    }

    private C64108z() {
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
                return newMessageInfo(f173317c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C64070dz.class, C64064dt.class, C64012bv.class, C64102t.class});
            case 3:
                return new C64108z();
            case 4:
                return new C64107y();
            case 5:
                return f173317c;
            case 6:
                C63010eb ebVar = f173318d;
                if (ebVar == null) {
                    synchronized (C64108z.class) {
                        ebVar = f173318d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173317c);
                            f173318d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
