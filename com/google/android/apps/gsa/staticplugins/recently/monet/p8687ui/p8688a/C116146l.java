package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.recently.p8678a.C116019b;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.l */
/* compiled from: PG */
public final class C116146l extends C116156v {
    public C116146l(Context context) {
        super(context, R.drawable.onboarding_recents, R.string.recently_onboarding_recent_title, R.string.recently_onboarding_recent_message);
    }

    /* renamed from: d */
    public final void mo102411d(float f, View view) {
        super.mo102411d(f, view);
        if (view.findViewById(R.id.info_entry_message) != null) {
            double atan = Math.atan((double) ((f * 8.0f) - 1.0f));
            float atan2 = (float) Math.atan(4.0d);
            float f2 = (((float) atan) + atan2) / (atan2 + atan2);
            float f3 = 1.0f - f2;
            view.findViewById(R.id.info_entry_message).setAlpha(C116144j.m192605a(f3));
            view.findViewById(R.id.info_entry_image).setAlpha(C116144j.m192605a(f3));
            view.findViewById(R.id.info_entry_message_2).setAlpha(C116144j.m192605a(f2));
        }
    }

    /* renamed from: f */
    public final void mo102413f(View view, C116019b bVar, C116226r rVar, C116214f fVar) {
        super.mo102413f(view, bVar, rVar, fVar);
        TextView textView = (TextView) view.findViewById(R.id.info_entry_message_2);
        View findViewById = view.findViewById(R.id.info_entry_image);
        textView.setText(R.string.recently_onboarding_recent_message_2);
        textView.setVisibility(0);
        findViewById.setVisibility(0);
    }
}
