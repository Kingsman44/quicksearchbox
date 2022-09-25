package com.google.p5234t;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.t.c */
/* compiled from: PG */
public final class C67481c extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C67481c f183407g;

    /* renamed from: h */
    private static volatile C63010eb f183408h;

    /* renamed from: a */
    public int f183409a;

    /* renamed from: b */
    public String f183410b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f183411c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f183412d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f183413e;

    /* renamed from: f */
    public String f183414f = BuildConfig.FLAVOR;

    static {
        C67481c cVar = new C67481c();
        f183407g = cVar;
        C62942bv.registerDefaultInstance(C67481c.class, cVar);
    }

    private C67481c() {
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
                return newMessageInfo(f183407g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0003\u0004ဈ\u0004\u0007ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C67480b.f183406a, C10662f.f35572a, "d"});
            case 3:
                return new C67481c();
            case 4:
                return new C67479a();
            case 5:
                return f183407g;
            case 6:
                C63010eb ebVar = f183408h;
                if (ebVar == null) {
                    synchronized (C67481c.class) {
                        ebVar = f183408h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183407g);
                            f183408h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
