package com.google.p4283bv.p4354e.p4356b;

import com.google.common.p4552o.aqm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.f */
/* compiled from: PG */
public final class C57346f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57346f f153208a;

    /* renamed from: b */
    public static final C62940bt f153209b = C62942bv.newSingularGeneratedExtension(aqm.f159760n, C57057b.f152311e, C57057b.f152311e, (C62958ce) null, 4368298, C63066gd.MESSAGE, C57057b.class);

    /* renamed from: c */
    private static volatile C63010eb f153210c;

    static {
        C57346f fVar = new C57346f();
        f153208a = fVar;
        C62942bv.registerDefaultInstance(C57346f.class, fVar);
    }

    private C57346f() {
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
                return newMessageInfo(f153208a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57346f();
            case 4:
                return new C57345e();
            case 5:
                return f153208a;
            case 6:
                C63010eb ebVar = f153210c;
                if (ebVar == null) {
                    synchronized (C57346f.class) {
                        ebVar = f153210c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153208a);
                            f153210c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
