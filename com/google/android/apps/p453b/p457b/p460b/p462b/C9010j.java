package com.google.android.apps.p453b.p457b.p460b.p462b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;

/* renamed from: com.google.android.apps.b.b.b.b.j */
/* compiled from: PG */
public final class C9010j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9010j f31129g;

    /* renamed from: h */
    private static volatile C63010eb f31130h;

    /* renamed from: a */
    public int f31131a;

    /* renamed from: b */
    public String f31132b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f31133c = 10;

    /* renamed from: d */
    public C63179l f31134d;

    /* renamed from: e */
    public String f31135e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f31136f;

    static {
        C9010j jVar = new C9010j();
        f31129g = jVar;
        C62942bv.registerDefaultInstance(C9010j.class, jVar);
    }

    private C9010j() {
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
                return newMessageInfo(f31129g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C9010j();
            case 4:
                return new C9009i();
            case 5:
                return f31129g;
            case 6:
                C63010eb ebVar = f31130h;
                if (ebVar == null) {
                    synchronized (C9010j.class) {
                        ebVar = f31130h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31129g);
                            f31130h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
