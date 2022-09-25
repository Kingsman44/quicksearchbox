package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.res.Resources;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51009d;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51165v;
import com.google.assistant.p3897e.p3921j.C52403ql;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.a */
/* compiled from: PG */
final class C11340a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ C51009d f37059a;

    /* renamed from: b */
    final /* synthetic */ AlarmInstance f37060b;

    public C11340a(AlarmInstance alarmInstance, C51009d dVar) {
        this.f37060b = alarmInstance;
        this.f37059a = dVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f37060b.f36882a.setChecked(z);
        if (z) {
            AlarmInstance alarmInstance = this.f37060b;
            C51165v vVar = this.f37059a.f132806d;
            if (vVar == null) {
                vVar = C51165v.f133190c;
            }
            C51098gh ghVar = vVar.f133193b;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            alarmInstance.mo19944l(ghVar);
            AlarmInstance alarmInstance2 = this.f37060b;
            TextView textView = alarmInstance2.f36883b;
            Resources resources = alarmInstance2.f37159r.getResources();
            Object[] objArr = new Object[1];
            C52403ql qlVar = this.f37059a.f132804b;
            if (qlVar == null) {
                qlVar = C52403ql.f137512f;
            }
            objArr[0] = AlarmInstance.m26974a(qlVar);
            textView.setContentDescription(resources.getString(R.string.fluid_action_alarm_instance_switch_on_label, objArr));
            return;
        }
        AlarmInstance alarmInstance3 = this.f37060b;
        C51165v vVar2 = this.f37059a.f132807e;
        if (vVar2 == null) {
            vVar2 = C51165v.f133190c;
        }
        C51098gh ghVar2 = vVar2.f133193b;
        if (ghVar2 == null) {
            ghVar2 = C51098gh.f133009e;
        }
        alarmInstance3.mo19944l(ghVar2);
        AlarmInstance alarmInstance4 = this.f37060b;
        TextView textView2 = alarmInstance4.f36883b;
        Resources resources2 = alarmInstance4.f37159r.getResources();
        Object[] objArr2 = new Object[1];
        C52403ql qlVar2 = this.f37059a.f132804b;
        if (qlVar2 == null) {
            qlVar2 = C52403ql.f137512f;
        }
        objArr2[0] = AlarmInstance.m26974a(qlVar2);
        textView2.setContentDescription(resources2.getString(R.string.fluid_action_alarm_instance_switch_off_label, objArr2));
    }
}
