package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.bm */
/* compiled from: PG */
public final class C18477bm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C18477bm f52408a;

    /* renamed from: b */
    private static volatile C63010eb f52409b;

    static {
        C18477bm bmVar = new C18477bm();
        f52408a = bmVar;
        C62942bv.registerDefaultInstance(C18477bm.class, bmVar);
    }

    private C18477bm() {
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f52408a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C18477bm();
            case 4:
                return new C18476bl();
            case 5:
                return f52408a;
            case 6:
                C63010eb ebVar = f52409b;
                if (ebVar == null) {
                    synchronized (C18477bm.class) {
                        ebVar = f52409b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52408a);
                            f52409b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
