package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.cd */
/* compiled from: PG */
public final class C57406cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57406cd f153364c;

    /* renamed from: e */
    private static volatile C63010eb f153365e;

    /* renamed from: a */
    public int f153366a;

    /* renamed from: b */
    public int f153367b;

    /* renamed from: d */
    private int f153368d;

    static {
        C57406cd cdVar = new C57406cd();
        f153364c = cdVar;
        C62942bv.registerDefaultInstance(C57406cd.class, cdVar);
    }

    private C57406cd() {
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
                return newMessageInfo(f153364c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57406cd();
            case 4:
                return new C57405cc();
            case 5:
                return f153364c;
            case 6:
                C63010eb ebVar = f153365e;
                if (ebVar == null) {
                    synchronized (C57406cd.class) {
                        ebVar = f153365e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153364c);
                            f153365e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
