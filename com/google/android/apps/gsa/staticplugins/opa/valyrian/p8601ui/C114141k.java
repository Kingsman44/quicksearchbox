package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.app.Activity;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.k */
/* compiled from: PG */
final class C114141k extends C0640fb {

    /* renamed from: a */
    final /* synthetic */ Activity f316416a;

    /* renamed from: b */
    final /* synthetic */ C108226ax f316417b;

    public C114141k(Activity activity, C108226ax axVar) {
        this.f316416a = activity;
        this.f316417b = axVar;
    }

    public final int getItemCount() {
        return 1;
    }

    public final long getItemId(int i) {
        return -2;
    }

    public final int getItemViewType(int i) {
        return -2;
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C108241bl blVar = (C108241bl) ghVar;
        C58976aa aaVar = C58975e.f156826a;
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f316416a).inflate(R.layout.demand_bottom_placeholder, viewGroup, false);
        inflate.setOnClickListener(new C114140j(this.f316417b));
        return new C108241bl(inflate);
    }
}
