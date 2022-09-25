package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.app.Activity;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108237bh;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108241bl;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.i */
/* compiled from: PG */
final class C114139i extends C0640fb {

    /* renamed from: a */
    final /* synthetic */ C108237bh f316412a;

    /* renamed from: b */
    final /* synthetic */ Activity f316413b;

    /* renamed from: c */
    final /* synthetic */ C114142l f316414c;

    public C114139i(C114142l lVar, C108237bh bhVar, Activity activity) {
        this.f316414c = lVar;
        this.f316412a = bhVar;
        this.f316413b = activity;
    }

    public final int getItemCount() {
        return 1;
    }

    public final long getItemId(int i) {
        return -3;
    }

    public final int getItemViewType(int i) {
        return -3;
    }

    public final /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        ViewGroup.LayoutParams layoutParams;
        C58976aa aaVar = C58975e.f156826a;
        View findViewById = ((C108241bl) ghVar).itemView.findViewById(R.id.initial_position_placeholder);
        if (findViewById != null && this.f316414c.f316423f && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = (int) C91115n.m148870b(this.f316413b.getResources().getConfiguration().orientation == 2 ? 0.0f : 6.0f, this.f316413b);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (this.f316412a.mo96656ab()) {
            i2 = R.layout.initial_position_placeholder_v2;
        } else {
            i2 = this.f316414c.f316418a ? R.layout.dm_initial_position_placeholder : R.layout.initial_position_placeholder;
        }
        return new C108241bl(LayoutInflater.from(this.f316413b).inflate(i2, viewGroup, false));
    }
}
