package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.np */
/* compiled from: PG */
public final class C55309np extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55309np f145710b;

    /* renamed from: c */
    public static final C62940bt f145711c;

    /* renamed from: d */
    private static volatile C63010eb f145712d;

    /* renamed from: a */
    public C62961ch f145713a = emptyIntList();

    static {
        C55309np npVar = new C55309np();
        f145710b = npVar;
        C62942bv.registerDefaultInstance(C55309np.class, npVar);
        f145711c = C62942bv.newSingularGeneratedExtension(C55231ks.f145410h, npVar, npVar, (C62958ce) null, 111839143, C63066gd.MESSAGE, C55309np.class);
    }

    private C55309np() {
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
                return newMessageInfo(f145710b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C55307nn.f145709a});
            case 3:
                return new C55309np();
            case 4:
                return new C55306nm();
            case 5:
                return f145710b;
            case 6:
                C63010eb ebVar = f145712d;
                if (ebVar == null) {
                    synchronized (C55309np.class) {
                        ebVar = f145712d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145710b);
                            f145712d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
