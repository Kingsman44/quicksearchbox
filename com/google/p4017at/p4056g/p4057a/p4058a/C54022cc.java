package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.cc */
/* compiled from: PG */
public final class C54022cc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54022cc f141741c;

    /* renamed from: d */
    private static volatile C63010eb f141742d;

    /* renamed from: a */
    public int f141743a = 0;

    /* renamed from: b */
    public Object f141744b;

    static {
        C54022cc ccVar = new C54022cc();
        f141741c = ccVar;
        C62942bv.registerDefaultInstance(C54022cc.class, ccVar);
    }

    private C54022cc() {
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
                return newMessageInfo(f141741c, "\u0000\u0004\u0001\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C54066r.class, C54052df.class, C54028ci.class, C54026cg.class});
            case 3:
                return new C54022cc();
            case 4:
                return new C54021cb();
            case 5:
                return f141741c;
            case 6:
                C63010eb ebVar = f141742d;
                if (ebVar == null) {
                    synchronized (C54022cc.class) {
                        ebVar = f141742d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141741c);
                            f141742d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
