package com.google.android.libraries.assistant.auto.tng.p893b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.b.i */
/* compiled from: PG */
public final class C13191i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C13191i f40830a;

    /* renamed from: b */
    private static volatile C63010eb f40831b;

    static {
        C13191i iVar = new C13191i();
        f40830a = iVar;
        C62942bv.registerDefaultInstance(C13191i.class, iVar);
    }

    private C13191i() {
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
                return newMessageInfo(f40830a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C13191i();
            case 4:
                return new C13190h();
            case 5:
                return f40830a;
            case 6:
                C63010eb ebVar = f40831b;
                if (ebVar == null) {
                    synchronized (C13191i.class) {
                        ebVar = f40831b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40830a);
                            f40831b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
