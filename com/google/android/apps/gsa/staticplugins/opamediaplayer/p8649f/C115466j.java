package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.j */
/* compiled from: PG */
public final class C115466j extends C62942bv implements C63001dt {

    /* renamed from: q */
    public static final C115466j f320304q;

    /* renamed from: r */
    private static volatile C63010eb f320305r;

    /* renamed from: a */
    public int f320306a;

    /* renamed from: b */
    public long f320307b;

    /* renamed from: c */
    public boolean f320308c;

    /* renamed from: d */
    public boolean f320309d;

    /* renamed from: e */
    public boolean f320310e;

    /* renamed from: f */
    public boolean f320311f;

    /* renamed from: g */
    public boolean f320312g;

    /* renamed from: h */
    public long f320313h;

    /* renamed from: i */
    public long f320314i;

    /* renamed from: j */
    public double f320315j;

    /* renamed from: k */
    public boolean f320316k;

    /* renamed from: l */
    public boolean f320317l;

    /* renamed from: m */
    public boolean f320318m;

    /* renamed from: n */
    public String f320319n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public long f320320o;

    /* renamed from: p */
    public long f320321p;

    static {
        C115466j jVar = new C115466j();
        f320304q = jVar;
        C62942bv.registerDefaultInstance(C115466j.class, jVar);
    }

    private C115466j() {
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
                return newMessageInfo(f320304q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဂ\u0007\tက\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p"});
            case 3:
                return new C115466j();
            case 4:
                return new C115465i();
            case 5:
                return f320304q;
            case 6:
                C63010eb ebVar = f320305r;
                if (ebVar == null) {
                    synchronized (C115466j.class) {
                        ebVar = f320305r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f320304q);
                            f320305r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
