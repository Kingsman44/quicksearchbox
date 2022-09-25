package com.google.android.apps.search.podcasts.settings;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.an */
/* compiled from: PG */
public final class C141071an extends C0673gh {

    /* renamed from: a */
    public final C47449e f382987a;

    /* renamed from: b */
    public final C47400m f382988b;

    /* renamed from: c */
    public final View f382989c;

    /* renamed from: d */
    public final TextView f382990d;

    /* renamed from: e */
    public final TextView f382991e;

    /* renamed from: f */
    public final ThumbnailView f382992f;

    /* renamed from: g */
    public final Switch f382993g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141071an(View view, C47449e eVar, C47400m mVar) {
        super(view);
        C69664n.m101061g(view, "root");
        C69664n.m101061g(eVar, "imageManager");
        C69664n.m101061g(mVar, "events");
        this.f382987a = eVar;
        this.f382988b = mVar;
        this.f382989c = view;
        View findViewById = view.findViewById(R.id.podcasts_subtitle);
        C69664n.m101060f(findViewById, "root.findViewById(R.id.podcasts_subtitle)");
        this.f382990d = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.podcasts_title);
        C69664n.m101060f(findViewById2, "root.findViewById(R.id.podcasts_title)");
        this.f382991e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.podcasts_thumbnail);
        C69664n.m101060f(findViewById3, "root.findViewById(R.id.podcasts_thumbnail)");
        this.f382992f = (ThumbnailView) findViewById3;
        View findViewById4 = view.findViewById(R.id.podcasts_switch_button);
        C69664n.m101060f(findViewById4, "root.findViewById(R.id.podcasts_switch_button)");
        this.f382993g = (Switch) findViewById4;
    }
}
