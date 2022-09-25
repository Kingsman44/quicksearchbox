package com.google.android.apps.gsa.staticplugins.searchregionpreference;

import android.view.View;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchregionpreference.a */
/* compiled from: PG */
final class C117047a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchRegionPreferenceFragment f324986a;

    public C117047a(SearchRegionPreferenceFragment searchRegionPreferenceFragment) {
        this.f324986a = searchRegionPreferenceFragment;
    }

    public final void onClick(View view) {
        SearchRegionPreferenceFragment searchRegionPreferenceFragment = this.f324986a;
        View findViewWithTag = searchRegionPreferenceFragment.f324981b.findViewWithTag(searchRegionPreferenceFragment.f324980a.getString("selected_search_country_code", BuildConfig.FLAVOR));
        if (findViewWithTag != null) {
            ((ImageView) findViewWithTag.findViewById(R.id.search_region_selected_check)).setImageResource(0);
        }
        String obj = Objects.requireNonNull(view.getTag()).toString();
        this.f324986a.f324980a.edit().putString("selected_search_country_code", obj).apply();
        this.f324986a.mo103114a(obj);
        ((ImageView) view.findViewById(R.id.search_region_selected_check)).setImageResource(R.drawable.quantum_ic_check_black_24);
    }
}
