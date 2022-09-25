package com.google.protos.p4816ai.p4820d.p4834h;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.h.b */
/* compiled from: PG */
public final class C63273b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63273b f171005g;

    /* renamed from: h */
    private static volatile C63010eb f171006h;

    /* renamed from: a */
    public int f171007a;

    /* renamed from: b */
    public int f171008b;

    /* renamed from: c */
    public String f171009c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f171010d;

    /* renamed from: e */
    public String f171011e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f171012f = BuildConfig.FLAVOR;

    static {
        C63273b bVar = new C63273b();
        f171005g = bVar;
        C62942bv.registerDefaultInstance(C63273b.class, bVar);
    }

    private C63273b() {
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
                return newMessageInfo(f171005g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C57695ab.m88521b(), C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C63273b();
            case 4:
                return new C63272a();
            case 5:
                return f171005g;
            case 6:
                C63010eb ebVar = f171006h;
                if (ebVar == null) {
                    synchronized (C63273b.class) {
                        ebVar = f171006h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171005g);
                            f171006h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
