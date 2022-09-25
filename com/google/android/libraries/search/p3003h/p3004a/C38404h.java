package com.google.android.libraries.search.p3003h.p3004a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.h.a.h */
/* compiled from: PG */
public final class C38404h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C38404h f101652g;

    /* renamed from: h */
    private static volatile C63010eb f101653h;

    /* renamed from: a */
    public int f101654a;

    /* renamed from: b */
    public String f101655b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f101656c = true;

    /* renamed from: d */
    public C62995dn f101657d = C62995dn.f170057a;

    /* renamed from: e */
    public int f101658e;

    /* renamed from: f */
    public String f101659f = BuildConfig.FLAVOR;

    static {
        C38404h hVar = new C38404h();
        f101652g = hVar;
        C62942bv.registerDefaultInstance(C38404h.class, hVar);
    }

    private C38404h() {
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
                return newMessageInfo(f101652g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0004ဇ\u0001\u00052\u0006ဌ\u0002\u0007ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C38403g.f101651a, "e", C38398b.f101649a, C10662f.f35572a});
            case 3:
                return new C38404h();
            case 4:
                return new C38402f();
            case 5:
                return f101652g;
            case 6:
                C63010eb ebVar = f101653h;
                if (ebVar == null) {
                    synchronized (C38404h.class) {
                        ebVar = f101653h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101652g);
                            f101653h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
