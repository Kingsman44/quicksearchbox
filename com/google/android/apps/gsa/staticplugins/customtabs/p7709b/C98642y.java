package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.browser.p059a.C0967o;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6519al.p6538ai.C84687a;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6807j.C86136e;
import com.google.android.apps.gsa.search.core.p6807j.C86137f;
import com.google.android.apps.gsa.search.core.p6807j.C86138g;
import com.google.android.apps.gsa.search.core.p6807j.C86139h;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7061g.C89917a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98573i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1703d.C20670z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60494rz;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.y */
/* compiled from: PG */
public final class C98642y implements C91007g {

    /* renamed from: a */
    public static final C59071e f275494a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.b.y");

    /* renamed from: A */
    private boolean f275495A;

    /* renamed from: B */
    private final C98622e f275496B;

    /* renamed from: b */
    public final Context f275497b;

    /* renamed from: c */
    public final C86124t f275498c;

    /* renamed from: d */
    public final C98573i f275499d;

    /* renamed from: e */
    public final C22871g f275500e;

    /* renamed from: f */
    public final C22871g f275501f;

    /* renamed from: g */
    public final C68214a f275502g;

    /* renamed from: h */
    public final C98595a f275503h;

    /* renamed from: i */
    public final C89917a f275504i;

    /* renamed from: j */
    public final int f275505j;

    /* renamed from: k */
    public final C20670z f275506k;

    /* renamed from: l */
    public final C98641x f275507l = new C98641x(this);

    /* renamed from: m */
    public volatile boolean f275508m = false;

    /* renamed from: n */
    public volatile boolean f275509n = false;

    /* renamed from: o */
    public volatile boolean f275510o = true;

    /* renamed from: p */
    public volatile C98596aa f275511p;

    /* renamed from: q */
    public volatile C98610ao f275512q;

    /* renamed from: r */
    public volatile Uri f275513r;

    /* renamed from: s */
    public volatile Uri f275514s;

    /* renamed from: t */
    public volatile C86139h f275515t;

    /* renamed from: u */
    public volatile boolean f275516u = false;

    /* renamed from: v */
    public final C98621d f275517v;

    /* renamed from: w */
    private final C22871g f275518w;

    /* renamed from: x */
    private final C85142a f275519x;

    /* renamed from: y */
    private final C98611ap f275520y;

    /* renamed from: z */
    private final C85929cw f275521z;

    public C98642y(Context context, C86124t tVar, C98573i iVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C85142a aVar, C98611ap apVar, C68214a aVar2, C98595a aVar3, C85929cw cwVar, C89917a aVar4, C20670z zVar, int i, C98621d dVar, C98622e eVar) {
        this.f275497b = context;
        this.f275498c = tVar;
        this.f275499d = iVar;
        this.f275500e = gVar;
        this.f275501f = gVar2;
        this.f275518w = gVar3;
        this.f275519x = aVar;
        this.f275520y = apVar;
        this.f275502g = aVar2;
        this.f275503h = aVar3;
        this.f275521z = cwVar;
        this.f275504i = aVar4;
        this.f275506k = zVar;
        this.f275505j = i;
        this.f275517v = dVar;
        this.f275496B = eVar;
    }

