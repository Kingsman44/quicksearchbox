package com.google.android.apps.gsa.shared.p7041h;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.shared.h.h */
/* compiled from: PG */
public final class C89776h extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C89776h f242979p;

    /* renamed from: q */
    private static volatile C63010eb f242980q;

    /* renamed from: a */
    public int f242981a;

    /* renamed from: b */
    public long f242982b;

    /* renamed from: c */
    public long f242983c;

    /* renamed from: d */
    public String f242984d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f242985e;

    /* renamed from: f */
    public long f242986f;

    /* renamed from: g */
    public String f242987g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f242988h;

    /* renamed from: i */
    public int f242989i;

    /* renamed from: j */
    public int f242990j;

    /* renamed from: k */
    public int f242991k;

    /* renamed from: l */
    public long f242992l;

    /* renamed from: m */
    public String f242993m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public boolean f242994n;

    /* renamed from: o */
    public boolean f242995o;

    static {
        C89776h hVar = new C89776h();
        f242979p = hVar;
        C62942bv.registerDefaultInstance(C89776h.class, hVar);
    }

    private C89776h() {
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
                return newMessageInfo(f242979p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0007\bဋ\b\tဇ\u0006\nဌ\t\u000bဂ\n\fဈ\u000b\u000eဇ\r\u000fဇ\u000e", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "i", C89771c.f242977a, "j", C19618h.f54585a, C19621k.f54601a, C89773e.f242978a, "l", "m", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C89776h();
            case 4:
                return new C89775g();
            case 5:
                return f242979p;
            case 6:
                C63010eb ebVar = f242980q;
                if (ebVar == null) {
                    synchronized (C89776h.class) {
                        ebVar = f242980q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242979p);
                            f242980q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
