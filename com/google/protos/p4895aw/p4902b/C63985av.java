package com.google.protos.p4895aw.p4902b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.av */
/* compiled from: PG */
public final class C63985av extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63985av f173039g;

    /* renamed from: h */
    private static volatile C63010eb f173040h;

    /* renamed from: a */
    public int f173041a;

    /* renamed from: b */
    public int f173042b;

    /* renamed from: c */
    public C63088z f173043c = C63088z.f170246b;

    /* renamed from: d */
    public C63088z f173044d = C63088z.f170246b;

    /* renamed from: e */
    public long f173045e = -1;

    /* renamed from: f */
    public String f173046f = BuildConfig.FLAVOR;

    static {
        C63985av avVar = new C63985av();
        f173039g = avVar;
        C62942bv.registerDefaultInstance(C63985av.class, avVar);
    }

    private C63985av() {
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
                return newMessageInfo(f173039g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C63983at.f173038a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C63985av();
            case 4:
                return new C63982as();
            case 5:
                return f173039g;
            case 6:
                C63010eb ebVar = f173040h;
                if (ebVar == null) {
                    synchronized (C63985av.class) {
                        ebVar = f173040h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173039g);
                            f173040h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
