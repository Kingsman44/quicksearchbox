package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.bn */
/* compiled from: PG */
public final class C51853bn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51853bn f136019b;

    /* renamed from: c */
    private static volatile C63010eb f136020c;

    /* renamed from: a */
    public C62971cq f136021a = C62942bv.emptyProtobufList();

    static {
        C51853bn bnVar = new C51853bn();
        f136019b = bnVar;
        C62942bv.registerDefaultInstance(C51853bn.class, bnVar);
    }

    private C51853bn() {
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
                return newMessageInfo(f136019b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C51853bn();
            case 4:
                return new C51852bm();
            case 5:
                return f136019b;
            case 6:
                C63010eb ebVar = f136020c;
                if (ebVar == null) {
                    synchronized (C51853bn.class) {
                        ebVar = f136020c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136019b);
                            f136020c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
