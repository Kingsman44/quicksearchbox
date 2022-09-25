package com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.h.a.c.k */
/* compiled from: PG */
public final class C33457k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33457k f89561b;

    /* renamed from: c */
    private static volatile C63010eb f89562c;

    /* renamed from: a */
    public C62971cq f89563a = emptyProtobufList();

    static {
        C33457k kVar = new C33457k();
        f89561b = kVar;
        C62942bv.registerDefaultInstance(C33457k.class, kVar);
    }

    private C33457k() {
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
                return newMessageInfo(f89561b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C33454h.class});
            case 3:
                return new C33457k();
            case 4:
                return new C33456j();
            case 5:
                return f89561b;
            case 6:
                C63010eb ebVar = f89562c;
                if (ebVar == null) {
                    synchronized (C33457k.class) {
                        ebVar = f89562c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89561b);
                            f89562c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
