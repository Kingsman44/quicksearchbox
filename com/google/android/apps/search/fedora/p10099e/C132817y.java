package com.google.android.apps.search.fedora.p10099e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.y */
/* compiled from: PG */
public final class C132817y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C132817y f362388d;

    /* renamed from: e */
    private static volatile C63010eb f362389e;

    /* renamed from: a */
    public int f362390a;

    /* renamed from: b */
    public boolean f362391b;

    /* renamed from: c */
    public boolean f362392c;

    static {
        C132817y yVar = new C132817y();
        f362388d = yVar;
        C62942bv.registerDefaultInstance(C132817y.class, yVar);
    }

    private C132817y() {
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
                return newMessageInfo(f362388d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C132817y();
            case 4:
                return new C132816x();
            case 5:
                return f362388d;
            case 6:
                C63010eb ebVar = f362389e;
                if (ebVar == null) {
                    synchronized (C132817y.class) {
                        ebVar = f362389e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362388d);
                            f362389e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
