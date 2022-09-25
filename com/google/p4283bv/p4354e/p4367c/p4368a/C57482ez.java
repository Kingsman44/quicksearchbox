package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ez */
/* compiled from: PG */
public final class C57482ez extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57482ez f153551c;

    /* renamed from: d */
    private static volatile C63010eb f153552d;

    /* renamed from: a */
    public int f153553a = 0;

    /* renamed from: b */
    public Object f153554b;

    static {
        C57482ez ezVar = new C57482ez();
        f153551c = ezVar;
        C62942bv.registerDefaultInstance(C57482ez.class, ezVar);
    }

    private C57482ez() {
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
                return newMessageInfo(f153551c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ျ\u0000", new Object[]{"b", "a", C57480ex.f153550a});
            case 3:
                return new C57482ez();
            case 4:
                return new C57479ew();
            case 5:
                return f153551c;
            case 6:
                C63010eb ebVar = f153552d;
                if (ebVar == null) {
                    synchronized (C57482ez.class) {
                        ebVar = f153552d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153551c);
                            f153552d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
