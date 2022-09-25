package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.f */
/* compiled from: PG */
public final class C128174f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C128174f f352598e;

    /* renamed from: f */
    private static volatile C63010eb f352599f;

    /* renamed from: a */
    public int f352600a;

    /* renamed from: b */
    public int f352601b = 1;

    /* renamed from: c */
    public C123733b f352602c;

    /* renamed from: d */
    public long f352603d;

    static {
        C128174f fVar = new C128174f();
        f352598e = fVar;
        C62942bv.registerDefaultInstance(C128174f.class, fVar);
    }

    private C128174f() {
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
                return newMessageInfo(f352598e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C128174f();
            case 4:
                return new C128173e();
            case 5:
                return f352598e;
            case 6:
                C63010eb ebVar = f352599f;
                if (ebVar == null) {
                    synchronized (C128174f.class) {
                        ebVar = f352599f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352598e);
                            f352599f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
