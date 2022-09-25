package android.support.p033v7.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.l */
/* compiled from: PG */
public final class C0472l extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ C0473m f1635a;

    /* renamed from: b */
    private int f1636b = -1;

    public C0472l(C0473m mVar) {
        this.f1635a = mVar;
        mo1623b();
    }

    /* renamed from: a */
    public final C0480t getItem(int i) {
        C0477q qVar = this.f1635a.f1639c;
        qVar.mo1664k();
        ArrayList arrayList = qVar.f1654e;
        int i2 = this.f1636b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0480t) arrayList.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1623b() {
        C0477q qVar = this.f1635a.f1639c;
        C0480t tVar = qVar.f1660k;
        if (tVar != null) {
            qVar.mo1664k();
            ArrayList arrayList = qVar.f1654e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0480t) arrayList.get(i)) == tVar) {
                    this.f1636b = i;
                    return;
                }
            }
        }
        this.f1636b = -1;
    }

    public final int getCount() {
        C0477q qVar = this.f1635a.f1639c;
        qVar.mo1664k();
        int size = qVar.f1654e.size();
        return this.f1636b < 0 ? size : size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1635a.f1638b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((C0453ag) view).mo1446f(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        mo1623b();
        super.notifyDataSetChanged();
    }
}
