package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48800ah;
import com.google.assistant.p3803ag.p3809c.C49138hw;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5036r.C65323i;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.e.j.aas */
/* compiled from: PG */
public final class aas extends C62937bq implements C62938br {

    /* renamed from: u */
    public static final aas f134661u;

    /* renamed from: x */
    private static volatile C63010eb f134662x;

    /* renamed from: a */
    public int f134663a;

    /* renamed from: b */
    public int f134664b;

    /* renamed from: c */
    public C62971cq f134665c;

    /* renamed from: d */
    public long f134666d;

    /* renamed from: e */
    public long f134667e;

    /* renamed from: f */
    public String f134668f;

    /* renamed from: g */
    public C63088z f134669g;

    /* renamed from: h */
    public String f134670h;

    /* renamed from: i */
    public String f134671i;

    /* renamed from: j */
    public int f134672j;

    /* renamed from: k */
    public C62971cq f134673k;

    /* renamed from: l */
    public String f134674l;

    /* renamed from: m */
    public String f134675m;

    /* renamed from: n */
    public aap f134676n;

    /* renamed from: o */
    public boolean f134677o;

    /* renamed from: p */
    public long f134678p;

    /* renamed from: q */
    public long f134679q;

    /* renamed from: r */
    public C48800ah f134680r;

    /* renamed from: s */
    public C65323i f134681s;

    /* renamed from: t */
    public boolean f134682t;

    /* renamed from: v */
    private C51016dg f134683v;

    /* renamed from: w */
    private byte f134684w = 2;

    static {
        aas aas = new aas();
        f134661u = aas;
        C62942bv.registerDefaultInstance(aas.class, aas);
    }

    private aas() {
        C63088z zVar = C63088z.f170246b;
        this.f134665c = emptyProtobufList();
        this.f134668f = BuildConfig.FLAVOR;
        this.f134669g = C63088z.f170246b;
        this.f134670h = BuildConfig.FLAVOR;
        this.f134671i = BuildConfig.FLAVOR;
        this.f134673k = emptyProtobufList();
        this.f134674l = BuildConfig.FLAVOR;
        this.f134675m = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134684w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134684w = b;
                return null;
            case 2:
                return newMessageInfo(f134661u, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0000\u0002\u0002\u0001ဌ\u0000\u0003\u001b\u0004ဂ\u0002\u0006ဈ\u0004\bဈ\b\t\u001b\nည\u0007\u000bဈ\u000b\fဈ\f\rဂ\u0003\u000eᐉ\u0006\u000fဇ\u000e\u0010ᐉ\r\u0012ဂ\u0010\u0013ဉ\u0012\u0014ဈ\t\u0015ဌ\n\u0016ဉ\u0013\u0017ဂ\u0011\u0018ဇ\u0014", new Object[]{"a", "b", aaq.f134660a, C45240c.f118157a, C52428rj.class, "d", C10662f.f35572a, C19618h.f54585a, C19621k.f54601a, C49138hw.class, C30325g.f82003a, "l", "m", "e", "v", C66412o.f180592a, C48004n.f124238a, "p", C33259r.f88929b, "i", "j", aak.f134648a, C59002s.f156871a, "q", C42181t.f110467a});
            case 3:
                return new aas();
            case 4:
                return new aaj();
            case 5:
                return f134661u;
            case 6:
                C63010eb ebVar = f134662x;
                if (ebVar == null) {
                    synchronized (aas.class) {
                        ebVar = f134662x;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134661u);
                            f134662x = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
