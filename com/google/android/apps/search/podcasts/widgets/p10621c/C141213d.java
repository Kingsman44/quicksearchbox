package com.google.android.apps.search.podcasts.widgets.p10621c;

import android.support.p033v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.content.C1877c;
import com.google.android.apps.search.podcasts.widgets.feedback.FeedbackHelper;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.c.d */
/* compiled from: PG */
public final class C141213d {

    /* renamed from: a */
    public final C46485f f383383a;

    /* renamed from: b */
    public final FeedbackHelper f383384b;

    /* renamed from: c */
    private final C47770dh f383385c;

    public C141213d(C46485f fVar, C47770dh dhVar, FeedbackHelper feedbackHelper) {
        C69664n.m101061g(fVar, "accountNavigation");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(feedbackHelper, "feedbackHelper");
        this.f383383a = fVar;
        this.f383385c = dhVar;
        this.f383384b = feedbackHelper;
    }

    /* renamed from: a */
    public final void mo116226a(Toolbar toolbar) {
        C69664n.m101061g(toolbar, "toolbar");
        Menu g = toolbar.mo2393g();
        C69664n.m101060f(g, "toolbar.menu");
        g.add(0, R.id.podcasts_send_feedback_menu_item, 0, R.string.podcasts_send_feedback);
        MenuItem findItem = g.findItem(R.id.podcasts_send_feedback_menu_item);
        findItem.setIcon(C1877c.m5125a(toolbar.getContext(), R.drawable.quantum_gm_ic_feedback_vd_theme_24));
        findItem.setOnMenuItemClickListener(new C47579cc(this.f383385c, "App bar more actions menu item to send feedback", new C141210a(this)));
    }

    /* renamed from: b */
    public final void mo116227b(Toolbar toolbar) {
        C69664n.m101061g(toolbar, "toolbar");
        toolbar.mo2419t(new C47591co(this.f383385c, "App bar back button", new C141212c(this, toolbar)));
        toolbar.mo2415p(R.string.podcasts_back_button);
    }

    /* renamed from: c */
    public final void mo116228c(Toolbar toolbar) {
        C69664n.m101061g(toolbar, "toolbar");
        mo116227b(toolbar);
        Menu g = toolbar.mo2393g();
        g.add(0, R.id.podcasts_settings_menu_item, 0, R.string.podcasts_settings_tng);
        MenuItem findItem = g.findItem(R.id.podcasts_settings_menu_item);
        findItem.setIcon(C1877c.m5125a(toolbar.getContext(), R.drawable.quantum_gm_ic_settings_vd_theme_24));
        findItem.setOnMenuItemClickListener(new C141211b(this, toolbar));
        mo116226a(toolbar);
        Menu g2 = toolbar.mo2393g();
        C69664n.m101060f(g2, "toolbar.menu");
        C141214e.m229222a(g2);
    }
}
