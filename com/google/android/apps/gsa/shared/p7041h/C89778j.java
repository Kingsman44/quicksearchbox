package com.google.android.apps.gsa.shared.p7041h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.h.j */
/* compiled from: PG */
public final class C89778j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C89778j f242996b;

    /* renamed from: c */
    private static volatile C63010eb f242997c;

    /* renamed from: a */
    public C62971cq f242998a = emptyProtobufList();

    static {
        C89778j jVar = new C89778j();
        f242996b = jVar;
        C62942bv.registerDefaultInstance(C89778j.class, jVar);
    }

    private C89778j() {
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
                return newMessageInfo(f242996b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C89776h.class});
            case 3:
                return new C89778j();
            case 4:
                return new C89777i();
            case 5:
                return f242996b;
            case 6:
                C63010eb ebVar = f242997c;
                if (ebVar == null) {
                    synchronized (C89778j.class) {
                        ebVar = f242997c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242996b);
                            f242997c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
