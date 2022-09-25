package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.dc */
/* compiled from: PG */
public final class C66189dc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66189dc f179984d;

    /* renamed from: e */
    public static final C62940bt f179985e;

    /* renamed from: f */
    private static volatile C63010eb f179986f;

    /* renamed from: a */
    public int f179987a;

    /* renamed from: b */
    public C66143bv f179988b;

    /* renamed from: c */
    public C66143bv f179989c;

    static {
        C66189dc dcVar = new C66189dc();
        f179984d = dcVar;
        C62942bv.registerDefaultInstance(C66189dc.class, dcVar);
        f179985e = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, dcVar, dcVar, (C62958ce) null, 168772996, C63066gd.MESSAGE, C66189dc.class);
    }

    private C66189dc() {
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
                return newMessageInfo(f179984d, "\u0001\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0000\bဉ\u0007\tဉ\b", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66189dc();
            case 4:
                return new C66188db();
            case 5:
                return f179984d;
            case 6:
                C63010eb ebVar = f179986f;
                if (ebVar == null) {
                    synchronized (C66189dc.class) {
                        ebVar = f179986f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179984d);
                            f179986f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
