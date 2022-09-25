package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.eg */
/* compiled from: PG */
public final class C66917eg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66917eg f181904d;

    /* renamed from: e */
    private static volatile C63010eb f181905e;

    /* renamed from: a */
    public C62971cq f181906a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f181907b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f181908c = emptyProtobufList();

    static {
        C66917eg egVar = new C66917eg();
        f181904d = egVar;
        C62942bv.registerDefaultInstance(C66917eg.class, egVar);
    }

    private C66917eg() {
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
                return newMessageInfo(f181904d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", C66929es.class, "b", C66919ei.class, C45240c.f118157a, C66935ey.class});
            case 3:
                return new C66917eg();
            case 4:
                return new C66916ef();
            case 5:
                return f181904d;
            case 6:
                C63010eb ebVar = f181905e;
                if (ebVar == null) {
                    synchronized (C66917eg.class) {
                        ebVar = f181905e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181904d);
                            f181905e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
