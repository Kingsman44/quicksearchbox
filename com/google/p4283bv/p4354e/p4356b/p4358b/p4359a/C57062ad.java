package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.ad */
/* compiled from: PG */
public final class C57062ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57062ad f152328c;

    /* renamed from: f */
    private static volatile C63010eb f152329f;

    /* renamed from: a */
    public C57315dp f152330a;

    /* renamed from: b */
    public C57252bg f152331b;

    /* renamed from: d */
    private int f152332d;

    /* renamed from: e */
    private byte f152333e = 2;

    static {
        C57062ad adVar = new C57062ad();
        f152328c = adVar;
        C62942bv.registerDefaultInstance(C57062ad.class, adVar);
    }

    private C57062ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152333e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152333e = b;
                return null;
            case 2:
                return newMessageInfo(f152328c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57062ad();
            case 4:
                return new C57061ac();
            case 5:
                return f152328c;
            case 6:
                C63010eb ebVar = f152329f;
                if (ebVar == null) {
                    synchronized (C57062ad.class) {
                        ebVar = f152329f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152328c);
                            f152329f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
