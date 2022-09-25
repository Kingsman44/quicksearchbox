package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yt */
/* compiled from: PG */
public final class C7453yt extends C7290ss implements aac {

    /* renamed from: a */
    public static final /* synthetic */ int f24466a = 0;

    /* renamed from: b */
    private final C7449yp f24467b;

    /* renamed from: c */
    private final C6873dg f24468c;

    /* renamed from: d */
    private final C6872df f24469d;

    /* renamed from: e */
    private final C7036jh f24470e;

    /* renamed from: f */
    private final int f24471f;

    /* renamed from: g */
    private final aad f24472g;

    /* renamed from: h */
    private adh f24473h;

    /* renamed from: i */
    private final C7440yg f24474i;

    /* renamed from: j */
    private final acj f24475j;

    /* renamed from: k */
    private final aqd f24476k;

    static {
        C6861cv.m19920b("goog.exo.hls");
    }

    public /* synthetic */ C7453yt(C6873dg dgVar, C7440yg ygVar, C7449yp ypVar, aqd aqd, C7036jh jhVar, acj acj, aad aad, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C6872df dfVar = dgVar.f21858b;
        ary.m19467t(dfVar);
        this.f24469d = dfVar;
        this.f24468c = dgVar;
        this.f24474i = ygVar;
        this.f24467b = ypVar;
        this.f24476k = aqd;
        this.f24470e = jhVar;
        this.f24475j = acj;
        this.f24472g = aad;
        this.f24471f = i;
    }

    /* renamed from: U */
    public final C6873dg mo16522U() {
        return this.f24468c;
    }

    /* renamed from: V */
    public final void mo16523V(C7320tv tvVar) {
        ((C7451yr) tvVar).mo16828k();
    }

    /* renamed from: W */
    public final C7320tv mo16524W(C7321tw twVar, acc acc, long j) {
        C7332ug f = mo16471f(twVar);
        return new C7451yr(this.f24467b, this.f24472g, this.f24474i, this.f24473h, this.f24470e, mo16473h(twVar), this.f24475j, f, acc, this.f24476k, this.f24471f, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16467a(adh adh) {
        this.f24473h = adh;
        this.f24470e.mo16070b();
        this.f24472g.mo14304a(this.f24469d.f21849a, mo16471f((C7321tw) null), this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo16469d() {
        this.f24472g.mo14305b();
        this.f24470e.mo16071c();
    }

    /* renamed from: u */
    public final void mo16515u() {
        this.f24472g.mo14312i();
    }

    /* renamed from: y */
    public final void mo14303y(C7480zt ztVar) {
        C7358vf vfVar;
        long j;
        C7480zt ztVar2 = ztVar;
        long a = ztVar2.f24632k ? C6821bi.m19754a(ztVar2.f24624c) : -9223372036854775807L;
        int i = ztVar2.f24622a;
        long j2 = (i == 2 || i == 1) ? a : -9223372036854775807L;
        long j3 = ztVar2.f24623b;
        ary.m19467t(this.f24472g.mo14308e());
        C7458yy yyVar = new C7458yy();
        if (this.f24472g.mo14315l()) {
            long g = ztVar2.f24624c - this.f24472g.mo14310g();
            long j4 = ztVar2.f24631j ? g + ztVar2.f24635n : -9223372036854775807L;
            List list = ztVar2.f24634m;
            if (j3 != -9223372036854775807L) {
                j = j3;
            } else if (!list.isEmpty()) {
                int max = Math.max(0, list.size() - 3);
                long j5 = ztVar2.f24635n;
                long j6 = ztVar2.f24629h;
                long j7 = j5 - (j6 + j6);
                while (max > 0 && ((C7479zs) list.get(max)).f24615e > j7) {
                    max--;
                }
                j = ((C7479zs) list.get(max)).f24615e;
            } else {
                j = 0;
            }
            vfVar = new C7358vf(j2, a, j4, ztVar2.f24635n, g, j, true, !ztVar2.f24631j, true, yyVar, this.f24468c);
        } else {
            long j8 = j3 == -9223372036854775807L ? 0 : j3;
            long j9 = ztVar2.f24635n;
            vfVar = new C7358vf(j2, a, j9, j9, 0, j8, true, false, false, yyVar, this.f24468c);
        }
        mo16470e(vfVar);
    }
}
