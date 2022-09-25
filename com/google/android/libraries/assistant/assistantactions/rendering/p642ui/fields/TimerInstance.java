package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TimerInstance */
/* compiled from: PG */
public class TimerInstance extends C11407n {

    /* renamed from: a */
    private static final C59071e f37052a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TimerInstance");

    /* renamed from: b */
    private TextView f37053b;

    /* renamed from: c */
    private TextView f37054c;

    /* renamed from: d */
    private LinearLayout f37055d;

    /* renamed from: e */
    private TextView f37056e;

    /* renamed from: f */
    private TextView f37057f;

    /* renamed from: g */
    private TextView f37058g;

    public TimerInstance(Context context) {
        super(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19809b() {
        /*
            r15 = this;
            super.mo19809b()
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r15.f37153l
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            int r1 = r0.f136277e
            r2 = 29
            if (r1 != r2) goto L_0x0015
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.ih r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51152ih) r0
            goto L_0x0017
        L_0x0015:
            com.google.assistant.e.c.c.ih r0 = com.google.assistant.p3897e.p3902c.p3907c.C51152ih.f133149f
        L_0x0017:
            android.widget.TextView r1 = r15.f37053b
            r2 = 0
            r1.setVisibility(r2)
            int r1 = r0.f133152b
            int r1 = com.google.assistant.p3897e.p3902c.p3907c.C51151ig.m86045a(r1)
            r3 = 1
            if (r1 != 0) goto L_0x0027
            r1 = 1
        L_0x0027:
            int r1 = r1 + -1
            r4 = 4
            r5 = 3
            r6 = 2
            if (r1 == r3) goto L_0x0081
            if (r1 == r6) goto L_0x006c
            if (r1 == r5) goto L_0x0081
            if (r1 == r4) goto L_0x0057
            com.google.common.f.e r1 = f37052a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r7 = "The status of timer is unknown."
            r8 = 43292(0xa91c, float:6.0665E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r8)).mo56386p(r7)
            android.widget.TextView r1 = r15.f37053b
            android.content.Context r7 = r15.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2132086889(0x7f151069, float:1.9814018E38)
            java.lang.String r7 = r7.getString(r8)
            r1.setText(r7)
            goto L_0x0095
        L_0x0057:
            android.widget.TextView r1 = r15.f37053b
            android.content.Context r7 = r15.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2132086888(0x7f151068, float:1.9814016E38)
            java.lang.String r7 = r7.getString(r8)
            r1.setText(r7)
            goto L_0x0095
        L_0x006c:
            android.widget.TextView r1 = r15.f37053b
            android.content.Context r7 = r15.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2132086887(0x7f151067, float:1.9814014E38)
            java.lang.String r7 = r7.getString(r8)
            r1.setText(r7)
            goto L_0x0095
        L_0x0081:
            android.widget.TextView r1 = r15.f37053b
            android.content.Context r7 = r15.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2132086886(0x7f151066, float:1.9814012E38)
            java.lang.String r7 = r7.getString(r8)
            r1.setText(r7)
        L_0x0095:
            int r1 = r0.f133152b
            int r1 = com.google.assistant.p3897e.p3902c.p3907c.C51151ig.m86045a(r1)
            if (r1 != 0) goto L_0x009e
            r1 = 1
        L_0x009e:
            int r1 = r1 + -1
            if (r1 == r3) goto L_0x00b3
            if (r1 == r5) goto L_0x00b3
            android.widget.TextView r1 = r15.f37053b
            android.content.Context r7 = r15.f37159r
            r8 = 2130969953(0x7f040561, float:1.7548602E38)
            int r7 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e.m26908a(r7, r8)
            r1.setTextColor(r7)
            goto L_0x00c1
        L_0x00b3:
            android.widget.TextView r1 = r15.f37053b
            android.content.Context r7 = r15.f37159r
            r8 = 2130969951(0x7f04055f, float:1.7548598E38)
            int r7 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e.m26908a(r7, r8)
            r1.setTextColor(r7)
        L_0x00c1:
            int r1 = r0.f133152b
            int r1 = com.google.assistant.p3897e.p3902c.p3907c.C51151ig.m86045a(r1)
            if (r1 != 0) goto L_0x00ca
            r1 = 1
        L_0x00ca:
            int r1 = r1 + -1
            if (r1 == r3) goto L_0x00e1
            if (r1 == r5) goto L_0x00e1
            android.widget.TextView r1 = r15.f37053b
            android.content.Context r7 = r15.getContext()
            r8 = 2131235633(0x7f081331, float:1.8087465E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r1.setBackground(r7)
            goto L_0x00f1
        L_0x00e1:
            android.widget.TextView r1 = r15.f37053b
            android.content.Context r7 = r15.getContext()
            r8 = 2131235632(0x7f081330, float:1.8087463E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            r1.setBackground(r7)
        L_0x00f1:
            int r1 = r0.f133151a
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0117
            android.widget.TextView r1 = r15.f37054c
            r1.setVisibility(r2)
            android.widget.TextView r1 = r15.f37054c
            com.google.assistant.e.j.so r7 = r0.f133153c
            if (r7 != 0) goto L_0x0103
            com.google.assistant.e.j.so r7 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
        L_0x0103:
            java.util.Locale r8 = java.util.Locale.getDefault()
            android.content.Context r9 = r15.getContext()
            android.content.res.Resources r9 = r9.getResources()
            java.lang.CharSequence r7 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e.m26912e(r7, r8, r9)
            r1.setText(r7)
            goto L_0x0125
        L_0x0117:
            com.google.common.f.e r1 = f37052a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r7 = "There is no total duration value specified in timerInstance."
            r8 = 43291(0xa91b, float:6.0664E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r8)).mo56386p(r7)
        L_0x0125:
            int r1 = r0.f133151a
            r7 = r1 & 4
            if (r7 == 0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            r1 = r1 & 8
            if (r1 == 0) goto L_0x01e0
        L_0x0130:
            android.widget.LinearLayout r1 = r15.f37055d
            r1.setVisibility(r2)
            int r1 = r0.f133151a
            r7 = r1 & 4
            if (r7 == 0) goto L_0x0144
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0144
            android.widget.TextView r1 = r15.f37057f
            r1.setVisibility(r2)
        L_0x0144:
            int r1 = r0.f133151a
            r1 = r1 & r4
            if (r1 == 0) goto L_0x01ce
            android.widget.TextView r1 = r15.f37056e
            r1.setVisibility(r2)
            android.widget.TextView r1 = r15.f37056e
            com.google.assistant.e.j.so r4 = r0.f133154d
            if (r4 != 0) goto L_0x0156
            com.google.assistant.e.j.so r4 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
        L_0x0156:
            long r7 = r4.f137717b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = r4.toHours(r7)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = r4.toMinutes(r7)
            r13 = 60
            long r11 = r11 % r13
            long r7 = r7 % r13
            r13 = 0
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0192
            android.content.Context r4 = r15.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r5[r2] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r5[r3] = r9
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            r5[r6] = r3
            r3 = 2132086878(0x7f15105e, float:1.9813995E38)
            java.lang.String r3 = r4.getString(r3, r5)
            goto L_0x01cb
        L_0x0192:
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b4
            android.content.Context r4 = r15.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r5[r2] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            r5[r3] = r6
            r3 = 2132086879(0x7f15105f, float:1.9813997E38)
            java.lang.String r3 = r4.getString(r3, r5)
            goto L_0x01cb
        L_0x01b4:
            android.content.Context r4 = r15.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r3[r2] = r5
            r5 = 2132086880(0x7f151060, float:1.9814E38)
            java.lang.String r3 = r4.getString(r5, r3)
        L_0x01cb:
            r1.setText(r3)
        L_0x01ce:
            int r1 = r0.f133151a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x01e0
            android.widget.TextView r1 = r15.f37058g
            r1.setVisibility(r2)
            android.widget.TextView r1 = r15.f37058g
            java.lang.String r0 = r0.f133155e
            r1.setText(r0)
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.TimerInstance.mo19809b():void");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37053b = (TextView) findViewById(R.id.timer_status);
        this.f37054c = (TextView) findViewById(R.id.timer_duration_total);
        this.f37055d = (LinearLayout) findViewById(R.id.timer_instance_description);
        this.f37056e = (TextView) findViewById(R.id.timer_remaining_duration);
        this.f37057f = (TextView) findViewById(R.id.remaining_duration_label_separator);
        this.f37058g = (TextView) findViewById(R.id.timer_label);
        this.f37053b.setVisibility(8);
        this.f37054c.setVisibility(8);
        this.f37055d.setVisibility(8);
        this.f37056e.setVisibility(8);
        this.f37057f.setVisibility(8);
        this.f37058g.setVisibility(8);
    }

    public TimerInstance(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimerInstance(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TimerInstance(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
