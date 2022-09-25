package com.google.android.apps.gsa.settingsui;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.View;
import android.widget.ListView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public abstract class SettingsPreferenceFragment extends PreferenceFragment {

    /* renamed from: l */
    public static final /* synthetic */ int f241148l = 0;

    /* renamed from: j */
    boolean f241149j = false;

    /* renamed from: k */
    boolean f241150k = false;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo82937e(View view) {
        int color = getResources().getColor(R.color.agsa_color_hairline);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{0, Integer.valueOf(color)});
        ofObject.addUpdateListener(new C88995j(view));
        ofObject.setRepeatMode(2);
        ofObject.setRepeatCount(1);
        ofObject.setDuration(1000);
        ofObject.setStartDelay(500);
        ofObject.start();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ListView listView = (ListView) view.findViewById(16908298);
        Bundle arguments = getArguments();
        listView.setOnHierarchyChangeListener(new C88996k(this, listView, arguments != null ? arguments.getString("preferenceName") : null));
    }
}
