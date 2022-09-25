package com.google.assistant.p4003x.p4004a.p4005a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.x.a.a.l */
/* compiled from: PG */
public final class C53522l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53522l f140462a;

    /* renamed from: b */
    private static volatile C63010eb f140463b;

    static {
        C53522l lVar = new C53522l();
        f140462a = lVar;
        C62942bv.registerDefaultInstance(C53522l.class, lVar);
    }

    private C53522l() {
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
                return newMessageInfo(f140462a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53522l();
            case 4:
                return new C53521k();
            case 5:
                return f140462a;
            case 6:
                C63010eb ebVar = f140463b;
                if (ebVar == null) {
                    synchronized (C53522l.class) {
                        ebVar = f140463b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140462a);
                            f140463b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
