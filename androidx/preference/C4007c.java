package androidx.preference;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.preference.c */
/* compiled from: PG */
final class C4007c implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ DropDownPreference f12866a;

    public C4007c(DropDownPreference dropDownPreference) {
        this.f12866a = dropDownPreference;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String obj = this.f12866a.f12708h[i].toString();
            if (!obj.equals(this.f12866a.f12709i) && this.f12866a.mo8351R(obj)) {
                this.f12866a.mo8330o(obj);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
