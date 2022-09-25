package com.google.protos.p4948ba;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ba.r */
/* compiled from: PG */
public final class C64388r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64388r f174632b;

    /* renamed from: c */
    private static volatile C63010eb f174633c;

    /* renamed from: a */
    public C62971cq f174634a = emptyProtobufList();

    static {
        C64388r rVar = new C64388r();
        f174632b = rVar;
        C62942bv.registerDefaultInstance(C64388r.class, rVar);
    }

    private C64388r() {
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
                return newMessageInfo(f174632b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64387q.class});
            case 3:
                return new C64388r();
            case 4:
                return new C64385o();
            case 5:
                return f174632b;
            case 6:
                C63010eb ebVar = f174633c;
                if (ebVar == null) {
                    synchronized (C64388r.class) {
                        ebVar = f174633c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174632b);
                            f174633c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
