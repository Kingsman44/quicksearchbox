package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3825an.p3830c.p3831a.C49308c;
import com.google.assistant.p3825an.p3830c.p3831a.C49348y;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54773u;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.d */
/* compiled from: PG */
public final class C48722d extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C48722d f126069m;

    /* renamed from: n */
    private static volatile C63010eb f126070n;

    /* renamed from: a */
    public int f126071a;

    /* renamed from: b */
    public String f126072b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126073c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f126074d;

    /* renamed from: e */
    public C54758f f126075e;

    /* renamed from: f */
    public C54773u f126076f;

    /* renamed from: g */
    public C49308c f126077g;

    /* renamed from: h */
    public int f126078h;

    /* renamed from: i */
    public String f126079i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62995dn f126080j = C62995dn.f170057a;

    /* renamed from: k */
    public C62995dn f126081k = C62995dn.f170057a;

    /* renamed from: l */
    public String f126082l = BuildConfig.FLAVOR;

    static {
        C48722d dVar = new C48722d();
        f126069m = dVar;
        C62942bv.registerDefaultInstance(C48722d.class, dVar);
    }

    private C48722d() {
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
                return newMessageInfo(f126069m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဌ\u0006\bဈ\u0007\t2\n2\u000bဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", C48582b.m85244b(), "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C49348y.m85418b(), "i", "j", C48583a.f125575a, C19621k.f54601a, C48719c.f126054a, "l"});
            case 3:
                return new C48722d();
            case 4:
                return new C48692b();
            case 5:
                return f126069m;
            case 6:
                C63010eb ebVar = f126070n;
                if (ebVar == null) {
                    synchronized (C48722d.class) {
                        ebVar = f126070n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126069m);
                            f126070n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
