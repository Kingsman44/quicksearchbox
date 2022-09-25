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
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.iq */
/* compiled from: PG */
public final class C7752iq extends C62937bq implements C62938br {

    /* renamed from: E */
    public static final C7752iq f27124E;

    /* renamed from: G */
    private static volatile C63010eb f27125G;

    /* renamed from: A */
    public C7669fo f27126A;

    /* renamed from: B */
    public int f27127B;

    /* renamed from: C */
    public int f27128C;

    /* renamed from: D */
    public C62961ch f27129D = emptyIntList();

    /* renamed from: F */
    private byte f27130F = 2;

    /* renamed from: a */
    public int f27131a;

    /* renamed from: b */
    public int f27132b = 0;

    /* renamed from: c */
    public Object f27133c;

    /* renamed from: d */
    public int f27134d = 0;

    /* renamed from: e */
    public Object f27135e;

    /* renamed from: f */
    public int f27136f = 0;

    /* renamed from: g */
    public Object f27137g;

    /* renamed from: h */
    public int f27138h = 0;

    /* renamed from: i */
    public Object f27139i;

    /* renamed from: j */
    public long f27140j;

    /* renamed from: k */
    public int f27141k;

    /* renamed from: l */
    public long f27142l;

    /* renamed from: m */
    public boolean f27143m;

    /* renamed from: n */
    public int f27144n;

    /* renamed from: o */
    public int f27145o;

    /* renamed from: p */
    public int f27146p;

    /* renamed from: q */
    public int f27147q;

    /* renamed from: r */
    public int f27148r;

    /* renamed from: s */
    public int f27149s;

    /* renamed from: t */
    public int f27150t;

    /* renamed from: u */
    public int f27151u;

    /* renamed from: v */
    public C7805kp f27152v;

    /* renamed from: w */
    public C7918ou f27153w;

    /* renamed from: x */
    public long f27154x;

    /* renamed from: y */
    public int f27155y;

    /* renamed from: z */
    public String f27156z = BuildConfig.FLAVOR;

    static {
        C7752iq iqVar = new C7752iq();
        f27124E = iqVar;
        C62942bv.registerDefaultInstance(C7752iq.class, iqVar);
    }

    private C7752iq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27130F);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27130F = b;
                return null;
            case 2:
                return newMessageInfo(f27124E, "\u0001\u001d\u0004\u0001\u00011\u001d\u0000\u0001\u0005\u0001ᐼ\u0000\u0002ᐼ\u0001\u0003ဂ\u0004\bဉ\u0012\u000bဂ\u0006\fင\u0005\rᐉ\u0013\u0010ဇ\b\u0011င\t\u0013င\n\u0014င\u000b\u0015င\f\u0017င\r\u0018င\u000e\u0019င\u000f\u001aင\u0010\u001dဂ\u0014\u001fင\u0015 ဈ\u0016\"ဉ\u0018#ᐼ\u0002$ᐼ\u0003'ဌ\u001e(ှ\u0000)ှ\u0001*ှ\u0002+ှ\u00030ဋ\u001f1\u0016", new Object[]{C45240c.f118157a, "b", "e", "d", C30325g.f82003a, C10662f.f35572a, "i", C19618h.f54585a, "a", C7708h.class, C7718hj.class, "j", "v", "l", C19621k.f54601a, "w", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a, "x", "y", "z", "A", C7709ha.class, C7709ha.class, "B", C8142xb.m22955b(), "C", "D"});
            case 3:
                return new C7752iq();
            case 4:
                return new C7751ip();
            case 5:
                return f27124E;
            case 6:
                C63010eb ebVar = f27125G;
                if (ebVar == null) {
                    synchronized (C7752iq.class) {
                        ebVar = f27125G;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27124E);
                            f27125G = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
