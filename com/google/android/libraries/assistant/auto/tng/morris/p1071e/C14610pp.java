package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pp */
/* compiled from: PG */
public final class C14610pp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14610pp f44171a;

    /* renamed from: b */
    private static volatile C63010eb f44172b;

    static {
        C14610pp ppVar = new C14610pp();
        f44171a = ppVar;
        C62942bv.registerDefaultInstance(C14610pp.class, ppVar);
    }

    private C14610pp() {
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
                return newMessageInfo(f44171a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14610pp();
            case 4:
                return new C14609po();
            case 5:
                return f44171a;
            case 6:
                C63010eb ebVar = f44172b;
                if (ebVar == null) {
                    synchronized (C14610pp.class) {
                        ebVar = f44172b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44171a);
                            f44172b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
