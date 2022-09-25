package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.rh */
/* compiled from: PG */
public final class C7986rh extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C7986rh f28046o;

    /* renamed from: p */
    private static volatile C63010eb f28047p;

    /* renamed from: a */
    public int f28048a;

    /* renamed from: b */
    public C8150xj f28049b;

    /* renamed from: c */
    public C8150xj f28050c;

    /* renamed from: d */
    public C8150xj f28051d;

    /* renamed from: e */
    public String f28052e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f28053f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f28054g;

    /* renamed from: h */
    public String f28055h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f28056i = 1;

    /* renamed from: j */
    public C7893nw f28057j;

    /* renamed from: k */
    public int f28058k;

    /* renamed from: l */
    public boolean f28059l;

    /* renamed from: m */
    public C8069uj f28060m;

    /* renamed from: n */
    public C8069uj f28061n;

    static {
        C7986rh rhVar = new C7986rh();
        f28046o = rhVar;
        C62942bv.registerDefaultInstance(C7986rh.class, rhVar);
    }

    private C7986rh() {
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
                return newMessageInfo(f28046o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0006\u0006ဉ\b\u0007ဌ\t\bဇ\n\tဉ\u000b\nဉ\f\u000bဌ\u0007\fဇ\u0005\rဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C19618h.f54585a, "j", C19621k.f54601a, C7786jx.f27250a, "l", "m", C48004n.f124238a, "i", C7984rf.f28045a, C30325g.f82003a, C10662f.f35572a});
            case 3:
                return new C7986rh();
            case 4:
                return new C7983re();
            case 5:
                return f28046o;
            case 6:
                C63010eb ebVar = f28047p;
                if (ebVar == null) {
                    synchronized (C7986rh.class) {
                        ebVar = f28047p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28046o);
                            f28047p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
