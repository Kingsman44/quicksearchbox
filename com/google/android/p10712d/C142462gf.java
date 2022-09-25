package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.gf */
/* compiled from: PG */
public final class C142462gf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142462gf f386596c;

    /* renamed from: e */
    private static volatile C63010eb f386597e;

    /* renamed from: a */
    public int f386598a;

    /* renamed from: b */
    public int f386599b;

    /* renamed from: d */
    private int f386600d;

    static {
        C142462gf gfVar = new C142462gf();
        f386596c = gfVar;
        C62942bv.registerDefaultInstance(C142462gf.class, gfVar);
    }

    private C142462gf() {
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
                return newMessageInfo(f386596c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", C142455fz.m231084b(), "b", C142461ge.m231086b()});
            case 3:
                return new C142462gf();
            case 4:
                return new C142459gc();
            case 5:
                return f386596c;
            case 6:
                C63010eb ebVar = f386597e;
                if (ebVar == null) {
                    synchronized (C142462gf.class) {
                        ebVar = f386597e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386596c);
                            f386597e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
