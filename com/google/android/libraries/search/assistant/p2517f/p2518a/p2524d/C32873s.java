package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.s */
/* compiled from: PG */
public final class C32873s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C32873s f88105a;

    /* renamed from: b */
    private static volatile C63010eb f88106b;

    static {
        C32873s sVar = new C32873s();
        f88105a = sVar;
        C62942bv.registerDefaultInstance(C32873s.class, sVar);
    }

    private C32873s() {
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
                return newMessageInfo(f88105a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C32873s();
            case 4:
                return new C32872r();
            case 5:
                return f88105a;
            case 6:
                C63010eb ebVar = f88106b;
                if (ebVar == null) {
                    synchronized (C32873s.class) {
                        ebVar = f88106b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88105a);
                            f88106b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
