package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.nw */
/* compiled from: PG */
public final class C50189nw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50189nw f130472e;

    /* renamed from: f */
    private static volatile C63010eb f130473f;

    /* renamed from: a */
    public C62971cq f130474a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f130475b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f130476c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f130477d = emptyProtobufList();

    static {
        C50189nw nwVar = new C50189nw();
        f130472e = nwVar;
        C62942bv.registerDefaultInstance(C50189nw.class, nwVar);
    }

    private C50189nw() {
        emptyProtobufList();
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
                return newMessageInfo(f130472e, "\u0001\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0006\u001b", new Object[]{"a", C50181no.class, "b", C50173ng.class, C45240c.f118157a, C50185ns.class, "d", C50177nk.class});
            case 3:
                return new C50189nw();
            case 4:
                return new C50188nv();
            case 5:
                return f130472e;
            case 6:
                C63010eb ebVar = f130473f;
                if (ebVar == null) {
                    synchronized (C50189nw.class) {
                        ebVar = f130473f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130472e);
                            f130473f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
