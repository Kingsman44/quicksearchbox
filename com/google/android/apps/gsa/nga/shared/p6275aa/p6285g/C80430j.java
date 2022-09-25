package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.j */
/* compiled from: PG */
public final class C80430j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80430j f220746b;

    /* renamed from: c */
    private static volatile C63010eb f220747c;

    /* renamed from: a */
    public C62971cq f220748a = emptyProtobufList();

    static {
        C80430j jVar = new C80430j();
        f220746b = jVar;
        C62942bv.registerDefaultInstance(C80430j.class, jVar);
    }

    private C80430j() {
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
                return newMessageInfo(f220746b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80429i.class});
            case 3:
                return new C80430j();
            case 4:
                return new C80427g();
            case 5:
                return f220746b;
            case 6:
                C63010eb ebVar = f220747c;
                if (ebVar == null) {
                    synchronized (C80430j.class) {
                        ebVar = f220747c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220746b);
                            f220747c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
