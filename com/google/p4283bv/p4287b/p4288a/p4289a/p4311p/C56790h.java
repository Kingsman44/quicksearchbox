package com.google.p4283bv.p4287b.p4288a.p4289a.p4311p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.p.h */
/* compiled from: PG */
public final class C56790h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56790h f151544c;

    /* renamed from: d */
    private static volatile C63010eb f151545d;

    /* renamed from: a */
    public int f151546a;

    /* renamed from: b */
    public int f151547b;

    static {
        C56790h hVar = new C56790h();
        f151544c = hVar;
        C62942bv.registerDefaultInstance(C56790h.class, hVar);
    }

    private C56790h() {
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
                return newMessageInfo(f151544c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56790h();
            case 4:
                return new C56789g();
            case 5:
                return f151544c;
            case 6:
                C63010eb ebVar = f151545d;
                if (ebVar == null) {
                    synchronized (C56790h.class) {
                        ebVar = f151545d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151544c);
                            f151545d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
