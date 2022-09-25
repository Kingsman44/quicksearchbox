package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97922l;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140367b;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.C140979f;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140981b;
import com.google.android.apps.search.podcasts.widgets.episodechips.C141232b;
import com.google.android.apps.search.podcasts.widgets.episodechips.EpisodeChipsView;
import com.google.android.apps.search.podcasts.widgets.p10622d.C141219a;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.play.unison.binding.C31970as;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31987m;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.podcasts.g.a.j */
/* compiled from: PG */
final class C140348j extends C31978d {

    /* renamed from: a */
    public final C46485f f381229a;

    /* renamed from: b */
    public final C28443m f381230b;

    /* renamed from: c */
    public boolean f381231c = false;

    /* renamed from: d */
    private final C47449e f381232d;

    /* renamed from: e */
    private final TextView f381233e;

    /* renamed from: j */
    private final ThumbnailView f381234j;

    /* renamed from: k */
    private final TextView f381235k;

    /* renamed from: l */
    private final TextView f381236l;

    /* renamed from: m */
    private final TextView f381237m;

    /* renamed from: n */
    private final TextView f381238n;

    /* renamed from: o */
    private final EpisodeChipsView f381239o;

    /* renamed from: p */
    private final C28306ab f381240p;

    /* renamed from: q */
    private final C47770dh f381241q;

    /* renamed from: r */
    private final C21370a f381242r;

    public C140348j(C47449e eVar, C46485f fVar, C28306ab abVar, C28443m mVar, C47770dh dhVar, C21370a aVar, View view) {
        super(view);
        this.f381232d = eVar;
        this.f381229a = fVar;
        this.f381240p = abVar;
        this.f381230b = mVar;
        this.f381241q = dhVar;
        this.f381242r = aVar;
        this.f381233e = (TextView) view.findViewById(R.id.podcasts_show_title);
        this.f381234j = (ThumbnailView) view.findViewById(R.id.podcasts_show_thumbnail);
        this.f381239o = (EpisodeChipsView) view.findViewById(R.id.podcasts_episode_chips);
        this.f381235k = (TextView) view.findViewById(R.id.podcasts_episode_title);
        this.f381236l = (TextView) view.findViewById(R.id.podcasts_episode_description);
        this.f381237m = (TextView) view.findViewById(R.id.podcasts_release_date);
        this.f381238n = (TextView) view.findViewById(R.id.podcasts_endorsement_text);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C140367b bVar = (C140367b) obj;
        boolean z = !bVar.f381306b.equals(C97925o.f273439f);
        this.f381231c = z;
        if (z) {
            C28306ab abVar = this.f381240p;
            View f = mo37744f();
            C28306ab abVar2 = this.f381240p;
            C140641b bVar2 = bVar.f381305a;
            C97925o oVar2 = bVar.f381306b;
            C31970as asVar = (C31970as) ((C31987m) oVar).f85985a;
            asVar.getClass();
            abVar.mo33802c(f, C140981b.m228939a(abVar2, bVar2, oVar2, asVar.mo37732a()));
        }
        TextView textView = this.f381233e;
        C140646b bVar3 = bVar.f381305a.f381974a;
        if (bVar3 == null) {
            bVar3 = C140646b.f381993r;
        }
        textView.setText(bVar3.f381996b);
        C141232b a = this.f381239o.mo17754z();
        C140641b bVar4 = bVar.f381305a;
        C97922l lVar = bVar.f381306b.f273442b;
        if (lVar == null) {
            lVar = C97922l.f273432e;
        }
        a.mo116251a(bVar4, lVar, bVar.f381307c, C140509u.AUTOPLAY_DEFAULT);
        C140646b bVar5 = bVar.f381305a.f381974a;
        if (bVar5 == null) {
            bVar5 = C140646b.f381993r;
        }
        this.f381234j.mo116304a(bVar5.f381996b, bVar5.f381998d, this.f381232d, bVar5.f382003i);
        if (bVar.f381305a.f381983j) {
            C141219a.m229227a(this.f381235k, mo37744f().getContext());
        } else {
            C141219a.m229229c(this.f381235k);
        }
        this.f381235k.setText(bVar.f381305a.f381976c);
        int i = 0;
        this.f381236l.setVisibility(true != bVar.f381305a.f381977d.isEmpty() ? 0 : 8);
        this.f381236l.setText(bVar.f381305a.f381977d);
        this.f381237m.setText(bVar.f381305a.f381980g > 0 ? C140979f.m228938d(mo37744f().getContext(), Duration.ofSeconds(bVar.f381305a.f381980g).toMillis(), this.f381242r.mo26870b()) : BuildConfig.FLAVOR);
        this.f381238n.setText(bVar.f381305a.f381982i);
        TextView textView2 = this.f381238n;
        if (true == bVar.f381305a.f381982i.isEmpty()) {
            i = 8;
        }
        textView2.setVisibility(i);
        mo37744f().setOnClickListener(new C47591co(this.f381241q, "Navigate to episode page", new C140347i(this, bVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37736b() {
        this.f381239o.mo17754z().mo116252b();
        if (this.f381231c) {
            C28306ab.m52929e(mo37744f());
        }
    }
}
