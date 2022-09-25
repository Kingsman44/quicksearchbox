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

/* renamed from: com.google.protos.youtube.elements.cc */
/* compiled from: PG */
public final class C66158cc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66158cc f179894d;

    /* renamed from: e */
    public static final C62940bt f179895e;

    /* renamed from: f */
    private static volatile C63010eb f179896f;

    /* renamed from: a */
    public int f179897a;

    /* renamed from: b */
    public int f179898b;

    /* renamed from: c */
    public int f179899c;

    static {
        C66158cc ccVar = new C66158cc();
        f179894d = ccVar;
        C62942bv.registerDefaultInstance(C66158cc.class, ccVar);
        f179895e = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, ccVar, ccVar, (C62958ce) null, 449848976, C63066gd.MESSAGE, C66158cc.class);
    }

    private C66158cc() {
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
                return newMessageInfo(f179894d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66158cc();
            case 4:
                return new C66157cb();
            case 5:
                return f179894d;
            case 6:
                C63010eb ebVar = f179896f;
                if (ebVar == null) {
                    synchronized (C66158cc.class) {
                        ebVar = f179896f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179894d);
                            f179896f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
