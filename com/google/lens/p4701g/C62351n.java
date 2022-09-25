package com.google.lens.p4701g;

import com.google.lens.p4705i.p4706a.C62375f;
import com.google.lens.p4705i.p4706a.C62379j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.n */
/* compiled from: PG */
public final class C62351n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62351n f168321c;

    /* renamed from: d */
    private static volatile C63010eb f168322d;

    /* renamed from: a */
    public int f168323a = 0;

    /* renamed from: b */
    public Object f168324b;

    static {
        C62351n nVar = new C62351n();
        f168321c = nVar;
        C62942bv.registerDefaultInstance(C62351n.class, nVar);
    }

    private C62351n() {
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
                return newMessageInfo(f168321c, "\u0001\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"b", "a", C62357t.class, C62310cf.class, C62326cv.class, C62318cn.class, C62296bs.class, C62335dd.class, C62349l.class, C62375f.class, C62343f.class, C62253ac.class, C62379j.class});
            case 3:
                return new C62351n();
            case 4:
                return new C62350m();
            case 5:
                return f168321c;
            case 6:
                C63010eb ebVar = f168322d;
                if (ebVar == null) {
                    synchronized (C62351n.class) {
                        ebVar = f168322d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168321c);
                            f168322d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
