package com.google.android.apps.gsa.shared.monet.p7070b.p7088g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.g.e */
/* compiled from: PG */
public final class C90240e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C90240e f252086e;

    /* renamed from: f */
    private static volatile C63010eb f252087f;

    /* renamed from: a */
    public int f252088a;

    /* renamed from: b */
    public C90238c f252089b;

    /* renamed from: c */
    public String f252090c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f252091d = BuildConfig.FLAVOR;

    static {
        C90240e eVar = new C90240e();
        f252086e = eVar;
        C62942bv.registerDefaultInstance(C90240e.class, eVar);
    }

    private C90240e() {
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
                return newMessageInfo(f252086e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C90240e();
            case 4:
                return new C90239d();
            case 5:
                return f252086e;
            case 6:
                C63010eb ebVar = f252087f;
                if (ebVar == null) {
                    synchronized (C90240e.class) {
                        ebVar = f252087f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252086e);
                            f252087f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
