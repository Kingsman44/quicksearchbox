package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57597bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.t */
/* compiled from: PG */
public final class C54483t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54483t f143048b;

    /* renamed from: d */
    private static volatile C63010eb f143049d;

    /* renamed from: a */
    public C57597bn f143050a;

    /* renamed from: c */
    private byte f143051c = 2;

    static {
        C54483t tVar = new C54483t();
        f143048b = tVar;
        C62942bv.registerDefaultInstance(C54483t.class, tVar);
    }

    private C54483t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143051c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f143051c = b;
                return null;
            case 2:
                return newMessageInfo(f143048b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C54483t();
            case 4:
                return new C54482s();
            case 5:
                return f143048b;
            case 6:
                C63010eb ebVar = f143049d;
                if (ebVar == null) {
                    synchronized (C54483t.class) {
                        ebVar = f143049d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143048b);
                            f143049d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
