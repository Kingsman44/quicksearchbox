package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.bi */
/* compiled from: PG */
public final class C11705bi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C11705bi f37726a;

    /* renamed from: b */
    private static volatile C63010eb f37727b;

    static {
        C11705bi biVar = new C11705bi();
        f37726a = biVar;
        C62942bv.registerDefaultInstance(C11705bi.class, biVar);
    }

    private C11705bi() {
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
                return newMessageInfo(f37726a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C11705bi();
            case 4:
                return new C11704bh();
            case 5:
                return f37726a;
            case 6:
                C63010eb ebVar = f37727b;
                if (ebVar == null) {
                    synchronized (C11705bi.class) {
                        ebVar = f37727b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37726a);
                            f37727b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
