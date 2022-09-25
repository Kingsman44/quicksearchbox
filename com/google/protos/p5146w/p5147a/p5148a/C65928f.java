package com.google.protos.p5146w.p5147a.p5148a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.w.a.a.f */
/* compiled from: PG */
public final class C65928f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65928f f179293f;

    /* renamed from: g */
    private static volatile C63010eb f179294g;

    /* renamed from: a */
    public int f179295a;

    /* renamed from: b */
    public String f179296b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f179297c;

    /* renamed from: d */
    public int f179298d;

    /* renamed from: e */
    public String f179299e = BuildConfig.FLAVOR;

    static {
        C65928f fVar = new C65928f();
        f179293f = fVar;
        C62942bv.registerDefaultInstance(C65928f.class, fVar);
    }

    private C65928f() {
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
                return newMessageInfo(f179293f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C65928f();
            case 4:
                return new C65927e();
            case 5:
                return f179293f;
            case 6:
                C63010eb ebVar = f179294g;
                if (ebVar == null) {
                    synchronized (C65928f.class) {
                        ebVar = f179294g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179293f);
                            f179294g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
