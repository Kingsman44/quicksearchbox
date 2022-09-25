package com.google.speech.p5224k.p5225a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.speech.k.a.ad */
/* compiled from: PG */
public final class C67186ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67186ad f182610e;

    /* renamed from: f */
    public static final C62940bt f182611f;

    /* renamed from: h */
    private static volatile C63010eb f182612h;

    /* renamed from: a */
    public int f182613a;

    /* renamed from: b */
    public C63088z f182614b = C63088z.f170246b;

    /* renamed from: c */
    public boolean f182615c;

    /* renamed from: d */
    public C67194al f182616d;

    /* renamed from: g */
    private byte f182617g = 2;

    static {
        C67186ad adVar = new C67186ad();
        f182610e = adVar;
        C62942bv.registerDefaultInstance(C67186ad.class, adVar);
        f182611f = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, adVar, adVar, (C62958ce) null, 28599812, C63066gd.MESSAGE, C67186ad.class);
    }

    private C67186ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182617g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182617g = b;
                return null;
            case 2:
                return newMessageInfo(f182610e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67186ad();
            case 4:
                return new C67185ac();
            case 5:
                return f182610e;
            case 6:
                C63010eb ebVar = f182612h;
                if (ebVar == null) {
                    synchronized (C67186ad.class) {
                        ebVar = f182612h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182610e);
                            f182612h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
