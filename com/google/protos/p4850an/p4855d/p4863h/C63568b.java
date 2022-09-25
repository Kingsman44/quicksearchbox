package com.google.protos.p4850an.p4855d.p4863h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.h.b */
/* compiled from: PG */
public final class C63568b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63568b f171946a;

    /* renamed from: b */
    private static volatile C63010eb f171947b;

    static {
        C63568b bVar = new C63568b();
        f171946a = bVar;
        C62942bv.registerDefaultInstance(C63568b.class, bVar);
    }

    private C63568b() {
        emptyLongList();
        emptyProtobufList();
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
                return newMessageInfo(f171946a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C63568b();
            case 4:
                return new C63567a();
            case 5:
                return f171946a;
            case 6:
                C63010eb ebVar = f171947b;
                if (ebVar == null) {
                    synchronized (C63568b.class) {
                        ebVar = f171947b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171946a);
                            f171947b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
