package com.google.android.apps.gsa.nga.shared.p6305ae.p6306a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ae.a.d */
/* compiled from: PG */
public final class C80559d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80559d f221121b;

    /* renamed from: c */
    private static volatile C63010eb f221122c;

    /* renamed from: a */
    public C62971cq f221123a = emptyProtobufList();

    static {
        C80559d dVar = new C80559d();
        f221121b = dVar;
        C62942bv.registerDefaultInstance(C80559d.class, dVar);
    }

    private C80559d() {
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
                return newMessageInfo(f221121b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80557b.class});
            case 3:
                return new C80559d();
            case 4:
                return new C80558c();
            case 5:
                return f221121b;
            case 6:
                C63010eb ebVar = f221122c;
                if (ebVar == null) {
                    synchronized (C80559d.class) {
                        ebVar = f221122c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221121b);
                            f221122c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
