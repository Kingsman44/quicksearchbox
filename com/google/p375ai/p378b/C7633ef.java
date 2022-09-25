package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57053a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.ef */
/* compiled from: PG */
public final class C7633ef extends C62942bv implements C63001dt {

    /* renamed from: x */
    public static final C7633ef f26354x;

    /* renamed from: y */
    private static volatile C63010eb f26355y;

    /* renamed from: a */
    public int f26356a;

    /* renamed from: b */
    public int f26357b;

    /* renamed from: c */
    public String f26358c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f26359d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f26360e;

    /* renamed from: f */
    public int f26361f;

    /* renamed from: g */
    public int f26362g;

    /* renamed from: h */
    public C7673fs f26363h;

    /* renamed from: i */
    public int f26364i;

    /* renamed from: j */
    public int f26365j;

    /* renamed from: k */
    public boolean f26366k;

    /* renamed from: l */
    public String f26367l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public int f26368m;

    /* renamed from: n */
    public boolean f26369n;

    /* renamed from: o */
    public boolean f26370o;

    /* renamed from: p */
    public boolean f26371p;

    /* renamed from: q */
    public boolean f26372q;

    /* renamed from: r */
    public boolean f26373r;

    /* renamed from: s */
    public boolean f26374s;

    /* renamed from: t */
    public boolean f26375t;

    /* renamed from: u */
    public boolean f26376u;

    /* renamed from: v */
    public boolean f26377v;

    /* renamed from: w */
    public String f26378w;

    static {
        C7633ef efVar = new C7633ef();
        f26354x = efVar;
        C62942bv.registerDefaultInstance(C7633ef.class, efVar);
    }

    private C7633ef() {
        emptyIntList();
        this.f26378w = BuildConfig.FLAVOR;
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
                return newMessageInfo(f26354x, "\u0001\u0016\u0000\u0001\u0001#\u0016\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007ဂ\u0004\bဌ\u0005\tဉ\u0007\nဌ\b\fင\t\rဈ\u000b\u000eင\f\u0013ဇ\n\u0016ဌ\u0006\u0019ဇ\r\u001aဇ\u000e\u001bဇ\u000f\u001dဇ\u0011\u001eဇ\u0012\u001fဇ\u0013 ဇ\u0014!ဇ\u0015\"ဇ\u0016#ဈ\u0017", new Object[]{"a", "b", C57053a.f152308a, C45240c.f118157a, "d", "e", C10662f.f35572a, C7631ed.f26352a, C19618h.f54585a, "i", C7632ee.f26353a, "j", "l", "m", C19621k.f54601a, C30325g.f82003a, C7630ec.f26351a, C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a, "v", "w"});
            case 3:
                return new C7633ef();
            case 4:
                return new C7629eb();
            case 5:
                return f26354x;
            case 6:
                C63010eb ebVar = f26355y;
                if (ebVar == null) {
                    synchronized (C7633ef.class) {
                        ebVar = f26355y;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26354x);
                            f26355y = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
