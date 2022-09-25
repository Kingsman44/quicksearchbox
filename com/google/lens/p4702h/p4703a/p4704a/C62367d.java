package com.google.lens.p4702h.p4703a.p4704a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66198dl;

/* renamed from: com.google.lens.h.a.a.d */
/* compiled from: PG */
public final class C62367d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62367d f168365d;

    /* renamed from: e */
    public static final C62940bt f168366e;

    /* renamed from: f */
    private static volatile C63010eb f168367f;

    /* renamed from: a */
    public int f168368a;

    /* renamed from: b */
    public int f168369b;

    /* renamed from: c */
    public int f168370c;

    static {
        C62367d dVar = new C62367d();
        f168365d = dVar;
        C62942bv.registerDefaultInstance(C62367d.class, dVar);
        f168366e = C62942bv.newSingularGeneratedExtension(C66198dl.f180008b, dVar, dVar, (C62958ce) null, 258246946, C63066gd.MESSAGE, C62367d.class);
    }

    private C62367d() {
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
                return newMessageInfo(f168365d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62367d();
            case 4:
                return new C62366c();
            case 5:
                return f168365d;
            case 6:
                C63010eb ebVar = f168367f;
                if (ebVar == null) {
                    synchronized (C62367d.class) {
                        ebVar = f168367f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168365d);
                            f168367f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
