package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

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
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb */
/* compiled from: PG */
public final class C138194bb extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C138194bb f376007r;

    /* renamed from: s */
    private static volatile C63010eb f376008s;

    /* renamed from: a */
    public int f376009a;

    /* renamed from: b */
    public String f376010b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f376011c;

    /* renamed from: d */
    public String f376012d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f376013e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f376014f;

    /* renamed from: g */
    public String f376015g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f376016h;

    /* renamed from: i */
    public boolean f376017i;

    /* renamed from: j */
    public boolean f376018j;

    /* renamed from: k */
    public String f376019k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C62995dn f376020l = C62995dn.f170057a;

    /* renamed from: m */
    public C138181ap f376021m;

    /* renamed from: n */
    public C138176ak f376022n;

    /* renamed from: o */
    public C138179an f376023o;

    /* renamed from: p */
    public C138193ba f376024p;

    /* renamed from: q */
    public C138187av f376025q;

    static {
        C138194bb bbVar = new C138194bb();
        f376007r = bbVar;
        C62942bv.registerDefaultInstance(C138194bb.class, bbVar);
    }

    private C138194bb() {
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
                return newMessageInfo(f376007r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0001\u0000\u0000\u0001ဌ\u0001\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဇ\b\bဉ\n\tဈ\t\n2\u000bဉ\u000b\fဉ\u000e\rဈ\u0000\u000eဌ\u0004\u000fဉ\f\u0010ဉ\r\u0011ဇ\u0007", new Object[]{"a", C45240c.f118157a, C138189ax.f375996a, "d", "e", C30325g.f82003a, C19618h.f54585a, "j", "m", C19621k.f54601a, "l", C138188aw.f375995a, C48004n.f124238a, "q", "b", C10662f.f35572a, C138190ay.f375997a, C66412o.f180592a, "p", "i"});
            case 3:
                return new C138194bb();
            case 4:
                return new C138177al();
            case 5:
                return f376007r;
            case 6:
                C63010eb ebVar = f376008s;
                if (ebVar == null) {
                    synchronized (C138194bb.class) {
                        ebVar = f376008s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376007r);
                            f376008s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
