package com.google.p5261vr.p5262a.p5263a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.vr.a.a.b */
/* compiled from: PG */
public final class C67930b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C67930b f184112h;

    /* renamed from: i */
    private static volatile C63010eb f184113i;

    /* renamed from: a */
    public int f184114a;

    /* renamed from: b */
    public String f184115b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f184116c;

    /* renamed from: d */
    public int f184117d;

    /* renamed from: e */
    public int f184118e;

    /* renamed from: f */
    public int f184119f;

    /* renamed from: g */
    public int f184120g;

    static {
        C67930b bVar = new C67930b();
        f184112h = bVar;
        C62942bv.registerDefaultInstance(C67930b.class, bVar);
    }

    private C67930b() {
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
                return newMessageInfo(f184112h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0002\u0003င\u0003\u0004င\u0004\u0005ဌ\u0005\u0006ဇ\u0001", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C67934c.f184125a, C45240c.f118157a});
            case 3:
                return new C67930b();
            case 4:
                return new C67911a();
            case 5:
                return f184112h;
            case 6:
                C63010eb ebVar = f184113i;
                if (ebVar == null) {
                    synchronized (C67930b.class) {
                        ebVar = f184113i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184112h);
                            f184113i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
