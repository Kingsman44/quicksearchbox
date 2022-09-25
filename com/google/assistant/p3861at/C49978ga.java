package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ga */
/* compiled from: PG */
public final class C49978ga extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49978ga f129919b;

    /* renamed from: c */
    private static volatile C63010eb f129920c;

    /* renamed from: a */
    public C62971cq f129921a = emptyProtobufList();

    static {
        C49978ga gaVar = new C49978ga();
        f129919b = gaVar;
        C62942bv.registerDefaultInstance(C49978ga.class, gaVar);
    }

    private C49978ga() {
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
                return newMessageInfo(f129919b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49976fz.class});
            case 3:
                return new C49978ga();
            case 4:
                return new C49970ft();
            case 5:
                return f129919b;
            case 6:
                C63010eb ebVar = f129920c;
                if (ebVar == null) {
                    synchronized (C49978ga.class) {
                        ebVar = f129920c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129919b);
                            f129920c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
