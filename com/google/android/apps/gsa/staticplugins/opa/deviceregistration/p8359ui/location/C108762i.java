package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8357b.C108568c;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.gms.tasks.C146046z;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.p2437b.C31848d;
import com.google.android.libraries.places.api.p2437b.C31857m;
import com.google.android.libraries.places.api.p2437b.C31858n;
import com.google.android.libraries.places.api.p2437b.C31859o;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.i */
/* compiled from: PG */
public final class C108762i extends ArrayAdapter implements Filterable {

    /* renamed from: e */
    private static final C59071e f302470e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.i");

    /* renamed from: a */
    public final List f302471a = new ArrayList();

    /* renamed from: b */
    public final TypeFilter f302472b;

    /* renamed from: c */
    public final TypeFilter f302473c;

    /* renamed from: d */
    public LocationBias f302474d;

    /* renamed from: f */
    private final C108568c f302475f;

    public C108762i(C108568c cVar, Context context, TypeFilter typeFilter, TypeFilter typeFilter2) {
        super(context, 17367047, 16908308);
        this.f302475f = cVar;
        this.f302472b = typeFilter;
        this.f302473c = typeFilter2;
    }

    /* renamed from: a */
    public final C108759f getItem(int i) {
        return (C108759f) this.f302471a.get(i);
    }

    /* renamed from: b */
    public final List mo97148b(CharSequence charSequence, TypeFilter typeFilter) {
        C31859o oVar;
        List list;
        C59071e eVar = f302470e;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "LocAutocompleteAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(24257)).mo56386p("Starting autocomplete query");
        C31863s a = this.f302475f.mo96986a();
        C31857m j = C31858n.m59252j();
        C31848d dVar = (C31848d) j;
        dVar.f85482a = charSequence.toString();
        dVar.f85483b = this.f302474d;
        dVar.f85487f = typeFilter;
        C146006ab b2 = a.mo37396b(j.mo37448f());
        try {
            if (b2.mo122490i()) {
                oVar = (C31859o) b2.mo122488g();
            } else {
                oVar = (C31859o) C146021aq.m237853g(b2, 60, TimeUnit.SECONDS);
            }
            if (oVar == null) {
                list = C58485gu.m89845m();
            } else {
                list = oVar.mo37433a();
            }
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "LocAutocompleteAdapter");
            ((C59052c) ((C59052c) b3).mo56372aa(24258)).mo56387q("Query completed. Received %d predictions", list.size());
            return C58597ky.m90217h(list, C108760g.f302468a);
        } catch (C146046z | InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            C59104x d = f302470e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LocAutocompleteAdapter");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24259)).mo56386p("Failed to fetch autocomplete results.");
            return C58485gu.m89845m();
        }
    }

    public final int getCount() {
        return this.f302471a.size();
    }

    public final Filter getFilter() {
        return new C108761h(this);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        C108759f fVar = (C108759f) Objects.requireNonNull(getItem(i));
        ((TextView) view2.findViewById(16908308)).setText(fVar.f302464a);
        ((TextView) view2.findViewById(16908309)).setText(fVar.f302465b);
        return view2;
    }
}
