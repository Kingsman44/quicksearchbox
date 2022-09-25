package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4433bz.p4437b.C57909n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.mdi.download.dl */
/* compiled from: PG */
public final class C29328dl extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C29328dl f79470q;

    /* renamed from: r */
    private static volatile C63010eb f79471r;

    /* renamed from: a */
    public int f79472a;

    /* renamed from: b */
    public String f79473b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f79474c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f79475d;

    /* renamed from: e */
    public int f79476e;

    /* renamed from: f */
    public String f79477f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C57909n f79478g;

    /* renamed from: h */
    public String f79479h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f79480i;

    /* renamed from: j */
    public C57909n f79481j;

    /* renamed from: k */
    public C62971cq f79482k = emptyProtobufList();

    /* renamed from: l */
    public int f79483l;

    /* renamed from: m */
    public int f79484m;

    /* renamed from: n */
    public String f79485n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public String f79486o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public C63070h f79487p;

    static {
        C29328dl dlVar = new C29328dl();
        f79470q = dlVar;
        C62942bv.registerDefaultInstance(C29328dl.class, dlVar);
    }

    private C29328dl() {
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
                return newMessageInfo(f79470q, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000fဌ\u0003\u0010င\u0007\u0011ဌ\t\u0012ဌ\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"a", C45240c.f118157a, "d", C10662f.f35572a, "b", C30325g.f82003a, "j", C19621k.f54601a, C29338dv.class, C19618h.f54585a, "e", C29326dj.f79469a, "i", "l", C29323dg.f79468a, "m", C29319de.f79465a, C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new C29328dl();
            case 4:
                return new C29325di();
            case 5:
                return f79470q;
            case 6:
                C63010eb ebVar = f79471r;
                if (ebVar == null) {
                    synchronized (C29328dl.class) {
                        ebVar = f79471r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79470q);
                            f79471r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
