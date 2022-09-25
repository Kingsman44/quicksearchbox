package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.a.d */
/* compiled from: PG */
public final class C131197d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C131197d f358807b;

    /* renamed from: c */
    private static volatile C63010eb f358808c;

    /* renamed from: a */
    public C62971cq f358809a = emptyProtobufList();

    static {
        C131197d dVar = new C131197d();
        f358807b = dVar;
        C62942bv.registerDefaultInstance(C131197d.class, dVar);
    }

    private C131197d() {
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
                return newMessageInfo(f358807b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C131195b.class});
            case 3:
                return new C131197d();
            case 4:
                return new C131196c();
            case 5:
                return f358807b;
            case 6:
                C63010eb ebVar = f358808c;
                if (ebVar == null) {
                    synchronized (C131197d.class) {
                        ebVar = f358808c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f358807b);
                            f358808c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
