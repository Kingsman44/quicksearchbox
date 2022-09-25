package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ys */
/* compiled from: PG */
public final class C7452ys implements C7334ui {

    /* renamed from: a */
    private C7449yp f24457a = C7449yp.f24411a;

    /* renamed from: b */
    private C7484zx f24458b = new C7471zk();

    /* renamed from: c */
    private C7485zy f24459c = C7474zn.f24574a;

    /* renamed from: d */
    private int f24460d;

    /* renamed from: e */
    private List f24461e;

    /* renamed from: f */
    private final C7440yg f24462f;

    /* renamed from: g */
    private acj f24463g;

    /* renamed from: h */
    private final acs f24464h = new acs();

    /* renamed from: i */
    private aqd f24465i;

    public C7452ys(C7440yg ygVar) {
        ary.m19467t(ygVar);
        this.f24462f = ygVar;
        int i = C7453yt.f24466a;
        C7449yp ypVar = null;
        if (aeu.f20466a >= 30) {
            try {
                ypVar = (C7449yp) Class.forName("com.google.ads.interactivemedia.v3.exoplayer2.source.MediaParserHlsMediaChunkExtractor").getDeclaredField("FACTORY").get((Object) null);
            } catch (Exception unused) {
            }
        }
        if (ypVar != null) {
            this.f24457a = ypVar;
        }
        this.f24463g = new acj();
        this.f24465i = new aqd();
        this.f24460d = 1;
        this.f24461e = Collections.emptyList();
    }

    @Deprecated
    /* renamed from: a */
    public final C7453yt mo16833a(Uri uri) {
        List list;
        C6868db dbVar = new C6868db();
        dbVar.mo15656h(uri);
        dbVar.mo15654f("application/x-mpegURL");
        C6873dg a = dbVar.mo15649a();
        ary.m19467t(a.f21858b);
        C7484zx zxVar = this.f24458b;
        if (a.f21858b.f21852d.isEmpty()) {
            list = this.f24461e;
        } else {
            list = a.f21858b.f21852d;
        }
        if (!list.isEmpty()) {
            zxVar = new C7475zo(zxVar, list);
        }
        C6872df dfVar = a.f21858b;
        Object obj = dfVar.f21856h;
        if (dfVar.f21852d.isEmpty() && !list.isEmpty()) {
            C6868db a2 = a.mo15665a();
            a2.mo15655g(list);
            a = a2.mo15649a();
        }
        C6873dg dgVar = a;
        C7440yg ygVar = this.f24462f;
        C7449yp ypVar = this.f24457a;
        aqd aqd = this.f24465i;
        C7036jh b = acs.m18254b(dgVar);
        acj acj = this.f24463g;
        return new C7453yt(dgVar, ygVar, ypVar, aqd, b, acj, new C7474zn(this.f24462f, acj, zxVar), this.f24460d, (byte[]) null, (byte[]) null, (byte[]) null);
    }
}
