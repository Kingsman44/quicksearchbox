package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.view.View;
import android.widget.NumberPicker;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.C33295ba;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.DurationSelectionField;
import com.google.assistant.p3897e.p3902c.p3907c.C50988cf;
import com.google.assistant.p3897e.p3902c.p3907c.C50991ci;
import com.google.assistant.p3897e.p3921j.C52459sn;
import com.google.assistant.p3897e.p3921j.C52460so;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.e */
/* compiled from: PG */
public final /* synthetic */ class C33246e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33248g f88896a;

    /* renamed from: b */
    public final /* synthetic */ NumberPicker f88897b;

    /* renamed from: c */
    public final /* synthetic */ NumberPicker f88898c;

    /* renamed from: d */
    public final /* synthetic */ NumberPicker f88899d;

    public /* synthetic */ C33246e(C33248g gVar, NumberPicker numberPicker, NumberPicker numberPicker2, NumberPicker numberPicker3) {
        this.f88896a = gVar;
        this.f88897b = numberPicker;
        this.f88898c = numberPicker2;
        this.f88899d = numberPicker3;
    }

    public final void onClick(View view) {
        C33248g gVar = this.f88896a;
        NumberPicker numberPicker = this.f88897b;
        NumberPicker numberPicker2 = this.f88898c;
        NumberPicker numberPicker3 = this.f88899d;
        numberPicker.clearFocus();
        numberPicker2.clearFocus();
        numberPicker3.clearFocus();
        C33247f fVar = gVar.f88902b;
        if (fVar != null) {
            int value = numberPicker.getValue();
            int value2 = numberPicker2.getValue();
            int value3 = numberPicker3.getValue();
            DurationSelectionField durationSelectionField = (DurationSelectionField) fVar;
            if (durationSelectionField.f89079c >= 0 && durationSelectionField.f89080d != null) {
                C52459sn snVar = (C52459sn) C52460so.f137714d.createBuilder();
                snVar.copyOnWrite();
                C52460so soVar = (C52460so) snVar.instance;
                soVar.f137716a |= 1;
                soVar.f137717b = (long) ((value * 3600) + (value2 * 60) + value3);
                C52460so soVar2 = (C52460so) snVar.build();
                String c = C33233k.m61637c(soVar2, durationSelectionField.getContext().getResources());
                C50991ci ciVar = (C50991ci) durationSelectionField.f89080d.getItem(durationSelectionField.f89079c);
                if (ciVar != null) {
                    C50988cf cfVar = (C50988cf) ciVar.toBuilder();
                    cfVar.copyOnWrite();
                    C50991ci ciVar2 = (C50991ci) cfVar.instance;
                    c.getClass();
                    ciVar2.f132743a |= 16;
                    ciVar2.f132748f = c;
                    cfVar.copyOnWrite();
                    C50991ci ciVar3 = (C50991ci) cfVar.instance;
                    soVar2.getClass();
                    ciVar3.f132749g = soVar2;
                    ciVar3.f132743a |= 32;
                    C50991ci ciVar4 = (C50991ci) cfVar.build();
                    durationSelectionField.f89080d.insert(ciVar4, durationSelectionField.f89079c);
                    C33295ba baVar = durationSelectionField.f89080d;
                    baVar.remove((C50991ci) baVar.getItem(durationSelectionField.f89079c + 1));
                    durationSelectionField.f89080d.notifyDataSetChanged();
                    durationSelectionField.mo38702a(ciVar4);
                }
            }
        }
        gVar.dismiss();
    }
}
