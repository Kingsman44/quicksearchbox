package org.tensorflow.p5650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.n */
/* compiled from: PG */
public final class C72654n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C72654n f193226b;

    /* renamed from: c */
    private static volatile C63010eb f193227c;

    /* renamed from: a */
    public C62995dn f193228a = C62995dn.f170057a;

    static {
        C72654n nVar = new C72654n();
        f193226b = nVar;
        C62942bv.registerDefaultInstance(C72654n.class, nVar);
    }

    private C72654n() {
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
                return newMessageInfo(f193226b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C72653m.f193225a});
            case 3:
                return new C72654n();
            case 4:
                return new C72652l();
            case 5:
                return f193226b;
            case 6:
                C63010eb ebVar = f193227c;
                if (ebVar == null) {
                    synchronized (C72654n.class) {
                        ebVar = f193227c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193226b);
                            f193227c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
