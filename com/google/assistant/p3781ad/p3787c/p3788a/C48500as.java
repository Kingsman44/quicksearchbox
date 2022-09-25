package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.as */
/* compiled from: PG */
public final class C48500as extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48500as f125283g;

    /* renamed from: h */
    private static volatile C63010eb f125284h;

    /* renamed from: a */
    public int f125285a;

    /* renamed from: b */
    public float f125286b;

    /* renamed from: c */
    public float f125287c;

    /* renamed from: d */
    public float f125288d;

    /* renamed from: e */
    public float f125289e;

    /* renamed from: f */
    public float f125290f;

    static {
        C48500as asVar = new C48500as();
        f125283g = asVar;
        C62942bv.registerDefaultInstance(C48500as.class, asVar);
    }

    private C48500as() {
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
                return newMessageInfo(f125283g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C48500as();
            case 4:
                return new C48499ar();
            case 5:
                return f125283g;
            case 6:
                C63010eb ebVar = f125284h;
                if (ebVar == null) {
                    synchronized (C48500as.class) {
                        ebVar = f125284h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125283g);
                            f125284h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
