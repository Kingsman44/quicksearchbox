package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56612d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.q */
/* compiled from: PG */
public final class C57186q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57186q f152670c;

    /* renamed from: d */
    private static volatile C63010eb f152671d;

    /* renamed from: a */
    public int f152672a;

    /* renamed from: b */
    public C56612d f152673b;

    static {
        C57186q qVar = new C57186q();
        f152670c = qVar;
        C62942bv.registerDefaultInstance(C57186q.class, qVar);
    }

    private C57186q() {
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
                return newMessageInfo(f152670c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57186q();
            case 4:
                return new C57185p();
            case 5:
                return f152670c;
            case 6:
                C63010eb ebVar = f152671d;
                if (ebVar == null) {
                    synchronized (C57186q.class) {
                        ebVar = f152671d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152670c);
                            f152671d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
