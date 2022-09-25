package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7510a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.t */
/* compiled from: PG */
public final class C56984t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f152113d = new C56980p();

    /* renamed from: f */
    public static final C56984t f152114f;

    /* renamed from: h */
    private static volatile C63010eb f152115h;

    /* renamed from: a */
    public int f152116a;

    /* renamed from: b */
    public C56975k f152117b;

    /* renamed from: c */
    public C62961ch f152118c = emptyIntList();

    /* renamed from: e */
    public int f152119e;

    /* renamed from: g */
    private byte f152120g = 2;

    static {
        C56984t tVar = new C56984t();
        f152114f = tVar;
        C62942bv.registerDefaultInstance(C56984t.class, tVar);
    }

    private C56984t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152120g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152120g = b;
                return null;
            case 2:
                return newMessageInfo(f152114f, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0003ဌ\u0001\u0004\u001e", new Object[]{"a", "b", "e", C7510a.f24744a, C45240c.f118157a, C56982r.m88248b()});
            case 3:
                return new C56984t();
            case 4:
                return new C56983s();
            case 5:
                return f152114f;
            case 6:
                C63010eb ebVar = f152115h;
                if (ebVar == null) {
                    synchronized (C56984t.class) {
                        ebVar = f152115h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152114f);
                            f152115h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
