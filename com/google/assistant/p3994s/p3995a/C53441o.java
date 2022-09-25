package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.o */
/* compiled from: PG */
public final class C53441o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53441o f140264a;

    /* renamed from: b */
    private static volatile C63010eb f140265b;

    static {
        C53441o oVar = new C53441o();
        f140264a = oVar;
        C62942bv.registerDefaultInstance(C53441o.class, oVar);
    }

    private C53441o() {
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
                return newMessageInfo(f140264a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53441o();
            case 4:
                return new C53414n();
            case 5:
                return f140264a;
            case 6:
                C63010eb ebVar = f140265b;
                if (ebVar == null) {
                    synchronized (C53441o.class) {
                        ebVar = f140265b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140264a);
                            f140265b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
