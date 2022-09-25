package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.support.p033v7.widget.AppCompatImageView;
import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140288ai;
import com.google.android.apps.search.podcasts.p10565f.C140289aj;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140373h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;

/* renamed from: com.google.android.apps.search.podcasts.g.a.ae */
/* compiled from: PG */
final class C140338ae extends C31978d {

    /* renamed from: a */
    private final AppCompatImageView f381217a;

    /* renamed from: b */
    private final C47400m f381218b;

    public C140338ae(C47400m mVar, View view) {
        super(view);
        this.f381218b = mVar;
        this.f381217a = (AppCompatImageView) view.findViewById(R.id.podcasts_subscriptions_carousel_explore_button);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        C140373h hVar = (C140373h) obj;
        AppCompatImageView appCompatImageView = this.f381217a;
        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(R.string.podcasts_explore_button));
        this.f381218b.mo51252a(this.f381217a, new C140289aj(C140288ai.EXPLORE, (Integer) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo37736b() {
    }
}
