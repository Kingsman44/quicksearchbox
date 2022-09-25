package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.ad */
/* compiled from: PG */
public final class C64650ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64650ad f175243c;

    /* renamed from: d */
    private static volatile C63010eb f175244d;

    /* renamed from: a */
    public int f175245a = 0;

    /* renamed from: b */
    public Object f175246b;

    static {
        C64650ad adVar = new C64650ad();
        f175243c = adVar;
        C62942bv.registerDefaultInstance(C64650ad.class, adVar);
    }

    private C64650ad() {
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
                return newMessageInfo(f175243c, "\u0001\u0004\u0001\u0000\u0002\u0006\u0004\u0000\u0000\u0000\u0002ျ\u0000\u0004ြ\u0000\u0005ဿ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C64685bl.class, C64681bh.f175333a, C64680bg.class});
            case 3:
                return new C64650ad();
            case 4:
                return new C64649ac();
            case 5:
                return f175243c;
            case 6:
                C63010eb ebVar = f175244d;
                if (ebVar == null) {
                    synchronized (C64650ad.class) {
                        ebVar = f175244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175243c);
                            f175244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
