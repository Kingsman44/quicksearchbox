package com.google.p4283bv.p4354e.p4356b.p4358b.p4364d;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57235aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.d.t */
/* compiled from: PG */
public final class C57214t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57214t f152741c;

    /* renamed from: d */
    public static final C62940bt f152742d;

    /* renamed from: e */
    private static volatile C63010eb f152743e;

    /* renamed from: a */
    public int f152744a = 0;

    /* renamed from: b */
    public Object f152745b;

    static {
        C57214t tVar = new C57214t();
        f152741c = tVar;
        C62942bv.registerDefaultInstance(C57214t.class, tVar);
        f152742d = C62942bv.newSingularGeneratedExtension(C57235aq.f152787g, tVar, tVar, (C62958ce) null, 312674248, C63066gd.MESSAGE, C57214t.class);
    }

    private C57214t() {
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
                return newMessageInfo(f152741c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C57214t();
            case 4:
                return new C57213s();
            case 5:
                return f152741c;
            case 6:
                C63010eb ebVar = f152743e;
                if (ebVar == null) {
                    synchronized (C57214t.class) {
                        ebVar = f152743e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152741c);
                            f152743e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
