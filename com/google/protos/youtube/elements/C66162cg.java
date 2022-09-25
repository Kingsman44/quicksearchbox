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

/* renamed from: com.google.protos.youtube.elements.cg */
/* compiled from: PG */
public final class C66162cg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66162cg f179907f;

    /* renamed from: g */
    public static final C62940bt f179908g;

    /* renamed from: i */
    private static volatile C63010eb f179909i;

    /* renamed from: a */
    public int f179910a;

    /* renamed from: b */
    public C66182d f179911b;

    /* renamed from: c */
    public int f179912c;

    /* renamed from: d */
    public boolean f179913d;

    /* renamed from: e */
    public int f179914e;

    /* renamed from: h */
    private byte f179915h = 2;

    static {
        C66162cg cgVar = new C66162cg();
        f179907f = cgVar;
        C62942bv.registerDefaultInstance(C66162cg.class, cgVar);
        f179908g = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, cgVar, cgVar, (C62958ce) null, 194116769, C63066gd.MESSAGE, C66162cg.class);
    }

    private C66162cg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179915h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179915h = b;
                return null;
            case 2:
                return newMessageInfo(f179907f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0004ဇ\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66162cg();
            case 4:
                return new C66161cf();
            case 5:
                return f179907f;
            case 6:
                C63010eb ebVar = f179909i;
                if (ebVar == null) {
                    synchronized (C66162cg.class) {
                        ebVar = f179909i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179907f);
                            f179909i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
