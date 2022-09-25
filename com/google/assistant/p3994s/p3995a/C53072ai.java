package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ai */
/* compiled from: PG */
public final class C53072ai extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53072ai f139082a;

    /* renamed from: b */
    private static volatile C63010eb f139083b;

    static {
        C53072ai aiVar = new C53072ai();
        f139082a = aiVar;
        C62942bv.registerDefaultInstance(C53072ai.class, aiVar);
    }

    private C53072ai() {
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
                return newMessageInfo(f139082a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53072ai();
            case 4:
                return new C53071ah();
            case 5:
                return f139082a;
            case 6:
                C63010eb ebVar = f139083b;
                if (ebVar == null) {
                    synchronized (C53072ai.class) {
                        ebVar = f139083b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139082a);
                            f139083b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
