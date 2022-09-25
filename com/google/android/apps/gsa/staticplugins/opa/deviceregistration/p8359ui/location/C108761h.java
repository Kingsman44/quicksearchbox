package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location;

import android.widget.Filter;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.h */
/* compiled from: PG */
final class C108761h extends Filter {

    /* renamed from: a */
    final /* synthetic */ C108762i f302469a;

    public C108761h(C108762i iVar) {
        this.f302469a = iVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        if (obj instanceof C108759f) {
            return ((C108759f) obj).f302466c;
        }
        return super.convertResultToString(obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null) {
            C108762i iVar = this.f302469a;
            List b = iVar.mo97148b(charSequence, iVar.f302472b);
            if (!b.isEmpty()) {
                filterResults.values = b;
                filterResults.count = b.size();
            } else {
                C108762i iVar2 = this.f302469a;
                TypeFilter typeFilter = iVar2.f302473c;
                if (typeFilter != null) {
                    List b2 = iVar2.mo97148b(charSequence, typeFilter);
                    if (!b2.isEmpty()) {
                        filterResults.values = b2;
                        filterResults.count = b2.size();
                    } else {
                        List b3 = this.f302469a.mo97148b(charSequence, (TypeFilter) null);
                        if (!b3.isEmpty()) {
                            filterResults.values = b3;
                            filterResults.count = b3.size();
                        }
                    }
                }
            }
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null || filterResults.count <= 0) {
            this.f302469a.notifyDataSetInvalidated();
            return;
        }
        this.f302469a.f302471a.clear();
        this.f302469a.f302471a.addAll((List) filterResults.values);
        this.f302469a.notifyDataSetChanged();
    }
}
