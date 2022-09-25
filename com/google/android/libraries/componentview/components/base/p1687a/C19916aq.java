package com.google.android.libraries.componentview.components.base.p1687a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.componentview.components.base.a.aq */
/* compiled from: PG */
public final class C19916aq extends C62942bv implements C63001dt {

    /* renamed from: s */
    public static final C19916aq f55703s;

    /* renamed from: t */
    private static volatile C63010eb f55704t;

    /* renamed from: a */
    public int f55705a;

    /* renamed from: b */
    public int f55706b = 0;

    /* renamed from: c */
    public Object f55707c;

    /* renamed from: d */
    public int f55708d = 0;

    /* renamed from: e */
    public Object f55709e;

    /* renamed from: f */
    public C19995r f55710f;

    /* renamed from: g */
    public float f55711g;

    /* renamed from: h */
    public C19904ae f55712h;

    /* renamed from: i */
    public String f55713i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public boolean f55714j;

    /* renamed from: k */
    public int f55715k;

    /* renamed from: l */
    public int f55716l;

    /* renamed from: m */
    public int f55717m;

    /* renamed from: n */
    public int f55718n;

    /* renamed from: o */
    public int f55719o;

    /* renamed from: p */
    public C19902ac f55720p;

    /* renamed from: q */
    public boolean f55721q;

    /* renamed from: r */
    public boolean f55722r;

    static {
        C19916aq aqVar = new C19916aq();
        f55703s = aqVar;
        C62942bv.registerDefaultInstance(C19916aq.class, aqVar);
    }

    private C19916aq() {
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
                return newMessageInfo(f55703s, "\u0001\u0012\u0002\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဴ\u0000\u0003ခ\u0004\u0004ဉ\u0005\u0005ဈ\u0006\u0006ဇ\u0007\u0007ြ\u0000\bဌ\b\tင\t\nင\n\u000bဌ\u000b\fဌ\f\rြ\u0001\u000eဉ\u000f\u000fြ\u0001\u0010ဇ\u0010\u0011ဇ\u0011\u0012်\u0000", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19906ag.class, C19621k.f54601a, C19910ak.f55700a, "l", "m", C48004n.f124238a, C19914ao.f55702a, C66412o.f180592a, C19912am.f55701a, C19991n.class, "p", C19993p.class, "q", C33259r.f88929b});
            case 3:
                return new C19916aq();
            case 4:
                return new C19909aj();
            case 5:
                return f55703s;
            case 6:
                C63010eb ebVar = f55704t;
                if (ebVar == null) {
                    synchronized (C19916aq.class) {
                        ebVar = f55704t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55703s);
                            f55704t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
