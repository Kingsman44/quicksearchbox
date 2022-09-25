package com.google.android.libraries.lens.view.filters.p2097a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.core.p094f.C1894g;
import androidx.core.p094f.C1897j;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4543n.p4551g.C59441a;
import com.google.common.p4543n.p4551g.C59442b;
import com.google.common.p4543n.p4551g.C59443c;
import com.google.common.p4543n.p4551g.C59444d;
import com.google.common.p4543n.p4551g.C59445e;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.a.f */
/* compiled from: PG */
public final class C25873f extends C0640fb implements Filterable {

    /* renamed from: a */
    public static final C58974d f70296a = C58974d.m91135i("DiningAutocompleteAdapter");

    /* renamed from: b */
    public static final LatLngBounds f70297b = new LatLngBounds(new LatLng(-90.0d, -179.99999999d), new LatLng(90.0d, 179.99999999d));

    /* renamed from: c */
    public final C31863s f70298c;

    /* renamed from: d */
    public final List f70299d;

    /* renamed from: e */
    public final List f70300e;

    /* renamed from: f */
    public final Location f70301f;

    /* renamed from: g */
    public final C25853ac f70302g;

    /* renamed from: h */
    private final Context f70303h;

    /* renamed from: i */
    private final LayoutInflater f70304i;

    /* renamed from: j */
    private final C47770dh f70305j;

    /* renamed from: k */
    private Filter f70306k;

    public C25873f(Context context, LayoutInflater layoutInflater, C31863s sVar, List list, Location location, C25853ac acVar, C47770dh dhVar) {
        this.f70303h = context;
        this.f70304i = layoutInflater;
        this.f70298c = sVar;
        this.f70299d = list;
        this.f70301f = location;
        this.f70302g = acVar;
        this.f70305j = dhVar;
        this.f70300e = new ArrayList(list);
    }

    public final Filter getFilter() {
        if (this.f70306k == null) {
            this.f70306k = new C25872e(this);
        }
        return this.f70306k;
    }

    public final int getItemCount() {
        return this.f70300e.size();
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        String str;
        C25866ap apVar = (C25866ap) ghVar;
        C25865ao aoVar = (C25865ao) this.f70300e.get(i);
        if (aoVar != null) {
            apVar.f70276a.setText(aoVar.mo31011c());
            apVar.f70277b.setText(aoVar.mo31010b());
            TextView textView = apVar.f70278c;
            if (aoVar.mo31009a() >= 0.0f) {
                Locale locale = C1897j.m5167d(C1894g.m5157a(this.f70303h.getResources().getConfiguration())).f5774b.f5775a.get(0);
                C59443c cVar = new C59443c((double) aoVar.mo31009a());
                DecimalFormat decimalFormat = new DecimalFormat("#.#");
                if (locale.getCountry().equals("US")) {
                    if (cVar.mo56958a() >= new C59445e(C59444d.f157697a, 0.1d).mo56958a()) {
                        str = this.f70303h.getString(R.string.lens_miles_indicator, new Object[]{decimalFormat.format(C59445e.m92356b(cVar.f157702b, cVar.f157703c, C59444d.f157697a))});
                    } else {
                        str = this.f70303h.getString(R.string.lens_feet_indicator, new Object[]{Long.toString(Math.round(C59445e.m92356b(cVar.f157702b, cVar.f157703c, C59441a.f157694a)))});
                    }
                } else if (cVar.mo56958a() >= new C59445e(C59442b.f157695a, 1.0d).mo56958a()) {
                    str = this.f70303h.getString(R.string.lens_kilometers_indicator, new Object[]{decimalFormat.format(C59445e.m92356b(cVar.f157702b, cVar.f157703c, C59442b.f157695a))});
                } else {
                    str = this.f70303h.getString(R.string.lens_meters_indicator, new Object[]{Long.toString(Math.round(cVar.mo56958a()))});
                }
            } else {
                str = BuildConfig.FLAVOR;
            }
            textView.setText(str);
            apVar.itemView.setOnClickListener(new C47591co(this.f70305j, "Click restaurant", new C25869b(this, aoVar)));
            if (this.f70299d.isEmpty()) {
                return;
            }
            if (aoVar.equals(this.f70299d.get(0))) {
                Context context = this.f70303h;
                apVar.f70278c.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C28110al.m52390b(context, R.drawable.quantum_ic_location_on_vd_theme_24, C28110al.m52389a(context, R.attr.colorAccent)), (Drawable) null, (Drawable) null);
                return;
            }
            apVar.f70278c.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.quantum_ic_location_on_vd_theme_24, 0, 0);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C25866ap(this.f70304i.inflate(R.layout.restaurant_list_item, viewGroup, false));
    }
}
