package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ie */
/* compiled from: PG */
public final class C55163ie extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55163ie f145233d;

    /* renamed from: e */
    public static final C62940bt f145234e;

    /* renamed from: f */
    private static volatile C63010eb f145235f;

    /* renamed from: a */
    public int f145236a;

    /* renamed from: b */
    public int f145237b;

    /* renamed from: c */
    public int f145238c;

    static {
        C55163ie ieVar = new C55163ie();
        f145233d = ieVar;
        C62942bv.registerDefaultInstance(C55163ie.class, ieVar);
        f145234e = C62942bv.newSingularGeneratedExtension(C55235kw.f145426i, ieVar, ieVar, (C62958ce) null, 74080909, C63066gd.MESSAGE, C55163ie.class);
    }

    private C55163ie() {
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
                return newMessageInfo(f145233d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C55160ib.m87612b(), C45240c.f118157a, C55161ic.f145232a});
            case 3:
                return new C55163ie();
            case 4:
                return new C55157hz();
            case 5:
                return f145233d;
            case 6:
                C63010eb ebVar = f145235f;
                if (ebVar == null) {
                    synchronized (C55163ie.class) {
                        ebVar = f145235f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145233d);
                            f145235f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
