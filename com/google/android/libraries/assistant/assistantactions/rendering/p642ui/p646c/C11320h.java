package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.h */
/* compiled from: PG */
public final class C11320h extends C0260w {

    /* renamed from: a */
    public NumberPicker f36778a;

    /* renamed from: b */
    public NumberPicker f36779b;

    /* renamed from: c */
    public NumberPicker f36780c;

    /* renamed from: d */
    public C11319g f36781d;

    /* renamed from: e */
    private int f36782e;

    /* renamed from: f */
    private int f36783f;

    /* renamed from: g */
    private int f36784g;

    /* renamed from: h */
    private TextView f36785h;

    /* renamed from: i */
    private Context f36786i;

    /* renamed from: a */
    public static C11320h m26934a(Context context, C11319g gVar, int i, int i2, int i3) {
        C11320h hVar = new C11320h();
        hVar.f36786i = context;
        hVar.f36781d = gVar;
        hVar.f36782e = i;
        hVar.f36783f = i2;
        hVar.f36784g = i3;
        return hVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(C11307e.m26908a(this.f36786i, R.attr.fluid_actions_duration_picker_background_color)));
        View inflate = LayoutInflater.from(this.f36786i).inflate(R.layout.fluid_action_duration_picker_dialog, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.hour_picker);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.minute_picker);
        ViewGroup viewGroup4 = (ViewGroup) inflate.findViewById(R.id.second_picker);
        this.f36778a = (NumberPicker) viewGroup2.findViewById(R.id.number_picker);
        this.f36779b = (NumberPicker) viewGroup3.findViewById(R.id.number_picker);
        this.f36780c = (NumberPicker) viewGroup4.findViewById(R.id.number_picker);
        int a = C11307e.m26908a(this.f36786i, R.attr.fluid_actions_duration_picker_number_color);
        this.f36778a.setTextColor(a);
        this.f36779b.setTextColor(a);
        this.f36780c.setTextColor(a);
        ((TextView) viewGroup2.findViewById(R.id.element_title)).setText(R.string.fluid_action_hours);
        ((TextView) viewGroup3.findViewById(R.id.element_title)).setText(R.string.fluid_action_minutes);
        ((TextView) viewGroup4.findViewById(R.id.element_title)).setText(R.string.fluid_action_seconds);
        this.f36785h = (TextView) inflate.findViewById(R.id.duration_set_button);
        this.f36778a.setMinValue(0);
        this.f36778a.setMaxValue(23);
        this.f36778a.setValue(this.f36782e);
        this.f36779b.setMinValue(0);
        this.f36779b.setMaxValue(59);
        this.f36779b.setValue(this.f36783f);
        this.f36780c.setMinValue(0);
        this.f36780c.setMaxValue(59);
        this.f36780c.setValue(this.f36784g);
        this.f36785h.setOnClickListener(new C11318f(this));
        return inflate;
    }
}
