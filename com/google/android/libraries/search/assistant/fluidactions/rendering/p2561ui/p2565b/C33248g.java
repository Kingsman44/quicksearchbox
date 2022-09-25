package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.g */
/* compiled from: PG */
public final class C33248g extends C0260w {

    /* renamed from: a */
    public static final String f88900a = C30325g.f82003a;

    /* renamed from: c */
    private static final C59071e f88901c = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.g");

    /* renamed from: b */
    public C33247f f88902b = null;

    /* renamed from: d */
    private int f88903d = 0;

    /* renamed from: e */
    private int f88904e = 0;

    /* renamed from: f */
    private int f88905f = 0;

    /* renamed from: g */
    private Context f88906g = null;

    /* renamed from: a */
    public static C33248g m61667a(Context context, C33247f fVar, int i, int i2, int i3) {
        C33248g gVar = new C33248g();
        gVar.f88906g = context;
        gVar.f88902b = fVar;
        gVar.f88903d = i;
        gVar.f88904e = i2;
        gVar.f88905f = i3;
        return gVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        if (this.f88906g == null) {
            ((C59052c) ((C59052c) f88901c.mo56226d()).mo56372aa(51168)).mo56386p("Failed to create DurationPicker view due to invalid args");
            return null;
        }
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.requestFeature(1);
            window.setBackgroundDrawable(new ColorDrawable(C33234l.m61644b(this.f88906g, R.attr.fa_duration_picker_background_color)));
        }
        View inflate = LayoutInflater.from(this.f88906g).inflate(R.layout.fa_duration_picker, (ViewGroup) null);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.fa_duration_picker_hour_picker);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.fa_duration_picker_minute_picker);
        ViewGroup viewGroup4 = (ViewGroup) inflate.findViewById(R.id.fa_duration_picker_second_picker);
        NumberPicker numberPicker = (NumberPicker) viewGroup2.findViewById(R.id.fa_duration_picker_element_number_picker);
        NumberPicker numberPicker2 = (NumberPicker) viewGroup3.findViewById(R.id.fa_duration_picker_element_number_picker);
        NumberPicker numberPicker3 = (NumberPicker) viewGroup4.findViewById(R.id.fa_duration_picker_element_number_picker);
        ((TextView) viewGroup2.findViewById(R.id.fa_duration_picker_element_title)).setText(R.string.fa_duration_picker_hour_unit_label);
        ((TextView) viewGroup3.findViewById(R.id.fa_duration_picker_element_title)).setText(R.string.fa_duration_picker_minute_unit_label);
        ((TextView) viewGroup4.findViewById(R.id.fa_duration_picker_element_title)).setText(R.string.fa_duration_picker_second_unit_label);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(23);
        numberPicker.setValue(this.f88903d);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(59);
        numberPicker2.setValue(this.f88904e);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(59);
        numberPicker3.setValue(this.f88905f);
        ((TextView) inflate.findViewById(R.id.fa_duration_picker_set_button)).setOnClickListener(new C33246e(this, numberPicker, numberPicker2, numberPicker3));
        return inflate;
    }
}
