package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yk */
/* compiled from: PG */
public final class C50474yk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50474yk f131364b;

    /* renamed from: c */
    private static volatile C63010eb f131365c;

    /* renamed from: a */
    public C62971cq f131366a = emptyProtobufList();

    static {
        C50474yk ykVar = new C50474yk();
        f131364b = ykVar;
        C62942bv.registerDefaultInstance(C50474yk.class, ykVar);
    }

    private C50474yk() {
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
                return newMessageInfo(f131364b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50470yg.class});
            case 3:
                return new C50474yk();
            case 4:
                return new C50473yj();
            case 5:
                return f131364b;
            case 6:
                C63010eb ebVar = f131365c;
                if (ebVar == null) {
                    synchronized (C50474yk.class) {
                        ebVar = f131365c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131364b);
                            f131365c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
