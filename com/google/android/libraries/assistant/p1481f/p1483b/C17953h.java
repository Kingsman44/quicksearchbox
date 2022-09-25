package com.google.android.libraries.assistant.p1481f.p1483b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.f.b.h */
/* compiled from: PG */
public final class C17953h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C17953h f51414b;

    /* renamed from: c */
    private static volatile C63010eb f51415c;

    /* renamed from: a */
    public C62971cq f51416a = emptyProtobufList();

    static {
        C17953h hVar = new C17953h();
        f51414b = hVar;
        C62942bv.registerDefaultInstance(C17953h.class, hVar);
    }

    private C17953h() {
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
                return newMessageInfo(f51414b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C17951f.class});
            case 3:
                return new C17953h();
            case 4:
                return new C17952g();
            case 5:
                return f51414b;
            case 6:
                C63010eb ebVar = f51415c;
                if (ebVar == null) {
                    synchronized (C17953h.class) {
                        ebVar = f51415c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51414b);
                            f51415c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
