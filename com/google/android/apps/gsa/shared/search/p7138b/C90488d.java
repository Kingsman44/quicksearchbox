package com.google.android.apps.gsa.shared.search.p7138b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.shared.search.b.d */
/* compiled from: PG */
public final class C90488d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C90488d f252873g;

    /* renamed from: i */
    private static volatile C63010eb f252874i;

    /* renamed from: a */
    public int f252875a;

    /* renamed from: b */
    public C63088z f252876b = C63088z.f170246b;

    /* renamed from: c */
    public String f252877c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f252878d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C90491g f252879e;

    /* renamed from: f */
    public String f252880f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f252881h = 2;

    static {
        C90488d dVar = new C90488d();
        f252873g = dVar;
        C62942bv.registerDefaultInstance(C90488d.class, dVar);
    }

    private C90488d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f252881h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f252881h = b;
                return null;
            case 2:
                return newMessageInfo(f252873g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C90488d();
            case 4:
                return new C90487c();
            case 5:
                return f252873g;
            case 6:
                C63010eb ebVar = f252874i;
                if (ebVar == null) {
                    synchronized (C90488d.class) {
                        ebVar = f252874i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252873g);
                            f252874i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
