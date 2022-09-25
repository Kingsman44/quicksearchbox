package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.pg */
/* compiled from: PG */
public final class C14601pg extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14601pg f44132a;

    /* renamed from: b */
    private static volatile C63010eb f44133b;

    static {
        C14601pg pgVar = new C14601pg();
        f44132a = pgVar;
        C62942bv.registerDefaultInstance(C14601pg.class, pgVar);
    }

    private C14601pg() {
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
                return newMessageInfo(f44132a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14601pg();
            case 4:
                return new C14600pf();
            case 5:
                return f44132a;
            case 6:
                C63010eb ebVar = f44133b;
                if (ebVar == null) {
                    synchronized (C14601pg.class) {
                        ebVar = f44133b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44132a);
                            f44133b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
