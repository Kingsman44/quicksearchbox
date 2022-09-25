package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.mk */
/* compiled from: PG */
public final class C67137mk extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C67137mk f182488g;

    /* renamed from: h */
    private static volatile C63010eb f182489h;

    /* renamed from: a */
    public int f182490a;

    /* renamed from: b */
    public int f182491b = 0;

    /* renamed from: c */
    public Object f182492c;

    /* renamed from: d */
    public int f182493d;

    /* renamed from: e */
    public String f182494e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f182495f = emptyProtobufList();

    static {
        C67137mk mkVar = new C67137mk();
        f182488g = mkVar;
        C62942bv.registerDefaultInstance(C67137mk.class, mkVar);
    }

    private C67137mk() {
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
                return newMessageInfo(f182488g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b\u0004်\u0000\u0005ွ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C67125lz.m97425b(), "e", C10662f.f35572a, C67171p.class});
            case 3:
                return new C67137mk();
            case 4:
                return new C67136mj();
            case 5:
                return f182488g;
            case 6:
                C63010eb ebVar = f182489h;
                if (ebVar == null) {
                    synchronized (C67137mk.class) {
                        ebVar = f182489h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182488g);
                            f182489h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
