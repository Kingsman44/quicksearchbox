package com.google.android.libraries.componentview.components.p1682a.p1683a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.a.a.f */
/* compiled from: PG */
public final class C19761f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C19761f f55194h;

    /* renamed from: i */
    private static volatile C63010eb f55195i;

    /* renamed from: a */
    public int f55196a;

    /* renamed from: b */
    public String f55197b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f55198c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f55199d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f55200e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f55201f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f55202g;

    static {
        C19761f fVar = new C19761f();
        f55194h = fVar;
        C62942bv.registerDefaultInstance(C19761f.class, fVar);
    }

    private C19761f() {
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
                return newMessageInfo(f55194h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C19761f();
            case 4:
                return new C19760e();
            case 5:
                return f55194h;
            case 6:
                C63010eb ebVar = f55195i;
                if (ebVar == null) {
                    synchronized (C19761f.class) {
                        ebVar = f55195i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55194h);
                            f55195i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
