package com.google.android.libraries.search.assistant.p2497ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.ab.ak */
/* compiled from: PG */
public final class C32369ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32369ak f86776c;

    /* renamed from: d */
    private static volatile C63010eb f86777d;

    /* renamed from: a */
    public C62971cq f86778a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f86779b = emptyProtobufList();

    static {
        C32369ak akVar = new C32369ak();
        f86776c = akVar;
        C62942bv.registerDefaultInstance(C32369ak.class, akVar);
    }

    private C32369ak() {
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
                return newMessageInfo(f86776c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", C32367ai.class, "b", C32367ai.class});
            case 3:
                return new C32369ak();
            case 4:
                return new C32368aj();
            case 5:
                return f86776c;
            case 6:
                C63010eb ebVar = f86777d;
                if (ebVar == null) {
                    synchronized (C32369ak.class) {
                        ebVar = f86777d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86776c);
                            f86777d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
