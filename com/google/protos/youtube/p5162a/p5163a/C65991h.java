package com.google.protos.youtube.p5162a.p5163a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.h */
/* compiled from: PG */
public final class C65991h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65991h f179478e;

    /* renamed from: f */
    private static volatile C63010eb f179479f;

    /* renamed from: a */
    public int f179480a;

    /* renamed from: b */
    public boolean f179481b;

    /* renamed from: c */
    public float f179482c = 1.0f;

    /* renamed from: d */
    public C65978ah f179483d;

    static {
        C65991h hVar = new C65991h();
        f179478e = hVar;
        C62942bv.registerDefaultInstance(C65991h.class, hVar);
    }

    private C65991h() {
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
                return newMessageInfo(f179478e, "\u0001\u0003\u0000\u0001\u0002\b\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0003ခ\u0001\bဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65991h();
            case 4:
                return new C65990g();
            case 5:
                return f179478e;
            case 6:
                C63010eb ebVar = f179479f;
                if (ebVar == null) {
                    synchronized (C65991h.class) {
                        ebVar = f179479f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179478e);
                            f179479f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
