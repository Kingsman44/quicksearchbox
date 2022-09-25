package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ix */
/* compiled from: PG */
public final class C53303ix extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53303ix f139739a;

    /* renamed from: b */
    private static volatile C63010eb f139740b;

    static {
        C53303ix ixVar = new C53303ix();
        f139739a = ixVar;
        C62942bv.registerDefaultInstance(C53303ix.class, ixVar);
    }

    private C53303ix() {
        emptyIntList();
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
                return newMessageInfo(f139739a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53303ix();
            case 4:
                return new C53302iw();
            case 5:
                return f139739a;
            case 6:
                C63010eb ebVar = f139740b;
                if (ebVar == null) {
                    synchronized (C53303ix.class) {
                        ebVar = f139740b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139739a);
                            f139740b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
