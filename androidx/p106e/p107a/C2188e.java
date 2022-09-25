package androidx.p106e.p107a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: androidx.e.a.e */
/* compiled from: PG */
final class C2188e extends Filter {

    /* renamed from: a */
    final C2187d f6207a;

    public C2188e(C2187d dVar) {
        this.f6207a = dVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f6207a.mo3227b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f6207a.mo3226a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor g = this.f6207a.mo5501g();
        if (filterResults.values != null && filterResults.values != g) {
            this.f6207a.mo3228d((Cursor) filterResults.values);
        }
    }
}
