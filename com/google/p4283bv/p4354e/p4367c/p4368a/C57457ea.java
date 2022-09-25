package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ea */
/* compiled from: PG */
public final class C57457ea extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57457ea f153482f;

    /* renamed from: h */
    private static volatile C63010eb f153483h;

    /* renamed from: a */
    public int f153484a;

    /* renamed from: b */
    public int f153485b;

    /* renamed from: c */
    public C57408cf f153486c;

    /* renamed from: d */
    public C57467ek f153487d;

    /* renamed from: e */
    public int f153488e;

    /* renamed from: g */
    private byte f153489g = 2;

    static {
        C57457ea eaVar = new C57457ea();
        f153482f = eaVar;
        C62942bv.registerDefaultInstance(C57457ea.class, eaVar);
    }

    private C57457ea() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153489g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153489g = b;
                return null;
            case 2:
                return newMessageInfo(f153482f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဆ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C57412cj.f153379a});
            case 3:
                return new C57457ea();
            case 4:
                return new C57455dz();
            case 5:
                return f153482f;
            case 6:
                C63010eb ebVar = f153483h;
                if (ebVar == null) {
                    synchronized (C57457ea.class) {
                        ebVar = f153483h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153482f);
                            f153483h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
