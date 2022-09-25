package com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.e.b.b */
/* compiled from: PG */
public final class C16889b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C16889b f49385a;

    /* renamed from: b */
    private static volatile C63010eb f49386b;

    static {
        C16889b bVar = new C16889b();
        f49385a = bVar;
        C62942bv.registerDefaultInstance(C16889b.class, bVar);
    }

    private C16889b() {
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
                return newMessageInfo(f49385a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C16889b();
            case 4:
                return new C16886a();
            case 5:
                return f49385a;
            case 6:
                C63010eb ebVar = f49386b;
                if (ebVar == null) {
                    synchronized (C16889b.class) {
                        ebVar = f49386b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49385a);
                            f49386b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
