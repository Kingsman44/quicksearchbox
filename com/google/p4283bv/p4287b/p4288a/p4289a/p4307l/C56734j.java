package com.google.p4283bv.p4287b.p4288a.p4289a.p4307l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.l.j */
/* compiled from: PG */
public final class C56734j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56734j f151421c;

    /* renamed from: d */
    private static volatile C63010eb f151422d;

    /* renamed from: a */
    public int f151423a;

    /* renamed from: b */
    public int f151424b;

    static {
        C56734j jVar = new C56734j();
        f151421c = jVar;
        C62942bv.registerDefaultInstance(C56734j.class, jVar);
    }

    private C56734j() {
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
                return newMessageInfo(f151421c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဌ\u0000", new Object[]{"a", "b", C56737m.f151429a});
            case 3:
                return new C56734j();
            case 4:
                return new C56733i();
            case 5:
                return f151421c;
            case 6:
                C63010eb ebVar = f151422d;
                if (ebVar == null) {
                    synchronized (C56734j.class) {
                        ebVar = f151422d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151421c);
                            f151422d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
