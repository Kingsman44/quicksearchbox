package com.google.android.apps.search.podcasts.library.p10579a;

import android.view.View;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97922l;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.library.p10580b.C140567b;
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
import com.google.apps.tiktok.tracing.C47586cj;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.podcasts.library.a.e */
/* compiled from: PG */
public final class C140563e extends C31978d {

    /* renamed from: a */
    public final C46485f f381742a;

    /* renamed from: b */
    public final C28443m f381743b;

    /* renamed from: c */
    private final C47449e f381744c;

    /* renamed from: d */
    private final ThumbnailView f381745d;

    /* renamed from: e */
    private final TextView f381746e;

    /* renamed from: j */
    private final TextView f381747j;

    /* renamed from: k */
    private final EpisodeChipsView f381748k;

    /* renamed from: l */
    private final C28306ab f381749l;

    /* renamed from: m */
    private final C47770dh f381750m;

    /* renamed from: n */
    private final C21370a f381751n;

    /* renamed from: o */
    private final View f381752o;

    public C140563e(C47449e eVar, C46485f fVar, C28306ab abVar, C28443m mVar, C47770dh dhVar, C21370a aVar, View view) {
        super(view);
        this.f381744c = eVar;
        this.f381742a = fVar;
        this.f381749l = abVar;
        this.f381743b = mVar;
        this.f381750m = dhVar;
        this.f381751n = aVar;
        this.f381745d = (ThumbnailView) view.findViewById(R.id.podcasts_show_thumbnail);
        this.f381748k = (EpisodeChipsView) view.findViewById(R.id.podcasts_episode_chips);
        this.f381746e = (TextView) view.findViewById(R.id.podcasts_episode_title);
        this.f381747j = (TextView) view.findViewById(R.id.podcasts_release_date);
        this.f381752o = view.findViewById(R.id.podcasts_drag_handle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C140567b bVar = (C140567b) obj;
        C28306ab abVar = this.f381749l;
        View f = mo37744f();
        C28306ab abVar2 = this.f381749l;
        C140641b bVar2 = bVar.f381764a;
        C97925o oVar2 = bVar.f381765b;
        C31970as asVar = (C31970as) ((C31987m) oVar).f85985a;
        asVar.getClass();
        abVar.mo33802c(f, C140981b.m228939a(abVar2, bVar2, oVar2, asVar.mo37732a()));
        C141232b a = this.f381748k.mo17754z();
        C140641b bVar3 = bVar.f381764a;
        C97922l lVar = bVar.f381765b.f273442b;
        if (lVar == null) {
            lVar = C97922l.f273432e;
        }
        a.mo116251a(bVar3, lVar, false, bVar.f381767d);
        C140646b bVar4 = bVar.f381764a.f381974a;
        if (bVar4 == null) {
            bVar4 = C140646b.f381993r;
        }
        this.f381745d.mo116304a(bVar4.f381996b, bVar4.f381998d, this.f381744c, bVar4.f382003i);
        if (bVar.f381764a.f381983j) {
            C141219a.m229227a(this.f381746e, mo37744f().getContext());
        } else {
            C141219a.m229229c(this.f381746e);
        }
        this.f381746e.setText(bVar.f381764a.f381976c);
        this.f381747j.setText(bVar.f381764a.f381980g > 0 ? C140979f.m228938d(mo37744f().getContext(), Duration.ofSeconds(bVar.f381764a.f381980g).toMillis(), this.f381751n.mo26870b()) : BuildConfig.FLAVOR);
        if (bVar.f381766c) {
            this.f381752o.setVisibility(0);
            this.f381752o.setOnTouchListener(new C47586cj(this.f381750m, new C140561c(this, oVar), "Drag handle touched"));
        } else {
            this.f381752o.setVisibility(8);
            this.f381752o.setOnTouchListener((View.OnTouchListener) null);
        }
        mo37744f().setOnClickListener(new C47591co(this.f381750m, "Navigate to episode page", new C140562d(this, bVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37736b() {
        this.f381748k.mo17754z().mo116252b();
        C28306ab.m52929e(mo37744f());
    }
}
