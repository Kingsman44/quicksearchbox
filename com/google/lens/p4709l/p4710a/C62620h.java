package com.google.lens.p4709l.p4710a;

import com.google.android.libraries.lens.ondevice.p2037n.C24776ai;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.l.a.h */
/* compiled from: PG */
public final class C62620h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62620h f169066b;

    /* renamed from: c */
    private static volatile C63010eb f169067c;

    /* renamed from: a */
    public C62971cq f169068a = emptyProtobufList();

    static {
        C62620h hVar = new C62620h();
        f169066b = hVar;
        C62942bv.registerDefaultInstance(C62620h.class, hVar);
    }

    private C62620h() {
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
                return newMessageInfo(f169066b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C24776ai.class});
            case 3:
                return new C62620h();
            case 4:
                return new C62619g();
            case 5:
                return f169066b;
            case 6:
                C63010eb ebVar = f169067c;
                if (ebVar == null) {
                    synchronized (C62620h.class) {
                        ebVar = f169067c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169066b);
                            f169067c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
