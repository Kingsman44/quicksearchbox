package com.google.p4283bv.p4287b.p4288a.p4289a.p4290a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.a.j */
/* compiled from: PG */
public final class C56618j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56618j f151169c;

    /* renamed from: d */
    private static volatile C63010eb f151170d;

    /* renamed from: a */
    public int f151171a;

    /* renamed from: b */
    public C56612d f151172b;

    static {
        C56618j jVar = new C56618j();
        f151169c = jVar;
        C62942bv.registerDefaultInstance(C56618j.class, jVar);
    }

    private C56618j() {
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
                return newMessageInfo(f151169c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56618j();
            case 4:
                return new C56617i();
            case 5:
                return f151169c;
            case 6:
                C63010eb ebVar = f151170d;
                if (ebVar == null) {
                    synchronized (C56618j.class) {
                        ebVar = f151170d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151169c);
                            f151170d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
