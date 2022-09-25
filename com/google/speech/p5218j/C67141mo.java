package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.mo */
/* compiled from: PG */
public final class C67141mo extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67141mo f182503b;

    /* renamed from: c */
    public static final C62940bt f182504c;

    /* renamed from: e */
    private static volatile C63010eb f182505e;

    /* renamed from: a */
    public int f182506a;

    /* renamed from: d */
    private int f182507d;

    static {
        C67141mo moVar = new C67141mo();
        f182503b = moVar;
        C62942bv.registerDefaultInstance(C67141mo.class, moVar);
        f182504c = C62942bv.newSingularGeneratedExtension(C67105lf.f182433a, moVar, moVar, (C62958ce) null, 396882605, C63066gd.MESSAGE, C67141mo.class);
    }

    private C67141mo() {
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
                return newMessageInfo(f182503b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", C67160ng.f182557a});
            case 3:
                return new C67141mo();
            case 4:
                return new C67140mn();
            case 5:
                return f182503b;
            case 6:
                C63010eb ebVar = f182505e;
                if (ebVar == null) {
                    synchronized (C67141mo.class) {
                        ebVar = f182505e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182503b);
                            f182505e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
