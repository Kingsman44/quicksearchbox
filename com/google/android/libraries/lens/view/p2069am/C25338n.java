package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.n */
/* compiled from: PG */
public final class C25338n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25338n f68962b;

    /* renamed from: c */
    private static volatile C63010eb f68963c;

    /* renamed from: a */
    public C62971cq f68964a = emptyProtobufList();

    static {
        C25338n nVar = new C25338n();
        f68962b = nVar;
        C62942bv.registerDefaultInstance(C25338n.class, nVar);
    }

    private C25338n() {
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
                return newMessageInfo(f68962b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C25336l.class});
            case 3:
                return new C25338n();
            case 4:
                return new C25337m();
            case 5:
                return f68962b;
            case 6:
                C63010eb ebVar = f68963c;
                if (ebVar == null) {
                    synchronized (C25338n.class) {
                        ebVar = f68963c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68962b);
                            f68963c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
