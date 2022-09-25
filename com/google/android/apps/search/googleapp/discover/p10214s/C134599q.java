package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.q */
/* compiled from: PG */
public final class C134599q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C134599q f366550b;

    /* renamed from: c */
    private static volatile C63010eb f366551c;

    /* renamed from: a */
    public C62971cq f366552a = emptyProtobufList();

    static {
        C134599q qVar = new C134599q();
        f366550b = qVar;
        C62942bv.registerDefaultInstance(C134599q.class, qVar);
    }

    private C134599q() {
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
                return newMessageInfo(f366550b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C134597o.class});
            case 3:
                return new C134599q();
            case 4:
                return new C134598p();
            case 5:
                return f366550b;
            case 6:
                C63010eb ebVar = f366551c;
                if (ebVar == null) {
                    synchronized (C134599q.class) {
                        ebVar = f366551c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366550b);
                            f366551c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
