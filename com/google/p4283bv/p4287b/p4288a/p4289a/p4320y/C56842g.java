package com.google.p4283bv.p4287b.p4288a.p4289a.p4320y;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.y.g */
/* compiled from: PG */
public final class C56842g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56842g f151655c;

    /* renamed from: d */
    private static volatile C63010eb f151656d;

    /* renamed from: a */
    public int f151657a;

    /* renamed from: b */
    public int f151658b;

    static {
        C56842g gVar = new C56842g();
        f151655c = gVar;
        C62942bv.registerDefaultInstance(C56842g.class, gVar);
    }

    private C56842g() {
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
                return newMessageInfo(f151655c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C56838c.f151647a});
            case 3:
                return new C56842g();
            case 4:
                return new C56841f();
            case 5:
                return f151655c;
            case 6:
                C63010eb ebVar = f151656d;
                if (ebVar == null) {
                    synchronized (C56842g.class) {
                        ebVar = f151656d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151655c);
                            f151656d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
