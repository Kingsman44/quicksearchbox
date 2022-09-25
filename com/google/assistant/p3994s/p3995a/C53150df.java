package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.df */
/* compiled from: PG */
public final class C53150df extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53150df f139301e;

    /* renamed from: g */
    private static volatile C63010eb f139302g;

    /* renamed from: a */
    public int f139303a;

    /* renamed from: b */
    public int f139304b;

    /* renamed from: c */
    public C53149de f139305c;

    /* renamed from: d */
    public C53147dc f139306d;

    /* renamed from: f */
    private byte f139307f = 2;

    static {
        C53150df dfVar = new C53150df();
        f139301e = dfVar;
        C62942bv.registerDefaultInstance(C53150df.class, dfVar);
    }

    private C53150df() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139307f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139307f = b;
                return null;
            case 2:
                return newMessageInfo(f139301e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001င\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53150df();
            case 4:
                return new C53145da();
            case 5:
                return f139301e;
            case 6:
                C63010eb ebVar = f139302g;
                if (ebVar == null) {
                    synchronized (C53150df.class) {
                        ebVar = f139302g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139301e);
                            f139302g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
