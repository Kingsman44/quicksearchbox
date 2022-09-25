package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.s */
/* compiled from: PG */
public final class C48917s extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48917s f126578f;

    /* renamed from: h */
    private static volatile C63010eb f126579h;

    /* renamed from: a */
    public int f126580a;

    /* renamed from: b */
    public C48919u f126581b;

    /* renamed from: c */
    public C48952az f126582c;

    /* renamed from: d */
    public C48904f f126583d;

    /* renamed from: e */
    public C48913o f126584e;

    /* renamed from: g */
    private byte f126585g = 2;

    static {
        C48917s sVar = new C48917s();
        f126578f = sVar;
        C62942bv.registerDefaultInstance(C48917s.class, sVar);
    }

    private C48917s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126585g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126585g = b;
                return null;
            case 2:
                return newMessageInfo(f126578f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48917s();
            case 4:
                return new C48916r();
            case 5:
                return f126578f;
            case 6:
                C63010eb ebVar = f126579h;
                if (ebVar == null) {
                    synchronized (C48917s.class) {
                        ebVar = f126579h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126578f);
                            f126579h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
