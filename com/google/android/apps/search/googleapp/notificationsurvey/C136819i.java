package com.google.android.apps.search.googleapp.notificationsurvey;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60901do;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.notificationsurvey.i */
/* compiled from: PG */
public final /* synthetic */ class C136819i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136820j f372420a;

    /* renamed from: b */
    public final /* synthetic */ C8178yk f372421b;

    /* renamed from: c */
    public final /* synthetic */ C57057b f372422c;

    public /* synthetic */ C136819i(C136820j jVar, C8178yk ykVar, C57057b bVar) {
        this.f372420a = jVar;
        this.f372421b = ykVar;
        this.f372422c = bVar;
    }

    public final void onClick(View view) {
        C136820j jVar = this.f372420a;
        C8178yk ykVar = this.f372421b;
        C57057b bVar = this.f372422c;
        if (ykVar != null && C136820j.m222501a(ykVar)) {
            C28443m mVar = jVar.f372425b;
            C28440j h = C28442l.m53142h();
            h.mo33895b(C136810a.m222487a(bVar));
            mVar.mo33853c(h.mo33894a(), C28485y.m53234a(view));
        }
        C136816g gVar = jVar.f372429f;
        if (gVar != null) {
            C136817h hVar = gVar.f372407a;
            ViewGroup viewGroup = gVar.f372408b;
            if (viewGroup.getLayoutTransition() != null) {
                viewGroup.getLayoutTransition().enableTransitionType(4);
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.googleapp_notificationsurvey_question_text);
            if (textView != null) {
                String string = hVar.f372413e.getString(R.string.googleapp_notificationsurvey_submitted_string);
                textView.setText(string);
                textView.announceForAccessibility(string);
                View view2 = hVar.f372413e.getView();
                if (view2 != null) {
                    TextView textView2 = (TextView) view2.findViewById(R.id.googleapp_notificationsurvey_negative_label);
                    TextView textView3 = (TextView) view2.findViewById(R.id.googleapp_notificationsurvey_positive_label);
                    if (textView2 != null) {
                        textView2.setText(BuildConfig.FLAVOR);
                        textView2.setVisibility(8);
                    }
                    if (textView3 != null) {
                        textView3.setText(BuildConfig.FLAVOR);
                        textView3.setVisibility(8);
                    }
                }
                RatingView ratingView = (RatingView) viewGroup.findViewById(R.id.googleapp_notificationsurvey_rating_view);
                if (ratingView != null) {
                    ratingView.setVisibility(8);
                }
            }
            C60872cz d = hVar.f372409a.mo29164d(C60901do.f165001a, 1500, TimeUnit.MILLISECONDS);
            C46439e eVar = hVar.f372410b;
            C46438d b = C46438d.m82810b(d);
            eVar.mo50428h(b.f121541a, (Object) null, hVar.f372411c);
        }
    }
}
