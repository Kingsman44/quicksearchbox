package com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.n.a.a.a.d */
/* compiled from: PG */
public final class C64959d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64959d f175916e;

    /* renamed from: f */
    private static volatile C63010eb f175917f;

    /* renamed from: a */
    public int f175918a;

    /* renamed from: b */
    public String f175919b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f175920c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f175921d = BuildConfig.FLAVOR;

    static {
        C64959d dVar = new C64959d();
        f175916e = dVar;
        C62942bv.registerDefaultInstance(C64959d.class, dVar);
    }

    private C64959d() {
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
                return newMessageInfo(f175916e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64959d();
            case 4:
                return new C64958c();
            case 5:
                return f175916e;
            case 6:
                C63010eb ebVar = f175917f;
                if (ebVar == null) {
                    synchronized (C64959d.class) {
                        ebVar = f175917f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175916e);
                            f175917f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
