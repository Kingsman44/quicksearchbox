package com.google.assistant.p3879aw.p3881b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.ad */
/* compiled from: PG */
public final class C50598ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50598ad f131652c;

    /* renamed from: d */
    private static volatile C63010eb f131653d;

    /* renamed from: a */
    public int f131654a;

    /* renamed from: b */
    public C50623z f131655b;

    static {
        C50598ad adVar = new C50598ad();
        f131652c = adVar;
        C62942bv.registerDefaultInstance(C50598ad.class, adVar);
    }

    private C50598ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f131652c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0004", new Object[]{"a", "b"});
            case 3:
                return new C50598ad();
            case 4:
                return new C50597ac();
            case 5:
                return f131652c;
            case 6:
                C63010eb ebVar = f131653d;
                if (ebVar == null) {
                    synchronized (C50598ad.class) {
                        ebVar = f131653d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131652c);
                            f131653d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
