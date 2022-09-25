package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mr */
/* compiled from: PG */
public final class C50157mr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50157mr f130395b;

    /* renamed from: c */
    private static volatile C63010eb f130396c;

    /* renamed from: a */
    public C62971cq f130397a = emptyProtobufList();

    static {
        C50157mr mrVar = new C50157mr();
        f130395b = mrVar;
        C62942bv.registerDefaultInstance(C50157mr.class, mrVar);
    }

    private C50157mr() {
        emptyProtobufList();
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
                return newMessageInfo(f130395b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50155mp.class});
            case 3:
                return new C50157mr();
            case 4:
                return new C50156mq();
            case 5:
                return f130395b;
            case 6:
                C63010eb ebVar = f130396c;
                if (ebVar == null) {
                    synchronized (C50157mr.class) {
                        ebVar = f130396c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130395b);
                            f130396c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
