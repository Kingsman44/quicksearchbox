package com.google.android.libraries.search.p2904c.p2982x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.af */
/* compiled from: PG */
public final class C38223af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C38223af f101305a;

    /* renamed from: b */
    private static volatile C63010eb f101306b;

    static {
        C38223af afVar = new C38223af();
        f101305a = afVar;
        C62942bv.registerDefaultInstance(C38223af.class, afVar);
    }

    private C38223af() {
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
                return newMessageInfo(f101305a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C38223af();
            case 4:
                return new C38222ae();
            case 5:
                return f101305a;
            case 6:
                C63010eb ebVar = f101306b;
                if (ebVar == null) {
                    synchronized (C38223af.class) {
                        ebVar = f101306b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101305a);
                            f101306b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
