package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ah */
/* compiled from: PG */
public final class C11677ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11677ah f37668c;

    /* renamed from: d */
    private static volatile C63010eb f37669d;

    /* renamed from: a */
    public int f37670a;

    /* renamed from: b */
    public C11681al f37671b;

    static {
        C11677ah ahVar = new C11677ah();
        f37668c = ahVar;
        C62942bv.registerDefaultInstance(C11677ah.class, ahVar);
    }

    private C11677ah() {
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
                return newMessageInfo(f37668c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C11677ah();
            case 4:
                return new C11676ag();
            case 5:
                return f37668c;
            case 6:
                C63010eb ebVar = f37669d;
                if (ebVar == null) {
                    synchronized (C11677ah.class) {
                        ebVar = f37669d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37668c);
                            f37669d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
