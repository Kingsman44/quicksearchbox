package com.google.android.libraries.micore.learning.p2258a;

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
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.micore.learning.a.p */
/* compiled from: PG */
public final class C29706p extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C29706p f80448p;

    /* renamed from: q */
    private static volatile C63010eb f80449q;

    /* renamed from: a */
    public int f80450a = 0;

    /* renamed from: b */
    public Object f80451b;

    /* renamed from: c */
    public String f80452c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f80453d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f80454e;

    /* renamed from: f */
    public C63042fg f80455f;

    /* renamed from: g */
    public C63042fg f80456g;

    /* renamed from: h */
    public C63042fg f80457h;

    /* renamed from: i */
    public C63042fg f80458i;

    /* renamed from: j */
    public C63042fg f80459j;

    /* renamed from: k */
    public String f80460k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C29700j f80461l;

    /* renamed from: m */
    public int f80462m;

    /* renamed from: n */
    public C63088z f80463n = C63088z.f170246b;

    /* renamed from: o */
    public boolean f80464o;

    static {
        C29706p pVar = new C29706p();
        f80448p = pVar;
        C62942bv.registerDefaultInstance(C29706p.class, pVar);
    }

    private C29706p() {
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
                return newMessageInfo(f80448p, "\u0000\u000f\u0001\u0000\u0001\u0010\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004<\u0000\u0005\t\u0006\t\u0007\t\b\t\t\t\nȈ\u000b\t\r<\u0000\u000e\f\u000f\n\u0010\u0007", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C29695e.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", C29697g.class, "m", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C29706p();
            case 4:
                return new C29704n();
            case 5:
                return f80448p;
            case 6:
                C63010eb ebVar = f80449q;
                if (ebVar == null) {
                    synchronized (C29706p.class) {
                        ebVar = f80449q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80448p);
                            f80449q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
