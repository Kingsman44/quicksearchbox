package com.google.android.gms.auth.p10743b.p10744a;

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

/* renamed from: com.google.android.gms.auth.b.a.d */
/* compiled from: PG */
public final class C142890d extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C142890d f387704m;

    /* renamed from: n */
    private static volatile C63010eb f387705n;

    /* renamed from: a */
    public int f387706a;

    /* renamed from: b */
    public String f387707b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f387708c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f387709d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f387710e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f387711f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f387712g;

    /* renamed from: h */
    public boolean f387713h;

    /* renamed from: i */
    public int f387714i;

    /* renamed from: j */
    public int f387715j;

    /* renamed from: k */
    public String f387716k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f387717l = BuildConfig.FLAVOR;

    static {
        C142890d dVar = new C142890d();
        f387704m = dVar;
        C62942bv.registerDefaultInstance(C142890d.class, dVar);
    }

    private C142890d() {
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
                return newMessageInfo(f387704m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဌ\b\nဈ\t\fဈ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C142888b.f387703a, C19621k.f54601a, "l"});
            case 3:
                return new C142890d();
            case 4:
                return new C142887a();
            case 5:
                return f387704m;
            case 6:
                C63010eb ebVar = f387705n;
                if (ebVar == null) {
                    synchronized (C142890d.class) {
                        ebVar = f387705n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f387704m);
                            f387705n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
