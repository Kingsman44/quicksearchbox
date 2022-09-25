package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.ao */
/* compiled from: PG */
public final class C32793ao extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C32793ao f87969a;

    /* renamed from: b */
    private static volatile C63010eb f87970b;

    static {
        C32793ao aoVar = new C32793ao();
        f87969a = aoVar;
        C62942bv.registerDefaultInstance(C32793ao.class, aoVar);
    }

    private C32793ao() {
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
                return newMessageInfo(f87969a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C32793ao();
            case 4:
                return new C32792an();
            case 5:
                return f87969a;
            case 6:
                C63010eb ebVar = f87970b;
                if (ebVar == null) {
                    synchronized (C32793ao.class) {
                        ebVar = f87970b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87969a);
                            f87970b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
