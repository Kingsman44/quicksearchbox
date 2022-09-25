package com.google.android.apps.search.podcasts.show.p10614a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.p10565f.C140290ak;
import com.google.android.apps.search.podcasts.p10565f.C140297ar;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.C140992n;
import com.google.android.apps.search.podcasts.show.p10615b.C141136c;
import com.google.android.apps.search.podcasts.show.p10618d.C141153a;
import com.google.android.apps.search.podcasts.show.p10618d.C141154b;
import com.google.android.apps.search.podcasts.widgets.expandabledescription.C141236a;
import com.google.android.apps.search.podcasts.widgets.expandabledescription.C141237b;
import com.google.android.apps.search.podcasts.widgets.expandabledescription.C141238c;
import com.google.android.apps.search.podcasts.widgets.expandabledescription.ExpandableDescription;
import com.google.android.apps.search.podcasts.widgets.p10622d.C141219a;
import com.google.android.apps.search.podcasts.widgets.subscribebutton.C141272e;
import com.google.android.apps.search.podcasts.widgets.subscribebutton.C141273f;
import com.google.android.apps.search.podcasts.widgets.subscribebutton.C141275h;
import com.google.android.apps.search.podcasts.widgets.subscribebutton.C141276i;
import com.google.android.apps.search.podcasts.widgets.subscribebutton.SubscribeButtonView;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.a.g */
/* compiled from: PG */
public final class C141114g extends C31978d {

    /* renamed from: a */
    private final C47449e f383127a;

    /* renamed from: b */
    private final C47400m f383128b;

    /* renamed from: c */
    private final ExpandableDescription f383129c;

    /* renamed from: d */
    private final ThumbnailView f383130d;

    /* renamed from: e */
    private final TextView f383131e;

    /* renamed from: j */
    private final TextView f383132j;

    /* renamed from: k */
    private final SubscribeButtonView f383133k;

    /* renamed from: l */
    private final TextView f383134l;

    /* renamed from: m */
    private final View f383135m;

    /* renamed from: n */
    private final View f383136n;

    /* renamed from: o */
    private final View f383137o;

