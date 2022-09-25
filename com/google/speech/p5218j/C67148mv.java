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

/* renamed from: com.google.speech.j.mv */
/* compiled from: PG */
public final class C67148mv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67148mv f182518d;

    /* renamed from: e */
    public static final C62940bt f182519e;

    /* renamed from: f */
    private static volatile C63010eb f182520f;

    /* renamed from: a */
    public int f182521a;

    /* renamed from: b */
    public int f182522b = 1;

    /* renamed from: c */
    public int f182523c = 1;

    static {
        C67148mv mvVar = new C67148mv();
        f182518d = mvVar;
        C62942bv.registerDefaultInstance(C67148mv.class, mvVar);
        f182519e = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, mvVar, mvVar, (C62958ce) null, 327888194, C63066gd.MESSAGE, C67148mv.class);
    }

    private C67148mv() {
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
                return newMessageInfo(f182518d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C67146mt.f182517a, C45240c.f118157a, C67154na.f182547a});
            case 3:
                return new C67148mv();
            case 4:
                return new C67147mu();
            case 5:
                return f182518d;
            case 6:
                C63010eb ebVar = f182520f;
                if (ebVar == null) {
                    synchronized (C67148mv.class) {
                        ebVar = f182520f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182518d);
                            f182520f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
