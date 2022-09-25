package android.support.p033v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.hf */
/* compiled from: PG */
final class C0698hf implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2530a;

    public C0698hf(SearchView searchView) {
        this.f2530a = searchView;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f2530a.onItemSelected(i);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
