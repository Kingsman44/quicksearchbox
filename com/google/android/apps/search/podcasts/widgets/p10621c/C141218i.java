package com.google.android.apps.search.podcasts.widgets.p10621c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.widget.C0678gm;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.C1877c;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.p175a.C3687aw;
import androidx.mediarouter.p175a.C3701bj;
import androidx.mediarouter.p175a.C3702bk;
import com.google.android.apps.search.podcasts.p10601r.C140954a;
import com.google.android.apps.search.podcasts.p10601r.C140997s;
import com.google.android.apps.search.podcasts.widgets.p10619a.C141185a;
import com.google.android.apps.search.podcasts.widgets.p10619a.C141186b;
import com.google.android.apps.search.podcasts.widgets.p10619a.C141187c;
import com.google.android.apps.search.podcasts.widgets.p10619a.C141188d;
import com.google.android.apps.search.podcasts.widgets.p10619a.C141190f;
import com.google.android.apps.search.podcasts.widgets.p10619a.C141193i;
import com.google.android.gms.cast.framework.C143380a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30304m;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30309r;
import com.google.android.libraries.onegoogle.accountmenu.features.C30495a;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.features.C30522c;
import com.google.android.libraries.onegoogle.accountmenu.features.C30606g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30630m;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30507d;
import com.google.android.libraries.onegoogle.accountmenu.features.p2359a.C30508e;
import com.google.android.libraries.onegoogle.accountmenu.features.p2361b.C30521c;
import com.google.android.libraries.onegoogle.accountmenu.features.p2375i.C30624c;
import com.google.android.libraries.onegoogle.accountmenu.p2353c.C30343m;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30461b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30473n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30474o;
import com.google.android.libraries.onegoogle.p2380c.C30834a;
import com.google.android.libraries.onegoogle.p2380c.p2382b.p2383a.C30867f;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19522b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.p3616e.p3623f.C46354b;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.c.i */
/* compiled from: PG */
public final class C141218i {

    /* renamed from: a */
    private final Context f383387a;

    /* renamed from: b */
    private final AccountId f383388b;

    /* renamed from: c */
    private final C141193i f383389c;

    /* renamed from: d */
    private final boolean f383390d;

    /* renamed from: e */
    private final C28306ab f383391e;

    /* renamed from: f */
    private final C140997s f383392f;

    public C141218i(Context context, C47770dh dhVar, AccountId accountId, C141193i iVar, boolean z, C28306ab abVar, C140997s sVar) {
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(sVar, "veLoggedEvents");
        this.f383387a = context;
        this.f383388b = accountId;
        this.f383389c = iVar;
        this.f383390d = z;
        this.f383391e = abVar;
        this.f383392f = sVar;
    }

