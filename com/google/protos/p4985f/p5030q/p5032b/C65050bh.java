package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.bh */
/* compiled from: PG */
public final class C65050bh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65050bh f176158b;

    /* renamed from: d */
    private static volatile C63010eb f176159d;

    /* renamed from: a */
    public C62971cq f176160a = emptyProtobufList();

    /* renamed from: c */
    private byte f176161c = 2;

    static {
        C65050bh bhVar = new C65050bh();
        f176158b = bhVar;
        C62942bv.registerDefaultInstance(C65050bh.class, bhVar);
    }

    private C65050bh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176161c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176161c = b;
                return null;
            case 2:
                return newMessageInfo(f176158b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C65049bg.class});
            case 3:
                return new C65050bh();
            case 4:
                return new C65047be();
            case 5:
                return f176158b;
            case 6:
                C63010eb ebVar = f176159d;
                if (ebVar == null) {
                    synchronized (C65050bh.class) {
                        ebVar = f176159d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176158b);
                            f176159d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
