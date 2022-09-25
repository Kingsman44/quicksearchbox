package com.google.protos.youtube.elements;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.dx */
/* compiled from: PG */
public final class C66210dx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66210dx f180043d;

    /* renamed from: e */
    public static final C62940bt f180044e;

    /* renamed from: g */
    private static volatile C63010eb f180045g;

    /* renamed from: a */
    public int f180046a;

    /* renamed from: b */
    public int f180047b;

    /* renamed from: c */
    public boolean f180048c = true;

    /* renamed from: f */
    private int f180049f;

    static {
        C66210dx dxVar = new C66210dx();
        f180043d = dxVar;
        C62942bv.registerDefaultInstance(C66210dx.class, dxVar);
        f180044e = C62942bv.newSingularGeneratedExtension(C66230eq.f180102a, dxVar, dxVar, (C62958ce) null, 188911708, C63066gd.MESSAGE, C66210dx.class);
    }

    private C66210dx() {
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
                return newMessageInfo(f180043d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a});
            case 3:
                return new C66210dx();
            case 4:
                return new C66209dw();
            case 5:
                return f180043d;
            case 6:
                C63010eb ebVar = f180045g;
                if (ebVar == null) {
                    synchronized (C66210dx.class) {
                        ebVar = f180045g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180043d);
                            f180045g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
