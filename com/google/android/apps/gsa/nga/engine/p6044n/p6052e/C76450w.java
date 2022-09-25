package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.w */
/* compiled from: PG */
public final class C76450w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76450w f211621b;

    /* renamed from: c */
    private static volatile C63010eb f211622c;

    /* renamed from: a */
    public C62971cq f211623a = emptyProtobufList();

    static {
        C76450w wVar = new C76450w();
        f211621b = wVar;
        C62942bv.registerDefaultInstance(C76450w.class, wVar);
    }

    private C76450w() {
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
                return newMessageInfo(f211621b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C76452y.class});
            case 3:
                return new C76450w();
            case 4:
                return new C76449v();
            case 5:
                return f211621b;
            case 6:
                C63010eb ebVar = f211622c;
                if (ebVar == null) {
                    synchronized (C76450w.class) {
                        ebVar = f211622c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211621b);
                            f211622c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
