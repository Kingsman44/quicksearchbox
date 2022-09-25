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

/* renamed from: com.google.bv.e.b.b.d.n */
/* compiled from: PG */
public final class C57208n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57208n f152725a;

    /* renamed from: b */
    public static final C62940bt f152726b;

    /* renamed from: c */
    private static volatile C63010eb f152727c;

    static {
        C57208n nVar = new C57208n();
        f152725a = nVar;
        C62942bv.registerDefaultInstance(C57208n.class, nVar);
        f152726b = C62942bv.newSingularGeneratedExtension(C57235aq.f152787g, nVar, nVar, (C62958ce) null, 190812910, C63066gd.MESSAGE, C57208n.class);
    }

    private C57208n() {
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
                return newMessageInfo(f152725a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57208n();
            case 4:
                return new C57207m();
            case 5:
                return f152725a;
            case 6:
                C63010eb ebVar = f152727c;
                if (ebVar == null) {
                    synchronized (C57208n.class) {
                        ebVar = f152727c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152725a);
                            f152727c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
