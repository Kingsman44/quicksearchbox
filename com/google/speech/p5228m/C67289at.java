package com.google.speech.p5228m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.at */
/* compiled from: PG */
public final class C67289at extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67289at f182906d;

    /* renamed from: e */
    private static volatile C63010eb f182907e;

    /* renamed from: a */
    public C62971cq f182908a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f182909b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f182910c = emptyProtobufList();

    static {
        C67289at atVar = new C67289at();
        f182906d = atVar;
        C62942bv.registerDefaultInstance(C67289at.class, atVar);
    }

    private C67289at() {
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
                return newMessageInfo(f182906d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", C67298bb.class, "b", C67282am.class, C45240c.f118157a, C67353q.class});
            case 3:
                return new C67289at();
            case 4:
                return new C67288as();
            case 5:
                return f182906d;
            case 6:
                C63010eb ebVar = f182907e;
                if (ebVar == null) {
                    synchronized (C67289at.class) {
                        ebVar = f182907e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182906d);
                            f182907e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
