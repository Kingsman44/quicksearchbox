package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.hq */
/* compiled from: PG */
public final class C51436hq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51436hq f133963a;

    /* renamed from: b */
    private static volatile C63010eb f133964b;

    static {
        C51436hq hqVar = new C51436hq();
        f133963a = hqVar;
        C62942bv.registerDefaultInstance(C51436hq.class, hqVar);
    }

    private C51436hq() {
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
                return newMessageInfo(f133963a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51436hq();
            case 4:
                return new C51435hp();
            case 5:
                return f133963a;
            case 6:
                C63010eb ebVar = f133964b;
                if (ebVar == null) {
                    synchronized (C51436hq.class) {
                        ebVar = f133964b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133963a);
                            f133964b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
