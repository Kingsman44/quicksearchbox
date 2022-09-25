package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.e */
/* compiled from: PG */
public final class C132797e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C132797e f362307g;

    /* renamed from: h */
    private static volatile C63010eb f362308h;

    /* renamed from: a */
    public int f362309a;

    /* renamed from: b */
    public String f362310b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f362311c;

    /* renamed from: d */
    public String f362312d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f362313e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f362314f;

    static {
        C132797e eVar = new C132797e();
        f362307g = eVar;
        C62942bv.registerDefaultInstance(C132797e.class, eVar);
    }

    private C132797e() {
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
                return newMessageInfo(f362307g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0003\u0004င\u0004\u0005ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "d"});
            case 3:
                return new C132797e();
            case 4:
                return new C132796d();
            case 5:
                return f362307g;
            case 6:
                C63010eb ebVar = f362308h;
                if (ebVar == null) {
                    synchronized (C132797e.class) {
                        ebVar = f362308h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362307g);
                            f362308h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
