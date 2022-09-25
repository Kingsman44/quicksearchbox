package com.google.android.apps.gsa.assist;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.ay */
/* compiled from: PG */
public final class C9354ay extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9354ay f32484e;

    /* renamed from: f */
    private static volatile C63010eb f32485f;

    /* renamed from: a */
    public int f32486a;

    /* renamed from: b */
    public int f32487b;

    /* renamed from: c */
    public int f32488c;

    /* renamed from: d */
    public int f32489d;

    static {
        C9354ay ayVar = new C9354ay();
        f32484e = ayVar;
        C62942bv.registerDefaultInstance(C9354ay.class, ayVar);
    }

    private C9354ay() {
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
                return newMessageInfo(f32484e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9354ay();
            case 4:
                return new C9353ax();
            case 5:
                return f32484e;
            case 6:
                C63010eb ebVar = f32485f;
                if (ebVar == null) {
                    synchronized (C9354ay.class) {
                        ebVar = f32485f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32484e);
                            f32485f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
