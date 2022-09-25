package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.bt */
/* compiled from: PG */
public final class C134988bt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C134988bt f367579b;

    /* renamed from: c */
    private static volatile C63010eb f367580c;

    /* renamed from: a */
    public C62971cq f367581a = emptyProtobufList();

    static {
        C134988bt btVar = new C134988bt();
        f367579b = btVar;
        C62942bv.registerDefaultInstance(C134988bt.class, btVar);
    }

    private C134988bt() {
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
                return newMessageInfo(f367579b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C134986br.class});
            case 3:
                return new C134988bt();
            case 4:
                return new C134987bs();
            case 5:
                return f367579b;
            case 6:
                C63010eb ebVar = f367580c;
                if (ebVar == null) {
                    synchronized (C134988bt.class) {
                        ebVar = f367580c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f367579b);
                            f367580c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
