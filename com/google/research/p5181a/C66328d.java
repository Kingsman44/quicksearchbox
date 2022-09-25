package com.google.research.p5181a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.d */
/* compiled from: PG */
public final class C66328d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66328d f180351e;

    /* renamed from: g */
    private static volatile C63010eb f180352g;

    /* renamed from: a */
    public long f180353a;

    /* renamed from: b */
    public float f180354b;

    /* renamed from: c */
    public float f180355c;

    /* renamed from: d */
    public float f180356d;

    /* renamed from: f */
    private int f180357f;

    static {
        C66328d dVar = new C66328d();
        f180351e = dVar;
        C62942bv.registerDefaultInstance(C66328d.class, dVar);
    }

    private C66328d() {
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
                return newMessageInfo(f180351e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66328d();
            case 4:
                return new C66309c();
            case 5:
                return f180351e;
            case 6:
                C63010eb ebVar = f180352g;
                if (ebVar == null) {
                    synchronized (C66328d.class) {
                        ebVar = f180352g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180351e);
                            f180352g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
