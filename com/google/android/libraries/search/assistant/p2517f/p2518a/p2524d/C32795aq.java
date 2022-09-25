package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.aq */
/* compiled from: PG */
public final class C32795aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C32795aq f87971a;

    /* renamed from: b */
    private static volatile C63010eb f87972b;

    static {
        C32795aq aqVar = new C32795aq();
        f87971a = aqVar;
        C62942bv.registerDefaultInstance(C32795aq.class, aqVar);
    }

    private C32795aq() {
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
                return newMessageInfo(f87971a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C32795aq();
            case 4:
                return new C32794ap();
            case 5:
                return f87971a;
            case 6:
                C63010eb ebVar = f87972b;
                if (ebVar == null) {
                    synchronized (C32795aq.class) {
                        ebVar = f87972b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87971a);
                            f87972b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
