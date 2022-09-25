package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.ad */
/* compiled from: PG */
public abstract class C93437ad extends LinearLayout {

    /* renamed from: a */
    protected final View.OnClickListener f260788a;

    /* renamed from: b */
    protected LayoutInflater f260789b;

    /* renamed from: c */
    public final List f260790c;

    /* renamed from: d */
    public C93436ac f260791d;

    /* renamed from: e */
    public boolean f260792e;

    public C93437ad(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo87719a(Parcelable parcelable, Object obj, boolean z, Comparator comparator);

    /* renamed from: b */
    public void mo87720b(C93436ac acVar) {
        this.f260791d = acVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo87750d(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        this.f260790c.add(layoutInflater.inflate(i, viewGroup));
    }

    /* renamed from: e */
    public final void mo87751e(Disambiguation disambiguation, Object obj, Comparator comparator) {
        List list;
        boolean z = true;
        C58838bb.m90868c(!disambiguation.mo81541i());
        boolean m = disambiguation.mo81544m();
        if (m) {
            Parcelable parcelable = disambiguation.f236364c;
            parcelable.getClass();
            list = C58597ky.m90212c(parcelable);
        } else {
            list = disambiguation.f236363b;
        }
        boolean z2 = !m;
        removeAllViews();
        this.f260790c.clear();
        int size = list.size();
        if (size != 1) {
            z = false;
        }
        for (int i = 0; i < size; i++) {
            View a = mo87719a((Parcelable) list.get(i), obj, z, comparator);
            this.f260790c.add(a);
            addView(a);
            if ((z || i < size - 1) && !this.f260792e) {
                mo87750d(this.f260789b, this, R.layout.disambiguation_item_divider);
            }
            if (z2) {
                a.setOnClickListener(this.f260788a);
            }
        }
    }

    public C93437ad(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C93437ad(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f260788a = new C93435ab(this);
        this.f260790c = new ArrayList();
        this.f260792e = false;
        this.f260789b = (LayoutInflater) context.getSystemService("layout_inflater");
        if (getLayoutTransition() != null) {
            getLayoutTransition().disableTransitionType(1);
        }
    }
}
