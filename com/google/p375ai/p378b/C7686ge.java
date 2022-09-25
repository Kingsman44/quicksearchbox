package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ge */
/* compiled from: PG */
public final class C7686ge extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7686ge f26856a;

    /* renamed from: b */
    private static volatile C63010eb f26857b;

    static {
        C7686ge geVar = new C7686ge();
        f26856a = geVar;
        C62942bv.registerDefaultInstance(C7686ge.class, geVar);
    }

    private C7686ge() {
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
                return newMessageInfo(f26856a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7686ge();
            case 4:
                return new C7685gd();
            case 5:
                return f26856a;
            case 6:
                C63010eb ebVar = f26857b;
                if (ebVar == null) {
                    synchronized (C7686ge.class) {
                        ebVar = f26857b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26856a);
                            f26857b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
