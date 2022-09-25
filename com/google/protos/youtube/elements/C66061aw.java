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

/* renamed from: com.google.protos.youtube.elements.aw */
/* compiled from: PG */
public final class C66061aw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66061aw f179648e;

    /* renamed from: f */
    public static final C62940bt f179649f;

    /* renamed from: h */
    private static volatile C63010eb f179650h;

    /* renamed from: a */
    public int f179651a;

    /* renamed from: b */
    public C66232es f179652b;

    /* renamed from: c */
    public C66128bg f179653c;

    /* renamed from: d */
    public C66063ay f179654d;

    /* renamed from: g */
    private byte f179655g = 2;

    static {
        C66061aw awVar = new C66061aw();
        f179648e = awVar;
        C62942bv.registerDefaultInstance(C66061aw.class, awVar);
        f179649f = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, awVar, awVar, (C62958ce) null, 168777401, C63066gd.MESSAGE, C66061aw.class);
    }

    private C66061aw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179655g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179655g = b;
                return null;
            case 2:
                return newMessageInfo(f179648e, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003ᐉ\u0001\u0005ᐉ\u0003\u0006ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66061aw();
            case 4:
                return new C66060av();
            case 5:
                return f179648e;
            case 6:
                C63010eb ebVar = f179650h;
                if (ebVar == null) {
                    synchronized (C66061aw.class) {
                        ebVar = f179650h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179648e);
                            f179650h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
