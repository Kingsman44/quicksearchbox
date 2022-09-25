package android.support.p033v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.he */
/* compiled from: PG */
final class C0697he implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f2529a;

    public C0697he(SearchView searchView) {
        this.f2529a = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f2529a.onItemClicked(i, 0, (String) null);
    }
}
