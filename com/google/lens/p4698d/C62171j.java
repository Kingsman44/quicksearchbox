package com.google.lens.p4698d;

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

/* renamed from: com.google.lens.d.j */
/* compiled from: PG */
public final class C62171j extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C62171j f167841r;

    /* renamed from: s */
    private static volatile C63010eb f167842s;

    /* renamed from: a */
    public int f167843a;

    /* renamed from: b */
    public float f167844b = 0.5f;

    /* renamed from: c */
    public float f167845c = 0.3f;

    /* renamed from: d */
    public float f167846d = 0.25f;

    /* renamed from: e */
    public float f167847e = 0.2f;

    /* renamed from: f */
    public boolean f167848f = true;

    /* renamed from: g */
    public long f167849g = 90;

    /* renamed from: h */
    public int f167850h = 6;

    /* renamed from: i */
    public boolean f167851i = true;

    /* renamed from: j */
    public long f167852j = 350;

    /* renamed from: k */
    public long f167853k = 2000;

    /* renamed from: l */
    public long f167854l = 4000;

    /* renamed from: m */
    public int f167855m = 2;

    /* renamed from: n */
    public float f167856n = 1.1f;

    /* renamed from: o */
    public boolean f167857o = true;

    /* renamed from: p */
    public float f167858p = 1.3f;

    /* renamed from: q */
    public boolean f167859q = true;

    static {
        C62171j jVar = new C62171j();
        f167841r = jVar;
        C62942bv.registerDefaultInstance(C62171j.class, jVar);
    }

    private C62171j() {
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
                return newMessageInfo(f167841r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007င\u0006\bဇ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fင\u000b\rခ\f\u000eဇ\r\u000fခ\u000e\u0010ဇ\u000f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q"});
            case 3:
                return new C62171j();
            case 4:
                return new C62170i();
            case 5:
                return f167841r;
            case 6:
                C63010eb ebVar = f167842s;
                if (ebVar == null) {
                    synchronized (C62171j.class) {
                        ebVar = f167842s;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167841r);
                            f167842s = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
