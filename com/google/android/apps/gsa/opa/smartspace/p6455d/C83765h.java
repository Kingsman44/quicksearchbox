package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.h */
/* compiled from: PG */
public final class C83765h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83765h f228310b;

    /* renamed from: c */
    private static volatile C63010eb f228311c;

    /* renamed from: a */
    public C62971cq f228312a = emptyProtobufList();

    static {
        C83765h hVar = new C83765h();
        f228310b = hVar;
        C62942bv.registerDefaultInstance(C83765h.class, hVar);
    }

    private C83765h() {
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
                return newMessageInfo(f228310b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C83763f.class});
            case 3:
                return new C83765h();
            case 4:
                return new C83764g();
            case 5:
                return f228310b;
            case 6:
                C63010eb ebVar = f228311c;
                if (ebVar == null) {
                    synchronized (C83765h.class) {
                        ebVar = f228311c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228310b);
                            f228311c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
