package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.b */
/* compiled from: PG */
public final class C53567b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53567b f140591b;

    /* renamed from: c */
    private static volatile C63010eb f140592c;

    /* renamed from: a */
    public C62971cq f140593a = emptyProtobufList();

    static {
        C53567b bVar = new C53567b();
        f140591b = bVar;
        C62942bv.registerDefaultInstance(C53567b.class, bVar);
    }

    private C53567b() {
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
                return newMessageInfo(f140591b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53597f.class});
            case 3:
                return new C53567b();
            case 4:
                return new C53540a();
            case 5:
                return f140591b;
            case 6:
                C63010eb ebVar = f140592c;
                if (ebVar == null) {
                    synchronized (C53567b.class) {
                        ebVar = f140592c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140591b);
                            f140592c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
