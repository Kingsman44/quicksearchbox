package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.aa */
/* compiled from: PG */
public final class C65016aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65016aa f176065b;

    /* renamed from: c */
    private static volatile C63010eb f176066c;

    /* renamed from: a */
    public C62971cq f176067a = emptyProtobufList();

    static {
        C65016aa aaVar = new C65016aa();
        f176065b = aaVar;
        C62942bv.registerDefaultInstance(C65016aa.class, aaVar);
    }

    private C65016aa() {
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
                return newMessageInfo(f176065b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65059f.class});
            case 3:
                return new C65016aa();
            case 4:
                return new C65079z();
            case 5:
                return f176065b;
            case 6:
                C63010eb ebVar = f176066c;
                if (ebVar == null) {
                    synchronized (C65016aa.class) {
                        ebVar = f176066c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176065b);
                            f176066c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
