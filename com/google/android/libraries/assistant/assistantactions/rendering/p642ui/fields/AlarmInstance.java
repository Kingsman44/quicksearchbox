package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.common.p4526f.C59071e;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AlarmInstance */
/* compiled from: PG */
public class AlarmInstance extends C11407n {

    /* renamed from: c */
    private static final C59071e f36881c = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.AlarmInstance");

    /* renamed from: a */
    public Switch f36882a;

    /* renamed from: b */
    public TextView f36883b;

    /* renamed from: d */
    private LinearLayout f36884d;

    /* renamed from: e */
    private ImageComponent f36885e;

    /* renamed from: f */
    private TextView f36886f;

    /* renamed from: g */
    private LinearLayout f36887g;

    /* renamed from: h */
    private TextView f36888h;

    /* renamed from: i */
    private LinearLayout f36889i;

    /* renamed from: t */
    private TextView f36890t;

    /* renamed from: u */
    private TextView f36891u;

    /* renamed from: v */
    private TextView f36892v;

    public AlarmInstance(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static String m26974a(C52403ql qlVar) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Calendar instance = Calendar.getInstance(timeZone);
        instance.set(0, 0, 0, qlVar.f137515b, qlVar.f137516c);
        DateFormat timeInstance = DateFormat.getTimeInstance(3, Locale.getDefault());
        timeInstance.setTimeZone(timeZone);
        return timeInstance.format(instance.getTime());
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x013e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19809b() {
        /*
            r8 = this;
            super.mo19809b()
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r8.f37153l
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            int r1 = r0.f136277e
            r2 = 28
            if (r1 != r2) goto L_0x0015
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.d r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r0
            goto L_0x0017
        L_0x0015:
            com.google.assistant.e.c.c.d r0 = com.google.assistant.p3897e.p3902c.p3907c.C51009d.f132801i
        L_0x0017:
            int r1 = r0.f132803a
            r1 = r1 & 64
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x009e
            com.google.assistant.e.c.c.gh r1 = r0.f132810h
            if (r1 != 0) goto L_0x0025
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0025:
            int r4 = r1.f133012b
            if (r4 != r2) goto L_0x0090
            java.lang.Object r1 = r1.f133013c
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            int r4 = r1.f132943a
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0081
            android.widget.LinearLayout r4 = r8.f36884d
            r4.setVisibility(r3)
            java.lang.String r1 = r1.f132944b
            android.content.Context r4 = r8.getContext()     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0053 }
            android.widget.TextView r5 = r8.f36886f     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.pm.ApplicationInfo r6 = r4.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0053 }
            java.lang.CharSequence r4 = r4.getApplicationLabel(r6)     // Catch:{ NameNotFoundException -> 0x0053 }
            r5.setText(r4)     // Catch:{ NameNotFoundException -> 0x0053 }
            android.widget.TextView r4 = r8.f36886f     // Catch:{ NameNotFoundException -> 0x0053 }
            r4.setVisibility(r3)     // Catch:{ NameNotFoundException -> 0x0053 }
        L_0x0053:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r4 = r8.f36885e
            r4.f36858e = r2
            com.google.assistant.e.c.c.dc r5 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.c.c.db r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.e.c.c.dc r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r6
            r1.getClass()
            int r7 = r6.f132815a
            r7 = r7 | 32
            r6.f132815a = r7
            r6.f132821g = r1
            com.google.protobuf.bv r1 = r5.build()
            com.google.assistant.e.c.c.dc r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r1
            r5 = 0
            r4.mo19786b(r1, r5)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r1 = r8.f36885e
            r1.setVisibility(r3)
            goto L_0x009e
        L_0x0081:
            com.google.common.f.e r1 = f36881c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r4 = "There is no package name specified in AndroidAppInfo."
            r5 = 43190(0xa8b6, float:6.0522E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r5)).mo56386p(r4)
            goto L_0x009e
        L_0x0090:
            com.google.common.f.e r1 = f36881c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r4 = "There is no AndroidAppInfo specified in OnDeviceClockProvider."
            r5 = 43191(0xa8b7, float:6.0523E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r5)).mo56386p(r4)
        L_0x009e:
            int r1 = r0.f132803a
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0167
            android.widget.LinearLayout r1 = r8.f36887g
            r1.setVisibility(r3)
            com.google.assistant.e.j.ql r1 = r0.f132804b
            if (r1 != 0) goto L_0x00ae
            com.google.assistant.e.j.ql r1 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x00ae:
            android.widget.TextView r4 = r8.f36888h
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.CharSequence r1 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e.m26913f(r1, r5)
            r4.setText(r1)
            android.widget.TextView r1 = r8.f36888h
            r1.setVisibility(r3)
            int r1 = r0.f132803a
            r4 = r1 & 4
            if (r4 == 0) goto L_0x0175
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0175
            android.widget.Switch r1 = r8.f36882a
            r1.setVisibility(r3)
            int r1 = r0.f132805c
            com.google.assistant.e.c.c.c r1 = com.google.assistant.p3897e.p3902c.p3907c.C50982c.m86000a(r1)
            if (r1 != 0) goto L_0x00d9
            com.google.assistant.e.c.c.c r1 = com.google.assistant.p3897e.p3902c.p3907c.C50982c.UNDEFINED
        L_0x00d9:
            com.google.assistant.e.c.c.c r4 = com.google.assistant.p3897e.p3902c.p3907c.C50982c.UNDEFINED
            if (r1 == r4) goto L_0x0112
            int r1 = r0.f132805c
            com.google.assistant.e.c.c.c r1 = com.google.assistant.p3897e.p3902c.p3907c.C50982c.m86000a(r1)
            if (r1 != 0) goto L_0x00e7
            com.google.assistant.e.c.c.c r1 = com.google.assistant.p3897e.p3902c.p3907c.C50982c.UNDEFINED
        L_0x00e7:
            com.google.assistant.e.c.c.c r4 = com.google.assistant.p3897e.p3902c.p3907c.C50982c.ON
            if (r1 != r4) goto L_0x00ec
            goto L_0x0112
        L_0x00ec:
            android.widget.Switch r1 = r8.f36882a
            r1.setChecked(r3)
            android.widget.TextView r1 = r8.f36883b
            android.content.Context r4 = r8.f37159r
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.assistant.e.j.ql r5 = r0.f132804b
            if (r5 != 0) goto L_0x0101
            com.google.assistant.e.j.ql r5 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x0101:
            java.lang.String r5 = m26974a(r5)
            r2[r3] = r5
            r5 = 2132086856(0x7f151048, float:1.981395E38)
            java.lang.String r2 = r4.getString(r5, r2)
            r1.setContentDescription(r2)
            goto L_0x0137
        L_0x0112:
            android.widget.Switch r1 = r8.f36882a
            r1.setChecked(r2)
            android.widget.TextView r1 = r8.f36883b
            android.content.Context r4 = r8.f37159r
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.google.assistant.e.j.ql r5 = r0.f132804b
            if (r5 != 0) goto L_0x0127
            com.google.assistant.e.j.ql r5 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x0127:
            java.lang.String r5 = m26974a(r5)
            r2[r3] = r5
            r5 = 2132086857(0x7f151049, float:1.9813953E38)
            java.lang.String r2 = r4.getString(r5, r2)
            r1.setContentDescription(r2)
        L_0x0137:
            android.widget.Switch r1 = r8.f36882a
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r8.f37153l
            if (r2 != 0) goto L_0x013e
            goto L_0x015c
        L_0x013e:
            com.google.assistant.e.j.e.eu r2 = r2.f36729a
            int r4 = r2.f136274b
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0149
            int r2 = r2.f136283k
            goto L_0x014c
        L_0x0149:
            r2 = 82724(0x14324, float:1.15921E-40)
        L_0x014c:
            com.google.android.libraries.logging.j r4 = new com.google.android.libraries.logging.j
            r4.<init>(r2)
            r2 = 5
            r4.mo33795i(r2)
            r2 = 4
            r4.mo33795i(r2)
            com.google.android.libraries.logging.C28295m.m52919e(r1, r4)
        L_0x015c:
            android.widget.Switch r1 = r8.f36882a
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.a r2 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.a
            r2.<init>(r8, r0)
            r1.setOnCheckedChangeListener(r2)
            goto L_0x0175
        L_0x0167:
            com.google.common.f.e r1 = f36881c
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "There is no time value specified in alarmInstance."
            r4 = 43188(0xa8b4, float:6.0519E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r2)
        L_0x0175:
            int r1 = r0.f132803a
            r2 = r1 & 16
            if (r2 == 0) goto L_0x017c
            goto L_0x0180
        L_0x017c:
            r1 = r1 & 32
            if (r1 == 0) goto L_0x01e1
        L_0x0180:
            android.widget.LinearLayout r1 = r8.f36889i
            r1.setVisibility(r3)
            int r1 = r0.f132803a
            r2 = r1 & 16
            if (r2 == 0) goto L_0x0194
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0194
            android.widget.TextView r1 = r8.f36891u
            r1.setVisibility(r3)
        L_0x0194:
            int r1 = r0.f132803a
            r1 = r1 & 16
            if (r1 == 0) goto L_0x01cf
            android.widget.TextView r1 = r8.f36890t
            r1.setVisibility(r3)
            com.google.assistant.e.j.qf r1 = r0.f132808f
            if (r1 != 0) goto L_0x01a5
            com.google.assistant.e.j.qf r1 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x01a5:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            com.google.common.base.ax r1 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d.m26904d(r1)
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x01c8
            java.lang.Object r1 = r1.mo56107c()
            com.android.b.s r1 = (com.android.p256b.C5033s) r1
            java.lang.String r1 = r1.toString()
            android.content.Context r2 = r8.f37159r
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r1 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d.m26907g(r1, r2)
            goto L_0x01ca
        L_0x01c8:
            java.lang.String r1 = ""
        L_0x01ca:
            android.widget.TextView r2 = r8.f36890t
            r2.setText(r1)
        L_0x01cf:
            int r1 = r0.f132803a
            r1 = r1 & 32
            if (r1 == 0) goto L_0x01e1
            android.widget.TextView r1 = r8.f36892v
            r1.setVisibility(r3)
            android.widget.TextView r1 = r8.f36892v
            java.lang.String r0 = r0.f132809g
            r1.setText(r0)
        L_0x01e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.AlarmInstance.mo19809b():void");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36884d = (LinearLayout) findViewById(R.id.provider_info);
        this.f36885e = (ImageComponent) findViewById(R.id.provider_image);
        this.f36886f = (TextView) findViewById(R.id.provider_name);
        this.f36884d.setVisibility(8);
        this.f36885e.setVisibility(8);
        this.f36886f.setVisibility(8);
        this.f36887g = (LinearLayout) findViewById(R.id.alarm_instance_main_panel);
        this.f36888h = (TextView) findViewById(R.id.alarm_time);
        this.f36882a = (Switch) findViewById(R.id.switch_control);
        this.f36883b = (TextView) findViewById(R.id.alarm_instance_switch_label);
        this.f36887g.setVisibility(8);
        this.f36888h.setVisibility(8);
        this.f36882a.setVisibility(8);
        this.f36889i = (LinearLayout) findViewById(R.id.alarm_instance_description);
        this.f36890t = (TextView) findViewById(R.id.alarm_recurrence);
        this.f36891u = (TextView) findViewById(R.id.recurrence_label_separator);
        this.f36892v = (TextView) findViewById(R.id.alarm_label);
        this.f36889i.setVisibility(8);
        this.f36890t.setVisibility(8);
        this.f36891u.setVisibility(8);
        this.f36892v.setVisibility(8);
    }

    public AlarmInstance(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlarmInstance(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AlarmInstance(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
