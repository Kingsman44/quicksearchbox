package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3913g.p3914a.C51225c;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4851a.p4852a.C63322f;
import com.google.protos.p4985f.p5030q.p5031a.C64987b;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.protos.f.q.ey */
/* compiled from: PG */
public final class C65191ey extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C65191ey f176424p;

    /* renamed from: r */
    private static volatile C63010eb f176425r;

    /* renamed from: a */
    public int f176426a;

    /* renamed from: b */
    public int f176427b = 0;

    /* renamed from: c */
    public Object f176428c;

    /* renamed from: d */
    public String f176429d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f176430e;

    /* renamed from: f */
    public long f176431f;

    /* renamed from: g */
    public String f176432g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f176433h;

    /* renamed from: i */
    public String f176434i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C52091ex f176435j;

    /* renamed from: k */
    public C65178el f176436k;

    /* renamed from: l */
    public C65180en f176437l;

    /* renamed from: m */
    public boolean f176438m;

    /* renamed from: n */
    public boolean f176439n;

    /* renamed from: o */
    public C51225c f176440o;

    /* renamed from: q */
    private byte f176441q = 2;

    static {
        C65191ey eyVar = new C65191ey();
        f176424p = eyVar;
        C62942bv.registerDefaultInstance(C65191ey.class, eyVar);
    }

    private C65191ey() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176441q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176441q = b;
                return null;
            case 2:
                return newMessageInfo(f176424p, "\u0000\u0010\u0001\u0001\u0001\u0015\u0010\u0000\u0000\u0004\u0001м\u0000\u0003\u0004\u0004Љ\u0007<\u0000\b\t\tȈ\nм\u0000\u000bȈ\f\t\u000eм\u0000\u000fဇ\u0002\u0010ဉ\u0003\u0011ဌ\u0000\u0012\u0002\u0014ለ\u0001\u0015\u0007", new Object[]{C45240c.f118157a, "b", "a", C63322f.class, C19618h.f54585a, C19621k.f54601a, C65190ex.class, "j", "d", C65187eu.class, C30325g.f82003a, "l", C64987b.class, C48004n.f124238a, C66412o.f180592a, "e", C10662f.f35572a, "i", "m"});
            case 3:
                return new C65191ey();
            case 4:
                return new C65185es();
            case 5:
                return f176424p;
            case 6:
                C63010eb ebVar = f176425r;
                if (ebVar == null) {
                    synchronized (C65191ey.class) {
                        ebVar = f176425r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176424p);
                            f176425r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
