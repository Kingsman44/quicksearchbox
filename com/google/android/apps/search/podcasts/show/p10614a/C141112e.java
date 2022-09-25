package com.google.android.apps.search.podcasts.show.p10614a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97922l;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10601r.C140979f;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140981b;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140984e;
import com.google.android.apps.search.podcasts.show.p10615b.C141135b;
import com.google.android.apps.search.podcasts.widgets.episodechips.C141232b;
import com.google.android.apps.search.podcasts.widgets.episodechips.EpisodeChipsView;
import com.google.android.apps.search.podcasts.widgets.p10622d.C141219a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.play.unison.binding.C31970as;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31987m;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.a.e */
/* compiled from: PG */
public final class C141112e extends C31978d {

    /* renamed from: a */
    public final C46485f f383115a;

    /* renamed from: b */
    private final C21370a f383116b;

    /* renamed from: c */
    private final C47770dh f383117c;

    /* renamed from: d */
    private final C28306ab f383118d;

    /* renamed from: e */
    private final TextView f383119e;

    /* renamed from: j */
    private final TextView f383120j;

    /* renamed from: k */
    private final TextView f383121k;

    /* renamed from: l */
    private final EpisodeChipsView f383122l;

    public C141112e(C21370a aVar, C47770dh dhVar, C46485f fVar, C28306ab abVar, View view) {
        super(view);
        this.f383116b = aVar;
        this.f383117c = dhVar;
        this.f383115a = fVar;
        this.f383118d = abVar;
        View findViewById = view.findViewById(R.id.podcasts_publish_time);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.podcasts_publish_time)");
        this.f383119e = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.podcasts_episode_title);
        C69664n.m101060f(findViewById2, "view.findViewById(R.id.podcasts_episode_title)");
        this.f383120j = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.podcasts_episode_description);
        C69664n.m101060f(findViewById3, "view.findViewById(R.id.p…asts_episode_description)");
        this.f383121k = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.podcasts_episode_chips);
        C69664n.m101060f(findViewById4, "view.findViewById(R.id.podcasts_episode_chips)");
        this.f383122l = (EpisodeChipsView) findViewById4;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        String str;
        C141135b bVar = (C141135b) obj;
        C69664n.m101061g(bVar, "viewData");
        TextView textView = this.f383119e;
        if (bVar.f383186a.f381980g > 0) {
            Context context = mo37744f().getContext();
            C69664n.m101060f(context, "itemView<View>().context");
            str = C140979f.m228938d(context, Duration.ofSeconds(bVar.f383186a.f381980g).toMillis(), this.f383116b.mo26870b());
        } else {
            str = BuildConfig.FLAVOR;
        }
        textView.setText(str);
        if (bVar.f383186a.f381983j) {
            TextView textView2 = this.f383120j;
            Context context2 = this.f85977f.getContext();
            C69664n.m101060f(context2, "itemView.context");
            C141219a.m229227a(textView2, context2);
        } else {
            C141219a.m229229c(this.f383120j);
        }
        this.f383120j.setText(bVar.f383186a.f381976c);
        C28306ab abVar = this.f383118d;
        View f = mo37744f();
        C28306ab abVar2 = this.f383118d;
        C140641b bVar2 = bVar.f383186a;
        C97925o oVar2 = C140984e.f382770a;
        C97925o oVar3 = C140984e.f382770a;
        Object obj2 = ((C31987m) oVar).f85985a;
        C69664n.m101058d(obj2);
        abVar.mo33802c(f, C140981b.m228939a(abVar2, bVar2, oVar3, ((C31970as) obj2).mo37732a()));
        C141232b a = this.f383122l.mo17754z();
        C140641b bVar3 = bVar.f383186a;
        C97922l lVar = C140984e.f382770a.f273442b;
        if (lVar == null) {
            lVar = C97922l.f273432e;
        }
        C69664n.m101060f(lVar, "VeMappingUtil.SHOW_PAGE_…DE_ITEM_VE.episodeChipsVe");
        int i = 0;
        a.mo116251a(bVar3, lVar, false, C140509u.AUTOPLAY_SHOW);
        this.f383121k.setText(bVar.f383186a.f381977d);
        TextView textView3 = this.f383121k;
        String str2 = bVar.f383186a.f381977d;
        C69664n.m101060f(str2, "viewData.episodeItem.description");
        if (str2.length() == 0) {
            i = 8;
        }
        textView3.setVisibility(i);
        mo37744f().setOnClickListener(new C47591co(this.f383117c, "Navigate to episode page", new C141111d(this, bVar)));
    }
}
