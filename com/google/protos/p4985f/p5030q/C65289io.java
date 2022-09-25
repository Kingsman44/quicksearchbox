package com.google.protos.p4985f.p5030q;

import com.google.assistant.p3825an.p3834e.p3835a.C49362d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.io */
/* compiled from: PG */
public final class C65289io extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65289io f176607b;

    /* renamed from: c */
    private static volatile C63010eb f176608c;

    /* renamed from: a */
    public C62971cq f176609a = emptyProtobufList();

    static {
        C65289io ioVar = new C65289io();
        f176607b = ioVar;
        C62942bv.registerDefaultInstance(C65289io.class, ioVar);
    }

    private C65289io() {
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
                return newMessageInfo(f176607b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49362d.class});
            case 3:
                return new C65289io();
            case 4:
                return new C65288in();
            case 5:
                return f176607b;
            case 6:
                C63010eb ebVar = f176608c;
                if (ebVar == null) {
                    synchronized (C65289io.class) {
                        ebVar = f176608c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176607b);
                            f176608c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
