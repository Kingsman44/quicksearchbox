package com.google.android.apps.search.googleapp.p10117aa;

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
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.aa.j */
/* compiled from: PG */
public final class C133125j extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C133125j f362919l;

    /* renamed from: m */
    private static volatile C63010eb f362920m;

    /* renamed from: a */
    public int f362921a;

    /* renamed from: b */
    public String f362922b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f362923c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f362924d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f362925e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63088z f362926f = C63088z.f170246b;

    /* renamed from: g */
    public C63088z f362927g = C63088z.f170246b;

    /* renamed from: h */
    public boolean f362928h;

    /* renamed from: i */
    public C63042fg f362929i;

    /* renamed from: j */
    public boolean f362930j;

    /* renamed from: k */
    public C63042fg f362931k;

    static {
        C133125j jVar = new C133125j();
        f362919l = jVar;
        C62942bv.registerDefaultInstance(C133125j.class, jVar);
    }

    private C133125j() {
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
                return newMessageInfo(f362919l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0004ည\u0004\u0005ည\u0005\u0006ဈ\u0003\u0007ဇ\u0006\bဉ\u0007\tဈ\u0001\nဇ\b\u000bဉ\t", new Object[]{"a", "b", "d", C10662f.f35572a, C30325g.f82003a, "e", C19618h.f54585a, "i", C45240c.f118157a, "j", C19621k.f54601a});
            case 3:
                return new C133125j();
            case 4:
                return new C133124i();
            case 5:
                return f362919l;
            case 6:
                C63010eb ebVar = f362920m;
                if (ebVar == null) {
                    synchronized (C133125j.class) {
                        ebVar = f362920m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362919l);
                            f362920m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
