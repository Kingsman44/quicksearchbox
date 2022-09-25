package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.ae */
/* compiled from: PG */
public final class C135133ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C135133ae f368059b;

    /* renamed from: c */
    private static volatile C63010eb f368060c;

    /* renamed from: a */
    public C62971cq f368061a = emptyProtobufList();

    static {
        C135133ae aeVar = new C135133ae();
        f368059b = aeVar;
        C62942bv.registerDefaultInstance(C135133ae.class, aeVar);
    }

    private C135133ae() {
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
                return newMessageInfo(f368059b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C135135ag.class});
            case 3:
                return new C135133ae();
            case 4:
                return new C135132ad();
            case 5:
                return f368059b;
            case 6:
                C63010eb ebVar = f368060c;
                if (ebVar == null) {
                    synchronized (C135133ae.class) {
                        ebVar = f368060c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f368059b);
                            f368060c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
