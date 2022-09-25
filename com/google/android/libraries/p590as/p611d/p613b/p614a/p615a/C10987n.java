package com.google.android.libraries.p590as.p611d.p613b.p614a.p615a;

import com.google.android.libraries.p590as.p611d.p612a.C10969b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.d.b.a.a.n */
/* compiled from: PG */
public final class C10987n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C10987n f36129d;

    /* renamed from: e */
    private static volatile C63010eb f36130e;

    /* renamed from: a */
    public int f36131a;

    /* renamed from: b */
    public C10976c f36132b;

    /* renamed from: c */
    public C62971cq f36133c = emptyProtobufList();

    static {
        C10987n nVar = new C10987n();
        f36129d = nVar;
        C62942bv.registerDefaultInstance(C10987n.class, nVar);
    }

    private C10987n() {
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
                return newMessageInfo(f36129d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C10969b.class});
            case 3:
                return new C10987n();
            case 4:
                return new C10986m();
            case 5:
                return f36129d;
            case 6:
                C63010eb ebVar = f36130e;
                if (ebVar == null) {
                    synchronized (C10987n.class) {
                        ebVar = f36130e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f36129d);
                            f36130e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
