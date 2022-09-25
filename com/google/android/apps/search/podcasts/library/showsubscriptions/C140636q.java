package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import com.google.android.apps.search.podcasts.library.showsubscriptions.p10584a.C140620d;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.q */
/* compiled from: PG */
public final class C140636q {

    /* renamed from: a */
    public static final C59071e f381946a = C59071e.m91331h();

    /* renamed from: b */
    public final ShowSubscriptionsFragment f381947b;

    /* renamed from: c */
    public final C46801dp f381948c;

    /* renamed from: d */
    public final C140620d f381949d;

    /* renamed from: e */
    public final C140630k f381950e;

    /* renamed from: f */
    public final C141213d f381951f;

    /* renamed from: g */
    public final C47770dh f381952g;

    /* renamed from: h */
    public final C28306ab f381953h;

    /* renamed from: i */
    public final C140621b f381954i;

    /* renamed from: j */
    public boolean f381955j;

    /* renamed from: k */
    public boolean f381956k;

    /* renamed from: l */
    private final C46485f f381957l;

    public C140636q(ShowSubscriptionsFragment showSubscriptionsFragment, C46801dp dpVar, C140620d dVar, C140630k kVar, C141213d dVar2, C47770dh dhVar, C46485f fVar, C28306ab abVar, C140621b bVar) {
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f381947b = showSubscriptionsFragment;
        this.f381948c = dpVar;
        this.f381949d = dVar;
        this.f381950e = kVar;
        this.f381951f = dVar2;
        this.f381952g = dhVar;
        this.f381957l = fVar;
        this.f381953h = abVar;
        this.f381954i = bVar;
    }

    /* renamed from: a */
    public final void mo115805a(C140621b bVar) {
        if (this.f381955j) {
            this.f381957l.mo50483d(this.f381947b.requireView()).mo50508d(R.id.podcasts_action_to_add_custom_feed, C46490k.m82868a(bVar).mo50504d());
            return;
        }
        C44581b bVar2 = new C44581b(this.f381947b.requireContext(), 0);
        bVar2.mo47604w(R.string.podcasts_subscribe_button_label);
        bVar2.mo47597p(R.string.podcasts_sign_in_to_subscribe);
        bVar2.mo47601t(R.string.podcasts_sign_in_accept, new C140635p(this));
        bVar2.mo47598q(R.string.podcasts_cancel, (DialogInterface.OnClickListener) null);
        C0392m create = bVar2.create();
        C69664n.m101060f(create, "private fun openSubscrip…  signInDialog.show()\n  }");
        create.show();
    }
}
