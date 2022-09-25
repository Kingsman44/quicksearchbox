package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p417d.p418a.C8537aq;
import com.google.p395al.p417d.p418a.C8545ay;
import com.google.p395al.p417d.p418a.C8547b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.cv */
/* compiled from: PG */
public final class C57294cv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57294cv f152940d;

    /* renamed from: g */
    private static volatile C63010eb f152941g;

    /* renamed from: a */
    public int f152942a;

    /* renamed from: b */
    public C8547b f152943b;

    /* renamed from: c */
    public C8537aq f152944c;

    /* renamed from: e */
    private C8545ay f152945e;

    /* renamed from: f */
    private byte f152946f = 2;

    static {
        C57294cv cvVar = new C57294cv();
        f152940d = cvVar;
        C62942bv.registerDefaultInstance(C57294cv.class, cvVar);
    }

    private C57294cv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152946f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152946f = b;
                return null;
            case 2:
                return newMessageInfo(f152940d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", "e", C45240c.f118157a});
            case 3:
                return new C57294cv();
            case 4:
                return new C57293cu();
            case 5:
                return f152940d;
            case 6:
                C63010eb ebVar = f152941g;
                if (ebVar == null) {
                    synchronized (C57294cv.class) {
                        ebVar = f152941g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152940d);
                            f152941g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
