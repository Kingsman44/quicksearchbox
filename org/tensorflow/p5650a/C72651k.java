package org.tensorflow.p5650a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: org.tensorflow.a.k */
/* compiled from: PG */
public final class C72651k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C72651k f193222a;

    /* renamed from: c */
    private static volatile C63010eb f193223c;

    /* renamed from: b */
    private C62995dn f193224b = C62995dn.f170057a;

    static {
        C72651k kVar = new C72651k();
        f193222a = kVar;
        C62942bv.registerDefaultInstance(C72651k.class, kVar);
    }

    private C72651k() {
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
                return newMessageInfo(f193222a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C72650j.f193221a});
            case 3:
                return new C72651k();
            case 4:
                return new C72649i();
            case 5:
                return f193222a;
            case 6:
                C63010eb ebVar = f193223c;
                if (ebVar == null) {
                    synchronized (C72651k.class) {
                        ebVar = f193223c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193222a);
                            f193223c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
