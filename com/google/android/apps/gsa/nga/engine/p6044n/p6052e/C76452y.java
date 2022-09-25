package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.y */
/* compiled from: PG */
public final class C76452y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76452y f211624c;

    /* renamed from: d */
    private static volatile C63010eb f211625d;

    /* renamed from: a */
    public C62971cq f211626a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f211627b = emptyProtobufList();

    static {
        C76452y yVar = new C76452y();
        f211624c = yVar;
        C62942bv.registerDefaultInstance(C76452y.class, yVar);
    }

    private C76452y() {
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
                return newMessageInfo(f211624c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"a", "b", C76438k.class});
            case 3:
                return new C76452y();
            case 4:
                return new C76451x();
            case 5:
                return f211624c;
            case 6:
                C63010eb ebVar = f211625d;
                if (ebVar == null) {
                    synchronized (C76452y.class) {
                        ebVar = f211625d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211624c);
                            f211625d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
