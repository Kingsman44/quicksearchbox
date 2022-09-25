package com.google.p4283bv.p4287b.p4288a.p4289a.p4313r;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.r.k */
/* compiled from: PG */
public final class C56813k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56813k f151598b;

    /* renamed from: d */
    private static volatile C63010eb f151599d;

    /* renamed from: a */
    public int f151600a;

    /* renamed from: c */
    private int f151601c;

    static {
        C56813k kVar = new C56813k();
        f151598b = kVar;
        C62942bv.registerDefaultInstance(C56813k.class, kVar);
    }

    private C56813k() {
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
                return newMessageInfo(f151598b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56813k();
            case 4:
                return new C56812j();
            case 5:
                return f151598b;
            case 6:
                C63010eb ebVar = f151599d;
                if (ebVar == null) {
                    synchronized (C56813k.class) {
                        ebVar = f151599d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151598b);
                            f151599d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
