package com.google.p375ai.p378b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.kl */
/* compiled from: PG */
public final class C7801kl extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C7801kl f27272g;

    /* renamed from: h */
    private static volatile C63010eb f27273h;

    /* renamed from: a */
    public int f27274a;

    /* renamed from: b */
    public int f27275b;

    /* renamed from: c */
    public int f27276c;

    /* renamed from: d */
    public float f27277d;

    /* renamed from: e */
    public int f27278e;

    /* renamed from: f */
    public int f27279f;

    static {
        C7801kl klVar = new C7801kl();
        f27272g = klVar;
        C62942bv.registerDefaultInstance(C7801kl.class, klVar);
    }

    private C7801kl() {
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
                return newMessageInfo(f27272g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C7801kl();
            case 4:
                return new C7800kk();
            case 5:
                return f27272g;
            case 6:
                C63010eb ebVar = f27273h;
                if (ebVar == null) {
                    synchronized (C7801kl.class) {
                        ebVar = f27273h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27272g);
                            f27273h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
