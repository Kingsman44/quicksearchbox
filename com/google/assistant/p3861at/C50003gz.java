package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.gz */
/* compiled from: PG */
public final class C50003gz extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50003gz f129981g;

    /* renamed from: h */
    private static volatile C63010eb f129982h;

    /* renamed from: a */
    public int f129983a;

    /* renamed from: b */
    public String f129984b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129985c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f129986d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f129987e;

    /* renamed from: f */
    public boolean f129988f;

    static {
        C50003gz gzVar = new C50003gz();
        f129981g = gzVar;
        C62942bv.registerDefaultInstance(C50003gz.class, gzVar);
    }

    private C50003gz() {
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
                return newMessageInfo(f129981g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C49875cf.m85756b(), C10662f.f35572a});
            case 3:
                return new C50003gz();
            case 4:
                return new C50002gy();
            case 5:
                return f129981g;
            case 6:
                C63010eb ebVar = f129982h;
                if (ebVar == null) {
                    synchronized (C50003gz.class) {
                        ebVar = f129982h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129981g);
                            f129982h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
