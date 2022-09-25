package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ph */
/* compiled from: PG */
public final class C88104ph extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C88104ph f238195b;

    /* renamed from: c */
    private static volatile C63010eb f238196c;

    /* renamed from: a */
    public C62971cq f238197a = C62942bv.emptyProtobufList();

    static {
        C88104ph phVar = new C88104ph();
        f238195b = phVar;
        C62942bv.registerDefaultInstance(C88104ph.class, phVar);
    }

    private C88104ph() {
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
                return newMessageInfo(f238195b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C88104ph();
            case 4:
                return new C88103pg();
            case 5:
                return f238195b;
            case 6:
                C63010eb ebVar = f238196c;
                if (ebVar == null) {
                    synchronized (C88104ph.class) {
                        ebVar = f238196c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238195b);
                            f238196c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
