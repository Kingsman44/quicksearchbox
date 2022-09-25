package com.google.android.apps.search.p8936a.p8937a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.a.a.d */
/* compiled from: PG */
public final class C119168d extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C119168d f332348m;

    /* renamed from: n */
    private static volatile C63010eb f332349n;

    /* renamed from: a */
    public int f332350a;

    /* renamed from: b */
    public String f332351b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f332352c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f332353d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f332354e;

    /* renamed from: f */
    public String f332355f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f332356g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f332357h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f332358i;

    /* renamed from: j */
    public int f332359j;

    /* renamed from: k */
    public int f332360k;

    /* renamed from: l */
    public String f332361l = BuildConfig.FLAVOR;

    static {
        C119168d dVar = new C119168d();
        f332348m = dVar;
        C62942bv.registerDefaultInstance(C119168d.class, dVar);
    }

    private C119168d() {
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
                return newMessageInfo(f332348m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဋ\u0007\tဌ\b\nဋ\t\u000bဈ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C119167c.m197877b(), C19621k.f54601a, "l"});
            case 3:
                return new C119168d();
            case 4:
                return new C119165a();
            case 5:
                return f332348m;
            case 6:
                C63010eb ebVar = f332349n;
                if (ebVar == null) {
                    synchronized (C119168d.class) {
                        ebVar = f332349n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332348m);
                            f332349n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
