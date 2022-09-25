package com.google.lens.p4698d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.d.y */
/* compiled from: PG */
public final class C62186y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62186y f167909b;

    /* renamed from: d */
    private static volatile C63010eb f167910d;

    /* renamed from: a */
    public boolean f167911a;

    /* renamed from: c */
    private int f167912c;

    static {
        C62186y yVar = new C62186y();
        f167909b = yVar;
        C62942bv.registerDefaultInstance(C62186y.class, yVar);
    }

    private C62186y() {
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
                return newMessageInfo(f167909b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဇ\u0003", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62186y();
            case 4:
                return new C62185x();
            case 5:
                return f167909b;
            case 6:
                C63010eb ebVar = f167910d;
                if (ebVar == null) {
                    synchronized (C62186y.class) {
                        ebVar = f167910d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167909b);
                            f167910d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
