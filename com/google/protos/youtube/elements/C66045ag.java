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

/* renamed from: com.google.protos.youtube.elements.ag */
/* compiled from: PG */
public final class C66045ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66045ag f179609e;

    /* renamed from: f */
    public static final C62940bt f179610f;

    /* renamed from: g */
    private static volatile C63010eb f179611g;

    /* renamed from: a */
    public int f179612a;

    /* renamed from: b */
    public C66055aq f179613b;

    /* renamed from: c */
    public C66055aq f179614c;

    /* renamed from: d */
    public C66055aq f179615d;

    static {
        C66045ag agVar = new C66045ag();
        f179609e = agVar;
        C62942bv.registerDefaultInstance(C66045ag.class, agVar);
        f179610f = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, agVar, agVar, (C62958ce) null, 455145426, C63066gd.MESSAGE, C66045ag.class);
    }

    private C66045ag() {
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
                return newMessageInfo(f179609e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66045ag();
            case 4:
                return new C66044af();
            case 5:
                return f179609e;
            case 6:
                C63010eb ebVar = f179611g;
                if (ebVar == null) {
                    synchronized (C66045ag.class) {
                        ebVar = f179611g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179609e);
                            f179611g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
