package com.google.protos.p4892au;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.au.d */
/* compiled from: PG */
public final class C63826d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63826d f172612g;

    /* renamed from: h */
    private static volatile C63010eb f172613h;

    /* renamed from: a */
    public int f172614a;

    /* renamed from: b */
    public int f172615b;

    /* renamed from: c */
    public String f172616c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f172617d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f172618e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f172619f = BuildConfig.FLAVOR;

    static {
        C63826d dVar = new C63826d();
        f172612g = dVar;
        C62942bv.registerDefaultInstance(C63826d.class, dVar);
    }

    private C63826d() {
        emptyIntList();
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
                return newMessageInfo(f172612g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C63824b.f172611a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C63826d();
            case 4:
                return new C63823a();
            case 5:
                return f172612g;
            case 6:
                C63010eb ebVar = f172613h;
                if (ebVar == null) {
                    synchronized (C63826d.class) {
                        ebVar = f172613h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172612g);
                            f172613h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
