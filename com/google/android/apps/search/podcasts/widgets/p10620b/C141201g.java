package com.google.android.apps.search.podcasts.widgets.p10620b;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.widgets.subscribebutton.C141270c;
import com.google.android.apps.search.podcasts.widgets.subscribebutton.C141271d;
import com.google.android.apps.search.podcasts.widgets.thumbnail.ThumbnailView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.podcasts.widgets.b.g */
/* compiled from: PG */
final class C141201g extends C0673gh {

    /* renamed from: a */
    public final C47770dh f383353a;

    /* renamed from: b */
    public final C47449e f383354b;

    /* renamed from: c */
    public final C46496q f383355c;

    /* renamed from: d */
    public final C141270c f383356d;

    /* renamed from: e */
    public final TextView f383357e;

    /* renamed from: f */
    public final TextView f383358f;

    /* renamed from: g */
    public final ThumbnailView f383359g;

    public C141201g(C47770dh dhVar, C47449e eVar, C141271d dVar, C46496q qVar, View view) {
        super(view);
        this.f383353a = dhVar;
        this.f383354b = eVar;
        this.f383355c = qVar;
        View findViewById = view.findViewById(R.id.podcasts_subscribe_button);
        C47770dh dhVar2 = (C47770dh) dVar.f383542a.mo17428b();
        dhVar2.getClass();
        findViewById.getClass();
        this.f383356d = new C141270c(dhVar2, findViewById);
        this.f383357e = (TextView) view.findViewById(R.id.podcasts_bottom_sheet_header_title);
        this.f383358f = (TextView) view.findViewById(R.id.podcasts_bottom_sheet_header_subtitle);
        this.f383359g = (ThumbnailView) view.findViewById(R.id.podcasts_bottom_sheet_header_thumbnail);
    }
}
