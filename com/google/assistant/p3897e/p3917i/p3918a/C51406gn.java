package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52378pn;
import com.google.assistant.p3897e.p3921j.C52438rt;
import com.google.assistant.p3897e.p3921j.C52654zt;
import com.google.assistant.p3897e.p3921j.aos;
import com.google.assistant.p3897e.p3921j.p3922a.C51644b;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.e.i.a.gn */
/* compiled from: PG */
public final class C51406gn extends C62937bq implements C62938br {

    /* renamed from: s */
    public static final C51406gn f133887s;

    /* renamed from: v */
    private static volatile C63010eb f133888v;

    /* renamed from: a */
    public int f133889a;

    /* renamed from: b */
    public aos f133890b;

    /* renamed from: c */
    public C52003hb f133891c;

    /* renamed from: d */
    public C51953ff f133892d;

    /* renamed from: e */
    public C52654zt f133893e;

    /* renamed from: f */
    public int f133894f;

    /* renamed from: g */
    public C52378pn f133895g;

    /* renamed from: h */
    public C51403gk f133896h;

    /* renamed from: i */
    public C51399gg f133897i;

    /* renamed from: j */
    public C51397ge f133898j;

    /* renamed from: k */
    public C51393ga f133899k;

    /* renamed from: l */
    public C51395gc f133900l;

    /* renamed from: m */
    public C51405gm f133901m;

    /* renamed from: n */
    public boolean f133902n;

    /* renamed from: o */
    public C52438rt f133903o;

    /* renamed from: p */
    public C51389fx f133904p;

    /* renamed from: q */
    public String f133905q = BuildConfig.FLAVOR;

    /* renamed from: r */
    public C64735n f133906r;

    /* renamed from: t */
    private C51644b f133907t;

    /* renamed from: u */
    private byte f133908u = 2;

    static {
        C51406gn gnVar = new C51406gn();
        f133887s = gnVar;
        C62942bv.registerDefaultInstance(C51406gn.class, gnVar);
    }

    private C51406gn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133908u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133908u = b;
                return null;
            case 2:
                return newMessageInfo(f133887s, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0005ဉ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဇ\f\u0010ဉ\r\u0011ဉ\u000e\u0012ဈ\u000f\u0013ဉ\u0010\u0014ဉ\u0011", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C51401gi.m86176b(), C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", C42181t.f110467a, C33259r.f88929b});
            case 3:
                return new C51406gn();
            case 4:
                return new C51390fy();
            case 5:
                return f133887s;
            case 6:
                C63010eb ebVar = f133888v;
                if (ebVar == null) {
                    synchronized (C51406gn.class) {
                        ebVar = f133888v;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133887s);
                            f133888v = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
