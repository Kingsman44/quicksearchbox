package com.google.protos.p4985f.p5030q.p5032b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.r */
/* compiled from: PG */
public final class C65071r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65071r f176208e;

    /* renamed from: f */
    private static volatile C63010eb f176209f;

    /* renamed from: a */
    public int f176210a;

    /* renamed from: b */
    public int f176211b = 0;

    /* renamed from: c */
    public Object f176212c;

    /* renamed from: d */
    public String f176213d = BuildConfig.FLAVOR;

    static {
        C65071r rVar = new C65071r();
        f176208e = rVar;
        C62942bv.registerDefaultInstance(C65071r.class, rVar);
    }

    private C65071r() {
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
                return newMessageInfo(f176208e, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0004်\u0000\u0005ဈ\u0000\u0006ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C65066m.class, C65070q.class, "d", C65068o.class});
            case 3:
                return new C65071r();
            case 4:
                return new C65064k();
            case 5:
                return f176208e;
            case 6:
                C63010eb ebVar = f176209f;
                if (ebVar == null) {
                    synchronized (C65071r.class) {
                        ebVar = f176209f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176208e);
                            f176209f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
