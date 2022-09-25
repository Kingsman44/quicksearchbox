package com.google.android.apps.search.googleapp.googleappbrowser;

import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10297k.C135868b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10297k.C135869c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135945a;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135946b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135948d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.TabsFragmentPeer;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10261b.C135506c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10265a.C135572a;
import com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10266b.C135575a;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136053ak;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136108z;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.apps.search.googleapp.p10527u.C139760a;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.p10527u.C139765f;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62912at;
import com.google.protobuf.C63077o;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.q */
/* compiled from: PG */
public final class C136109q {

    /* renamed from: D */
    private static final C58495hd f370677D;

    /* renamed from: a */
    public static final C59071e f370678a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.q");

    /* renamed from: A */
    public C28439i f370679A;

    /* renamed from: B */
    public boolean f370680B;

    /* renamed from: C */
    public final C38553h f370681C;

    /* renamed from: E */
    private final C133118a f370682E;

    /* renamed from: F */
    private final C135575a f370683F;

    /* renamed from: b */
    public final AccountId f370684b;

    /* renamed from: c */
    public final boolean f370685c;

    /* renamed from: d */
    public final C135462h f370686d;

    /* renamed from: e */
    public final C136020o f370687e;

    /* renamed from: f */
    public final C28306ab f370688f;

    /* renamed from: g */
    public final C43377v f370689g;

    /* renamed from: h */
    public final C136012b f370690h;

    /* renamed from: i */
    public final C136012b f370691i;

    /* renamed from: j */
    public final C136247a f370692j;

    /* renamed from: k */
    public final C135572a f370693k;

    /* renamed from: l */
    public final Optional f370694l;

    /* renamed from: m */
    public final C133081f f370695m;

    /* renamed from: n */
    public final C135869c f370696n;

    /* renamed from: o */
    public final C135946b f370697o;

    /* renamed from: p */
    public final C46801dp f370698p;

    /* renamed from: q */
    public final Optional f370699q;

    /* renamed from: r */
    public final C136370a f370700r;

    /* renamed from: s */
    public final C133110a f370701s;

    /* renamed from: t */
    public final boolean f370702t;

    /* renamed from: u */
    public final C135520bm f370703u;

    /* renamed from: v */
    public final C43269t f370704v;

    /* renamed from: w */
    public final boolean f370705w;

    /* renamed from: x */
    public final boolean f370706x;

    /* renamed from: y */
    public final boolean f370707y;

