package com.google.android.libraries.notifications.p2292g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.notifications.g.j */
/* compiled from: PG */
public final class C30002j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C30002j f81213b;

    /* renamed from: c */
    private static volatile C63010eb f81214c;

    /* renamed from: a */
    public C62971cq f81215a = emptyProtobufList();

    static {
        C30002j jVar = new C30002j();
        f81213b = jVar;
        C62942bv.registerDefaultInstance(C30002j.class, jVar);
    }

    private C30002j() {
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
                return newMessageInfo(f81213b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63070h.class});
            case 3:
                return new C30002j();
            case 4:
                return new C30001i();
            case 5:
                return f81213b;
            case 6:
                C63010eb ebVar = f81214c;
                if (ebVar == null) {
                    synchronized (C30002j.class) {
                        ebVar = f81214c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f81213b);
                            f81214c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
