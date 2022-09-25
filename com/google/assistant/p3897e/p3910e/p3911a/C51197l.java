package com.google.assistant.p3897e.p3910e.p3911a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.assistant.e.e.a.l */
/* compiled from: PG */
public final class C51197l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51197l f133282e;

    /* renamed from: f */
    public static final C62940bt f133283f;

    /* renamed from: g */
    private static volatile C63010eb f133284g;

    /* renamed from: a */
    public int f133285a;

    /* renamed from: b */
    public String f133286b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f133287c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f133288d;

    static {
        C51197l lVar = new C51197l();
        f133282e = lVar;
        C62942bv.registerDefaultInstance(C51197l.class, lVar);
        f133283f = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, lVar, lVar, (C62958ce) null, 179759477, C63066gd.MESSAGE, C51197l.class);
    }

    private C51197l() {
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
                return newMessageInfo(f133282e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51197l();
            case 4:
                return new C51196k();
            case 5:
                return f133282e;
            case 6:
                C63010eb ebVar = f133284g;
                if (ebVar == null) {
                    synchronized (C51197l.class) {
                        ebVar = f133284g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133282e);
                            f133284g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