    /* renamed from: z */
    public final C46792di f370708z = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C136109q.f370678a.mo56226d()).mo56382g(th)).mo56372aa(40582)).mo56384n();
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            C135869c cVar = C136109q.this.f370696n;
            C60870cx c = cVar.f370042b.mo50246c(cVar.f370041a);
            C135868b bVar = new C135868b(cVar, uVar);
            C60922j.m93045h(c, C47810es.m84966f(bVar), C60826bg.f164896a);
            C135946b bVar2 = C136109q.this.f370697o;
            if (!bVar2.f370273d.f101930a && bVar2.f370271b.mo110979b()) {
                int i = uVar.f113328a;
                if ((i & 64) == 0 && (i & 4) == 0) {
                    C43369n a = C43369n.m76519a(uVar.f113330c);
                    if (a == null) {
                        a = C43369n.UNSPECIFIED;
                    }
                    if (a.equals(C43369n.SUCCESS) && uVar.f113333f == 100) {
                        String str = uVar.f113334g;
                        String str2 = uVar.f113329b;
                        C60870cx a2 = bVar2.f370274e.mo46277a(TimeUnit.MILLISECONDS);
                        C135945a aVar = new C135945a(bVar2, str, str2);
                        C46459k.m82829b(C60922j.m93045h(a2, C47810es.m84966f(aVar), bVar2.f370270a), "Failed to save web page as a tab", new Object[0]);
                        return;
                    }
                }
                if (!uVar.f113334g.isEmpty() && !uVar.f113329b.isEmpty() && !uVar.f113329b.equals(bVar2.f370272c)) {
                    C46459k.m82829b(bVar2.mo112646a(uVar.f113334g, uVar.f113329b, (Bitmap) null), "Failed to save web page as a tab", new Object[0]);
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C135461g.AMP_NOW, C139779t.HOME_SCREEN);
        gzVar.mo55429h(C135461g.NOW, C139779t.HOME_SCREEN);
        gzVar.mo55429h(C135461g.AMP, C139779t.SEARCH);
        gzVar.mo55429h(C135461g.SRP, C139779t.SEARCH);
        gzVar.mo55429h(C135461g.COLLECTIONS, C139779t.COLLECTIONS);
        gzVar.mo55429h(C135461g.MENU, C139779t.HOME_SCREEN);
        gzVar.mo55429h(C135461g.SUGGEST, C139779t.SEARCH);
        gzVar.mo55429h(C135461g.DOODLE, C139779t.HOME_SCREEN);
        gzVar.mo55429h(C135461g.TABS_MANAGER, C139779t.TABS);
        gzVar.mo55429h(C135461g.GAB_NEW_TAB_CREATION, C139779t.TABS);
        f370677D = gzVar.mo55427f(false);
    }

    public C136109q(AccountId accountId, boolean z, C135462h hVar, C136020o oVar, C28306ab abVar, C43377v vVar, C136012b bVar, C136012b bVar2, C135572a aVar, Optional optional, C133081f fVar, C133118a aVar2, C38553h hVar2, C135869c cVar, C135946b bVar3, C46801dp dpVar, Optional optional2, C136247a aVar3, C136370a aVar4, C133110a aVar5, boolean z2, C43269t tVar, C135520bm bmVar, C135575a aVar6, boolean z3, boolean z4, boolean z5) {
        this.f370684b = accountId;
        this.f370685c = z;
        this.f370686d = hVar;
        this.f370687e = oVar;
        this.f370688f = abVar;
        this.f370689g = vVar;
        this.f370690h = bVar;
        this.f370691i = bVar2;
        this.f370693k = aVar;
        this.f370694l = optional;
        this.f370695m = fVar;
        this.f370682E = aVar2;
        this.f370696n = cVar;
        this.f370697o = bVar3;
        this.f370698p = dpVar;
        this.f370699q = optional2;
        this.f370681C = hVar2;
        this.f370692j = aVar3;
        this.f370700r = aVar4;
        this.f370701s = aVar5;
        this.f370702t = z2;
        this.f370704v = tVar;
        this.f370703u = bmVar;
        this.f370683F = aVar6;
        this.f370705w = z3;
        this.f370706x = z4;
        this.f370707y = z5;
    }

    /* renamed from: a */
    static C136020o m221146a(AccountId accountId, C135462h hVar) {
        C136020o oVar = new C136020o();
        C68324h.m98669f(oVar);
        C47247a.m84047b(oVar, accountId);
        C47243l.m84039a(oVar, hVar);
        return oVar;
    }

    /* renamed from: b */
    public final C135948d mo112757b() {
        return (C135948d) this.f370687e.getChildFragmentManager().f634a.mo671c("googleappbrowser_tabs");
    }

    /* renamed from: c */
    public final C136053ak mo112758c() {
        Fragment c = this.f370687e.getChildFragmentManager().f634a.mo671c("googleappbrowser_bottom_bar");
        if (c != null) {
            return ((C136108z) c).mo17754z();
        }
        return null;
    }

    /* renamed from: d */
    public final C43861g mo112759d() {
        return (C43861g) this.f370687e.getChildFragmentManager().f634a.mo671c("googleappbrowser_webview");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo112760e(AssistContent assistContent) {
        if (!this.f370681C.f101930a) {
            String str = this.f370689g.mo46468a().f113329b;
            if (str.isEmpty()) {
                C43367l lVar = this.f370689g.mo46468a().f113335h;
                if (lVar == null) {
                    lVar = C43367l.f113293h;
                }
                str = lVar.f113296b;
            }
            if (!str.isEmpty()) {
                assistContent.setWebUri(Uri.parse(str));
            }
        }
    }

    /* renamed from: f */
    public final void mo112761f(boolean z) {
        C135948d b = mo112757b();
        if (b != null) {
            b.mo17754z().f370254c.mo50381d(C62912at.f169862a, C63077o.m96099a(z));
        }
    }

    /* renamed from: g */
    public final void mo112762g() {
        C43861g d = mo112759d();
        if (d != null) {
            d.mo17754z().f114326h.mo46862i(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo112763h() {
        C136053ak c = mo112758c();
        if (c != null && c.f370522j.f115862E == 3) {
            c.mo112716c();
            return true;
        } else if (mo112764i()) {
            return true;
        } else {
            if (this.f370700r.mo112949a()) {
                C135462h hVar = this.f370686d;
                if (hVar.f369069i && !hVar.f369072l && (hVar.f369061a & 4) != 0) {
                    C135461g a = C135461g.m219650a(hVar.f369064d);
                    if (a == null) {
                        a = C135461g.UNKNOWN;
                    }
                    if (mo112765j(a)) {
                        this.f370683F.mo112392a(1);
                        return true;
                    }
                }
            }
            this.f370683F.mo112392a(1);
            C135462h hVar2 = this.f370686d;
            if (!hVar2.f369072l || !hVar2.f369069i || !this.f370700r.mo112949a()) {
                return false;
            }
            this.f370687e.requireActivity().finishAndRemoveTask();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo112764i() {
        String str;
        C43861g d = mo112759d();
        if (d == null || !d.mo17754z().mo46876d()) {
            C135948d b = mo112757b();
            if (b == null) {
                return false;
            }
            TabsFragmentPeer a = b.mo17754z();
            View requireView = this.f370687e.requireView();
            if (!a.f370263l.f101930a && (str = a.f370255d.mo46384b().f112969h) != null) {
                a.mo112643a(str);
                if (a.f370262k.isEmpty()) {
                    C133118a aVar = a.f370259h;
                    aVar.f362916d++;
                    aVar.mo110981a(C37182a.f97779aK.mo40805c(C62722b.OK));
                } else if (!a.mo112644b()) {
                    a.f370259h.mo110982b();
                } else {
                    if (a.f370258g.mo112949a()) {
                        String str2 = a.f370262k;
                        C139765f fVar = (C139765f) C139767h.f379869k.createBuilder();
                        C139779t tVar = C139779t.SEARCH;
                        fVar.copyOnWrite();
                        C139767h hVar = (C139767h) fVar.instance;
                        hVar.f379872b = tVar.f379907i;
                        hVar.f379871a |= 1;
                        fVar.copyOnWrite();
                        C139767h hVar2 = (C139767h) fVar.instance;
                        hVar2.f379871a = 2 | hVar2.f379871a;
                        hVar2.f379873c = true;
                        fVar.copyOnWrite();
                        C139767h hVar3 = (C139767h) fVar.instance;
                        str2.getClass();
                        hVar3.f379871a |= 8;
                        hVar3.f379876f = str2;
                        fVar.copyOnWrite();
                        C139767h hVar4 = (C139767h) fVar.instance;
                        hVar4.f379871a |= 128;
                        hVar4.f379880j = str;
                        C47393f.m84237h(new C139760a((C139767h) fVar.build()), requireView);
                    } else {
                        C135948d dVar = a.f370253b;
                        String str3 = a.f370262k;
                        C136128i l = C136129j.m221208l();
                        l.mo112776k(C139779t.SEARCH);
                        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
                        eVar.copyOnWrite();
                        C137418g gVar = (C137418g) eVar.instance;
                        str3.getClass();
                        gVar.f373769a |= 1;
                        gVar.f373770b = str3;
                        l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
                        l.mo112772g(Optional.m71637of(str));
                        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
                        C136127h.m221196a(intent, l.mo112766a());
                        C47709i.m84861a(dVar, intent);
                    }
                    a.f370259h.mo110982b();
                    return true;
                }
            }
            return false;
        }
        if (this.f370701s.mo110979b()) {
            this.f370682E.mo110982b();
        }
        this.f370683F.mo112392a(2);
        return true;
    }

    /* renamed from: j */
    public final boolean mo112765j(C135461g gVar) {
        C58495hd hdVar = f370677D;
        if (!hdVar.containsKey(gVar)) {
            return false;
        }
        if (this.f370686d.f369073m) {
            C47393f.m84236g(new C135506c((C139779t) hdVar.getOrDefault(gVar, C139779t.HOME_SCREEN)), this.f370687e);
            return true;
        }
        C47393f.m84236g(C139762c.m227230b((C139779t) hdVar.getOrDefault(gVar, C139779t.HOME_SCREEN)), this.f370687e);
        return true;
    }
}
