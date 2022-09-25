package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.g */
/* compiled from: PG */
public final class C63750g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63750g f172461c;

    /* renamed from: d */
    private static volatile C63010eb f172462d;

    /* renamed from: a */
    public int f172463a = 0;

    /* renamed from: b */
    public Object f172464b;

    static {
        C63750g gVar = new C63750g();
        f172461c = gVar;
        C62942bv.registerDefaultInstance(C63750g.class, gVar);
    }

    private C63750g() {
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
                return newMessageInfo(f172461c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ဿ\u0000\u0003ျ\u0000", new Object[]{"b", "a", C63736ay.m96293b()});
            case 3:
                return new C63750g();
            case 4:
                return new C63748e();
            case 5:
                return f172461c;
            case 6:
                C63010eb ebVar = f172462d;
                if (ebVar == null) {
                    synchronized (C63750g.class) {
                        ebVar = f172462d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172461c);
                            f172462d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
