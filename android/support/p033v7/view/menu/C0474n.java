package android.support.p033v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.n */
/* compiled from: PG */
public final class C0474n extends BaseAdapter {

    /* renamed from: a */
    public final C0477q f1643a;

    /* renamed from: b */
    public boolean f1644b;

    /* renamed from: c */
    private int f1645c = -1;

    /* renamed from: d */
    private final boolean f1646d;

    /* renamed from: e */
    private final LayoutInflater f1647e;

    /* renamed from: f */
    private final int f1648f;

    public C0474n(C0477q qVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1646d = z;
        this.f1647e = layoutInflater;
        this.f1643a = qVar;
        this.f1648f = i;
        mo1632b();
    }

    /* renamed from: a */
    public final C0480t getItem(int i) {
        ArrayList arrayList;
        if (this.f1646d) {
            C0477q qVar = this.f1643a;
            qVar.mo1664k();
            arrayList = qVar.f1654e;
        } else {
            arrayList = this.f1643a.mo1654e();
        }
        int i2 = this.f1645c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0480t) arrayList.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo1632b() {
        C0477q qVar = this.f1643a;
        C0480t tVar = qVar.f1660k;
        if (tVar != null) {
            qVar.mo1664k();
            ArrayList arrayList = qVar.f1654e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0480t) arrayList.get(i)) == tVar) {
                    this.f1645c = i;
                    return;
                }
            }
        }
        this.f1645c = -1;
    }

    public final int getCount() {
        ArrayList arrayList;
        if (this.f1646d) {
            C0477q qVar = this.f1643a;
            qVar.mo1664k();
            arrayList = qVar.f1654e;
        } else {
            arrayList = this.f1643a.mo1654e();
        }
        if (this.f1645c < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        if (view == null) {
            view = this.f1647e.inflate(this.f1648f, viewGroup, false);
        }
        int i3 = getItem(i).f1683b;
        int i4 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.f1643a.mo1599w() && i3 != (i4 >= 0 ? getItem(i4).f1683b : i3);
        ImageView imageView = listMenuItemView.f1519b;
        if (imageView != null) {
            if (listMenuItemView.f1521d || !z) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        C0453ag agVar = (C0453ag) view;
        if (this.f1644b) {
            listMenuItemView.f1522e = true;
            listMenuItemView.f1520c = true;
        }
        agVar.mo1446f(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        mo1632b();
        super.notifyDataSetChanged();
    }
}
