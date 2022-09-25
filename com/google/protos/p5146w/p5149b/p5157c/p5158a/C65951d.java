package com.google.protos.p5146w.p5149b.p5157c.p5158a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;

/* renamed from: com.google.protos.w.b.c.a.d */
/* compiled from: PG */
public final class C65951d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65951d f179375b;

    /* renamed from: f */
    private static volatile C63010eb f179376f;

    /* renamed from: a */
    public String f179377a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f179378c;

    /* renamed from: d */
    private C65930h f179379d;

    /* renamed from: e */
    private byte f179380e = 2;

    static {
        C65951d dVar = new C65951d();
        f179375b = dVar;
        C62942bv.registerDefaultInstance(C65951d.class, dVar);
    }

    private C65951d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179380e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179380e = b;
                return null;
            case 2:
                return newMessageInfo(f179375b, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0005ᐉ\u0003", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C65951d();
            case 4:
                return new C65950c();
            case 5:
                return f179375b;
            case 6:
                C63010eb ebVar = f179376f;
                if (ebVar == null) {
                    synchronized (C65951d.class) {
                        ebVar = f179376f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179375b);
                            f179376f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
