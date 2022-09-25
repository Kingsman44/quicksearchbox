package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.h */
/* compiled from: PG */
public final class C17505h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C17505h f50519a;

    /* renamed from: b */
    private static volatile C63010eb f50520b;

    static {
        C17505h hVar = new C17505h();
        f50519a = hVar;
        C62942bv.registerDefaultInstance(C17505h.class, hVar);
    }

    private C17505h() {
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
                return newMessageInfo(f50519a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C17505h();
            case 4:
                return new C17504g();
            case 5:
                return f50519a;
            case 6:
                C63010eb ebVar = f50520b;
                if (ebVar == null) {
                    synchronized (C17505h.class) {
                        ebVar = f50520b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50519a);
                            f50520b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
