package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.kq */
/* compiled from: PG */
public final class C50102kq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50102kq f130252b;

    /* renamed from: c */
    private static volatile C63010eb f130253c;

    /* renamed from: a */
    public C62971cq f130254a = emptyProtobufList();

    static {
        C50102kq kqVar = new C50102kq();
        f130252b = kqVar;
        C62942bv.registerDefaultInstance(C50102kq.class, kqVar);
    }

    private C50102kq() {
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
                return newMessageInfo(f130252b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50100ko.class});
            case 3:
                return new C50102kq();
            case 4:
                return new C50101kp();
            case 5:
                return f130252b;
            case 6:
                C63010eb ebVar = f130253c;
                if (ebVar == null) {
                    synchronized (C50102kq.class) {
                        ebVar = f130253c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130252b);
                            f130253c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
