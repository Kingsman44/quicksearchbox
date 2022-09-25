package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.l */
/* compiled from: PG */
public final class C54060l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54060l f141840c;

    /* renamed from: e */
    private static volatile C63010eb f141841e;

    /* renamed from: a */
    public C62971cq f141842a = emptyProtobufList();

    /* renamed from: b */
    public int f141843b;

    /* renamed from: d */
    private byte f141844d = 2;

    static {
        C54060l lVar = new C54060l();
        f141840c = lVar;
        C62942bv.registerDefaultInstance(C54060l.class, lVar);
    }

    private C54060l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141844d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141844d = b;
                return null;
            case 2:
                return newMessageInfo(f141840c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\f", new Object[]{"a", C54058j.class, "b"});
            case 3:
                return new C54060l();
            case 4:
                return new C54059k();
            case 5:
                return f141840c;
            case 6:
                C63010eb ebVar = f141841e;
                if (ebVar == null) {
                    synchronized (C54060l.class) {
                        ebVar = f141841e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141840c);
                            f141841e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
