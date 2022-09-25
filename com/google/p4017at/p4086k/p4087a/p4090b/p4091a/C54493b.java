package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.b */
/* compiled from: PG */
public final class C54493b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54493b f143074f;

    /* renamed from: g */
    private static volatile C63010eb f143075g;

    /* renamed from: a */
    public float f143076a;

    /* renamed from: b */
    public float f143077b;

    /* renamed from: c */
    public float f143078c;

    /* renamed from: d */
    public long f143079d;

    /* renamed from: e */
    public boolean f143080e;

    static {
        C54493b bVar = new C54493b();
        f143074f = bVar;
        C62942bv.registerDefaultInstance(C54493b.class, bVar);
    }

    private C54493b() {
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
                return newMessageInfo(f143074f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0005\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54493b();
            case 4:
                return new C54490a();
            case 5:
                return f143074f;
            case 6:
                C63010eb ebVar = f143075g;
                if (ebVar == null) {
                    synchronized (C54493b.class) {
                        ebVar = f143075g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143074f);
                            f143075g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
