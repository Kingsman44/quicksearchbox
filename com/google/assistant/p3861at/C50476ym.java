package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ym */
/* compiled from: PG */
public final class C50476ym extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50476ym f131367b;

    /* renamed from: c */
    private static volatile C63010eb f131368c;

    /* renamed from: a */
    public C62971cq f131369a = emptyProtobufList();

    static {
        C50476ym ymVar = new C50476ym();
        f131367b = ymVar;
        C62942bv.registerDefaultInstance(C50476ym.class, ymVar);
    }

    private C50476ym() {
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
                return newMessageInfo(f131367b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50472yi.class});
            case 3:
                return new C50476ym();
            case 4:
                return new C50475yl();
            case 5:
                return f131367b;
            case 6:
                C63010eb ebVar = f131368c;
                if (ebVar == null) {
                    synchronized (C50476ym.class) {
                        ebVar = f131368c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131367b);
                            f131368c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
