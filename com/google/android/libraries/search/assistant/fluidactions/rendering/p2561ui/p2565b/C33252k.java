package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.k */
/* compiled from: PG */
public final class C33252k extends C0260w {

    /* renamed from: a */
    public static final C59071e f88913a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.k");

    /* renamed from: b */
    public static final String f88914b = C33248g.class.getSimpleName();

    /* renamed from: c */
    public C33251j f88915c;

    /* renamed from: d */
    public Context f88916d;

    /* renamed from: e */
    public List f88917e = new ArrayList();

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        if (this.f88916d == null) {
            return null;
        }
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.requestFeature(1);
            window.setBackgroundDrawable(new ColorDrawable(C19391a.m36980a(this.f88916d, 16842801)));
        }
        View inflate = LayoutInflater.from(this.f88916d).inflate(R.layout.fa_list_item_picker, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.fa_list_item_picker_recycler_view_container);
        if (linearLayout != null && this.f88917e.size() > 3) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = this.f88916d.getResources().getDimensionPixelSize(R.dimen.fa_list_item_picker_recycler_view_height);
            linearLayout.setLayoutParams(layoutParams);
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.fa_list_item_picker_recycler_view);
        Context context = this.f88916d;
        if (!(context == null || recyclerView == null)) {
            recyclerView.setAdapter(new C33250i(this, context, this.f88917e));
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f88916d));
            recyclerView.addItemDecoration$ar$ds(new C0569cl(this.f88916d, 1));
            recyclerView.setVisibility(0);
        }
        return inflate;
    }
}
