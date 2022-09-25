package android.support.p033v7.app;

import android.content.Context;
import android.support.p033v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* renamed from: android.support.v7.app.f */
/* compiled from: PG */
final class C0385f extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f1312a;

    /* renamed from: b */
    final /* synthetic */ C0388i f1313b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0385f(C0388i iVar, Context context, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, 16908308, charSequenceArr);
        this.f1313b = iVar;
        this.f1312a = recycleListView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f1313b.f1342w;
        if (zArr != null && zArr[i]) {
            this.f1312a.setItemChecked(i, true);
        }
        return view2;
    }
}
