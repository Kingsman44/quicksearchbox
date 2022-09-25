package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.ae */
/* compiled from: PG */
public final class C119269ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119269ae f332610b;

    /* renamed from: c */
    private static volatile C63010eb f332611c;

    /* renamed from: a */
    public C62971cq f332612a = C62942bv.emptyProtobufList();

    static {
        C119269ae aeVar = new C119269ae();
        f332610b = aeVar;
        C62942bv.registerDefaultInstance(C119269ae.class, aeVar);
    }

    private C119269ae() {
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
                return newMessageInfo(f332610b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C119269ae();
            case 4:
                return new C119268ad();
            case 5:
                return f332610b;
            case 6:
                C63010eb ebVar = f332611c;
                if (ebVar == null) {
                    synchronized (C119269ae.class) {
                        ebVar = f332611c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332610b);
                            f332611c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
