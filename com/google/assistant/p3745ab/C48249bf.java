package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.bf */
/* compiled from: PG */
public final class C48249bf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48249bf f124811a;

    /* renamed from: b */
    private static volatile C63010eb f124812b;

    static {
        C48249bf bfVar = new C48249bf();
        f124811a = bfVar;
        C62942bv.registerDefaultInstance(C48249bf.class, bfVar);
    }

    private C48249bf() {
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
                return newMessageInfo(f124811a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48249bf();
            case 4:
                return new C48248be();
            case 5:
                return f124811a;
            case 6:
                C63010eb ebVar = f124812b;
                if (ebVar == null) {
                    synchronized (C48249bf.class) {
                        ebVar = f124812b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124811a);
                            f124812b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
