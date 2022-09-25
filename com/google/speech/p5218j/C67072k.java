package com.google.speech.p5218j;

import com.google.android.libraries.search.p2904c.C37502di;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.k */
/* compiled from: PG */
public final class C67072k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67072k f182318d;

    /* renamed from: e */
    public static final C62940bt f182319e;

    /* renamed from: f */
    private static volatile C63010eb f182320f;

    /* renamed from: a */
    public int f182321a;

    /* renamed from: b */
    public int f182322b;

    /* renamed from: c */
    public C37502di f182323c;

    static {
        C67072k kVar = new C67072k();
        f182318d = kVar;
        C62942bv.registerDefaultInstance(C67072k.class, kVar);
        f182319e = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, kVar, kVar, (C62958ce) null, 401192911, C63066gd.MESSAGE, C67072k.class);
    }

    private C67072k() {
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
                return newMessageInfo(f182318d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C67160ng.f182557a, C45240c.f118157a});
            case 3:
                return new C67072k();
            case 4:
                return new C67045j();
            case 5:
                return f182318d;
            case 6:
                C63010eb ebVar = f182320f;
                if (ebVar == null) {
                    synchronized (C67072k.class) {
                        ebVar = f182320f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182318d);
                            f182320f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
