package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.q */
/* compiled from: PG */
public final class C65070q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65070q f176204c;

    /* renamed from: d */
    private static volatile C63010eb f176205d;

    /* renamed from: a */
    public C62964ck f176206a = emptyLongList();

    /* renamed from: b */
    public C62971cq f176207b = C62942bv.emptyProtobufList();

    static {
        C65070q qVar = new C65070q();
        f176204c = qVar;
        C62942bv.registerDefaultInstance(C65070q.class, qVar);
    }

    private C65070q() {
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
                return newMessageInfo(f176204c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0014\u0002\u001a", new Object[]{"a", "b"});
            case 3:
                return new C65070q();
            case 4:
                return new C65069p();
            case 5:
                return f176204c;
            case 6:
                C63010eb ebVar = f176205d;
                if (ebVar == null) {
                    synchronized (C65070q.class) {
                        ebVar = f176205d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176204c);
                            f176205d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
