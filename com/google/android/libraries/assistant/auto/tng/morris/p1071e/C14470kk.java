package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.kk */
/* compiled from: PG */
public final class C14470kk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14470kk f43743a;

    /* renamed from: b */
    private static volatile C63010eb f43744b;

    static {
        C14470kk kkVar = new C14470kk();
        f43743a = kkVar;
        C62942bv.registerDefaultInstance(C14470kk.class, kkVar);
    }

    private C14470kk() {
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
                return newMessageInfo(f43743a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14470kk();
            case 4:
                return new C14469kj();
            case 5:
                return f43743a;
            case 6:
                C63010eb ebVar = f43744b;
                if (ebVar == null) {
                    synchronized (C14470kk.class) {
                        ebVar = f43744b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43743a);
                            f43744b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
