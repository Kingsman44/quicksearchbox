package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

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
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.l */
/* compiled from: PG */
public final class C11324l extends C0260w {

    /* renamed from: a */
    public static final C59071e f36793a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.c.l");

    /* renamed from: b */
    public C11323k f36794b;

    /* renamed from: c */
    public List f36795c;

    /* renamed from: d */
    public Context f36796d;

    /* renamed from: e */
    private LinearLayout f36797e;

    /* renamed from: f */
    private RecyclerView f36798f;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(C11307e.m26908a(this.f36796d, R.attr.fluid_actions_list_item_picker_background_color)));
        View inflate = LayoutInflater.from(this.f36796d).inflate(R.layout.fluid_action_list_item_picker, (ViewGroup) null);
        this.f36797e = (LinearLayout) inflate.findViewById(R.id.recycler_view_container);
        if (this.f36795c.size() > 3) {
            ViewGroup.LayoutParams layoutParams = this.f36797e.getLayoutParams();
            layoutParams.height = this.f36796d.getResources().getDimensionPixelSize(R.dimen.list_item_picker_recycler_view_height);
            this.f36797e.setLayoutParams(layoutParams);
        }
        this.f36798f = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f36798f.setAdapter(new C11322j(this, this.f36796d, this.f36795c));
        this.f36798f.setLayoutManager(new LinearLayoutManager(this.f36796d));
        this.f36798f.addItemDecoration$ar$ds(new C0569cl(this.f36796d, 1));
        this.f36798f.setVisibility(0);
        return inflate;
    }
}
