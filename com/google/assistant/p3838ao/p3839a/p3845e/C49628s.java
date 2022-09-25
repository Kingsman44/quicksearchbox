package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.s */
/* compiled from: PG */
public final class C49628s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49628s f128078d;

    /* renamed from: g */
    private static volatile C63010eb f128079g;

    /* renamed from: a */
    public int f128080a = 0;

    /* renamed from: b */
    public Object f128081b;

    /* renamed from: c */
    public C49538av f128082c;

    /* renamed from: e */
    private int f128083e;

    /* renamed from: f */
    private byte f128084f = 2;

    static {
        C49628s sVar = new C49628s();
        f128078d = sVar;
        C62942bv.registerDefaultInstance(C49628s.class, sVar);
    }

    private C49628s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128084f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128084f = b;
                return null;
            case 2:
                return newMessageInfo(f128078d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C49626q.class, C49626q.class});
            case 3:
                return new C49628s();
            case 4:
                return new C49627r();
            case 5:
                return f128078d;
            case 6:
                C63010eb ebVar = f128079g;
                if (ebVar == null) {
                    synchronized (C49628s.class) {
                        ebVar = f128079g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128078d);
                            f128079g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
