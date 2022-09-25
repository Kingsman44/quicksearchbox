package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.e */
/* compiled from: PG */
public abstract class C93630e extends BaseAdapter {

    /* renamed from: a */
    public final List f261380a;

    /* renamed from: b */
    protected final LayoutInflater f261381b;

    /* renamed from: c */
    protected AdapterView.OnItemClickListener f261382c;

    /* renamed from: d */
    protected int f261383d = -1;

    public C93630e(Context context, List list) {
        this.f261380a = list;
        this.f261381b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo88079a(ViewGroup viewGroup) {
        return this.f261381b.inflate(R.layout.dropdown_custom_picker_element, viewGroup, false);
    }

    /* renamed from: b */
    public final C91109h getItem(int i) {
        return (C91109h) this.f261380a.get(i);
    }

    /* renamed from: c */
    public final void mo88081c(C91109h hVar) {
        this.f261380a.add(hVar);
    }

    /* renamed from: d */
    public final void mo88082d(C91109h[] hVarArr) {
        for (C91109h c : hVarArr) {
            mo88081c(c);
        }
    }

    /* renamed from: e */
    public final void mo88083e() {
        this.f261380a.clear();
    }

    public final int getCount() {
        return this.f261380a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return getItem(i).f254418c ? 1 : 0;
    }

    public final int getViewTypeCount() {
        return 2;
    }
}
