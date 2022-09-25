package com.google.android.apps.gsa.shared.logger.p7060f;

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
import com.google.speech.p5218j.C67160ng;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.android.apps.gsa.shared.logger.f.d */
/* compiled from: PG */
public final class C89915d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89915d f246343e;

    /* renamed from: f */
    public static final C62940bt f246344f;

    /* renamed from: g */
    private static volatile C63010eb f246345g;

    /* renamed from: a */
    public int f246346a;

    /* renamed from: b */
    public int f246347b;

    /* renamed from: c */
    public String f246348c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f246349d;

    static {
        C89915d dVar = new C89915d();
        f246343e = dVar;
        C62942bv.registerDefaultInstance(C89915d.class, dVar);
        f246344f = C62942bv.newSingularGeneratedExtension(C67438ag.f183256k, dVar, dVar, (C62958ce) null, 428870870, C63066gd.MESSAGE, C89915d.class);
    }

    private C89915d() {
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
                return newMessageInfo(f246343e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C67160ng.f182557a, C45240c.f118157a, "d", C89913b.f246342a});
            case 3:
                return new C89915d();
            case 4:
                return new C89912a();
            case 5:
                return f246343e;
            case 6:
                C63010eb ebVar = f246345g;
                if (ebVar == null) {
                    synchronized (C89915d.class) {
                        ebVar = f246345g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f246343e);
                            f246345g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
