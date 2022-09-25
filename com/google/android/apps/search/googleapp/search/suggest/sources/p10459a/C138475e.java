package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.e */
/* compiled from: PG */
public final class C138475e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C138475e f376660b;

    /* renamed from: c */
    private static volatile C63010eb f376661c;

    /* renamed from: a */
    public C62971cq f376662a = emptyProtobufList();

    static {
        C138475e eVar = new C138475e();
        f376660b = eVar;
        C62942bv.registerDefaultInstance(C138475e.class, eVar);
    }

    private C138475e() {
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
                return newMessageInfo(f376660b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C138474d.class});
            case 3:
                return new C138475e();
            case 4:
                return new C138405b();
            case 5:
                return f376660b;
            case 6:
                C63010eb ebVar = f376661c;
                if (ebVar == null) {
                    synchronized (C138475e.class) {
                        ebVar = f376661c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376660b);
                            f376661c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
