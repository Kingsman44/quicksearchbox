package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.ce */
/* compiled from: PG */
public final class C56278ce extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56278ce f149986e;

    /* renamed from: f */
    private static volatile C63010eb f149987f;

    /* renamed from: a */
    public int f149988a;

    /* renamed from: b */
    public int f149989b = 0;

    /* renamed from: c */
    public Object f149990c;

    /* renamed from: d */
    public int f149991d;

    static {
        C56278ce ceVar = new C56278ce();
        f149986e = ceVar;
        C62942bv.registerDefaultInstance(C56278ce.class, ceVar);
    }

    private C56278ce() {
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
                return newMessageInfo(f149986e, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဌ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C56306df.m87965b(), C56277cd.class, C56272bz.class, C56260bn.class, C56275cb.class, C56270bx.class, C56268bv.class, C56266bt.class, C56257bk.class});
            case 3:
                return new C56278ce();
            case 4:
                return new C56258bl();
            case 5:
                return f149986e;
            case 6:
                C63010eb ebVar = f149987f;
                if (ebVar == null) {
                    synchronized (C56278ce.class) {
                        ebVar = f149987f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149986e);
                            f149987f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
