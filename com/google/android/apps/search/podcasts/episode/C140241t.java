package com.google.android.apps.search.podcasts.episode;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.core.p096h.C1951d;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.episode.p10563a.C140219f;
import com.google.android.apps.search.podcasts.episode.p10563a.C140221h;
import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.C140979f;
import com.google.android.apps.search.podcasts.p10601r.C140992n;
import com.google.android.apps.search.podcasts.p10601r.C140993o;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140984e;
import com.google.android.apps.search.podcasts.show.C141121af;
import com.google.android.apps.search.podcasts.show.C141122ag;
import com.google.android.apps.search.podcasts.widgets.episodechips.C141232b;
import com.google.android.apps.search.podcasts.widgets.episodechips.EpisodeChipsView;
import com.google.android.apps.search.podcasts.widgets.expandabledescription.C141239d;
import com.google.android.apps.search.podcasts.widgets.expandabledescription.ExpandableDescription;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.C141252c;
import com.google.android.apps.search.podcasts.widgets.fullscreenmessage.FullScreenMessageView;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141213d;
import com.google.android.apps.search.podcasts.widgets.p10622d.C141219a;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47707g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4538j.p4539a.C59305c;
import com.google.common.p4538j.p4539a.C59308f;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.episode.t */
/* compiled from: PG */
public final class C140241t {

    /* renamed from: a */
    public static final C59071e f380988a = C59071e.m91331h();

    /* renamed from: b */
    public final C140237p f380989b;

    /* renamed from: c */
    public final C46485f f380990c;

    /* renamed from: d */
    public final EpisodeFragment f380991d;

    /* renamed from: e */
    public final C46801dp f380992e;

    /* renamed from: f */
    public final C140219f f380993f;

    /* renamed from: g */
    public final C141213d f380994g;

    /* renamed from: h */
    public final C21370a f380995h;

    /* renamed from: i */
    public final C28306ab f380996i;

    /* renamed from: j */
    public final C47449e f380997j;

    /* renamed from: k */
    public final C47707g f380998k;

    /* renamed from: l */
    public final C46778cv f380999l;

