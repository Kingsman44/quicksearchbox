package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.ay */
/* compiled from: PG */
public final class C103135ay {

    /* renamed from: a */
    public static final C58974d f287828a = C58974d.m91136j();

    /* renamed from: b */
    public final C80244ck f287829b;

    /* renamed from: c */
    public final C103032a f287830c;

    /* renamed from: d */
    public final C103143bf f287831d;

    /* renamed from: e */
    public final C86124t f287832e;

    /* renamed from: f */
    private final Context f287833f;

    public C103135ay(C80244ck ckVar, Context context, C103032a aVar, C86124t tVar, C103133aw awVar) {
        this.f287829b = ckVar;
        this.f287833f = context;
        this.f287830c = aVar;
        this.f287831d = ((PieActivity) awVar.getActivity()).mo17754z();
        this.f287832e = tVar;
        C103143bf.m171040g(awVar, R.id.nga_pie_lightweight_invocation_message, R.id.nga_pie_lightweight_failure_title, R.id.nga_pie_swipe_invocation_animation, R.id.nga_pie_nudge_container);
    }

    /* renamed from: a */
    public final void mo93653a(View view, String str) {
        if (this.f287832e.mo79746e(C90126fx.f251389hr)) {
            View findViewById = view.findViewById(R.id.nga_pie_nudge_container);
            int i = 0;
            findViewById.setVisibility(0);
            Resources resources = this.f287833f.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            }
            findViewById.setTranslationY((float) (-i));
            View findViewById2 = findViewById.findViewById(R.id.nga_pie_nudge);
            if (!this.f287829b.f220143e) {
                findViewById2.startAnimation(AnimationUtils.loadAnimation(this.f287833f, R.anim.nga_pie_nudge_float));
            }
            ((TextView) findViewById2.findViewById(R.id.nga_pie_nudge_text)).setText(str);
        }
    }
}
