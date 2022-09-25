package com.google.android.libraries.lens.view.filters.p2097a;

import android.location.Location;
import android.widget.Filter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.p2437b.C31848d;
import com.google.android.libraries.places.api.p2437b.C31857m;
import com.google.android.libraries.places.api.p2437b.C31858n;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59129av;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.filters.a.e */
/* compiled from: PG */
public final class C25872e extends Filter {

    /* renamed from: c */
    public static final /* synthetic */ int f70293c = 0;

    /* renamed from: a */
    public final List f70294a = new ArrayList();

    /* renamed from: b */
    final /* synthetic */ C25873f f70295b;

    public C25872e(C25873f fVar) {
        this.f70295b = fVar;
    }

    /* renamed from: a */
    public final void mo31038a() {
        this.f70295b.f70300e.clear();
        this.f70295b.f70300e.addAll(this.f70294a);
        this.f70295b.mObservable.mo2879a();
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        RectangularBounds rectangularBounds;
        if (charSequence == null) {
            return new Filter.FilterResults();
        }
        this.f70294a.clear();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence.length() == 0) {
            this.f70294a.addAll(this.f70295b.f70299d);
        } else {
            String obj = charSequence.toString();
            AutocompleteSessionToken b = AutocompleteSessionToken.m59347b();
            Location location = this.f70295b.f70301f;
            if (location != null) {
                C59127at b2 = C59127at.m91610b(location.getLatitude(), location.getLongitude());
                double cos = Math.cos(Math.toRadians(location.getLatitude()));
                double d = 3.141592653589793d;
                if (cos != C59203do.f157270a) {
                    d = Math.min(0.00102024639735301d / cos, 3.141592653589793d);
                }
                C59127at atVar = new C59127at(0.00102024639735301d, d);
                C59129av f = new C59129av(b2, b2).mo56464f(new C59127at(atVar.f157132a * 0.5d, atVar.f157133b * 0.5d));
                rectangularBounds = RectangularBounds.m59384c(new LatLngBounds(new LatLng(f.mo56473n().f157132a * 57.29577951308232d, f.mo56473n().f157133b * 57.29577951308232d), new LatLng(f.mo56472m().f157132a * 57.29577951308232d, f.mo56472m().f157133b * 57.29577951308232d)));
            } else {
                rectangularBounds = RectangularBounds.m59384c(C25873f.f70297b);
            }
            C31857m j = C31858n.m59252j();
            C31848d dVar = (C31848d) j;
            dVar.f85482a = obj;
            dVar.f85483b = rectangularBounds;
            dVar.f85487f = TypeFilter.ESTABLISHMENT;
            dVar.f85486e = b;
            C146006ab b3 = this.f70295b.f70298c.mo37396b(j.mo37448f());
            b3.mo122499r(new C25870c(this));
            b3.mo122498q(C25871d.f70292a);
        }
        filterResults.values = this.f70294a;
        filterResults.count = this.f70294a.size();
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (!this.f70294a.isEmpty()) {
            mo31038a();
        }
    }
}
