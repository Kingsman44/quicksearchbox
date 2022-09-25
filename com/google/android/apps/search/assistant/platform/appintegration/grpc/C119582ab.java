package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.ab */
/* compiled from: PG */
public final class C119582ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119582ab f333282b;

    /* renamed from: c */
    private static volatile C63010eb f333283c;

    /* renamed from: a */
    public C62971cq f333284a = emptyProtobufList();

    static {
        C119582ab abVar = new C119582ab();
        f333282b = abVar;
        C62942bv.registerDefaultInstance(C119582ab.class, abVar);
    }

    private C119582ab() {
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
                return newMessageInfo(f333282b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C119644z.class});
            case 3:
                return new C119582ab();
            case 4:
                return new C119581aa();
            case 5:
                return f333282b;
            case 6:
                C63010eb ebVar = f333283c;
                if (ebVar == null) {
                    synchronized (C119582ab.class) {
                        ebVar = f333283c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333282b);
                            f333283c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
