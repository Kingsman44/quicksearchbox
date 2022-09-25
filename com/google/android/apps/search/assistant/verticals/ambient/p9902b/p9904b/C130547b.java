package com.google.android.apps.search.assistant.verticals.ambient.p9902b.p9904b;

import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.b.b.b */
/* compiled from: PG */
public final class C130547b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C130547b f357600b;

    /* renamed from: c */
    private static volatile C63010eb f357601c;

    /* renamed from: a */
    public C62971cq f357602a = emptyProtobufList();

    static {
        C130547b bVar = new C130547b();
        f357600b = bVar;
        C62942bv.registerDefaultInstance(C130547b.class, bVar);
    }

    private C130547b() {
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
                return newMessageInfo(f357600b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C83739ak.class});
            case 3:
                return new C130547b();
            case 4:
                return new C130546a();
            case 5:
                return f357600b;
            case 6:
                C63010eb ebVar = f357601c;
                if (ebVar == null) {
                    synchronized (C130547b.class) {
                        ebVar = f357601c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357600b);
                            f357601c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
