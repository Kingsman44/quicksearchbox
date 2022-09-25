package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83930q;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83932s;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C50358uc;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4017at.p4018a.p4019a.p4020a.C53750ah;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.a.f */
/* compiled from: PG */
public final class C109774f extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C109774f f305863p;

    /* renamed from: q */
    private static volatile C63010eb f305864q;

    /* renamed from: a */
    public int f305865a;

    /* renamed from: b */
    public C109772d f305866b;

    /* renamed from: c */
    public C50358uc f305867c;

    /* renamed from: d */
    public String f305868d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f305869e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f305870f;

    /* renamed from: g */
    public int f305871g;

    /* renamed from: h */
    public C83915b f305872h;

    /* renamed from: i */
    public int f305873i;

    /* renamed from: j */
    public C109778j f305874j;

    /* renamed from: k */
    public C63088z f305875k = C63088z.f170246b;

    /* renamed from: l */
    public String f305876l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public int f305877m;

    /* renamed from: n */
    public boolean f305878n;

    /* renamed from: o */
    public boolean f305879o;

    static {
        C109774f fVar = new C109774f();
        f305863p = fVar;
        C62942bv.registerDefaultInstance(C109774f.class, fVar);
    }

    private C109774f() {
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
                return newMessageInfo(f305863p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဌ\u0005\bဉ\u0006\tဌ\u0007\nဉ\b\u000bည\t\fဈ\n\rဌ\u000b\u000eဇ\f\u000fဇ\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C53750ah.f141112a, C19618h.f54585a, "i", C83930q.f228588a, "j", C19621k.f54601a, "l", "m", C83932s.f228589a, C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C109774f();
            case 4:
                return new C109773e();
            case 5:
                return f305863p;
            case 6:
                C63010eb ebVar = f305864q;
                if (ebVar == null) {
                    synchronized (C109774f.class) {
                        ebVar = f305864q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f305863p);
                            f305864q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
