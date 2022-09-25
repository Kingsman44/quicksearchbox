package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.cb */
/* compiled from: PG */
public final class C55492cb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55492cb f146427c;

    /* renamed from: d */
    private static volatile C63010eb f146428d;

    /* renamed from: a */
    public int f146429a = 0;

    /* renamed from: b */
    public Object f146430b;

    static {
        C55492cb cbVar = new C55492cb();
        f146427c = cbVar;
        C62942bv.registerDefaultInstance(C55492cb.class, cbVar);
    }

    private C55492cb() {
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
                return newMessageInfo(f146427c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C55484bu.f146378a});
            case 3:
                return new C55492cb();
            case 4:
                return new C55491ca();
            case 5:
                return f146427c;
            case 6:
                C63010eb ebVar = f146428d;
                if (ebVar == null) {
                    synchronized (C55492cb.class) {
                        ebVar = f146428d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146427c);
                            f146428d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
