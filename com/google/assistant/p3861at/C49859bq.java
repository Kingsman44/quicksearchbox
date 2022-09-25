package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bq */
/* compiled from: PG */
public final class C49859bq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49859bq f129564a;

    /* renamed from: b */
    private static volatile C63010eb f129565b;

    static {
        C49859bq bqVar = new C49859bq();
        f129564a = bqVar;
        C62942bv.registerDefaultInstance(C49859bq.class, bqVar);
    }

    private C49859bq() {
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
                return newMessageInfo(f129564a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49859bq();
            case 4:
                return new C49858bp();
            case 5:
                return f129564a;
            case 6:
                C63010eb ebVar = f129565b;
                if (ebVar == null) {
                    synchronized (C49859bq.class) {
                        ebVar = f129565b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129564a);
                            f129565b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
