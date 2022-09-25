package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.xq */
/* compiled from: PG */
public final class C50453xq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50453xq f131307a;

    /* renamed from: b */
    private static volatile C63010eb f131308b;

    static {
        C50453xq xqVar = new C50453xq();
        f131307a = xqVar;
        C62942bv.registerDefaultInstance(C50453xq.class, xqVar);
    }

    private C50453xq() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f131307a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50453xq();
            case 4:
                return new C50452xp();
            case 5:
                return f131307a;
            case 6:
                C63010eb ebVar = f131308b;
                if (ebVar == null) {
                    synchronized (C50453xq.class) {
                        ebVar = f131308b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131307a);
                            f131308b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
