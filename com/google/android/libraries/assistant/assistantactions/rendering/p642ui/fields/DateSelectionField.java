package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.C11339f;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.SpinnerComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11316d;
import com.google.assistant.p3897e.p3902c.p3907c.C50973br;
import com.google.assistant.p3897e.p3902c.p3907c.C50976bu;
import com.google.assistant.p3897e.p3902c.p3907c.C50978bw;
import com.google.assistant.p3897e.p3921j.C52392qa;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59071e;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DateSelectionField */
/* compiled from: PG */
public class DateSelectionField extends C11407n implements C11316d {

    /* renamed from: a */
    public static final C59071e f36969a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DateSelectionField");

    /* renamed from: b */
    public SpinnerComponent f36970b;

    /* renamed from: c */
    public int f36971c = -1;

    /* renamed from: d */
    public C11354an f36972d;

    /* renamed from: e */
    public C50976bu f36973e = C50976bu.f132703h;

    /* renamed from: f */
    private TextView f36974f;

    /* renamed from: g */
    private C11339f f36975g;

    public DateSelectionField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo19751a(int i, int i2, int i3) {
        if (this.f37153l != null && this.f37154m != null && this.f36971c >= 0 && this.f36972d != null) {
            C52392qa qaVar = (C52392qa) C52393qb.f137479e.createBuilder();
            qaVar.copyOnWrite();
            C52393qb qbVar = (C52393qb) qaVar.instance;
            qbVar.f137481a |= 1;
            qbVar.f137482b = i;
            qaVar.copyOnWrite();
            C52393qb qbVar2 = (C52393qb) qaVar.instance;
            qbVar2.f137481a |= 2;
            qbVar2.f137483c = i2;
            qaVar.copyOnWrite();
            C52393qb qbVar3 = (C52393qb) qaVar.instance;
            qbVar3.f137481a |= 4;
            qbVar3.f137484d = i3;
            C52393qb qbVar4 = (C52393qb) qaVar.build();
            C50976bu buVar = (C50976bu) this.f36972d.getItem(this.f36971c);
            if (buVar != null) {
                Locale locale = Locale.getDefault();
                TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
                Calendar instance = Calendar.getInstance(timeZone);
                instance.set(1, i);
                instance.set(2, i2 - 1);
                instance.set(5, i3);
                DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
                dateInstance.setTimeZone(timeZone);
                String format = dateInstance.format(instance.getTime());
                C50973br brVar = (C50973br) buVar.toBuilder();
                brVar.copyOnWrite();
                C50976bu buVar2 = (C50976bu) brVar.instance;
                format.getClass();
                buVar2.f132705a |= 32;
                buVar2.f132710f = format;
                brVar.copyOnWrite();
                C50976bu buVar3 = (C50976bu) brVar.instance;
                qbVar4.getClass();
                buVar3.f132707c = qbVar4;
                buVar3.f132705a |= 4;
                C50976bu buVar4 = (C50976bu) brVar.build();
                this.f36972d.insert(buVar4, this.f36971c);
                C11354an anVar = this.f36972d;
                anVar.remove((C50976bu) anVar.getItem(this.f36971c + 1));
                this.f36972d.notifyDataSetChanged();
                mo19839c(buVar4);
            }
        }
    }

