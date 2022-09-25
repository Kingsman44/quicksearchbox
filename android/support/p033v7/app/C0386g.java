package android.support.p033v7.app;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.g */
/* compiled from: PG */
final class C0386g implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f1314a;

    /* renamed from: b */
    final /* synthetic */ C0388i f1315b;

    public C0386g(C0388i iVar, AlertController alertController) {
        this.f1315b = iVar;
        this.f1314a = alertController;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f1315b.f1339t.onClick(this.f1314a.f1102b, i);
        if (!this.f1315b.f1344y) {
            this.f1314a.f1102b.dismiss();
        }
    }
}
