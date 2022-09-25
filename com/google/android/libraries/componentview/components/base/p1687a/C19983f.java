package com.google.android.libraries.componentview.components.base.p1687a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.f */
/* compiled from: PG */
public final class C19983f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C19983f f56002g;

    /* renamed from: h */
    private static volatile C63010eb f56003h;

    /* renamed from: a */
    public int f56004a;

    /* renamed from: b */
    public String f56005b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f56006c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f56007d;

    /* renamed from: e */
    public String f56008e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f56009f;

    static {
        C19983f fVar = new C19983f();
        f56002g = fVar;
        C62942bv.registerDefaultInstance(C19983f.class, fVar);
    }

    private C19983f() {
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
                return newMessageInfo(f56002g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0005ဌ\u0003\u0006ဈ\u0004\bဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C19980d.f55976a, "e", C10662f.f35572a});
            case 3:
                return new C19983f();
            case 4:
                return new C19953c();
            case 5:
                return f56002g;
            case 6:
                C63010eb ebVar = f56003h;
                if (ebVar == null) {
                    synchronized (C19983f.class) {
                        ebVar = f56003h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56002g);
                            f56003h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
