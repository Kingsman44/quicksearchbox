package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.s.a.ck */
/* compiled from: PG */
public final class C53128ck extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53128ck f139238f;

    /* renamed from: h */
    private static volatile C63010eb f139239h;

    /* renamed from: a */
    public int f139240a;

    /* renamed from: b */
    public int f139241b;

    /* renamed from: c */
    public int f139242c;

    /* renamed from: d */
    public C51992gr f139243d;

    /* renamed from: e */
    public C63042fg f139244e;

    /* renamed from: g */
    private byte f139245g = 2;

    static {
        C53128ck ckVar = new C53128ck();
        f139238f = ckVar;
        C62942bv.registerDefaultInstance(C53128ck.class, ckVar);
    }

    private C53128ck() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139245g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139245g = b;
                return null;
            case 2:
                return newMessageInfo(f139238f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001င\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C51133hp.m86036b(), "d", "e"});
            case 3:
                return new C53128ck();
            case 4:
                return new C53127cj();
            case 5:
                return f139238f;
            case 6:
                C63010eb ebVar = f139239h;
                if (ebVar == null) {
                    synchronized (C53128ck.class) {
                        ebVar = f139239h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139238f);
                            f139239h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
