package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.qj */
/* compiled from: PG */
public final class C7961qj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7961qj f27964c;

    /* renamed from: e */
    private static volatile C63010eb f27965e;

    /* renamed from: a */
    public int f27966a;

    /* renamed from: b */
    public C7957qf f27967b;

    /* renamed from: d */
    private byte f27968d = 2;

    static {
        C7961qj qjVar = new C7961qj();
        f27964c = qjVar;
        C62942bv.registerDefaultInstance(C7961qj.class, qjVar);
    }

    private C7961qj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27968d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27968d = b;
                return null;
            case 2:
                return newMessageInfo(f27964c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7961qj();
            case 4:
                return new C7960qi();
            case 5:
                return f27964c;
            case 6:
                C63010eb ebVar = f27965e;
                if (ebVar == null) {
                    synchronized (C7961qj.class) {
                        ebVar = f27965e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27964c);
                            f27965e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
