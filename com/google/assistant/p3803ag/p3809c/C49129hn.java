package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hn */
/* compiled from: PG */
public final class C49129hn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49129hn f127054a;

    /* renamed from: b */
    private static volatile C63010eb f127055b;

    static {
        C49129hn hnVar = new C49129hn();
        f127054a = hnVar;
        C62942bv.registerDefaultInstance(C49129hn.class, hnVar);
    }

    private C49129hn() {
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
                return newMessageInfo(f127054a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49129hn();
            case 4:
                return new C49128hm();
            case 5:
                return f127054a;
            case 6:
                C63010eb ebVar = f127055b;
                if (ebVar == null) {
                    synchronized (C49129hn.class) {
                        ebVar = f127055b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127054a);
                            f127055b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
