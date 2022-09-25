package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.zo */
/* compiled from: PG */
public final class C8209zo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8209zo f28835a;

    /* renamed from: b */
    private static volatile C63010eb f28836b;

    static {
        C8209zo zoVar = new C8209zo();
        f28835a = zoVar;
        C62942bv.registerDefaultInstance(C8209zo.class, zoVar);
    }

    private C8209zo() {
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
                return newMessageInfo(f28835a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8209zo();
            case 4:
                return new C8208zn();
            case 5:
                return f28835a;
            case 6:
                C63010eb ebVar = f28836b;
                if (ebVar == null) {
                    synchronized (C8209zo.class) {
                        ebVar = f28836b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28835a);
                            f28836b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
