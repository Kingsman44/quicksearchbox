package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.i.a.jn */
/* compiled from: PG */
public final class C51487jn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51487jn f134153a;

    /* renamed from: b */
    private static volatile C63010eb f134154b;

    static {
        C51487jn jnVar = new C51487jn();
        f134153a = jnVar;
        C62942bv.registerDefaultInstance(C51487jn.class, jnVar);
    }

    private C51487jn() {
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
                return newMessageInfo(f134153a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51487jn();
            case 4:
                return new C51486jm();
            case 5:
                return f134153a;
            case 6:
                C63010eb ebVar = f134154b;
                if (ebVar == null) {
                    synchronized (C51487jn.class) {
                        ebVar = f134154b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134153a);
                            f134154b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
