package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.ay */
/* compiled from: PG */
public final class C53990ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53990ay f141649c;

    /* renamed from: d */
    private static volatile C63010eb f141650d;

    /* renamed from: a */
    public boolean f141651a;

    /* renamed from: b */
    public boolean f141652b;

    static {
        C53990ay ayVar = new C53990ay();
        f141649c = ayVar;
        C62942bv.registerDefaultInstance(C53990ay.class, ayVar);
    }

    private C53990ay() {
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
                return newMessageInfo(f141649c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C53990ay();
            case 4:
                return new C53989ax();
            case 5:
                return f141649c;
            case 6:
                C63010eb ebVar = f141650d;
                if (ebVar == null) {
                    synchronized (C53990ay.class) {
                        ebVar = f141650d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141649c);
                            f141650d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
