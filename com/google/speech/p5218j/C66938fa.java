package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.fa */
/* compiled from: PG */
public final class C66938fa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66938fa f181943e;

    /* renamed from: f */
    public static final C62940bt f181944f;

    /* renamed from: g */
    private static volatile C63010eb f181945g;

    /* renamed from: a */
    public int f181946a;

    /* renamed from: b */
    public int f181947b = 0;

    /* renamed from: c */
    public Object f181948c;

    /* renamed from: d */
    public int f181949d = 1;

    static {
        C66938fa faVar = new C66938fa();
        f181943e = faVar;
        C62942bv.registerDefaultInstance(C66938fa.class, faVar);
        f181944f = C62942bv.newSingularGeneratedExtension(C67105lf.f182433a, faVar, faVar, (C62958ce) null, 328836685, C63066gd.MESSAGE, C66938fa.class);
    }

    private C66938fa() {
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
                return newMessageInfo(f181943e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ဿ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C67176u.f182594a, C67171p.class, C67177v.f182595a});
            case 3:
                return new C66938fa();
            case 4:
                return new C66936ez();
            case 5:
                return f181943e;
            case 6:
                C63010eb ebVar = f181945g;
                if (ebVar == null) {
                    synchronized (C66938fa.class) {
                        ebVar = f181945g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181943e);
                            f181945g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
