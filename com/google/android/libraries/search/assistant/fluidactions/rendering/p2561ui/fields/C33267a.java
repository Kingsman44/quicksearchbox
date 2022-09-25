package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h;
import com.google.assistant.p3897e.p3902c.p3907c.C51009d;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51165v;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.a */
/* compiled from: PG */
public final /* synthetic */ class C33267a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ AlarmInstanceField f89216a;

    /* renamed from: b */
    public final /* synthetic */ C51009d f89217b;

    public /* synthetic */ C33267a(AlarmInstanceField alarmInstanceField, C51009d dVar) {
        this.f89216a = alarmInstanceField;
        this.f89217b = dVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AlarmInstanceField alarmInstanceField = this.f89216a;
        C51009d dVar = this.f89217b;
        Switch switchR = alarmInstanceField.f88986b;
        if (switchR == null || alarmInstanceField.f88987c == null || alarmInstanceField.f88990f == null) {
            ((C59052c) ((C59052c) AlarmInstanceField.f88985a.mo56226d()).mo56372aa(50983)).mo56386p("Failed to handle onCheck due to invalid args");
            return;
        }
        switchR.setChecked(z);
        if (z) {
            Context context = alarmInstanceField.getContext();
            Fragment fragment = alarmInstanceField.f88990f;
            C51165v vVar = dVar.f132806d;
            if (vVar == null) {
                vVar = C51165v.f133190c;
            }
            C51098gh ghVar = vVar.f133193b;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            C33230h.m61622d(context, fragment, ghVar);
            TextView textView = alarmInstanceField.f88987c;
            Context context2 = alarmInstanceField.getContext();
            Object[] objArr = new Object[1];
            C52403ql qlVar = dVar.f132804b;
            if (qlVar == null) {
                qlVar = C52403ql.f137512f;
            }
            objArr[0] = AlarmInstanceField.m61697a(qlVar);
            textView.setContentDescription(context2.getString(R.string.fa_alarm_instance_switch_on_label, objArr));
            return;
        }
        Context context3 = alarmInstanceField.getContext();
        Fragment fragment2 = alarmInstanceField.f88990f;
        C51165v vVar2 = dVar.f132807e;
        if (vVar2 == null) {
            vVar2 = C51165v.f133190c;
        }
        C51098gh ghVar2 = vVar2.f133193b;
        if (ghVar2 == null) {
            ghVar2 = C51098gh.f133009e;
        }
        C33230h.m61622d(context3, fragment2, ghVar2);
        TextView textView2 = alarmInstanceField.f88987c;
        Context context4 = alarmInstanceField.getContext();
        Object[] objArr2 = new Object[1];
        C52403ql qlVar2 = dVar.f132804b;
        if (qlVar2 == null) {
            qlVar2 = C52403ql.f137512f;
        }
        objArr2[0] = AlarmInstanceField.m61697a(qlVar2);
        textView2.setContentDescription(context4.getString(R.string.fa_alarm_instance_switch_off_label, objArr2));
    }
}
