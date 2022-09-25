package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.assistant.p3803ag.p3809c.C48956bc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.n */
/* compiled from: PG */
public final class C16378n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16378n f48208b;

    /* renamed from: c */
    private static volatile C63010eb f48209c;

    /* renamed from: a */
    public C62971cq f48210a = emptyProtobufList();

    static {
        C16378n nVar = new C16378n();
        f48208b = nVar;
        C62942bv.registerDefaultInstance(C16378n.class, nVar);
    }

    private C16378n() {
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
                return newMessageInfo(f48208b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48956bc.class});
            case 3:
                return new C16378n();
            case 4:
                return new C16377m();
            case 5:
                return f48208b;
            case 6:
                C63010eb ebVar = f48209c;
                if (ebVar == null) {
                    synchronized (C16378n.class) {
                        ebVar = f48209c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48208b);
                            f48209c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
