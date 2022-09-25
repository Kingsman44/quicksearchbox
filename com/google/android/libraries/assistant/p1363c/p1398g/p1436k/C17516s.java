package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.s */
/* compiled from: PG */
public final class C17516s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17516s f50530a;

    /* renamed from: b */
    private static volatile C63010eb f50531b;

    static {
        C17516s sVar = new C17516s();
        f50530a = sVar;
        C62942bv.registerDefaultInstance(C17516s.class, sVar);
    }

    private C17516s() {
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
                return newMessageInfo(f50530a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C17516s();
            case 4:
                return new C17515r();
            case 5:
                return f50530a;
            case 6:
                C63010eb ebVar = f50531b;
                if (ebVar == null) {
                    synchronized (C17516s.class) {
                        ebVar = f50531b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50530a);
                            f50531b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
