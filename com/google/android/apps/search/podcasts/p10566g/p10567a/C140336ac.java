package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.library.showsubscriptions.C140621b;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140371f;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140372g;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140373h;
import com.google.android.apps.search.podcasts.p10600q.C140943b;
import com.google.android.apps.search.podcasts.p10600q.C140946e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.play.unison.binding.C31951a;
import com.google.android.libraries.play.unison.binding.C31963al;
import com.google.android.libraries.play.unison.binding.C31969ar;
import com.google.android.libraries.play.unison.binding.C31975ax;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.android.libraries.play.unison.binding.C31993s;
import com.google.android.libraries.play.unison.binding.C31996v;
import com.google.android.libraries.play.unison.binding.C31999y;
import com.google.android.libraries.play.unison.binding.C32000z;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;

/* renamed from: com.google.android.apps.search.podcasts.g.a.ac */
/* compiled from: PG */
final class C140336ac extends C31993s {

    /* renamed from: c */
    private final C31969ar f381210c;

    /* renamed from: d */
    private final C28306ab f381211d;

    public C140336ac(C46485f fVar, C31975ax axVar, C31975ax axVar2, C0660fv fvVar, C28306ab abVar, View view) {
        super(view);
        this.f381211d = abVar;
        ((TextView) view.findViewById(R.id.podcasts_subscriptions_page_button)).setOnClickListener(fVar.mo50480a(R.id.podcasts_action_to_show_subscriptions, C46490k.m82868a(C140621b.f381913c).mo50504d(), "Clicked Home to Show Subscriptions"));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.podcasts_subscriptions_carousel_recycler);
        C140943b.m228894a(recyclerView, fvVar);
        C31969ar a = C31963al.m59554a(recyclerView, new C31996v(new C32000z(C140371f.class, axVar), new C32000z(C140373h.class, axVar2)), C31969ar.f85962j, C140335ab.f381209a, C31999y.f85999a, C31963al.f85947a);
        this.f381210c = a;
        mo37763k(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo37761c(Object obj, C31989o oVar) {
        mo37764l(this.f381210c, C140946e.m228899a(((C140372g) obj).f381319a));
        C28306ab abVar = this.f381211d;
        abVar.mo33802c(this.f85977f, abVar.f76990a.mo33805a(C28427h.m53115a(97613)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo37762d() {
        C31951a.m59536b(this.f381210c);
        C28306ab.m52929e(this.f85977f);
    }
}
