package com.google.android.libraries.search.assistant.p2497ab;

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

/* renamed from: com.google.android.libraries.search.assistant.ab.bm */
/* compiled from: PG */
public final class C32398bm extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C32398bm f86831r;

    /* renamed from: s */
    private static volatile C63010eb f86832s;

    /* renamed from: a */
    public int f86833a;

    /* renamed from: b */
    public int f86834b;

    /* renamed from: c */
    public long f86835c;

    /* renamed from: d */
    public double f86836d;

    /* renamed from: e */
    public double f86837e;

    /* renamed from: f */
    public double f86838f;

    /* renamed from: g */
    public double f86839g;

    /* renamed from: h */
    public double f86840h;

    /* renamed from: i */
    public double f86841i;

    /* renamed from: j */
    public double f86842j;

    /* renamed from: k */
    public boolean f86843k;

    /* renamed from: l */
    public String f86844l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public double f86845m;

    /* renamed from: n */
    public double f86846n;

    /* renamed from: o */
    public double f86847o;

    /* renamed from: p */
    public double f86848p;

    /* renamed from: q */
    public double f86849q;

    static {
        C32398bm bmVar = new C32398bm();
        f86831r = bmVar;
        C62942bv.registerDefaultInstance(C32398bm.class, bmVar);
    }

    private C32398bm() {
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
                return newMessageInfo(f86831r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007က\u0006\bက\u0007\tက\b\nဇ\t\fဈ\u000b\rက\f\u000eက\r\u000fက\u000e\u0010က\u000f\u0011က\u0010", new Object[]{"a", "b", C32395bj.f86830a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C32398bm();
            case 4:
                return new C32397bl();
            case 5:
                return f86831r;
            case 6:
                C63010eb ebVar = f86832s;
                if (ebVar == null) {
                    synchronized (C32398bm.class) {
                        ebVar = f86832s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86831r);
                            f86832s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
