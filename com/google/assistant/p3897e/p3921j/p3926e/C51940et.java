package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.et */
/* compiled from: PG */
public final class C51940et extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51940et f136268b;

    /* renamed from: c */
    private static volatile C63010eb f136269c;

    /* renamed from: a */
    public C62971cq f136270a = emptyProtobufList();

    static {
        C51940et etVar = new C51940et();
        f136268b = etVar;
        C62942bv.registerDefaultInstance(C51940et.class, etVar);
    }

    private C51940et() {
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
                return newMessageInfo(f136268b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51809dy.class});
            case 3:
                return new C51940et();
            case 4:
                return new C51939es();
            case 5:
                return f136268b;
            case 6:
                C63010eb ebVar = f136269c;
                if (ebVar == null) {
                    synchronized (C51940et.class) {
                        ebVar = f136269c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136268b);
                            f136269c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
