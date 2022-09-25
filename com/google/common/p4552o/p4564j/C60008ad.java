package com.google.common.p4552o.p4564j;

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

/* renamed from: com.google.common.o.j.ad */
/* compiled from: PG */
public final class C60008ad extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C60008ad f162175p;

    /* renamed from: q */
    private static volatile C63010eb f162176q;

    /* renamed from: a */
    public int f162177a;

    /* renamed from: b */
    public int f162178b;

    /* renamed from: c */
    public int f162179c = 1;

    /* renamed from: d */
    public boolean f162180d;

    /* renamed from: e */
    public boolean f162181e;

    /* renamed from: f */
    public boolean f162182f;

    /* renamed from: g */
    public int f162183g;

    /* renamed from: h */
    public int f162184h;

    /* renamed from: i */
    public int f162185i;

    /* renamed from: j */
    public int f162186j;

    /* renamed from: k */
    public int f162187k;

    /* renamed from: l */
    public int f162188l;

    /* renamed from: m */
    public int f162189m;

    /* renamed from: n */
    public boolean f162190n;

    /* renamed from: o */
    public int f162191o;

    static {
        C60008ad adVar = new C60008ad();
        f162175p = adVar;
        C62942bv.registerDefaultInstance(C60008ad.class, adVar);
    }

    private C60008ad() {
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
                return newMessageInfo(f162175p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b", new Object[]{"a", "b", C60007ac.f162174a, C45240c.f118157a, C60005aa.f162173a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "j"});
            case 3:
                return new C60008ad();
            case 4:
                return new C60006ab();
            case 5:
                return f162175p;
            case 6:
                C63010eb ebVar = f162176q;
                if (ebVar == null) {
                    synchronized (C60008ad.class) {
                        ebVar = f162176q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162175p);
                            f162176q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
