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

/* renamed from: com.google.speech.j.la */
/* compiled from: PG */
public final class C67100la extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67100la f182420e;

    /* renamed from: f */
    public static final C62940bt f182421f;

    /* renamed from: g */
    private static volatile C63010eb f182422g;

    /* renamed from: a */
    public int f182423a;

    /* renamed from: b */
    public long f182424b;

    /* renamed from: c */
    public int f182425c;

    /* renamed from: d */
    public long f182426d;

    static {
        C67100la laVar = new C67100la();
        f182420e = laVar;
        C62942bv.registerDefaultInstance(C67100la.class, laVar);
        f182421f = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, laVar, laVar, (C62958ce) null, 453155936, C63066gd.MESSAGE, C67100la.class);
    }

    private C67100la() {
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
                return newMessageInfo(f182420e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, C67098kz.m97423b(), "d"});
            case 3:
                return new C67100la();
            case 4:
                return new C67096kx();
            case 5:
                return f182420e;
            case 6:
                C63010eb ebVar = f182422g;
                if (ebVar == null) {
                    synchronized (C67100la.class) {
                        ebVar = f182422g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182420e);
                            f182422g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
