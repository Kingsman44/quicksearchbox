package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4570p.C60368ax;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.gz */
/* compiled from: PG */
public final class C59833gz extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C59833gz f161685o;

    /* renamed from: p */
    private static volatile C63010eb f161686p;

    /* renamed from: a */
    public int f161687a;

    /* renamed from: b */
    public long f161688b;

    /* renamed from: c */
    public int f161689c;

    /* renamed from: d */
    public String f161690d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f161691e;

    /* renamed from: f */
    public int f161692f;

    /* renamed from: g */
    public int f161693g = 1;

    /* renamed from: h */
    public String f161694h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f161695i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C60368ax f161696j;

    /* renamed from: k */
    public long f161697k;

    /* renamed from: l */
    public int f161698l;

    /* renamed from: m */
    public String f161699m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public int f161700n;

    static {
        C59833gz gzVar = new C59833gz();
        f161685o = gzVar;
        C62942bv.registerDefaultInstance(C59833gz.class, gzVar);
    }

    private C59833gz() {
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
                return newMessageInfo(f161685o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဃ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006\tဈ\b\nဉ\t\u000bဃ\n\fင\u000b\rဈ\f\u000eဌ\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C89851ag.m146285b()});
            case 3:
                return new C59833gz();
            case 4:
                return new C59832gy();
            case 5:
                return f161685o;
            case 6:
                C63010eb ebVar = f161686p;
                if (ebVar == null) {
                    synchronized (C59833gz.class) {
                        ebVar = f161686p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161685o);
                            f161686p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
