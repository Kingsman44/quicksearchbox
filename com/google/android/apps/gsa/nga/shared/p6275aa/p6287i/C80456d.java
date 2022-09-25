package com.google.android.apps.gsa.nga.shared.p6275aa.p6287i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.i.d */
/* compiled from: PG */
public final class C80456d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80456d f220820b;

    /* renamed from: c */
    private static volatile C63010eb f220821c;

    /* renamed from: a */
    public C62971cq f220822a = emptyProtobufList();

    static {
        C80456d dVar = new C80456d();
        f220820b = dVar;
        C62942bv.registerDefaultInstance(C80456d.class, dVar);
    }

    private C80456d() {
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
                return newMessageInfo(f220820b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80454b.class});
            case 3:
                return new C80456d();
            case 4:
                return new C80455c();
            case 5:
                return f220820b;
            case 6:
                C63010eb ebVar = f220821c;
                if (ebVar == null) {
                    synchronized (C80456d.class) {
                        ebVar = f220821c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220820b);
                            f220821c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
