package org.tensorflow.p5650a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.t */
/* compiled from: PG */
public final class C72660t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C72660t f193233b;

    /* renamed from: d */
    private static volatile C63010eb f193234d;

    /* renamed from: a */
    public C72654n f193235a;

    /* renamed from: c */
    private C72651k f193236c;

    static {
        C72660t tVar = new C72660t();
        f193233b = tVar;
        C62942bv.registerDefaultInstance(C72660t.class, tVar);
    }

    private C72660t() {
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
                return newMessageInfo(f193233b, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", C45240c.f118157a});
            case 3:
                return new C72660t();
            case 4:
                return new C72659s();
            case 5:
                return f193233b;
            case 6:
                C63010eb ebVar = f193234d;
                if (ebVar == null) {
                    synchronized (C72660t.class) {
                        ebVar = f193234d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193233b);
                            f193234d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
