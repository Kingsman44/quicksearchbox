package com.google.p395al.p408c.p414c.p416b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.ag */
/* compiled from: PG */
public final class C8464ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8464ag f29390d;

    /* renamed from: e */
    private static volatile C63010eb f29391e;

    /* renamed from: a */
    public int f29392a;

    /* renamed from: b */
    public int f29393b;

    /* renamed from: c */
    public int f29394c;

    static {
        C8464ag agVar = new C8464ag();
        f29390d = agVar;
        C62942bv.registerDefaultInstance(C8464ag.class, agVar);
    }

    private C8464ag() {
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
                return newMessageInfo(f29390d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8464ag();
            case 4:
                return new C8463af();
            case 5:
                return f29390d;
            case 6:
                C63010eb ebVar = f29391e;
                if (ebVar == null) {
                    synchronized (C8464ag.class) {
                        ebVar = f29391e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29390d);
                            f29391e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
