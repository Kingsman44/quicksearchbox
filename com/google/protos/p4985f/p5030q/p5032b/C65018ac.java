package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.ac */
/* compiled from: PG */
public final class C65018ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65018ac f176068c;

    /* renamed from: d */
    private static volatile C63010eb f176069d;

    /* renamed from: a */
    public C62964ck f176070a = emptyLongList();

    /* renamed from: b */
    public C62971cq f176071b = C62942bv.emptyProtobufList();

    static {
        C65018ac acVar = new C65018ac();
        f176068c = acVar;
        C62942bv.registerDefaultInstance(C65018ac.class, acVar);
    }

    private C65018ac() {
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
                return newMessageInfo(f176068c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0014\u0002\u001a", new Object[]{"a", "b"});
            case 3:
                return new C65018ac();
            case 4:
                return new C65017ab();
            case 5:
                return f176068c;
            case 6:
                C63010eb ebVar = f176069d;
                if (ebVar == null) {
                    synchronized (C65018ac.class) {
                        ebVar = f176069d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176068c);
                            f176069d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
