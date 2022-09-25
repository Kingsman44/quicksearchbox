package com.google.android.apps.gsa.speech.p7277g.p7278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.speech.g.a.b */
/* compiled from: PG */
public final class C92295b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C92295b f257370d;

    /* renamed from: e */
    private static volatile C63010eb f257371e;

    /* renamed from: a */
    public int f257372a;

    /* renamed from: b */
    public String f257373b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f257374c = BuildConfig.FLAVOR;

    static {
        C92295b bVar = new C92295b();
        f257370d = bVar;
        C62942bv.registerDefaultInstance(C92295b.class, bVar);
    }

    private C92295b() {
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
                return newMessageInfo(f257370d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C92295b();
            case 4:
                return new C92294a();
            case 5:
                return f257370d;
            case 6:
                C63010eb ebVar = f257371e;
                if (ebVar == null) {
                    synchronized (C92295b.class) {
                        ebVar = f257371e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f257370d);
                            f257371e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
