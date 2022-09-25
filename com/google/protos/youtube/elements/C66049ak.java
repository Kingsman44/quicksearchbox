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

/* renamed from: com.google.protos.youtube.elements.ak */
/* compiled from: PG */
public final class C66049ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66049ak f179623e;

    /* renamed from: f */
    public static final C62940bt f179624f;

    /* renamed from: g */
    private static volatile C63010eb f179625g;

    /* renamed from: a */
    public int f179626a;

    /* renamed from: b */
    public C66043ae f179627b;

    /* renamed from: c */
    public C66043ae f179628c;

    /* renamed from: d */
    public C66206dt f179629d;

    static {
        C66049ak akVar = new C66049ak();
        f179623e = akVar;
        C62942bv.registerDefaultInstance(C66049ak.class, akVar);
        f179624f = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, akVar, akVar, (C62958ce) null, 461985397, C63066gd.MESSAGE, C66049ak.class);
    }

    private C66049ak() {
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
                return newMessageInfo(f179623e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66049ak();
            case 4:
                return new C66048aj();
            case 5:
                return f179623e;
            case 6:
                C63010eb ebVar = f179625g;
                if (ebVar == null) {
                    synchronized (C66049ak.class) {
                        ebVar = f179625g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179623e);
                            f179625g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
