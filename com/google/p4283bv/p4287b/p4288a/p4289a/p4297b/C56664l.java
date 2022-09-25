package com.google.p4283bv.p4287b.p4288a.p4289a.p4297b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.b.l */
/* compiled from: PG */
public final class C56664l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56664l f151264c;

    /* renamed from: d */
    private static volatile C63010eb f151265d;

    /* renamed from: a */
    public int f151266a;

    /* renamed from: b */
    public boolean f151267b;

    static {
        C56664l lVar = new C56664l();
        f151264c = lVar;
        C62942bv.registerDefaultInstance(C56664l.class, lVar);
    }

    private C56664l() {
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
                return newMessageInfo(f151264c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56664l();
            case 4:
                return new C56663k();
            case 5:
                return f151264c;
            case 6:
                C63010eb ebVar = f151265d;
                if (ebVar == null) {
                    synchronized (C56664l.class) {
                        ebVar = f151265d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151264c);
                            f151265d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
