package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.alb */
/* compiled from: PG */
public final class alb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final alb f135306b;

    /* renamed from: d */
    private static volatile C63010eb f135307d;

    /* renamed from: a */
    public ald f135308a;

    /* renamed from: c */
    private int f135309c;

    static {
        alb alb = new alb();
        f135306b = alb;
        C62942bv.registerDefaultInstance(alb.class, alb);
    }

    private alb() {
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
                return newMessageInfo(f135306b, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဉ\b", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new alb();
            case 4:
                return new ala();
            case 5:
                return f135306b;
            case 6:
                C63010eb ebVar = f135307d;
                if (ebVar == null) {
                    synchronized (alb.class) {
                        ebVar = f135307d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135306b);
                            f135307d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
