package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.gm */
/* compiled from: PG */
public final class C49990gm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49990gm f129947a;

    /* renamed from: b */
    private static volatile C63010eb f129948b;

    static {
        C49990gm gmVar = new C49990gm();
        f129947a = gmVar;
        C62942bv.registerDefaultInstance(C49990gm.class, gmVar);
    }

    private C49990gm() {
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
                return newMessageInfo(f129947a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49990gm();
            case 4:
                return new C49989gl();
            case 5:
                return f129947a;
            case 6:
                C63010eb ebVar = f129948b;
                if (ebVar == null) {
                    synchronized (C49990gm.class) {
                        ebVar = f129948b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129947a);
                            f129948b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
