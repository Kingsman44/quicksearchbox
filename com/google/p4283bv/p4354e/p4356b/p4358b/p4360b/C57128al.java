package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57175f;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.al */
/* compiled from: PG */
public final class C57128al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57128al f152495c;

    /* renamed from: d */
    private static volatile C63010eb f152496d;

    /* renamed from: a */
    public int f152497a = 0;

    /* renamed from: b */
    public Object f152498b;

    static {
        C57128al alVar = new C57128al();
        f152495c = alVar;
        C62942bv.registerDefaultInstance(C57128al.class, alVar);
    }

    private C57128al() {
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
                return newMessageInfo(f152495c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C57194y.class, C57175f.class});
            case 3:
                return new C57128al();
            case 4:
                return new C57127ak();
            case 5:
                return f152495c;
            case 6:
                C63010eb ebVar = f152496d;
                if (ebVar == null) {
                    synchronized (C57128al.class) {
                        ebVar = f152496d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152495c);
                            f152496d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
