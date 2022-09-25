package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sv */
/* compiled from: PG */
public final class C50323sv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50323sv f130971b;

    /* renamed from: c */
    private static volatile C63010eb f130972c;

    /* renamed from: a */
    public C62971cq f130973a = emptyProtobufList();

    static {
        C50323sv svVar = new C50323sv();
        f130971b = svVar;
        C62942bv.registerDefaultInstance(C50323sv.class, svVar);
    }

    private C50323sv() {
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
                return newMessageInfo(f130971b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50329ta.class});
            case 3:
                return new C50323sv();
            case 4:
                return new C50322su();
            case 5:
                return f130971b;
            case 6:
                C63010eb ebVar = f130972c;
                if (ebVar == null) {
                    synchronized (C50323sv.class) {
                        ebVar = f130972c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130971b);
                            f130972c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
