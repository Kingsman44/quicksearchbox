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

/* renamed from: com.google.protos.youtube.elements.b */
/* compiled from: PG */
public final class C66065b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66065b f179659d;

    /* renamed from: e */
    public static final C62940bt f179660e;

    /* renamed from: f */
    private static volatile C63010eb f179661f;

    /* renamed from: a */
    public int f179662a;

    /* renamed from: b */
    public boolean f179663b;

    /* renamed from: c */
    public float f179664c;

    static {
        C66065b bVar = new C66065b();
        f179659d = bVar;
        C62942bv.registerDefaultInstance(C66065b.class, bVar);
        f179660e = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, bVar, bVar, (C62958ce) null, 196573526, C63066gd.MESSAGE, C66065b.class);
    }

    private C66065b() {
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
                return newMessageInfo(f179659d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66065b();
            case 4:
                return new C66012a();
            case 5:
                return f179659d;
            case 6:
                C63010eb ebVar = f179661f;
                if (ebVar == null) {
                    synchronized (C66065b.class) {
                        ebVar = f179661f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179659d);
                            f179661f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
