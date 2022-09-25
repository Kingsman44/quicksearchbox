package com.google.android.apps.gsa.search.core.p6805i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.i.k */
/* compiled from: PG */
public final class C86115k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C86115k f232756b;

    /* renamed from: c */
    private static volatile C63010eb f232757c;

    /* renamed from: a */
    public C62971cq f232758a = emptyProtobufList();

    static {
        C86115k kVar = new C86115k();
        f232756b = kVar;
        C62942bv.registerDefaultInstance(C86115k.class, kVar);
    }

    private C86115k() {
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
                return newMessageInfo(f232756b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C86113i.class});
            case 3:
                return new C86115k();
            case 4:
                return new C86114j();
            case 5:
                return f232756b;
            case 6:
                C63010eb ebVar = f232757c;
                if (ebVar == null) {
                    synchronized (C86115k.class) {
                        ebVar = f232757c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f232756b);
                            f232757c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
