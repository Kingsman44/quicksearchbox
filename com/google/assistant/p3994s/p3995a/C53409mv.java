package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mv */
/* compiled from: PG */
public final class C53409mv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53409mv f140144a;

    /* renamed from: b */
    private static volatile C63010eb f140145b;

    static {
        C53409mv mvVar = new C53409mv();
        f140144a = mvVar;
        C62942bv.registerDefaultInstance(C53409mv.class, mvVar);
    }

    private C53409mv() {
        emptyProtobufList();
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
                return newMessageInfo(f140144a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53409mv();
            case 4:
                return new C53408mu();
            case 5:
                return f140144a;
            case 6:
                C63010eb ebVar = f140145b;
                if (ebVar == null) {
                    synchronized (C53409mv.class) {
                        ebVar = f140145b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140144a);
                            f140145b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
