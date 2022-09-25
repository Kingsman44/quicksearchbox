package com.google.p4283bv.p4287b.p4288a.p4289a.p4307l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.l.h */
/* compiled from: PG */
public final class C56732h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56732h f151417c;

    /* renamed from: d */
    private static volatile C63010eb f151418d;

    /* renamed from: a */
    public int f151419a;

    /* renamed from: b */
    public C56726b f151420b;

    static {
        C56732h hVar = new C56732h();
        f151417c = hVar;
        C62942bv.registerDefaultInstance(C56732h.class, hVar);
    }

    private C56732h() {
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
                return newMessageInfo(f151417c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56732h();
            case 4:
                return new C56731g();
            case 5:
                return f151417c;
            case 6:
                C63010eb ebVar = f151418d;
                if (ebVar == null) {
                    synchronized (C56732h.class) {
                        ebVar = f151418d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151417c);
                            f151418d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
