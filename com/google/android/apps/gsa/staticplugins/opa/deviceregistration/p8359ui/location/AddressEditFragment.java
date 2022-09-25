package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8357b.C108568c;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.C146036p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.AddressEditFragment */
/* compiled from: PG */
public final class AddressEditFragment extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302437b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.AddressEditFragment");

    /* renamed from: c */
    public static final C58485gu f302438c = C58485gu.m89847o(Place.Field.ID, Place.Field.LAT_LNG);

    /* renamed from: d */
    public Context f302439d;

    /* renamed from: e */
    public C108568c f302440e;

    /* renamed from: f */
    public C108763j f302441f;

    /* renamed from: g */
    public Double f302442g;

    /* renamed from: h */
    public Double f302443h;

    /* renamed from: i */
    public String f302444i;

    /* renamed from: j */
    public String f302445j;

    /* renamed from: k */
    public String f302446k;

    /* renamed from: l */
    public AddressEditConfiguration f302447l;

    /* renamed from: m */
    public C108762i f302448m;

    /* renamed from: n */
    public AutoCompleteTextView f302449n;

    /* renamed from: o */
    public View f302450o;

    /* renamed from: p */
    public C108758e f302451p;

    /* renamed from: q */
    public final C146036p f302452q = new C108755b(this);

    /* renamed from: r */
    private TextView f302453r;

    /* renamed from: s */
    private View f302454s;

    /* renamed from: t */
    private final AdapterView.OnItemClickListener f302455t = new C108754a(this);

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.AddressEditFragment$AddressEditConfiguration */
    /* compiled from: PG */
    public class AddressEditConfiguration implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C108757d();

        /* renamed from: a */
        public final boolean f302456a;

        /* renamed from: b */
        public final boolean f302457b;

        /* renamed from: c */
        public final String f302458c;

        /* renamed from: d */
        public final Integer f302459d;

        public AddressEditConfiguration() {
            this.f302456a = true;
            this.f302457b = false;
            this.f302458c = null;
            this.f302459d = null;
        }

        public AddressEditConfiguration(Parcel parcel) {
            boolean z = false;
            this.f302456a = parcel.readInt() == 1;
            this.f302457b = parcel.readInt() == 1 ? true : z;
            this.f302458c = parcel.readString();
            this.f302459d = Integer.valueOf(parcel.readInt());
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f302456a ? 1 : 0);
            parcel.writeInt(this.f302457b ? 1 : 0);
            parcel.writeString(this.f302458c);
            Integer num = this.f302459d;
            if (num != null) {
                parcel.writeInt(num.intValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo97131e() {
        if (this.f302447l.f302456a) {
            this.f302449n.setText(this.f302444i);
            this.f302449n.dismissDropDown();
            this.f302453r.setText(this.f302445j);
            this.f302454s.setVisibility(0);
            return;
        }
        this.f302449n.setText(this.f302446k);
        this.f302449n.dismissDropDown();
        this.f302454s.setVisibility(8);
    }

    public final void onCreate(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (bundle != null) {
            this.f302442g = (Double) bundle.getSerializable("latitude");
            this.f302443h = (Double) bundle.getSerializable("longitude");
            this.f302444i = bundle.getString("addressLine1");
            this.f302445j = bundle.getString("addressLine2");
            this.f302446k = bundle.getString("fullText");
            this.f302447l = (AddressEditConfiguration) bundle.getParcelable("configuration");
            return;
        }
        this.f302442g = (Double) arguments.getSerializable("latitude");
        this.f302443h = (Double) arguments.getSerializable("longitude");
        this.f302444i = arguments.getString("addressLine1");
        this.f302445j = arguments.getString("addressLine2");
        this.f302446k = arguments.getString("fullText");
        this.f302447l = (AddressEditConfiguration) arguments.getParcelable("configuration");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        double d;
        View inflate = layoutInflater.inflate(R.layout.gae_location_content, viewGroup, false);
        this.f302449n = (AutoCompleteTextView) inflate.findViewById(R.id.places_autocomplete);
        C108763j jVar = this.f302441f;
        Context context = this.f302439d;
        TypeFilter typeFilter = TypeFilter.ADDRESS;
        TypeFilter typeFilter2 = TypeFilter.ESTABLISHMENT;
        C108568c cVar = (C108568c) jVar.f302476a.mo17428b();
        cVar.getClass();
        context.getClass();
        typeFilter.getClass();
        typeFilter2.getClass();
        C108762i iVar = new C108762i(cVar, context, typeFilter, typeFilter2);
        this.f302448m = iVar;
        Double d2 = this.f302443h;
        Double d3 = this.f302442g;
        if (!(d2 == null || d3 == null)) {
            LatLng latLng = new LatLng(d3.doubleValue(), d2.doubleValue());
            double min = Math.min(Double.POSITIVE_INFINITY, latLng.f392012a);
            double max = Math.max(Double.NEGATIVE_INFINITY, latLng.f392012a);
            double d4 = latLng.f392013b;
            double d5 = Double.NaN;
            if (Double.isNaN(Double.NaN)) {
                d5 = d4;
                d = d5;
            } else if (d4 >= Double.NaN || d4 <= Double.NaN) {
                d4 = Double.NaN;
                d = Double.NaN;
            } else if (((Double.NaN - d4) + 360.0d) % 360.0d < ((d4 + Double.NaN) + 360.0d) % 360.0d) {
                d = Double.NaN;
                d5 = d4;
            } else {
                d = d4;
                d4 = Double.NaN;
            }
            C143919bh.m233967j(!Double.isNaN(d4), "no included points");
            iVar.f302474d = RectangularBounds.m59384c(new LatLngBounds(new LatLng(min, d5), new LatLng(max, d)));
        }
        this.f302449n.setAdapter(this.f302448m);
        this.f302449n.setOnItemClickListener(this.f302455t);
        this.f302449n.addTextChangedListener(new C108756c(this));
        this.f302453r = (TextView) inflate.findViewById(R.id.address_line2);
        this.f302454s = inflate.findViewById(R.id.address_line2_wrapper);
        this.f302450o = inflate.findViewById(R.id.location_error_warning);
        TextView textView = (TextView) inflate.findViewById(R.id.places_autocomplete_title);
        String str = this.f302447l.f302458c;
        if (str != null) {
            textView.setText(str);
        }
        Integer num = this.f302447l.f302459d;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        mo97131e();
        return inflate;
    }

    public final void onPause() {
        C58976aa aaVar = C58975e.f156826a;
        super.onPause();
    }

    public final void onResume() {
        C58976aa aaVar = C58975e.f156826a;
        super.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("latitude", this.f302442g);
        bundle.putSerializable("longitude", this.f302443h);
        bundle.putString("addressLine1", this.f302444i);
        bundle.putString("addressLine2", this.f302445j);
        bundle.putString("fullText", this.f302446k);
        bundle.putParcelable("configuration", this.f302447l);
    }
}
