package com.google.lens.p4694a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dj */
/* compiled from: PG */
public final class C62112dj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62112dj f167731d;

    /* renamed from: e */
    private static volatile C63010eb f167732e;

    /* renamed from: a */
    public int f167733a;

    /* renamed from: b */
    public float f167734b;

    /* renamed from: c */
    public float f167735c;

    static {
        C62112dj djVar = new C62112dj();
        f167731d = djVar;
        C62942bv.registerDefaultInstance(C62112dj.class, djVar);
    }

    private C62112dj() {
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
                return newMessageInfo(f167731d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62112dj();
            case 4:
                return new C62111di();
            case 5:
                return f167731d;
            case 6:
                C63010eb ebVar = f167732e;
                if (ebVar == null) {
                    synchronized (C62112dj.class) {
                        ebVar = f167732e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167731d);
                            f167732e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
