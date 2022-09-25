package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.l */
/* compiled from: PG */
public final class C102063l implements C102076y {

    /* renamed from: a */
    final /* synthetic */ C102061j f284753a;

    /* renamed from: b */
    final /* synthetic */ C102064m f284754b;

    public C102063l(C102064m mVar, C102061j jVar) {
        this.f284754b = mVar;
        this.f284753a = jVar;
    }

    /* renamed from: a */
    public final int mo92846a() {
        return R.layout.hotword_enroll_home_summary_contents;
    }

    /* renamed from: b */
    public final void mo92847b(View view) {
        TextView textView = (TextView) view.findViewById(R.id.google_home_hotword_enrollment_share_bottom_summary_google_play_text);
        int c = this.f284753a.mo92825c();
        int i = c - 1;
        if (c != 0) {
            if (i != 0) {
                if (i == 1) {
                    textView.setVisibility(0);
                    textView.setOnClickListener(new C102062k(this));
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.google_home_hotword_enrollment_share_bottom_summary);
            if (this.f284753a.mo92824b() != null) {
                textView2.setVisibility(0);
                textView2.setText(this.f284753a.mo92824b());
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
            View findViewById = view.findViewById(R.id.hotword_enrollment_summary_google_home_use_example);
            C102060i a = this.f284753a.mo92823a();
            if (a != null) {
                findViewById.setVisibility(0);
                ((TextView) findViewById.findViewById(R.id.hotword_enrollment_summary_usage_sample_title)).setText(view.getContext().getString(R.string.hotword_enrollment_summary_usage_sample_title));
                ((TextView) findViewById.findViewById(R.id.hotword_enrollment_summary_usage_example_view1)).setText(a.mo92829a());
                ((TextView) findViewById.findViewById(R.id.hotword_enrollment_summary_usage_example_view2)).setText(a.mo92831c());
                ((TextView) findViewById.findViewById(R.id.hotword_enrollment_summary_usage_example_view3)).setText(a.mo92830b());
            } else if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        } else {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo92848c() {
        try {
            this.f284754b.f284755a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.chromecast.app")));
        } catch (ActivityNotFoundException unused) {
            this.f284754b.f284755a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.chromecast.app")));
        }
    }
}
