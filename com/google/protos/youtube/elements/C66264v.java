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

/* renamed from: com.google.protos.youtube.elements.v */
/* compiled from: PG */
public final class C66264v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66264v f180201d;

    /* renamed from: e */
    public static final C62940bt f180202e;

    /* renamed from: f */
    private static volatile C63010eb f180203f;

    /* renamed from: a */
    public int f180204a;

    /* renamed from: b */
    public C66206dt f180205b;

    /* renamed from: c */
    public int f180206c;

    static {
        C66264v vVar = new C66264v();
        f180201d = vVar;
        C62942bv.registerDefaultInstance(C66264v.class, vVar);
        f180202e = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, vVar, vVar, (C62958ce) null, 198239242, C63066gd.MESSAGE, C66264v.class);
    }

    private C66264v() {
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
                return newMessageInfo(f180201d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66264v();
            case 4:
                return new C66263u();
            case 5:
                return f180201d;
            case 6:
                C63010eb ebVar = f180203f;
                if (ebVar == null) {
                    synchronized (C66264v.class) {
                        ebVar = f180203f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180201d);
                            f180203f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