    /* renamed from: com.google.android.apps.search.podcasts.episode.t$a */
    /* compiled from: PG */
    final class C140242a implements C46792di.C46793a {
        public C140242a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            SwipeRefreshLayout a = C140241t.this.mo115519a();
            if (a != null) {
                a.mo8794l(false, false);
            }
            C140241t.this.mo115520b(C141252c.ERROR);
            C59052c cVar = (C59052c) ((C59052c) C140241t.f380988a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41584));
            cVar.mo56386p("Error loading episode page");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            String str;
            C140221h hVar = (C140221h) obj;
            C69664n.m101061g(hVar, "data");
            View view = C140241t.this.f380991d.getView();
            if (view != null) {
                if (hVar.f380959a != C140993o.EXPLICIT) {
                    C140641b bVar = hVar.f380960b;
                    if (bVar != null) {
                        TextView textView = (TextView) view.findViewById(R.id.podcasts_episode_page_show_title);
                        C140646b bVar2 = bVar.f381974a;
                        if (bVar2 == null) {
                            bVar2 = C140646b.f381993r;
                        }
                        textView.setText(bVar2.f381996b);
                        TextView textView2 = (TextView) view.findViewById(R.id.podcasts_episode_page_publisher_name);
                        C140646b bVar3 = bVar.f381974a;
                        if (bVar3 == null) {
                            bVar3 = C140646b.f381993r;
                        }
                        textView2.setText(bVar3.f381997c);
                        TextView textView3 = (TextView) view.findViewById(R.id.podcasts_episode_page_date_published);
                        if (bVar.f381980g > 0) {
                            Context requireContext = C140241t.this.f380991d.requireContext();
                            C69664n.m101060f(requireContext, "episodeFragment.requireContext()");
                            str = C140979f.m228938d(requireContext, Duration.ofSeconds(bVar.f381980g).toMillis(), C140241t.this.f380995h.mo26870b());
                        } else {
                            str = BuildConfig.FLAVOR;
                        }
                        textView3.setText(str);
                        View findViewById = view.findViewById(R.id.podcasts_episode_page_episode_title);
                        C140241t tVar = C140241t.this;
                        TextView textView4 = (TextView) findViewById;
                        textView4.setText(bVar.f381976c);
                        if (bVar.f381983j) {
                            C69664n.m101060f(textView4, "this");
                            Context requireContext2 = tVar.f380991d.requireContext();
                            C69664n.m101060f(requireContext2, "episodeFragment.requireContext()");
                            C141219a.m229228b(textView4, requireContext2);
                        } else {
                            C69664n.m101060f(textView4, "this");
                            C141219a.m229229c(textView4);
                        }
                        ExpandableDescription expandableDescription = (ExpandableDescription) view.findViewById(R.id.podcasts_episode_page_episode_description);
                        C59308f fVar = hVar.f380961c;
                        String str2 = bVar.f381977d;
                        C69664n.m101060f(str2, "episode.description");
                        C69664n.m101061g(str2, "stringDescription");
                        expandableDescription.f383442a.setAutoLinkMask(0);
                        if (fVar != null && !C69664n.m101066l(fVar, C59308f.f157472b)) {
                            TextView textView5 = expandableDescription.f383442a;
                            C59305c cVar = new C59305c(fVar.f157474a);
                            int i = C141239d.f383448a;
                            textView5.setText(C1951d.m5281b(C69764m.m101231j(C69764m.m101231j(C69764m.m101231j(C69764m.m101231j(C69764m.m101231j(C69764m.m101231j(cVar.f157465a, "<ul>", "<gaul>"), "</ul>", "</gaul>"), "<ol>", "<gaol>"), "</ol>", "</gaol>"), "<li>", "<gali>"), "</li>", "</gali>"), 0, (Html.ImageGetter) null, new C141239d()));
                            textView5.setMovementMethod(LinkMovementMethod.getInstance());
                        } else if (str2.length() > 0) {
                            expandableDescription.f383442a.setAutoLinkMask(3);
                            expandableDescription.f383442a.setText(str2);
                        } else {
                            expandableDescription.f383442a.setText(expandableDescription.getResources().getString(R.string.podcasts_no_description));
                        }
                        expandableDescription.f383444c = true;
                        expandableDescription.f383442a.setMaxLines(Integer.MAX_VALUE);
                        View findViewById2 = view.findViewById(R.id.podcasts_episode_page_show_thumbnail);
                        C140241t tVar2 = C140241t.this;
                        ThumbnailView thumbnailView = (ThumbnailView) findViewById2;
                        C69664n.m101060f(thumbnailView, BuildConfig.FLAVOR);
                        C140646b bVar4 = bVar.f381974a;
                        if (bVar4 == null) {
                            bVar4 = C140646b.f381993r;
                        }
                        String str3 = bVar4.f381996b;
                        C69664n.m101060f(str3, "episode.show.title");
                        C140646b bVar5 = bVar.f381974a;
                        if (bVar5 == null) {
                            bVar5 = C140646b.f381993r;
                        }
                        String str4 = bVar5.f381998d;
                        C69664n.m101060f(str4, "episode.show.thumbnailUrl");
                        C47449e eVar = tVar2.f380997j;
                        C140646b bVar6 = bVar.f381974a;
                        String str5 = (bVar6 == null ? C140646b.f381993r : bVar6).f382003i;
                        if (bVar6 == null) {
                            bVar6 = C140646b.f381993r;
                        }
                        C69664n.m101060f(bVar6, "episode.show");
                        ThumbnailView.m229315d(thumbnailView, str3, str4, eVar, str5, C140992n.m228955b(bVar6), (String) null, 32);
                        View findViewById3 = view.findViewById(R.id.podcasts_episode_page_show_header);
                        C46485f fVar2 = C140241t.this.f380990c;
                        C141121af afVar = (C141121af) C141122ag.f383149c.createBuilder();
                        C140646b bVar7 = bVar.f381974a;
                        if (bVar7 == null) {
                            bVar7 = C140646b.f381993r;
                        }
                        String str6 = bVar7.f381995a;
                        afVar.copyOnWrite();
                        str6.getClass();
                        ((C141122ag) afVar.instance).f383151a = str6;
                        findViewById3.setOnClickListener(fVar2.mo50480a(R.id.podcasts_action_to_show, C46490k.m82868a(afVar.build()).mo50504d(), "Navigate to show page from episode page"));
                        C141232b a = ((EpisodeChipsView) view.findViewById(R.id.podcasts_episode_chips)).mo17754z();
                        C97925o oVar = C140984e.f382770a;
                        a.mo116251a(bVar, C140984e.f382777h, false, C140509u.AUTOPLAY_DEFAULT);
                        C140241t.this.mo115520b(C141252c.NONE);
                        return;
                    }
                    C140241t.this.mo115520b(C141252c.ERROR);
                    return;
                }
                C140241t.this.mo115520b(C141252c.EXPLICIT_CONTENT);
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
            SwipeRefreshLayout a = C140241t.this.mo115519a();
            if (a != null) {
                a.mo8794l(true, false);
            }
        }

        /* renamed from: d */
        public final void mo50733d() {
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            SwipeRefreshLayout a = C140241t.this.mo115519a();
            if (a != null) {
                a.mo8794l(false, false);
            }
            C59052c cVar = (C59052c) ((C59052c) C140241t.f380988a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(41583));
            cVar.mo56386p("Error loading episode page in background");
        }

        /* renamed from: f */
        public final void mo50735f() {
            SwipeRefreshLayout a = C140241t.this.mo115519a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }
    }

    public C140241t(C140237p pVar, C46485f fVar, EpisodeFragment episodeFragment, C46801dp dpVar, C140219f fVar2, C141213d dVar, C21370a aVar, C28306ab abVar, C47449e eVar, C47707g gVar, C46778cv cvVar) {
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(dpVar, "subscriptionMixin");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f380989b = pVar;
        this.f380990c = fVar;
        this.f380991d = episodeFragment;
        this.f380992e = dpVar;
        this.f380993f = fVar2;
        this.f380994g = dVar;
        this.f380995h = aVar;
        this.f380996i = abVar;
        this.f380997j = eVar;
        this.f380998k = gVar;
        this.f380999l = cvVar;
    }

    /* renamed from: a */
    public final SwipeRefreshLayout mo115519a() {
        View view = this.f380991d.getView();
        if (view != null) {
            return (SwipeRefreshLayout) view.findViewById(R.id.podcasts_episode_swipe_refresh);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo115520b(C141252c cVar) {
        View view = this.f380991d.getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.podcasts_episode_page_scroll_view);
            if (findViewById != null) {
                findViewById.setVisibility(cVar == C141252c.NONE ? 0 : 8);
            }
            FullScreenMessageView fullScreenMessageView = (FullScreenMessageView) view.findViewById(R.id.podcasts_message_layer);
            if (fullScreenMessageView != null) {
                fullScreenMessageView.mo17754z().mo116270a(cVar);
            }
            SwipeRefreshLayout a = mo115519a();
            if (a != null) {
                a.mo8794l(false, false);
            }
        }
    }
}
