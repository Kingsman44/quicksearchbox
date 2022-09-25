package com.google.android.apps.search.podcasts.library.showsubscriptions;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.widgets.menu.ClickableMenuView;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.i */
/* compiled from: PG */
public final class C140628i extends C0673gh {

    /* renamed from: a */
    public final TextView f381932a;

    /* renamed from: b */
    public final ThumbnailView f381933b;

    /* renamed from: c */
    public final ClickableMenuView f381934c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140628i(View view) {
        super(view);
        C69664n.m101061g(view, "itemView");
        View findViewById = view.findViewById(R.id.podcasts_show_title);
        C69664n.m101060f(findViewById, "itemView.findViewById(R.id.podcasts_show_title)");
        this.f381932a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.podcasts_show_image);
        C69664n.m101060f(findViewById2, "itemView.findViewById(R.id.podcasts_show_image)");
        this.f381933b = (ThumbnailView) findViewById2;
        View findViewById3 = view.findViewById(R.id.podcasts_show_more_actions_button);
        C69664n.m101060f(findViewById3, "itemView.findViewById(R.…show_more_actions_button)");
        this.f381934c = (ClickableMenuView) findViewById3;
    }
}
