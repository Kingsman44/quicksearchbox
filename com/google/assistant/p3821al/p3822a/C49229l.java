package com.google.assistant.p3821al.p3822a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.al.a.l */
/* compiled from: PG */
public final class C49229l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49229l f127273c;

    /* renamed from: d */
    private static volatile C63010eb f127274d;

    /* renamed from: a */
    public int f127275a = 0;

    /* renamed from: b */
    public Object f127276b;

    static {
        C49229l lVar = new C49229l();
        f127273c = lVar;
        C62942bv.registerDefaultInstance(C49229l.class, lVar);
    }

    private C49229l() {
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
                return newMessageInfo(f127273c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002း\u0000", new Object[]{"b", "a"});
            case 3:
                return new C49229l();
            case 4:
                return new C49228k();
            case 5:
                return f127273c;
            case 6:
                C63010eb ebVar = f127274d;
                if (ebVar == null) {
                    synchronized (C49229l.class) {
                        ebVar = f127274d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127273c);
                            f127274d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
