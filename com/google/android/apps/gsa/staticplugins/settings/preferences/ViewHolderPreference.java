package com.google.android.apps.gsa.staticplugins.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ViewHolderPreference extends Preference {

    /* renamed from: a */
    public View f325682a;

    public ViewHolderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12718D = R.layout.assistant_android_settings_view_preference;
        mo8348O(false);
        mo8339F(false);
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        FrameLayout frameLayout = (FrameLayout) axVar.itemView;
        frameLayout.removeAllViews();
        View view = this.f325682a;
        if (view == null) {
            mo8348O(false);
            return;
        }
        mo8348O(true);
        frameLayout.addView(view);
    }
}
