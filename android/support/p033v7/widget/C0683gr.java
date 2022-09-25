package android.support.p033v7.widget;

import android.support.p033v7.app.C0382c;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* renamed from: android.support.v7.widget.gr */
/* compiled from: PG */
public final class C0683gr extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ C0687gv f2502a;

    public C0683gr(C0687gv gvVar) {
        this.f2502a = gvVar;
    }

    public final int getCount() {
        return this.f2502a.f2513b.getChildCount();
    }

    public final Object getItem(int i) {
        return ((C0685gt) this.f2502a.f2513b.getChildAt(i)).f2504a;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            return this.f2502a.mo3163a((C0382c) getItem(i), true);
        }
        C0685gt gtVar = (C0685gt) view;
        gtVar.f2504a = (C0382c) getItem(i);
        gtVar.mo3155a();
        return view;
    }
}
