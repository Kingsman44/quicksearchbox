package com.google.android.libraries.componentview.components.base.p1687a;

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
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.android.libraries.componentview.components.base.a.ay */
/* compiled from: PG */
public final class C19924ay extends C62942bv implements C63001dt {

    /* renamed from: w */
    public static final C19924ay f55728w;

    /* renamed from: x */
    public static final C62940bt f55729x;

    /* renamed from: z */
    private static volatile C63010eb f55730z;

    /* renamed from: a */
    public int f55731a;

    /* renamed from: b */
    public String f55732b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C19995r f55733c;

    /* renamed from: d */
    public String f55734d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public float f55735e;

    /* renamed from: f */
    public int f55736f;

    /* renamed from: g */
    public int f55737g;

    /* renamed from: h */
    public C19916aq f55738h;

    /* renamed from: i */
    public C62971cq f55739i = emptyProtobufList();

    /* renamed from: j */
    public int f55740j;

    /* renamed from: k */
    public int f55741k;

    /* renamed from: l */
    public int f55742l;

    /* renamed from: m */
    public boolean f55743m;

    /* renamed from: n */
    public boolean f55744n;

    /* renamed from: o */
    public boolean f55745o;

    /* renamed from: p */
    public boolean f55746p = true;

    /* renamed from: q */
    public boolean f55747q;

    /* renamed from: r */
    public boolean f55748r;

    /* renamed from: s */
    public C19995r f55749s;

    /* renamed from: t */
    public boolean f55750t;

    /* renamed from: u */
    public boolean f55751u;

    /* renamed from: v */
    public C19920au f55752v;

    /* renamed from: y */
    private byte f55753y = 2;

    static {
        C19924ay ayVar = new C19924ay();
        f55728w = ayVar;
        C62942bv.registerDefaultInstance(C19924ay.class, ayVar);
        f55729x = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, ayVar, ayVar, (C62958ce) null, 121795420, C63066gd.MESSAGE, C19924ay.class);
    }

    private C19924ay() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55753y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55753y = b;
                return null;
            case 2:
                return newMessageInfo(f55728w, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ခ\u0003\u0005ဋ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bЛ\tင\u0007\nင\b\u000bင\t\fဇ\n\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0010ဇ\u000e\u0011ဇ\u000f\u0012ဉ\u0010\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဉ\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19922aw.f55727a, C19618h.f54585a, "i", C56425d.class, "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C33259r.f88929b, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a, "v"});
            case 3:
                return new C19924ay();
            case 4:
                return new C19921av();
            case 5:
                return f55728w;
            case 6:
                C63010eb ebVar = f55730z;
                if (ebVar == null) {
                    synchronized (C19924ay.class) {
                        ebVar = f55730z;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55728w);
                            f55730z = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