    /* renamed from: b */
    public final void mo19809b() {
        C50978bw bwVar;
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null && this.f37152k != null && this.f36972d != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 12) {
                bwVar = (C50978bw) euVar.f136278f;
            } else {
                bwVar = C50978bw.f132713e;
            }
            this.f36974f.setText(bwVar.f132716b);
            ArrayList arrayList = new ArrayList(bwVar.f132717c);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                C50976bu buVar = (C50976bu) it.next();
                if ((buVar.f132705a & 8) != 0 && buVar.f132708d) {
                    break;
                }
                i++;
            }
            this.f36971c = i;
            if (i != -1) {
                this.f36972d.clear();
                this.f36972d.addAll(arrayList);
                this.f36970b.setAdapter((SpinnerAdapter) this.f36972d);
                this.f36970b.setVisibility(0);
                this.f36970b.setSelection(this.f36971c, false);
                C50976bu buVar2 = (C50976bu) arrayList.get(this.f36971c);
                this.f36973e = buVar2;
                if ((buVar2.f132705a & 4) != 0) {
                    this.f36974f.setVisibility(4);
                } else {
                    this.f36974f.setVisibility(0);
                }
            }
            mo19840d();
        }
    }

    /* renamed from: o */
    public final void mo19841o() {
        this.f36970b.requestFocus();
        this.f36970b.requestFocusFromTouch();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36974f = (TextView) findViewById(R.id.date_selection_field_title);
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.date_list);
        this.f36970b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f36972d = new C11354an(this, getContext());
        C11350aj ajVar = new C11350aj(this);
        this.f36975g = ajVar;
        SpinnerComponent spinnerComponent2 = this.f36970b;
        spinnerComponent2.f36871e = ajVar;
        spinnerComponent2.setOnFocusChangeListener(new C11351ak(this));
        this.f36970b.setOnTouchListener(new C11352al(this));
    }

    /* renamed from: p */
    public final void mo19843p() {
        this.f36970b.clearFocus();
    }

    public DateSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DateSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: d */
    public final void mo19840d() {
        int i;
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            if (cVar.mo19717a()) {
                i = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_error_color);
            } else if (this.f37151j) {
                i = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_highlight_field_color);
            } else {
                i = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_nonhighlight_field_title_color);
            }
            this.f36974f.setTextColor(i);
        }
        if (this.f36970b.getChildAt(0) != null && this.f37153l != null) {
            SpinnerComponent spinnerComponent = this.f36970b;
            spinnerComponent.mo19803c((TextView) spinnerComponent.getChildAt(0), this.f37153l.mo19717a(), this.f37151j);
        }
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19839c(com.google.assistant.p3897e.p3902c.p3907c.C50976bu r10) {
        /*
            r9 = this;
            r9.f36973e = r10
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            r1 = 1
            if (r0 != 0) goto L_0x0009
            goto L_0x00cf
        L_0x0009:
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            com.google.protobuf.bn r2 = r10.toBuilder()
            com.google.assistant.e.c.c.br r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50973br) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.bu r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r3
            int r4 = r3.f132705a
            r4 = r4 | 8
            r3.f132705a = r4
            r3.f132708d = r1
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.bu r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r2
            int r3 = r0.f136277e
            r4 = 12
            if (r3 != r4) goto L_0x0031
            java.lang.Object r3 = r0.f136278f
            com.google.assistant.e.c.c.bw r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r3
            goto L_0x0033
        L_0x0031:
            com.google.assistant.e.c.c.bw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50978bw.f132713e
        L_0x0033:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.c.c.bv r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50977bv) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.bw r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r5
            r2.getClass()
            r5.f132718d = r2
            int r6 = r5.f132715a
            r6 = r6 | 2
            r5.f132715a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.bw r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r5
            com.google.protobuf.cq r6 = com.google.assistant.p3897e.p3902c.p3907c.C50978bw.emptyProtobufList()
            r5.f132717c = r6
            int r5 = r0.f136277e
            if (r5 != r4) goto L_0x0061
            java.lang.Object r5 = r0.f136278f
            com.google.assistant.e.c.c.bw r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r5
            goto L_0x0063
        L_0x0061:
            com.google.assistant.e.c.c.bw r5 = com.google.assistant.p3897e.p3902c.p3907c.C50978bw.f132713e
        L_0x0063:
            com.google.protobuf.cq r5 = r5.f132717c
            java.util.Iterator r5 = r5.iterator()
        L_0x0069:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r5.next()
            com.google.assistant.e.c.c.bu r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r6
            com.google.protobuf.bn r7 = r6.toBuilder()
            com.google.assistant.e.c.c.br r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50973br) r7
            int r8 = r6.f132705a
            r8 = r8 & r1
            if (r8 == 0) goto L_0x0097
            int r8 = r2.f132705a
            r8 = r8 & r1
            if (r8 == 0) goto L_0x0097
            java.lang.String r6 = r6.f132706b
            java.lang.String r8 = r2.f132706b
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0097
            com.google.protobuf.bn r6 = r2.toBuilder()
            r7 = r6
            com.google.assistant.e.c.c.br r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50973br) r7
            goto L_0x00a7
        L_0x0097:
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.assistant.e.c.c.bu r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r6
            int r8 = r6.f132705a
            r8 = r8 | 8
            r6.f132705a = r8
            r8 = 0
            r6.f132708d = r8
        L_0x00a7:
            r3.mo53496a(r7)
            goto L_0x0069
        L_0x00ab:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.c.c.bw r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r3
            r3.getClass()
            r2.f136278f = r3
            r2.f136277e = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            r2.f36729a = r0
        L_0x00cf:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            if (r0 == 0) goto L_0x017c
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r0 = r9.f37154m
            if (r0 != 0) goto L_0x00d9
            goto L_0x017c
        L_0x00d9:
            com.google.assistant.e.j.qb r0 = r10.f132707c
            if (r0 != 0) goto L_0x00df
            com.google.assistant.e.j.qb r0 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x00df:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            if (r2 == 0) goto L_0x0161
            com.google.assistant.e.j.tr r2 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.tp r2 = (com.google.assistant.p3897e.p3921j.C52488tp) r2
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = r9.f37153l
            com.google.assistant.e.j.e.eu r3 = r3.f36729a
            java.lang.String r3 = r3.f136279g
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.j.tr r4 = (com.google.assistant.p3897e.p3921j.C52490tr) r4
            r3.getClass()
            int r5 = r4.f137797a
            r5 = r5 | r1
            r4.f137797a = r5
            r4.f137800d = r3
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = r9.f37153l
            com.google.assistant.e.j.e.eu r3 = r3.f36729a
            java.lang.String r3 = r3.f136280h
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.j.tr r4 = (com.google.assistant.p3897e.p3921j.C52490tr) r4
            r3.getClass()
            int r5 = r4.f137797a
            r5 = r5 | 2
            r4.f137797a = r5
            r4.f137801e = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            int r4 = r3.f137797a
            r4 = r4 | 4
            r3.f137797a = r4
            r3.f137802f = r1
            com.google.assistant.e.j.ti r3 = com.google.assistant.p3897e.p3921j.C52481ti.f137762c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.th r3 = (com.google.assistant.p3897e.p3921j.C52480th) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.e.j.ti r4 = (com.google.assistant.p3897e.p3921j.C52481ti) r4
            r0.getClass()
            r4.f137765b = r0
            int r0 = r4.f137764a
            r0 = r0 | r1
            r4.f137764a = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            com.google.protobuf.bv r1 = r3.build()
            com.google.assistant.e.j.ti r1 = (com.google.assistant.p3897e.p3921j.C52481ti) r1
            r1.getClass()
            r0.f137799c = r1
            r1 = 6
            r0.f137798b = r1
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.tr r1 = (com.google.assistant.p3897e.p3921j.C52490tr) r1
            r0.f36730b = r1
        L_0x0161:
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r0 = r9.f37154m
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r1 = r9.f37153l
            com.google.android.libraries.assistant.assistantactions.rendering.c.f r0 = r0.mo19691a(r1)
            int r1 = r10.f132705a
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0179
            com.google.assistant.e.c.c.dg r10 = r10.f132709e
            if (r10 != 0) goto L_0x0175
            com.google.assistant.e.c.c.dg r10 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0175:
            r9.mo19942i(r10, r0)
            return
        L_0x0179:
            r9.mo19941h(r0)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.DateSelectionField.mo19839c(com.google.assistant.e.c.c.bu):void");
    }
}
