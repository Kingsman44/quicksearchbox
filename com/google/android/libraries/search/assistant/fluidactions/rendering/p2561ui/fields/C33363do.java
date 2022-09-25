package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.android.material.timepicker.C44989m;
import com.google.assistant.p3897e.p3902c.p3907c.C51142hy;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;
import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.do */
/* compiled from: PG */
public final /* synthetic */ class C33363do implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f89406a;

    /* renamed from: b */
    public final /* synthetic */ C44989m f89407b;

    public /* synthetic */ C33363do(TimeSelectionField timeSelectionField, C44989m mVar) {
        this.f89406a = timeSelectionField;
        this.f89407b = mVar;
    }

    public final void onClick(View view) {
        TimeSelectionField timeSelectionField = this.f89406a;
        C44989m mVar = this.f89407b;
        int a = mVar.mo48654a();
        int i = mVar.f117559f.f117515e;
        if (timeSelectionField.f89196g != null && timeSelectionField.f89193d >= 0 && timeSelectionField.f89192c != null) {
            C52402qk qkVar = (C52402qk) C52403ql.f137512f.createBuilder();
            qkVar.copyOnWrite();
            C52403ql qlVar = (C52403ql) qkVar.instance;
            qlVar.f137514a |= 1;
            qlVar.f137515b = a;
            qkVar.copyOnWrite();
            C52403ql qlVar2 = (C52403ql) qkVar.instance;
            qlVar2.f137514a |= 2;
            qlVar2.f137516c = i;
            C52403ql qlVar3 = (C52403ql) qkVar.build();
            Locale locale = Locale.getDefault();
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            Calendar instance = Calendar.getInstance(timeZone);
            instance.set(0, 0, 0, a, i);
            DateFormat timeInstance = DateFormat.getTimeInstance(3, locale);
            timeInstance.setTimeZone(timeZone);
            String format = timeInstance.format(instance.getTime());
            C51146ib ibVar = (C51146ib) timeSelectionField.f89192c.getItem(timeSelectionField.f89193d);
            if (ibVar != null) {
                C51142hy hyVar = (C51142hy) ibVar.toBuilder();
                hyVar.copyOnWrite();
                C51146ib ibVar2 = (C51146ib) hyVar.instance;
                format.getClass();
                ibVar2.f133132a |= 16;
                ibVar2.f133137f = format;
                hyVar.copyOnWrite();
                C51146ib ibVar3 = (C51146ib) hyVar.instance;
                qlVar3.getClass();
                ibVar3.f133134c = qlVar3;
                ibVar3.f133132a |= 2;
                C51146ib ibVar4 = (C51146ib) hyVar.build();
                timeSelectionField.f89192c.insert(ibVar4, timeSelectionField.f89193d);
                C33368dt dtVar = timeSelectionField.f89192c;
                dtVar.remove((C51146ib) dtVar.getItem(timeSelectionField.f89193d + 1));
                timeSelectionField.f89192c.notifyDataSetChanged();
                timeSelectionField.mo38727a(ibVar4);
            }
        }
    }
}
