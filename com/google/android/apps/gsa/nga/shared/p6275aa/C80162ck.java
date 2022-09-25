package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.ck */
/* compiled from: PG */
public final class C80162ck extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80162ck f219968b;

    /* renamed from: c */
    private static volatile C63010eb f219969c;

    /* renamed from: a */
    public C62971cq f219970a = emptyProtobufList();

    static {
        C80162ck ckVar = new C80162ck();
        f219968b = ckVar;
        C62942bv.registerDefaultInstance(C80162ck.class, ckVar);
    }

    private C80162ck() {
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
                return newMessageInfo(f219968b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80161cj.class});
            case 3:
                return new C80162ck();
            case 4:
                return new C80159ch();
            case 5:
                return f219968b;
            case 6:
                C63010eb ebVar = f219969c;
                if (ebVar == null) {
                    synchronized (C80162ck.class) {
                        ebVar = f219969c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219968b);
                            f219969c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
