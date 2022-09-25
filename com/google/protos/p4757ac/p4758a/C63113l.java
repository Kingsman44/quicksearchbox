package com.google.protos.p4757ac.p4758a;

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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.ac.a.l */
/* compiled from: PG */
public final class C63113l extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C63113l f170365p;

    /* renamed from: q */
    private static volatile C63010eb f170366q;

    /* renamed from: a */
    public int f170367a;

    /* renamed from: b */
    public String f170368b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f170369c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f170370d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f170371e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f170372f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f170373g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f170374h;

    /* renamed from: i */
    public String f170375i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f170376j;

    /* renamed from: k */
    public String f170377k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C63107f f170378l;

    /* renamed from: m */
    public String f170379m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f170380n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public C62971cq f170381o = C62942bv.emptyProtobufList();

    static {
        C63113l lVar = new C63113l();
        f170365p = lVar;
        C62942bv.registerDefaultInstance(C63113l.class, lVar);
    }

    private C63113l() {
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
                return newMessageInfo(f170365p, "\u0001\u000e\u0000\u0001\u0001\u0017\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဈ\u0005\u0007ဈ\u0006\tင\b\u000bဈ\t\fဌ\u000b\rဈ\f\u000fဉ\u000f\u0010ဈ\u0010\u0016ဈ\u0014\u0017\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C63102a.f170332a, C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C63113l();
            case 4:
                return new C63112k();
            case 5:
                return f170365p;
            case 6:
                C63010eb ebVar = f170366q;
                if (ebVar == null) {
                    synchronized (C63113l.class) {
                        ebVar = f170366q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170365p);
                            f170366q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
