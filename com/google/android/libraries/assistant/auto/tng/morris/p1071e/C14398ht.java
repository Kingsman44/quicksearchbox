package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ht */
/* compiled from: PG */
public final class C14398ht extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14398ht f43560b;

    /* renamed from: c */
    private static volatile C63010eb f43561c;

    /* renamed from: a */
    public int f43562a;

    static {
        C14398ht htVar = new C14398ht();
        f43560b = htVar;
        C62942bv.registerDefaultInstance(C14398ht.class, htVar);
    }

    private C14398ht() {
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
                return newMessageInfo(f43560b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14398ht();
            case 4:
                return new C14397hs();
            case 5:
                return f43560b;
            case 6:
                C63010eb ebVar = f43561c;
                if (ebVar == null) {
                    synchronized (C14398ht.class) {
                        ebVar = f43561c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43560b);
                            f43561c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
