package com.google.android.apps.gsa.staticplugins.searchregionpreference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchregionpreference.c */
/* compiled from: PG */
final class C117049c extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ SearchRegionPreferenceFragment f324988a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117049c(SearchRegionPreferenceFragment searchRegionPreferenceFragment, Context context, List list) {
        super(context, 0, list);
        this.f324988a = searchRegionPreferenceFragment;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str = (String) getItem(i);
        String str2 = (String) this.f324988a.f324983d.get(str);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.search_region_preference, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.search_region_preference_text)).setText(str);
        view.setTag(str2);
        view.setOnClickListener(this.f324988a.f324982c);
        ImageView imageView = (ImageView) view.findViewById(R.id.search_region_selected_check);
        if (this.f324988a.f324980a.getString("selected_search_country_code", BuildConfig.FLAVOR).equals(str2)) {
            imageView.setImageResource(R.drawable.quantum_ic_check_black_24);
        } else {
            imageView.setImageDrawable((Drawable) null);
        }
        return view;
    }
}
