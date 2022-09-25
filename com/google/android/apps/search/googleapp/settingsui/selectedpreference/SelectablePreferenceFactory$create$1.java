package com.google.android.apps.search.googleapp.settingsui.selectedpreference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44535e;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SelectablePreferenceFactory$create$1 extends Preference {

    /* renamed from: a */
    final /* synthetic */ Context f378734a;

    /* renamed from: b */
    final /* synthetic */ SelectablePreferenceFactory f378735b;

    /* renamed from: c */
    final /* synthetic */ C139873i f378736c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectablePreferenceFactory$create$1(Context context, SelectablePreferenceFactory selectablePreferenceFactory, C139873i iVar) {
        super(context);
        this.f378734a = context;
        this.f378735b = selectablePreferenceFactory;
        this.f378736c = iVar;
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        C69664n.m101061g(axVar, "viewHolder");
        super.mo8313a(axVar);
        View view = axVar.itemView;
        if (this.f378734a.getResources().getBoolean(R.bool.googleapp_settings_use_two_pane)) {
            SelectablePreferenceFactory selectablePreferenceFactory = this.f378735b;
            if (selectablePreferenceFactory.f378733b && selectablePreferenceFactory.f378732a.f378739b == this.f378736c) {
                view.setBackgroundResource(R.drawable.googleapp_settings_selected_preference_background);
                int b = C44535e.m78719b(view, R.attr.colorOnPrimaryContainer);
                ((TextView) view.findViewById(16908310)).setTextColor(b);
                ((TextView) view.findViewById(16908304)).setTextColor(C44535e.m78719b(view, R.attr.colorOnSecondaryContainer));
                Drawable drawable = ((ImageView) view.findViewById(16908294)).getDrawable();
                if (drawable != null) {
                    drawable.setTint(b);
                    return;
                }
                return;
            }
        }
        int b2 = C44535e.m78719b(view, 16842806);
        ((TextView) view.findViewById(16908310)).setTextColor(b2);
        ((TextView) view.findViewById(16908304)).setTextColor(C44535e.m78719b(view, 16842808));
        Drawable drawable2 = ((ImageView) view.findViewById(16908294)).getDrawable();
        if (drawable2 != null) {
            drawable2.setTint(b2);
        }
    }
}
