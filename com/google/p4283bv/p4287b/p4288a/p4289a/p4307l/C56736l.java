package com.google.p4283bv.p4287b.p4288a.p4289a.p4307l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.l.l */
/* compiled from: PG */
public final class C56736l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56736l f151425c;

    /* renamed from: d */
    private static volatile C63010eb f151426d;

    /* renamed from: a */
    public int f151427a;

    /* renamed from: b */
    public C56734j f151428b;

    static {
        C56736l lVar = new C56736l();
        f151425c = lVar;
        C62942bv.registerDefaultInstance(C56736l.class, lVar);
    }

    private C56736l() {
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
                return newMessageInfo(f151425c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56736l();
            case 4:
                return new C56735k();
            case 5:
                return f151425c;
            case 6:
                C63010eb ebVar = f151426d;
                if (ebVar == null) {
                    synchronized (C56736l.class) {
                        ebVar = f151426d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151425c);
                            f151426d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
