package com.google.android.libraries.social.p3269d.p3270a;

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

/* renamed from: com.google.android.libraries.social.d.a.r */
/* compiled from: PG */
public final class C41943r extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C41943r f109473l;

    /* renamed from: m */
    private static volatile C63010eb f109474m;

    /* renamed from: a */
    public int f109475a;

    /* renamed from: b */
    public String f109476b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f109477c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f109478d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f109479e;

    /* renamed from: f */
    public String f109480f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f109481g;

    /* renamed from: h */
    public String f109482h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f109483i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f109484j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f109485k = BuildConfig.FLAVOR;

    static {
        C41943r rVar = new C41943r();
        f109473l = rVar;
        C62942bv.registerDefaultInstance(C41943r.class, rVar);
    }

    private C41943r() {
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
                return newMessageInfo(f109473l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\bဈ\u0006\tဈ\u0007\fဈ\n\rဈ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C41947v.f109492a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C41943r();
            case 4:
                return new C41942q();
            case 5:
                return f109473l;
            case 6:
                C63010eb ebVar = f109474m;
                if (ebVar == null) {
                    synchronized (C41943r.class) {
                        ebVar = f109474m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109473l);
                            f109474m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
