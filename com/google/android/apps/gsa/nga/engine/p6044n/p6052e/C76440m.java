package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.m */
/* compiled from: PG */
public final class C76440m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76440m f211607b;

    /* renamed from: c */
    private static volatile C63010eb f211608c;

    /* renamed from: a */
    public C62971cq f211609a = emptyProtobufList();

    static {
        C76440m mVar = new C76440m();
        f211607b = mVar;
        C62942bv.registerDefaultInstance(C76440m.class, mVar);
    }

    private C76440m() {
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
                return newMessageInfo(f211607b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C76438k.class});
            case 3:
                return new C76440m();
            case 4:
                return new C76439l();
            case 5:
                return f211607b;
            case 6:
                C63010eb ebVar = f211608c;
                if (ebVar == null) {
                    synchronized (C76440m.class) {
                        ebVar = f211608c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211607b);
                            f211608c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
