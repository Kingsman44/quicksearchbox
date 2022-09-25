package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.view.ActionMode;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.LockableBottomSheetBehavior;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a.C136039a;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a.C136042d;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b.C136072b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.weblayer.contrib.p3453b.C44169c;
import com.google.android.libraries.web.weblayer.contrib.p3457e.C44197d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3711b.C47696d;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3711b.C47697e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ak */
/* compiled from: PG */
public final class C136053ak {

    /* renamed from: a */
    public static final C59071e f370513a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ak");

    /* renamed from: b */
    public final C136108z f370514b;

    /* renamed from: c */
    public final boolean f370515c;

    /* renamed from: d */
    public final C46801dp f370516d;

    /* renamed from: e */
    public final C44197d f370517e;

    /* renamed from: f */
    public final C46855i f370518f;

    /* renamed from: g */
    public final C44169c f370519g;

    /* renamed from: h */
    public final C43377v f370520h;

    /* renamed from: i */
    public final C136042d f370521i;

    /* renamed from: j */
    public final LockableBottomSheetBehavior f370522j;

    /* renamed from: k */
    public final C136072b f370523k;

    /* renamed from: l */
    public final Map f370524l;

    /* renamed from: m */
    public final Map f370525m;

    /* renamed from: n */
    public final C28306ab f370526n;

    /* renamed from: o */
    public final C46792di f370527o;

    /* renamed from: p */
    public final C136066aw f370528p;

    /* renamed from: q */
    public final Optional f370529q;

    /* renamed from: r */
    public final boolean f370530r;

    /* renamed from: s */
    public final boolean f370531s;

    /* renamed from: t */
    public final C136039a f370532t = new C136050ah(this);

    /* renamed from: u */
    public final C136039a f370533u = new C136051ai(this);

    /* renamed from: v */
    public ActionMode f370534v = null;

    /* renamed from: w */
    private final AccountId f370535w;

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.ak$a */
    /* compiled from: PG */
    final class C136054a implements C46792di {

        /* renamed from: b */
        private String f370537b = BuildConfig.FLAVOR;

        public C136054a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C136053ak.f370513a.mo56225c()).mo56382g(th)).mo56372aa(40661)).mo56384n();
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            String str;
            C43376u uVar = (C43376u) obj;
            if ((uVar.f113328a & 64) != 0) {
                C43367l lVar = uVar.f113335h;
                if (lVar == null) {
                    lVar = C43367l.f113293h;
                }
                str = lVar.f113296b;
            } else {
                str = uVar.f113329b;
            }
            if (!this.f370537b.equals(str)) {
                C136053ak.this.mo112719f();
                C136053ak.this.mo112716c();
                C136053ak.this.f370521i.mo112541j();
            }
            this.f370537b = str;
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C136053ak(AccountId accountId, C136108z zVar, C46801dp dpVar, C44197d dVar, C46855i iVar, C44169c cVar, C43377v vVar, C136072b bVar, Set set, Map map, Map map2, C28306ab abVar, C47697e eVar, C136060aq aqVar, C136067ax axVar, boolean z, boolean z2) {
        Optional optional;
        C136067ax axVar2 = axVar;
        this.f370535w = accountId;
        this.f370514b = zVar;
        this.f370516d = dpVar;
        this.f370517e = dVar;
        this.f370518f = iVar;
        this.f370519g = cVar;
        this.f370520h = vVar;
        this.f370523k = bVar;
        this.f370524l = map;
        this.f370525m = map2;
        this.f370526n = abVar;
        this.f370530r = z2;
        this.f370527o = new C136054a();
        boolean isEmpty = set.isEmpty();
        this.f370515c = isEmpty;
        Optional findFirst = Collection.EL.stream(map.values()).filter(C136045ac.f370505a).findFirst();
        this.f370531s = findFirst.isPresent();
        LockableBottomSheetBehavior s = LockableBottomSheetBehavior.m221089s(zVar.requireContext(), isEmpty, !findFirst.isPresent(), new C136046ad(zVar));
        this.f370522j = s;
        C136042d dVar2 = new C136042d(s);
        this.f370521i = dVar2;
        findFirst.ifPresent(new C136047ae(this));
        s.mo47506D(new C47696d(eVar, dVar2));
        Context requireContext = zVar.requireContext();
        requireContext.getClass();
        findFirst.getClass();
        s.getClass();
        C60888db dbVar = (C60888db) axVar2.f370581a.mo17428b();
        dbVar.getClass();
        Boolean bool = (Boolean) axVar2.f370582b.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) axVar2.f370583c.mo17428b();
        bool2.getClass();
        this.f370528p = new C136066aw(requireContext, isEmpty, findFirst, s, dbVar, booleanValue, bool2.booleanValue());
        if (z) {
            optional = Optional.empty();
        } else {
            findFirst.getClass();
            C28443m mVar = (C28443m) aqVar.f370548a.mo17428b();
            mVar.getClass();
            optional = Optional.m71637of(new C136059ap(findFirst, mVar));
        }
        this.f370529q = optional;
    }

    /* renamed from: a */
    public final Fragment mo112714a() {
        return this.f370514b.getChildFragmentManager().f634a.mo671c("ReplacementBottomBar");
    }

    /* renamed from: b */
    public final void mo112715b(boolean z) {
        AccountId accountId = this.f370535w;
        C136070b bVar = new C136070b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        mo112718e(bVar, "DefaultBottomBar", z);
    }

    /* renamed from: c */
    public final void mo112716c() {
        this.f370522j.mo47519v(true != this.f370515c ? 4 : 5);
    }

    /* renamed from: d */
    public final void mo112717d(boolean z) {
        this.f370528p.f370570g = z;
        this.f370522j.f370624b = z;
        int i = true != z ? 0 : 4;
        View findViewById = this.f370514b.requireView().findViewById(R.id.googleapp_browser_bottomsheet_draghandle);
        if (true != this.f370531s) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    /* renamed from: e */
    public final void mo112718e(Fragment fragment, String str, boolean z) {
        C0154a aVar = new C0154a(this.f370514b.getChildFragmentManager());
        if (!z && !this.f370515c) {
            aVar.mo691x(R.anim.googleapp_browser_bottombar_fade_in, R.anim.googleapp_browser_bottombar_fade_out, R.anim.googleapp_browser_bottombar_fade_in, R.anim.googleapp_browser_bottombar_fade_out);
        }
        aVar.mo689v(R.id.googleapp_browser_bottomsheet_bottombar_container, fragment, str);
        aVar.mo509f();
    }

    /* renamed from: f */
    public final void mo112719f() {
        if (mo112714a() != null) {
            mo112717d(false);
            mo112715b(false);
            mo112716c();
        }
    }
}
