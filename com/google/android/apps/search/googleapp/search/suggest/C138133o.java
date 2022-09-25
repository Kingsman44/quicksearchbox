package com.google.android.apps.search.googleapp.search.suggest;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10310h.C136135p;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.o */
/* compiled from: PG */
public final class C138133o extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C138133o f375822o;

    /* renamed from: p */
    private static volatile C63010eb f375823p;

    /* renamed from: a */
    public int f375824a;

    /* renamed from: b */
    public String f375825b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f375826c;

    /* renamed from: d */
    public boolean f375827d;

    /* renamed from: e */
    public int f375828e;

    /* renamed from: f */
    public long f375829f;

    /* renamed from: g */
    public int f375830g;

    /* renamed from: h */
    public C8575bc f375831h;

    /* renamed from: i */
    public String f375832i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public boolean f375833j;

    /* renamed from: k */
    public C136135p f375834k;

    /* renamed from: l */
    public String f375835l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f375836m;

    /* renamed from: n */
    public boolean f375837n;

    static {
        C138133o oVar = new C138133o();
        f375822o = oVar;
        C62942bv.registerDefaultInstance(C138133o.class, oVar);
    }

    private C138133o() {
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
                return newMessageInfo(f375822o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bဈ\u0007\tဇ\b\nဉ\t\u000bဈ\n\fဇ\u000b\rဇ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C139704d.m227142b(), C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C138133o();
            case 4:
                return new C138132n();
            case 5:
                return f375822o;
            case 6:
                C63010eb ebVar = f375823p;
                if (ebVar == null) {
                    synchronized (C138133o.class) {
                        ebVar = f375823p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375822o);
                            f375823p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
