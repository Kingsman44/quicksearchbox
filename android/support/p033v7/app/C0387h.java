package android.support.p033v7.app;

import android.support.p033v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.h */
/* compiled from: PG */
final class C0387h implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f1316a;

    /* renamed from: b */
    final /* synthetic */ AlertController f1317b;

    /* renamed from: c */
    final /* synthetic */ C0388i f1318c;

    public C0387h(C0388i iVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f1318c = iVar;
        this.f1316a = recycleListView;
        this.f1317b = alertController;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.f1318c.f1342w;
        if (zArr != null) {
            zArr[i] = this.f1316a.isItemChecked(i);
        }
        this.f1318c.f1319A.onClick(this.f1317b.f1102b, i, this.f1316a.isItemChecked(i));
    }
}
