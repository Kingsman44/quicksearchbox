package org.tensorflow.p5650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.d */
/* compiled from: PG */
public final class C72644d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C72644d f193212b;

    /* renamed from: c */
    private static volatile C63010eb f193213c;

    /* renamed from: a */
    public C72654n f193214a;

    static {
        C72644d dVar = new C72644d();
        f193212b = dVar;
        C62942bv.registerDefaultInstance(C72644d.class, dVar);
    }

    private C72644d() {
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
                return newMessageInfo(f193212b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C72644d();
            case 4:
                return new C72643c();
            case 5:
                return f193212b;
            case 6:
                C63010eb ebVar = f193213c;
                if (ebVar == null) {
                    synchronized (C72644d.class) {
                        ebVar = f193213c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193212b);
                            f193213c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
