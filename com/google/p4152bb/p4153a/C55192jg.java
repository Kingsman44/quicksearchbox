package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.jg */
/* compiled from: PG */
public final class C55192jg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55192jg f145274b;

    /* renamed from: d */
    private static volatile C63010eb f145275d;

    /* renamed from: a */
    public int f145276a;

    /* renamed from: c */
    private int f145277c;

    static {
        C55192jg jgVar = new C55192jg();
        f145274b = jgVar;
        C62942bv.registerDefaultInstance(C55192jg.class, jgVar);
    }

    private C55192jg() {
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
                return newMessageInfo(f145274b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C55190je.f145273a});
            case 3:
                return new C55192jg();
            case 4:
                return new C55189jd();
            case 5:
                return f145274b;
            case 6:
                C63010eb ebVar = f145275d;
                if (ebVar == null) {
                    synchronized (C55192jg.class) {
                        ebVar = f145275d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145274b);
                            f145275d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