    public C141114g(C47449e eVar, C47400m mVar, View view) {
        super(view);
        this.f383127a = eVar;
        this.f383128b = mVar;
        View findViewById = view.findViewById(R.id.podcasts_expandable_description);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.p…s_expandable_description)");
        this.f383129c = (ExpandableDescription) findViewById;
        View findViewById2 = view.findViewById(R.id.podcasts_show_header_thumbnail);
        C69664n.m101060f(findViewById2, "view.findViewById(R.id.p…ts_show_header_thumbnail)");
        this.f383130d = (ThumbnailView) findViewById2;
        View findViewById3 = view.findViewById(R.id.podcasts_show_header_title);
        C69664n.m101060f(findViewById3, "view.findViewById(R.id.podcasts_show_header_title)");
        this.f383131e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.podcasts_show_header_publisher);
        C69664n.m101060f(findViewById4, "view.findViewById(R.id.p…ts_show_header_publisher)");
        this.f383132j = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.podcasts_subscribe_button);
        C69664n.m101060f(findViewById5, "view.findViewById(R.id.podcasts_subscribe_button)");
        this.f383133k = (SubscribeButtonView) findViewById5;
        View findViewById6 = view.findViewById(R.id.podcasts_episode_list_header_title);
        C69664n.m101060f(findViewById6, "view.findViewById(R.id.p…pisode_list_header_title)");
        this.f383134l = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.podcasts_visit_website);
        C69664n.m101060f(findViewById7, "view.findViewById(R.id.podcasts_visit_website)");
        this.f383135m = findViewById7;
        View findViewById8 = view.findViewById(R.id.podcasts_share_podcast);
        C69664n.m101060f(findViewById8, "view.findViewById(R.id.podcasts_share_podcast)");
        this.f383136n = findViewById8;
        View findViewById9 = view.findViewById(R.id.podcasts_episodes_sort_button);
        C69664n.m101060f(findViewById9, "view.findViewById(R.id.p…sts_episodes_sort_button)");
        this.f383137o = findViewById9;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C141136c cVar = (C141136c) obj;
        C69664n.m101061g(cVar, "viewData");
        ExpandableDescription expandableDescription = this.f383129c;
        String str = cVar.f383188a.f382000f;
        C69664n.m101060f(str, "viewData.showItem.description");
        C69664n.m101061g(str, "description");
        int i = 0;
        expandableDescription.f383442a.setAutoLinkMask(0);
        expandableDescription.f383442a.setText(str);
        if (!expandableDescription.f383444c) {
            expandableDescription.f383442a.setMaxLines(3);
            expandableDescription.f383443b.setVisibility(0);
            expandableDescription.f383443b.setOnClickListener(new C141236a(expandableDescription));
            expandableDescription.f383442a.setOnScrollChangeListener(new C141237b(expandableDescription));
            expandableDescription.f383442a.addOnLayoutChangeListener(new C141238c(expandableDescription));
        }
        ThumbnailView thumbnailView = this.f383130d;
        String str2 = cVar.f383188a.f381996b;
        C69664n.m101060f(str2, "viewData.showItem.title");
        String str3 = cVar.f383188a.f381998d;
        C69664n.m101060f(str3, "viewData.showItem.thumbnailUrl");
        C47449e eVar = this.f383127a;
        C140646b bVar = cVar.f383188a;
        ThumbnailView.m229315d(thumbnailView, str2, str3, eVar, bVar.f382003i, C140992n.m228955b(bVar), (String) null, 32);
        this.f383131e.setText(cVar.f383188a.f381996b);
        if (cVar.f383188a.f382005k) {
            TextView textView = this.f383131e;
            Context context = this.f85977f.getContext();
            C69664n.m101060f(context, "itemView.context");
            C141219a.m229228b(textView, context);
        }
        this.f383132j.setText(cVar.f383188a.f381997c);
        this.f383128b.mo51252a(this.f383132j, new C141153a(cVar.f383188a));
        C141276i a = this.f383133k.mo17754z();
        C140646b bVar2 = cVar.f383188a;
        boolean z = cVar.f383191d;
        C69664n.m101061g(bVar2, "showItem");
        if (!z) {
            a.f383550b.mo116062a(a.f383549a, C141275h.f383548a, "Subscribe button click without account");
        } else if (bVar2.f382007m) {
            a.f383550b.mo116062a(a.f383549a, new C141272e(a, bVar2), "Unsubscribe button click");
        } else {
            a.f383550b.mo116062a(a.f383549a, new C141273f(a, bVar2), "Subscribe button click");
        }
        a.mo116297a(bVar2.f382007m);
        if (a.f383553e) {
            C28306ab.m52929e(a.f383549a);
            a.f383553e = false;
        }
        C28306ab abVar = a.f383551c;
        abVar.mo33802c(a.f383549a, abVar.f76990a.mo33805a(C28427h.m53115a(true != bVar2.f382007m ? 41154 : 41153)));
        a.f383553e = true;
        TextView textView2 = this.f383134l;
        Resources resources = textView2.getContext().getResources();
        int i2 = cVar.f383189b;
        textView2.setText(resources.getQuantityString(R.plurals.podcasts_episode_list_title_text, i2, new Object[]{Integer.valueOf(i2)}));
        View view = this.f383135m;
        String str4 = cVar.f383188a.f382006l;
        C69664n.m101060f(str4, "viewData.showItem.homepageUrl");
        if (str4.length() == 0) {
            i = 8;
        }
        view.setVisibility(i);
        C47400m mVar = this.f383128b;
        View view2 = this.f383135m;
        String str5 = cVar.f383188a.f382006l;
        C69664n.m101060f(str5, "viewData.showItem.homepageUrl");
        mVar.mo51252a(view2, new C140290ak(str5));
        this.f383128b.mo51252a(this.f383136n, new C140297ar(cVar.f383188a));
        this.f383128b.mo51252a(this.f383137o, new C141154b(cVar.f383188a, cVar.f383190c));
    }
}
