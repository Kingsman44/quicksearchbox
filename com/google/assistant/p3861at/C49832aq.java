package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aq */
/* compiled from: PG */
public final class C49832aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49832aq f129493a;

    /* renamed from: b */
    private static volatile C63010eb f129494b;

    static {
        C49832aq aqVar = new C49832aq();
        f129493a = aqVar;
        C62942bv.registerDefaultInstance(C49832aq.class, aqVar);
    }

    private C49832aq() {
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
                return newMessageInfo(f129493a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49832aq();
            case 4:
                return new C49831ap();
            case 5:
                return f129493a;
            case 6:
                C63010eb ebVar = f129494b;
                if (ebVar == null) {
                    synchronized (C49832aq.class) {
                        ebVar = f129494b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129493a);
                            f129494b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
