package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.n */
/* compiled from: PG */
public final class C11717n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C11717n f37757c;

    /* renamed from: d */
    private static volatile C63010eb f37758d;

    /* renamed from: a */
    public int f37759a = 0;

    /* renamed from: b */
    public Object f37760b;

    static {
        C11717n nVar = new C11717n();
        f37757c = nVar;
        C62942bv.registerDefaultInstance(C11717n.class, nVar);
    }

    private C11717n() {
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
                return newMessageInfo(f37757c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C11683an.class, C11714k.class});
            case 3:
                return new C11717n();
            case 4:
                return new C11715l();
            case 5:
                return f37757c;
            case 6:
                C63010eb ebVar = f37758d;
                if (ebVar == null) {
                    synchronized (C11717n.class) {
                        ebVar = f37758d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37757c);
                            f37758d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
