package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.nn */
/* compiled from: PG */
public final class C88056nn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C88056nn f238098b;

    /* renamed from: d */
    private static volatile C63010eb f238099d;

    /* renamed from: a */
    public int f238100a = 0;

    /* renamed from: c */
    private Object f238101c;

    static {
        C88056nn nnVar = new C88056nn();
        f238098b = nnVar;
        C62942bv.registerDefaultInstance(C88056nn.class, nnVar);
    }

    private C88056nn() {
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
                return newMessageInfo(f238098b, "\u0001\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002ြ\u0000", new Object[]{C45240c.f118157a, "a", C88049ng.class});
            case 3:
                return new C88056nn();
            case 4:
                return new C88054nl();
            case 5:
                return f238098b;
            case 6:
                C63010eb ebVar = f238099d;
                if (ebVar == null) {
                    synchronized (C88056nn.class) {
                        ebVar = f238099d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238098b);
                            f238099d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
