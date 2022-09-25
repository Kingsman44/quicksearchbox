package com.google.android.libraries.mdi;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.mdi.b */
/* compiled from: PG */
public final class C28595b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C28595b f77795g;

    /* renamed from: h */
    private static volatile C63010eb f77796h;

    /* renamed from: a */
    public int f77797a;

    /* renamed from: b */
    public String f77798b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f77799c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f77800d;

    /* renamed from: e */
    public int f77801e;

    /* renamed from: f */
    public C63070h f77802f;

    static {
        C28595b bVar = new C28595b();
        f77795g = bVar;
        C62942bv.registerDefaultInstance(C28595b.class, bVar);
    }

    private C28595b() {
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
                return newMessageInfo(f77795g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C28595b();
            case 4:
                return new C28593a();
            case 5:
                return f77795g;
            case 6:
                C63010eb ebVar = f77796h;
                if (ebVar == null) {
                    synchronized (C28595b.class) {
                        ebVar = f77796h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77795g);
                            f77796h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
