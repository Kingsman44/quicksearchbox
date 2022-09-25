package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.ad */
/* compiled from: PG */
public final class C88406ad extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C88406ad f239033l;

    /* renamed from: m */
    private static volatile C63010eb f239034m;

    /* renamed from: a */
    public int f239035a;

    /* renamed from: b */
    public C63088z f239036b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f239037c = C63088z.f170246b;

    /* renamed from: d */
    public int f239038d;

    /* renamed from: e */
    public int f239039e;

    /* renamed from: f */
    public boolean f239040f;

    /* renamed from: g */
    public boolean f239041g;

    /* renamed from: h */
    public int f239042h;

    /* renamed from: i */
    public long f239043i;

    /* renamed from: j */
    public boolean f239044j;

    /* renamed from: k */
    public String f239045k = BuildConfig.FLAVOR;

    static {
        C88406ad adVar = new C88406ad();
        f239033l = adVar;
        C62942bv.registerDefaultInstance(C88406ad.class, adVar);
    }

    private C88406ad() {
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
                return newMessageInfo(f239033l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဌ\u0006\bဂ\u0007\tဇ\b\nဈ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, amo.m92436b(), "i", "j", C19621k.f54601a});
            case 3:
                return new C88406ad();
            case 4:
                return new C88405ac();
            case 5:
                return f239033l;
            case 6:
                C63010eb ebVar = f239034m;
                if (ebVar == null) {
                    synchronized (C88406ad.class) {
                        ebVar = f239034m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239033l);
                            f239034m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
