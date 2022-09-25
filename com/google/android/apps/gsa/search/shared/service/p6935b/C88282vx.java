package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.vx */
/* compiled from: PG */
public final class C88282vx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C88282vx f238770b;

    /* renamed from: c */
    private static volatile C63010eb f238771c;

    /* renamed from: a */
    public C62971cq f238772a = emptyProtobufList();

    static {
        C88282vx vxVar = new C88282vx();
        f238770b = vxVar;
        C62942bv.registerDefaultInstance(C88282vx.class, vxVar);
    }

    private C88282vx() {
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
                return newMessageInfo(f238770b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C88281vw.class});
            case 3:
                return new C88282vx();
            case 4:
                return new C88279vu();
            case 5:
                return f238770b;
            case 6:
                C63010eb ebVar = f238771c;
                if (ebVar == null) {
                    synchronized (C88282vx.class) {
                        ebVar = f238771c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238770b);
                            f238771c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
