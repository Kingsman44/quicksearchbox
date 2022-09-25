package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.speech.h.l */
/* compiled from: PG */
public final class C66678l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66678l f181384f;

    /* renamed from: g */
    public static final C62940bt f181385g;

    /* renamed from: h */
    public static final C62940bt f181386h;

    /* renamed from: i */
    private static volatile C63010eb f181387i;

    /* renamed from: a */
    public int f181388a;

    /* renamed from: b */
    public int f181389b;

    /* renamed from: c */
    public float f181390c;

    /* renamed from: d */
    public int f181391d = 1;

    /* renamed from: e */
    public int f181392e = -1;

    static {
        C66678l lVar = new C66678l();
        f181384f = lVar;
        C62942bv.registerDefaultInstance(C66678l.class, lVar);
        C66678l lVar2 = lVar;
        C66678l lVar3 = lVar;
        f181385g = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, lVar2, lVar3, (C62958ce) null, 293100, C63066gd.MESSAGE, C66678l.class);
        f181386h = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, lVar2, lVar3, (C62958ce) null, 65013010, C63066gd.MESSAGE, C66678l.class);
    }

    private C66678l() {
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
                return newMessageInfo(f181384f, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0000\u0002ခ\u0001\u0003ဌ\u0000\u0004င\u0002\bင\u0003", new Object[]{"a", C45240c.f118157a, "b", C67451at.m97474b(), "d", "e"});
            case 3:
                return new C66678l();
            case 4:
                return new C66677k();
            case 5:
                return f181384f;
            case 6:
                C63010eb ebVar = f181387i;
                if (ebVar == null) {
                    synchronized (C66678l.class) {
                        ebVar = f181387i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181384f);
                            f181387i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
