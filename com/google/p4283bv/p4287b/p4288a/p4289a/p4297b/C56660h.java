package com.google.p4283bv.p4287b.p4288a.p4289a.p4297b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.b.h */
/* compiled from: PG */
public final class C56660h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56660h f151256c;

    /* renamed from: d */
    private static volatile C63010eb f151257d;

    /* renamed from: a */
    public int f151258a;

    /* renamed from: b */
    public boolean f151259b;

    static {
        C56660h hVar = new C56660h();
        f151256c = hVar;
        C62942bv.registerDefaultInstance(C56660h.class, hVar);
    }

    private C56660h() {
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
                return newMessageInfo(f151256c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56660h();
            case 4:
                return new C56659g();
            case 5:
                return f151256c;
            case 6:
                C63010eb ebVar = f151257d;
                if (ebVar == null) {
                    synchronized (C56660h.class) {
                        ebVar = f151257d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151256c);
                            f151257d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
