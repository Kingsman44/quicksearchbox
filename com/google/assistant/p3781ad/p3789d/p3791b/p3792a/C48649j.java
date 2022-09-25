package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.j */
/* compiled from: PG */
public final class C48649j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48649j f125734d;

    /* renamed from: e */
    private static volatile C63010eb f125735e;

    /* renamed from: a */
    public int f125736a;

    /* renamed from: b */
    public String f125737b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f125738c = BuildConfig.FLAVOR;

    static {
        C48649j jVar = new C48649j();
        f125734d = jVar;
        C62942bv.registerDefaultInstance(C48649j.class, jVar);
    }

    private C48649j() {
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
                return newMessageInfo(f125734d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48649j();
            case 4:
                return new C48648i();
            case 5:
                return f125734d;
            case 6:
                C63010eb ebVar = f125735e;
                if (ebVar == null) {
                    synchronized (C48649j.class) {
                        ebVar = f125735e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125734d);
                            f125735e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
