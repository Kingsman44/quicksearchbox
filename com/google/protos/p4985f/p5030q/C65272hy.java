package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.hy */
/* compiled from: PG */
public final class C65272hy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65272hy f176579c;

    /* renamed from: d */
    private static volatile C63010eb f176580d;

    /* renamed from: a */
    public int f176581a;

    /* renamed from: b */
    public C65682h f176582b;

    static {
        C65272hy hyVar = new C65272hy();
        f176579c = hyVar;
        C62942bv.registerDefaultInstance(C65272hy.class, hyVar);
    }

    private C65272hy() {
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
                return newMessageInfo(f176579c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65272hy();
            case 4:
                return new C65271hx();
            case 5:
                return f176579c;
            case 6:
                C63010eb ebVar = f176580d;
                if (ebVar == null) {
                    synchronized (C65272hy.class) {
                        ebVar = f176580d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176579c);
                            f176580d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
