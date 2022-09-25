package com.google.android.libraries.search.p2998g.p2999a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.g.a.y */
/* compiled from: PG */
public final class C38384y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38384y f101627d;

    /* renamed from: e */
    private static volatile C63010eb f101628e;

    /* renamed from: a */
    public int f101629a;

    /* renamed from: b */
    public C63088z f101630b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f101631c = C63088z.f170246b;

    static {
        C38384y yVar = new C38384y();
        f101627d = yVar;
        C62942bv.registerDefaultInstance(C38384y.class, yVar);
    }

    private C38384y() {
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
                return newMessageInfo(f101627d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38384y();
            case 4:
                return new C38383x();
            case 5:
                return f101627d;
            case 6:
                C63010eb ebVar = f101628e;
                if (ebVar == null) {
                    synchronized (C38384y.class) {
                        ebVar = f101628e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101627d);
                            f101628e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
