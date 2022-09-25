package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.t */
/* compiled from: PG */
public final class C60522t extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C60522t f163843r;

    /* renamed from: s */
    private static volatile C63010eb f163844s;

    /* renamed from: a */
    public int f163845a;

    /* renamed from: b */
    public boolean f163846b;

    /* renamed from: c */
    public boolean f163847c;

    /* renamed from: d */
    public boolean f163848d;

    /* renamed from: e */
    public boolean f163849e;

    /* renamed from: f */
    public boolean f163850f;

    /* renamed from: g */
    public boolean f163851g;

    /* renamed from: h */
    public boolean f163852h;

    /* renamed from: i */
    public String f163853i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public boolean f163854j;

    /* renamed from: k */
    public int f163855k;

    /* renamed from: l */
    public boolean f163856l;

    /* renamed from: m */
    public int f163857m;

    /* renamed from: n */
    public int f163858n;

    /* renamed from: o */
    public int f163859o;

    /* renamed from: p */
    public double f163860p;

    /* renamed from: q */
    public long f163861q;

    static {
        C60522t tVar = new C60522t();
        f163843r = tVar;
        C62942bv.registerDefaultInstance(C60522t.class, tVar);
    }

    private C60522t() {
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
                return newMessageInfo(f163843r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဈ\u0007\tဇ\b\nဌ\t\u000bဇ\n\fဌ\u000b\rဌ\f\u000eဌ\r\u000fက\u000e\u0010ဃ\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C60432q.f163552a, "l", "m", C60464r.f163635a, C48004n.f124238a, C60314o.f163204a, C66412o.f180592a, C60495s.f163763a, "p", "q"});
            case 3:
                return new C60522t();
            case 4:
                return new C60343p();
            case 5:
                return f163843r;
            case 6:
                C63010eb ebVar = f163844s;
                if (ebVar == null) {
                    synchronized (C60522t.class) {
                        ebVar = f163844s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163843r);
                            f163844s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
