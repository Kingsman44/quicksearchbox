package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5042u.C65344f;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.e.j.e.gr */
/* compiled from: PG */
public final class C51992gr extends C62942bv implements C63001dt {

    /* renamed from: r */
    public static final C51992gr f136445r;

    /* renamed from: t */
    private static volatile C63010eb f136446t;

    /* renamed from: a */
    public int f136447a;

    /* renamed from: b */
    public String f136448b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f136449c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f136450d;

    /* renamed from: e */
    public String f136451e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C51012dc f136452f;

    /* renamed from: g */
    public C51098gh f136453g;

    /* renamed from: h */
    public C51994gt f136454h;

    /* renamed from: i */
    public String f136455i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C51016dg f136456j;

    /* renamed from: k */
    public C52230ka f136457k;

    /* renamed from: l */
    public boolean f136458l;

    /* renamed from: m */
    public C65344f f136459m;

    /* renamed from: n */
    public C51980gf f136460n;

    /* renamed from: o */
    public C52030ib f136461o;

    /* renamed from: p */
    public C51991gq f136462p;

    /* renamed from: q */
    public C51989go f136463q;

    /* renamed from: s */
    private byte f136464s = 2;

    static {
        C51992gr grVar = new C51992gr();
        f136445r = grVar;
        C62942bv.registerDefaultInstance(C51992gr.class, grVar);
    }

    private C51992gr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136464s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136464s = b;
                return null;
            case 2:
                return newMessageInfo(f136445r, "\u0001\u0010\u0000\u0001\u0001\u0015\u0010\u0000\u0000\u0003\u0001ဈ\u0003\u0002ᐉ\u0004\u0003ဈ\u0001\u0004ဉ\u0005\u0005ဈ\u0007\u0007င\u0002\nᐉ\t\u000bဉ\n\fဇ\u000b\rဉ\u0006\u000eဉ\f\u0011ဉ\r\u0012ᐉ\u000e\u0013ဉ\u000f\u0014ဈ\u0000\u0015ဉ\u0010", new Object[]{"a", "e", C10662f.f35572a, C45240c.f118157a, C30325g.f82003a, "i", "d", "j", C19621k.f54601a, "l", C19618h.f54585a, "m", C48004n.f124238a, C66412o.f180592a, "p", "b", "q"});
            case 3:
                return new C51992gr();
            case 4:
                return new C51987gm();
            case 5:
                return f136445r;
            case 6:
                C63010eb ebVar = f136446t;
                if (ebVar == null) {
                    synchronized (C51992gr.class) {
                        ebVar = f136446t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136445r);
                            f136446t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
