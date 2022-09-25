package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C50999cq;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51112gv;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

@Deprecated
/* renamed from: com.google.assistant.e.j.wo */
/* compiled from: PG */
public final class C52568wo extends C62942bv implements C63001dt {

    /* renamed from: v */
    public static final C52568wo f137992v;

    /* renamed from: y */
    private static volatile C63010eb f137993y;

    /* renamed from: a */
    public int f137994a;

    /* renamed from: b */
    public int f137995b;

    /* renamed from: c */
    public int f137996c = 0;

    /* renamed from: d */
    public Object f137997d;

    /* renamed from: e */
    public String f137998e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f137999f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f138000g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f138001h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f138002i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f138003j;

    /* renamed from: k */
    public C51012dc f138004k;

    /* renamed from: l */
    public C52407qp f138005l;

    /* renamed from: m */
    public String f138006m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f138007n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public int f138008o;

    /* renamed from: p */
    public C52565wl f138009p;

    /* renamed from: q */
    public String f138010q;

    /* renamed from: r */
    public C62971cq f138011r;

    /* renamed from: s */
    public long f138012s;

    /* renamed from: t */
    public long f138013t;

    /* renamed from: u */
    public C51112gv f138014u;

    /* renamed from: w */
    private C50999cq f138015w;

    /* renamed from: x */
    private byte f138016x = 2;

    static {
        C52568wo woVar = new C52568wo();
        f137992v = woVar;
        C62942bv.registerDefaultInstance(C52568wo.class, woVar);
    }

    private C52568wo() {
        emptyProtobufList();
        this.f138010q = BuildConfig.FLAVOR;
        this.f138011r = C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138016x);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138016x = b;
                return null;
            case 2:
                return newMessageInfo(f137992v, "\u0001\u0017\u0001\u0002\u0001,\u0017\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0003\u0004ဈ\u0005\u0006ဌ\t\bᐉ\n\u000bဈ\r\rင\u0010\u0011ဉ\f\u0012ြ\u0000\u0014ဉ\u0019\u0016ဈ\u0004\u0017ဈ\u000e\u0018ဈ\u001a\u001aြ\u0000\u001bြ\u0000\u001c\u001a$ᐉ\u001f%ြ\u0000)ြ\u0000*ဂ!+ဂ\",ဉ#", new Object[]{"d", C45240c.f118157a, "a", "b", "e", C10662f.f35572a, C30325g.f82003a, "i", "j", C52567wn.m86650c(), C19621k.f54601a, "m", C66412o.f180592a, "l", C52574wu.class, "p", C19618h.f54585a, C48004n.f124238a, "q", C52583xc.class, C52595xo.class, C33259r.f88929b, "w", C52593xm.class, C52562wi.class, C59002s.f156871a, C42181t.f110467a, C147476u.f398081a});
            case 3:
                return new C52568wo();
            case 4:
                return new C52563wj();
            case 5:
                return f137992v;
            case 6:
                C63010eb ebVar = f137993y;
                if (ebVar == null) {
                    synchronized (C52568wo.class) {
                        ebVar = f137993y;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137992v);
                            f137993y = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
