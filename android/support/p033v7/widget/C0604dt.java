package android.support.p033v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.dt */
/* compiled from: PG */
final class C0604dt implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C0613eb f2343a;

    public C0604dt(C0613eb ebVar) {
        this.f2343a = ebVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0578cu cuVar;
        if (i != -1 && (cuVar = this.f2343a.f2354e) != null) {
            cuVar.f2225a = false;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
