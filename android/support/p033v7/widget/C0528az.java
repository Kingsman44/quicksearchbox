package android.support.p033v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.az */
/* compiled from: PG */
final class C0528az implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0533bc f2088a;

    public C0528az(C0533bc bcVar) {
        this.f2088a = bcVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f2088a.f2104d.setSelection(i);
        if (this.f2088a.f2104d.getOnItemClickListener() != null) {
            C0533bc bcVar = this.f2088a;
            bcVar.f2104d.performItemClick(view, i, bcVar.f2102b.getItemId(i));
        }
        this.f2088a.mo1575m();
    }
}
