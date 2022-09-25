package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mb */
/* compiled from: PG */
public final class C53389mb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53389mb f140099a;

    /* renamed from: b */
    private static volatile C63010eb f140100b;

    static {
        C53389mb mbVar = new C53389mb();
        f140099a = mbVar;
        C62942bv.registerDefaultInstance(C53389mb.class, mbVar);
    }

    private C53389mb() {
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
                return newMessageInfo(f140099a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53389mb();
            case 4:
                return new C53388ma();
            case 5:
                return f140099a;
            case 6:
                C63010eb ebVar = f140100b;
                if (ebVar == null) {
                    synchronized (C53389mb.class) {
                        ebVar = f140100b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140099a);
                            f140100b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