    /* renamed from: a */
    public final void mo91243a(C86137f fVar) {
        C86137f fVar2 = fVar;
        Uri parse = Uri.parse(fVar2.f232807b);
        String s = this.f275521z.mo79577s(parse, false, false);
        if (s != null) {
            parse = Uri.parse(s);
        }
        this.f275513r = parse;
        this.f275514s = null;
        long j = fVar2.f232810e;
        C98611ap apVar = this.f275520y;
        C60494rz a = C60494rz.m92598a(fVar2.f232809d);
        if (a == null) {
            a = C60494rz.UNKNOWN;
        }
        C60494rz rzVar = a;
        Uri uri = this.f275513r;
        Uri uri2 = uri;
        Context context = (Context) apVar.f275422a.mo17428b();
        context.getClass();
        C86124t tVar = (C86124t) apVar.f275423b.mo17428b();
        tVar.getClass();
        C84474e eVar = (C84474e) apVar.f275424c.mo17428b();
        eVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) apVar.f275425d).f184585a);
        a2.getClass();
        C84687a aVar = (C84687a) apVar.f275426e.mo17428b();
        aVar.getClass();
        C85929cw cwVar = (C85929cw) apVar.f275427f.mo17428b();
        cwVar.getClass();
        C22871g gVar = (C22871g) apVar.f275428g.mo17428b();
        C98610ao aoVar = r0;
        C22871g gVar2 = gVar;
        gVar.getClass();
        C22871g gVar3 = (C22871g) apVar.f275429h.mo17428b();
        Uri uri3 = uri;
        C22871g gVar4 = gVar3;
        gVar3.getClass();
        C98617av avVar = (C98617av) apVar.f275430i.mo17428b();
        C98611ap apVar2 = apVar;
        C98617av avVar2 = avVar;
        avVar.getClass();
        C21370a aVar2 = (C21370a) apVar2.f275431j.mo17428b();
        long j2 = j;
        C21370a aVar3 = aVar2;
        aVar2.getClass();
        C98573i iVar = (C98573i) apVar2.f275432k.mo17428b();
        iVar.getClass();
        rzVar.getClass();
        uri3.getClass();
        C98610ao aoVar2 = new C98610ao(context, tVar, eVar, a2, aVar, cwVar, gVar2, gVar4, avVar2, aVar3, iVar, this, rzVar, uri2, j2);
        this.f275512q = aoVar;
        C98572h a3 = this.f275499d.mo91191a();
        this.f275510o = fVar.f232808c && a3 != null && a3.mo79780c() && this.f275506k.mo25668g();
        C86138g gVar5 = (C86138g) C86139h.f232811d.createBuilder();
        int i = this.f275505j;
        gVar5.copyOnWrite();
        C86139h hVar = (C86139h) gVar5.instance;
        hVar.f232813a |= 1;
        hVar.f232814b = i;
        C86136e eVar2 = (C86136e) fVar.toBuilder();
        eVar2.copyOnWrite();
        C86137f fVar3 = (C86137f) eVar2.instance;
        fVar3.f232806a |= 8;
        fVar3.f232810e = j2;
        C86137f fVar4 = (C86137f) eVar2.build();
        gVar5.copyOnWrite();
        C86139h hVar2 = (C86139h) gVar5.instance;
        fVar4.getClass();
        hVar2.f232815c = fVar4;
        hVar2.f232813a |= 2;
        this.f275515t = (C86139h) gVar5.build();
    }

    /* renamed from: b */
    public final void mo91244b(Uri uri) {
        if (!uri.equals(this.f275514s)) {
            this.f275514s = uri;
            this.f275495A = true;
        }
    }

    /* renamed from: c */
    public final void mo91245c() {
        if (this.f275495A && this.f275514s != null) {
            this.f275495A = false;
            new C90873ag(this.f275519x.mo78732a(this.f275514s), this.f275518w, "Update save icon", new C98636s(this)).mo85223a(C98637t.f275489a);
        }
    }

    /* renamed from: e */
    public final void mo91246e(Bitmap bitmap, String str) {
        boolean z;
        C98572h a = this.f275499d.mo91191a();
        if (a == null || !a.mo25587k(18)) {
            C0967o oVar = this.f275506k.f57939b;
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            oVar.mo3593a(bundle);
            try {
                z = oVar.f3080d.mo94a(oVar.f3077a, bundle2);
            } catch (RemoteException unused) {
                z = false;
            }
        } else {
            z = this.f275506k.f57939b.mo3595c(bitmap, str);
        }
        if (z) {
            C89949q.m146523g(1042);
            return;
        }
        this.f275495A = true;
        C89949q.m146523g(1041);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        C98622e eVar = this.f275496B;
        int i = this.f275505j;
        C98634q qVar = eVar.f275456a;
        synchronized (qVar.f275476g) {
            qVar.f275476g.remove(i);
        }
        super.finalize();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("CustomTabsSession");
        fVar.mo85279c("package name").mo85276a(C90752i.m148229c(this.f275506k.f57938a.f57932a));
        fVar.mo85279c("private API version").mo85276a(C90752i.m148230d(this.f275506k.f57938a.mo25584iG()));
    }
}
