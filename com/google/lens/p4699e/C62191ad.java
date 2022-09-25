package com.google.lens.p4699e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4984e.C64643b;

/* renamed from: com.google.lens.e.ad */
/* compiled from: PG */
public final class C62191ad extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C62191ad f167916k;

    /* renamed from: l */
    private static volatile C63010eb f167917l;

    /* renamed from: a */
    public int f167918a;

    /* renamed from: b */
    public int f167919b = 0;

    /* renamed from: c */
    public Object f167920c;

    /* renamed from: d */
    public String f167921d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f167922e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f167923f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f167924g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C64643b f167925h;

    /* renamed from: i */
    public float f167926i;

    /* renamed from: j */
    public boolean f167927j;

    static {
        C62191ad adVar = new C62191ad();
        f167916k = adVar;
        C62942bv.registerDefaultInstance(C62191ad.class, adVar);
    }

    private C62191ad() {
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
                return newMessageInfo(f167916k, "\u0001\t\u0001\u0001\u0002\n\t\u0000\u0000\u0000\u0002ြ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဉ\u0007\bခ\b\tဇ\t\nြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C62221bg.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C62199al.class});
            case 3:
                return new C62191ad();
            case 4:
                return new C62190ac();
            case 5:
                return f167916k;
            case 6:
                C63010eb ebVar = f167917l;
                if (ebVar == null) {
                    synchronized (C62191ad.class) {
                        ebVar = f167917l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167916k);
                            f167917l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
