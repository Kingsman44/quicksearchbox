package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.o */
/* compiled from: PG */
public final class C134597o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C134597o f366547b;

    /* renamed from: c */
    private static volatile C63010eb f366548c;

    /* renamed from: a */
    public C62971cq f366549a = emptyProtobufList();

    static {
        C134597o oVar = new C134597o();
        f366547b = oVar;
        C62942bv.registerDefaultInstance(C134597o.class, oVar);
    }

    private C134597o() {
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
                return newMessageInfo(f366547b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C134595m.class});
            case 3:
                return new C134597o();
            case 4:
                return new C134596n();
            case 5:
                return f366547b;
            case 6:
                C63010eb ebVar = f366548c;
                if (ebVar == null) {
                    synchronized (C134597o.class) {
                        ebVar = f366548c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366547b);
                            f366548c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
