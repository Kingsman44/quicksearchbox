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

/* renamed from: com.google.bv.e.b.b.d.v */
/* compiled from: PG */
public final class C57216v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57216v f152746a;

    /* renamed from: b */
    public static final C62940bt f152747b;

    /* renamed from: c */
    private static volatile C63010eb f152748c;

    static {
        C57216v vVar = new C57216v();
        f152746a = vVar;
        C62942bv.registerDefaultInstance(C57216v.class, vVar);
        f152747b = C62942bv.newSingularGeneratedExtension(C57235aq.f152787g, vVar, vVar, (C62958ce) null, 185431437, C63066gd.MESSAGE, C57216v.class);
    }

    private C57216v() {
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
                return newMessageInfo(f152746a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57216v();
            case 4:
                return new C57215u();
            case 5:
                return f152746a;
            case 6:
                C63010eb ebVar = f152748c;
                if (ebVar == null) {
                    synchronized (C57216v.class) {
                        ebVar = f152748c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152746a);
                            f152748c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