    /* renamed from: a */
    public final void mo116230a(C19522b bVar, View view) {
        C58485gu guVar;
        C69664n.m101061g(view, "rootView");
        if (C3687aw.m10683e(this.f383387a).mo7771f() == null) {
            C3701bj bjVar = new C3701bj();
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON", !this.f383390d);
            bjVar.f11897d = new Bundle(bundle);
            C3687aw.m10688r(new C3702bk(bjVar));
        }
        View findViewById = view.findViewById(R.id.podcasts_media_route_button);
        C69664n.m101060f(findViewById, "rootView.findViewById(R.…casts_media_route_button)");
        MediaRouteButton mediaRouteButton = (MediaRouteButton) findViewById;
        if (C140954a.m228911a(bVar.requireContext())) {
            C143380a.m232631a(bVar.requireContext().getApplicationContext(), mediaRouteButton);
        }
        C28306ab abVar = this.f383391e;
        abVar.mo33801b(mediaRouteButton, abVar.f76990a.mo33805a(C28427h.m53115a(56953)));
        this.f383392f.mo116062a(mediaRouteButton, C141217h.f383386a, "cast button click");
        C141193i iVar = this.f383389c;
        AccountId accountId = this.f383388b;
        MenuItem a = C141216g.m229225a(view);
        C69664n.m101058d(a);
        C30304m f = C30305n.m56405f(iVar.f383321b, C46108a.class);
        C30309r rVar = (C30309r) f;
        rVar.f81942d = iVar.f383326g;
        rVar.f81941c = new C30306o(iVar.f383326g);
        C30495a a2 = C30518b.m56960a();
        ((C30522c) a2).f82435e = C58833ax.m90834k(C30624c.m57226e());
        C30507d a3 = C30508e.m56929a();
        if (iVar.f383332m) {
            Context requireContext = bVar.requireContext();
            C30630m k = C30631n.m57247k();
            k.mo36301b(C1877c.m5125a(requireContext, R.drawable.quantum_gm_ic_policy_vd_theme_24));
            k.mo36303d(requireContext.getString(R.string.podcasts_content_policies));
            ((C30606g) k).f82677b = new C47591co(iVar.f383329j, "Account menu content policies click", new C141185a(requireContext));
            guVar = C58485gu.m89846n(k.mo36300a());
        } else {
            guVar = C58485gu.m89845m();
        }
        a3.mo36139b(guVar);
        a2.mo36134f(a3.mo36138a());
        C0167am activity = bVar.getActivity();
        C30464e b = C30521c.m56984b(activity, activity.getString(R.string.podcasts_launcher_app_name), new C47591co(iVar.f383329j, "Account menu settings click", new C141186b(iVar, bVar)));
        C0167am activity2 = bVar.getActivity();
        C47591co coVar = new C47591co(iVar.f383329j, "Account menu help click", new C141187c(iVar));
        Drawable c = C0678gm.m2375e().mo3100c(activity2, R.drawable.quantum_gm_ic_help_outline_vd_theme_24);
        c.getClass();
        C30462c g = C30464e.m56760g();
        g.mo36053f(R.id.og_ai_help);
        C30466g gVar = (C30466g) g;
        gVar.f82287a = c;
        g.mo36054g(activity2.getString(R.string.og_help_action_string));
        g.mo36056i(90539);
        gVar.f82288b = coVar;
        g.mo36058k(true);
        g.mo36049b(C30461b.HELP_AND_FEEDBACK);
        C30464e a4 = g.mo36048a();
        C0167am activity3 = bVar.getActivity();
        C47591co coVar2 = new C47591co(iVar.f383329j, "Account menu feedback click", new C141188d(iVar));
        Drawable c2 = C0678gm.m2375e().mo3100c(activity3, R.drawable.quantum_gm_ic_feedback_vd_theme_24);
        c2.getClass();
        C30462c g2 = C30464e.m56760g();
        g2.mo36053f(R.id.og_ai_feedback);
        C30466g gVar2 = (C30466g) g2;
        gVar2.f82287a = c2;
        g2.mo36054g(activity3.getString(R.string.og_feedback_action_string));
        g2.mo36056i(90540);
        gVar2.f82288b = coVar2;
        g2.mo36058k(true);
        g2.mo36049b(C30461b.HELP_AND_FEEDBACK);
        a2.mo36131c(C58485gu.m89848p(b, a4, g2.mo36048a()));
        f.mo35845s(a2.mo36129a());
        C30473n h = C30474o.m56824h();
        h.mo36087d(false);
        f.mo35844r(h.mo36084a());
        rVar.f81947i = C46354b.m82635a(iVar.f383325f, bVar, iVar.f383326g);
        rVar.f81945g = new C30834a(iVar.f383326g, iVar.f383321b);
        f.f81933b = iVar.f383328i;
        f.mo35849w(iVar.f383327h);
        rVar.f81950l = C58833ax.m90834k(new C30867f());
        C30305n d = f.mo35830d();
        C30306o i = d.mo35858i();
        iVar.f383323d.mo50707a(iVar.f383322c.mo50245b(), new C141193i.C141194a(i, accountId));
        i.f81934a.f81880a.add(new C141190f(iVar.f383324e, accountId));
        a.setActionView(R.layout.selected_account_disc_toolbar);
        C30343m.m56502b(bVar, d, (SelectedAccountDisc) a.getActionView().findViewById(R.id.selected_account_disc));
    }
}
