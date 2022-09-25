package com.google.android.apps.gsa.staticplugins.searchregionpreference;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
public class SearchRegionPreferenceFragment extends Fragment {

    /* renamed from: a */
    public SharedPreferences f324980a;

    /* renamed from: b */
    public View f324981b;

    /* renamed from: c */
    public View.OnClickListener f324982c;

    /* renamed from: d */
    public final Map f324983d = new HashMap();

    /* renamed from: e */
    private Context f324984e;

    /* renamed from: f */
    private ListView f324985f;

    /* renamed from: com.google.android.apps.gsa.staticplugins.searchregionpreference.SearchRegionPreferenceFragment$a */
    /* compiled from: PG */
    public interface C117046a {
        /* renamed from: qZ */
        void mo103117qZ(SearchRegionPreferenceFragment searchRegionPreferenceFragment);
    }

    /* renamed from: a */
    public final void mo103114a(String str) {
        TextView textView = (TextView) this.f324981b.findViewById(R.id.search_region_selected_region);
        if (TextUtils.isEmpty(str)) {
            textView.setText(R.string.search_region_default);
        } else {
            textView.setText(new Locale(BuildConfig.FLAVOR, str).getDisplayCountry());
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((ViewGroup) this.f324981b.getParent()).setClipToPadding(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((C117046a) C47266f.m84076a(getActivity(), C117046a.class)).mo103117qZ(this);
        this.f324981b = layoutInflater.inflate(R.layout.search_region_preference_screen, viewGroup, false);
        this.f324984e = getActivity();
        this.f324985f = (ListView) this.f324981b.findViewById(R.id.search_region_preferences_layout);
        this.f324982c = new C117047a(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f324981b.getLayoutParams();
        int i = -((int) (this.f324984e.getResources().getDisplayMetrics().density * 16.0f));
        marginLayoutParams.setMargins(i, 0, i, 0);
        this.f324981b.setLayoutParams(marginLayoutParams);
        mo103114a(this.f324980a.getString("selected_search_country_code", BuildConfig.FLAVOR));
        Resources resources = this.f324984e.getResources();
        for (String str : resources.getStringArray(R.array.search_region_country_codes)) {
            this.f324983d.put(new Locale(BuildConfig.FLAVOR, str).getDisplayCountry(), str);
        }
        String string = resources.getString(R.string.search_region_default);
        this.f324983d.put(string, resources.getString(R.string.search_region_country_code_default));
        ArrayList arrayList = new ArrayList(this.f324983d.keySet());
        Collections.sort(arrayList, new C117048b(string));
        this.f324985f.setAdapter(new C117049c(this, this.f324984e, arrayList));
        return this.f324981b;
    }
}
