package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.C11339f;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.SpinnerComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11332t;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11333u;
import com.google.android.material.timepicker.C44988l;
import com.google.android.material.timepicker.C44989m;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3902c.p3907c.C51142hy;
import com.google.assistant.p3897e.p3902c.p3907c.C51145ia;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;
import com.google.assistant.p3897e.p3902c.p3907c.C51148id;
import com.google.assistant.p3897e.p3921j.C52402qk;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TimeSelectionField */
/* compiled from: PG */
public class TimeSelectionField extends C11407n implements C11332t {

    /* renamed from: a */
    public static final C59071e f37041a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TimeSelectionField");

    /* renamed from: b */
    public SpinnerComponent f37042b;

    /* renamed from: c */
    public int f37043c = -1;

    /* renamed from: d */
    public C11396cb f37044d;

    /* renamed from: e */
    public C51146ib f37045e = C51146ib.f133130h;

    /* renamed from: f */
    private TextView f37046f;

    /* renamed from: g */
    private C11339f f37047g;

    /* renamed from: h */
    private LinearLayout f37048h;

    /* renamed from: i */
    private TextView f37049i;

    /* renamed from: t */
    private TextView f37050t;

    /* renamed from: u */
    private ImageComponent f37051u;

    public TimeSelectionField(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51148id idVar;
        int a;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null && this.f37152k != null && this.f37044d != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 9) {
                idVar = (C51148id) euVar.f136278f;
            } else {
                idVar = C51148id.f133140f;
            }
            this.f37046f.setText(idVar.f133143b);
            ArrayList arrayList = new ArrayList(idVar.f133146e);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                C51146ib ibVar = (C51146ib) it.next();
                if ((ibVar.f133132a & 4) != 0 && ibVar.f133135d) {
                    break;
                }
                i++;
            }
            this.f37043c = i;
            if (i != -1) {
                this.f37044d.clear();
                this.f37044d.addAll(arrayList);
                this.f37042b.setAdapter((SpinnerAdapter) this.f37044d);
                this.f37042b.setVisibility(0);
                this.f37042b.setSelection(this.f37043c, false);
                C51146ib ibVar2 = (C51146ib) arrayList.get(this.f37043c);
                this.f37045e = ibVar2;
                if ((ibVar2.f133132a & 2) != 0) {
                    this.f37046f.setVisibility(0);
                } else {
                    this.f37046f.setVisibility(4);
                }
            }
            if (arrayList.size() == 1 && (a = C51145ia.m86043a(((C51146ib) C58557jl.m90133n(arrayList)).f133138g)) != 0 && a == 2) {
                this.f37042b.setClickable(false);
                this.f37042b.setOnTouchListener(new C11395ca(this, arrayList));
            }
            C51141hx hxVar = idVar.f133145d;
            if (hxVar == null) {
                hxVar = C51141hx.f133119h;
            }
            if ((hxVar.f133121a & 16) != 0) {
                C51141hx hxVar2 = idVar.f133145d;
                if (((hxVar2 == null ? C51141hx.f133119h : hxVar2).f133121a & 4) != 0) {
                    TextView textView = this.f37050t;
                    if (hxVar2 == null) {
                        hxVar2 = C51141hx.f133119h;
                    }
                    textView.setText(hxVar2.f133124d);
                    ImageComponent imageComponent = this.f37051u;
                    C51141hx hxVar3 = idVar.f133145d;
                    if (hxVar3 == null) {
                        hxVar3 = C51141hx.f133119h;
                    }
                    C51012dc dcVar = hxVar3.f133126f;
                    if (dcVar == null) {
                        dcVar = C51012dc.f132813k;
                    }
                    imageComponent.mo19786b(dcVar, (Drawable) null);
                    this.f37048h.setVisibility(0);
                    C51146ib ibVar3 = idVar.f133144c;
                    if (ibVar3 == null) {
                        ibVar3 = C51146ib.f133130h;
                    }
                    C52403ql qlVar = ibVar3.f133134c;
                    if (qlVar == null) {
                        qlVar = C52403ql.f137512f;
                    }
                    int i2 = qlVar.f137514a;
                    if (!((i2 & 1) == 0 || (i2 & 2) == 0)) {
                        Calendar instance = Calendar.getInstance();
                        instance.set(0, 0, 0, qlVar.f137515b, qlVar.f137516c);
                        this.f37049i.setText(DateFormat.getTimeInstance(3).format(instance.getTime()));
                    }
                }
            }
            mo19871e();
            if (this.f37160s == 2) {
                this.f37046f.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo19870c(C51146ib ibVar) {
        int i;
        if (this.f37156o == null) {
            ((C59052c) ((C59052c) f37041a.mo56226d()).mo56372aa(43289)).mo56386p("fragmentActivity is null.");
        } else if (this.f37155n.mo19521b(30)) {
            int i2 = 0;
            if (ibVar == null || (ibVar.f133132a & 2) == 0) {
                i = 0;
            } else {
                C52403ql qlVar = ibVar.f133134c;
                if (qlVar == null) {
                    qlVar = C52403ql.f137512f;
                }
                i2 = qlVar.f137515b;
                i = qlVar.f137516c;
            }
            C44988l lVar = new C44988l();
            lVar.f117552a.mo48632e(i2);
            lVar.f117552a.f117515e = i % 60;
            lVar.mo48652a();
            lVar.mo48653b(android.text.format.DateFormat.is24HourFormat(this.f37159r) ? 1 : 0);
            C44989m b = C44989m.m79968b(lVar);
            b.mo48656d(new C11390bw(this, b));
            b.showNow(this.f37156o.mo545jw(), "MaterialTimePickerFragment");
        } else if (ibVar == null || (ibVar.f133132a & 2) == 0) {
            C11333u.m26945a(this.f37156o, this).mo19765c();
        } else {
            C52403ql qlVar2 = ibVar.f133134c;
            if (qlVar2 == null) {
                qlVar2 = C52403ql.f137512f;
            }
            C11333u.m26946b(this.f37156o, this, qlVar2.f137515b, qlVar2.f137516c).mo19765c();
        }
    }

    /* renamed from: d */
    public final void mo19764d(int i, int i2) {
        if (this.f37153l != null && this.f37154m != null && this.f37043c >= 0 && this.f37044d != null) {
            C52402qk qkVar = (C52402qk) C52403ql.f137512f.createBuilder();
            qkVar.copyOnWrite();
            C52403ql qlVar = (C52403ql) qkVar.instance;
            qlVar.f137514a |= 1;
            qlVar.f137515b = i;
            qkVar.copyOnWrite();
            C52403ql qlVar2 = (C52403ql) qkVar.instance;
            qlVar2.f137514a |= 2;
            qlVar2.f137516c = i2;
            C52403ql qlVar3 = (C52403ql) qkVar.build();
            Locale locale = Locale.getDefault();
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            Calendar instance = Calendar.getInstance(timeZone);
            instance.set(0, 0, 0, i, i2);
            DateFormat timeInstance = DateFormat.getTimeInstance(3, locale);
            timeInstance.setTimeZone(timeZone);
            String format = timeInstance.format(instance.getTime());
            C51146ib ibVar = (C51146ib) this.f37044d.getItem(this.f37043c);
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
                this.f37044d.insert(ibVar4, this.f37043c);
                C11396cb cbVar = this.f37044d;
                cbVar.remove((C51146ib) cbVar.getItem(this.f37043c + 1));
                this.f37044d.notifyDataSetChanged();
                mo19869a(ibVar4);
            }
        }
    }

    /* renamed from: o */
    public final void mo19841o() {
        if (this.f37042b.requestFocus()) {
            this.f37042b.requestFocusFromTouch();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37046f = (TextView) findViewById(R.id.time_selection_field_title);
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.time_list);
        this.f37042b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f37044d = new C11396cb(this, getContext());
        C11391bx bxVar = new C11391bx(this);
        this.f37047g = bxVar;
        SpinnerComponent spinnerComponent2 = this.f37042b;
        spinnerComponent2.f36871e = bxVar;
        spinnerComponent2.setOnFocusChangeListener(new C11392by(this));
        this.f37042b.setOnTouchListener(new C11393bz(this));
        this.f37048h = (LinearLayout) findViewById(R.id.time_selection_field_text_label);
        this.f37049i = (TextView) findViewById(R.id.time_selection_primary_text);
        this.f37050t = (TextView) findViewById(R.id.time_selection_secondary_text);
        this.f37051u = (ImageComponent) findViewById(R.id.time_selection_icon);
    }

    /* renamed from: p */
    public final void mo19843p() {
        this.f37042b.clearFocus();
    }

    public TimeSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimeSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: e */
    public final void mo19871e() {
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
            this.f37046f.setTextColor(i);
        }
        if (this.f37042b.getChildAt(0) != null && this.f37153l != null) {
            SpinnerComponent spinnerComponent = this.f37042b;
            spinnerComponent.mo19803c((TextView) spinnerComponent.getChildAt(0), this.f37153l.mo19717a(), this.f37151j);
        }
    }

    /* JADX WARNING: type inference failed for: r6v14, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19869a(com.google.assistant.p3897e.p3902c.p3907c.C51146ib r10) {
        /*
            r9 = this;
            r9.f37045e = r10
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            r1 = 1
            if (r0 != 0) goto L_0x0009
            goto L_0x00cf
        L_0x0009:
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            com.google.protobuf.bn r2 = r10.toBuilder()
            com.google.assistant.e.c.c.hy r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51142hy) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.ib r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r3
            int r4 = r3.f133132a
            r4 = r4 | 4
            r3.f133132a = r4
            r3.f133135d = r1
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.ib r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r2
            int r3 = r0.f136277e
            r4 = 9
            if (r3 != r4) goto L_0x0031
            java.lang.Object r3 = r0.f136278f
            com.google.assistant.e.c.c.id r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r3
            goto L_0x0033
        L_0x0031:
            com.google.assistant.e.c.c.id r3 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x0033:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.c.c.ic r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51147ic) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.id r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r5
            r2.getClass()
            r5.f133144c = r2
            int r6 = r5.f133142a
            r6 = r6 | 2
            r5.f133142a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.id r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r5
            com.google.protobuf.cq r6 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.emptyProtobufList()
            r5.f133146e = r6
            int r5 = r0.f136277e
            if (r5 != r4) goto L_0x0061
            java.lang.Object r5 = r0.f136278f
            com.google.assistant.e.c.c.id r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r5
            goto L_0x0063
        L_0x0061:
            com.google.assistant.e.c.c.id r5 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x0063:
            com.google.protobuf.cq r5 = r5.f133146e
            java.util.Iterator r5 = r5.iterator()
        L_0x0069:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r5.next()
            com.google.assistant.e.c.c.ib r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r6
            com.google.protobuf.bn r7 = r6.toBuilder()
            com.google.assistant.e.c.c.hy r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51142hy) r7
            int r8 = r6.f133132a
            r8 = r8 & r1
            if (r8 == 0) goto L_0x0097
            int r8 = r2.f133132a
            r8 = r8 & r1
            if (r8 == 0) goto L_0x0097
            java.lang.String r6 = r6.f133133b
            java.lang.String r8 = r2.f133133b
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0097
            com.google.protobuf.bn r6 = r2.toBuilder()
            r7 = r6
            com.google.assistant.e.c.c.hy r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51142hy) r7
            goto L_0x00a7
        L_0x0097:
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.assistant.e.c.c.ib r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r6
            int r8 = r6.f133132a
            r8 = r8 | 4
            r6.f133132a = r8
            r8 = 0
            r6.f133135d = r8
        L_0x00a7:
            r3.mo53523a(r7)
            goto L_0x0069
        L_0x00ab:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.c.c.id r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r3
            r3.getClass()
            r2.f136278f = r3
            r2.f136277e = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            r2.f36729a = r0
        L_0x00cf:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            if (r0 == 0) goto L_0x01e3
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r0 = r9.f37154m
            if (r0 != 0) goto L_0x00d9
            goto L_0x01e3
        L_0x00d9:
            com.google.assistant.e.j.ql r0 = r10.f133134c
            if (r0 != 0) goto L_0x00df
            com.google.assistant.e.j.ql r0 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x00df:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            if (r2 == 0) goto L_0x0190
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
            com.google.assistant.e.j.uj r3 = com.google.assistant.p3897e.p3921j.C52509uj.f137841c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.ui r3 = (com.google.assistant.p3897e.p3921j.C52508ui) r3
            com.google.assistant.e.j.ql r4 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.qk r4 = (com.google.assistant.p3897e.p3921j.C52402qk) r4
            int r5 = r0.f137515b
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.e.j.ql r6 = (com.google.assistant.p3897e.p3921j.C52403ql) r6
            int r7 = r6.f137514a
            r7 = r7 | r1
            r6.f137514a = r7
            r6.f137515b = r5
            int r0 = r0.f137516c
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ql r5 = (com.google.assistant.p3897e.p3921j.C52403ql) r5
            int r6 = r5.f137514a
            r6 = r6 | 2
            r5.f137514a = r6
            r5.f137516c = r0
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.assistant.e.j.uj r0 = (com.google.assistant.p3897e.p3921j.C52509uj) r0
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.j.ql r4 = (com.google.assistant.p3897e.p3921j.C52403ql) r4
            r4.getClass()
            r0.f137844b = r4
            int r4 = r0.f137843a
            r4 = r4 | r1
            r0.f137843a = r4
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.uj r3 = (com.google.assistant.p3897e.p3921j.C52509uj) r3
            r3.getClass()
            r0.f137799c = r3
            r3 = 5
            r0.f137798b = r3
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            r0.f36730b = r2
        L_0x0190:
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r0 = r9.f37154m
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            com.google.android.libraries.assistant.assistantactions.rendering.c.f r0 = r0.mo19691a(r2)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            com.google.assistant.e.j.e.eu r2 = r2.f36729a
            int r3 = r2.f136275c
            if (r3 != r1) goto L_0x01a5
            java.lang.Object r2 = r2.f136276d
            com.google.assistant.e.c.c.dg r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r2
            goto L_0x01a7
        L_0x01a5:
            com.google.assistant.e.c.c.dg r2 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01a7:
            int r2 = r2.f132829a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x01d0
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            int r2 = r0.f136275c
            if (r2 != r1) goto L_0x01ba
            java.lang.Object r0 = r0.f136276d
            com.google.assistant.e.c.c.dg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r0
            goto L_0x01bc
        L_0x01ba:
            com.google.assistant.e.c.c.dg r0 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01bc:
            com.google.assistant.e.j.du r0 = r0.f132833e
            if (r0 != 0) goto L_0x01c2
            com.google.assistant.e.j.du r0 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x01c2:
            com.google.assistant.e.j.ql r10 = r10.f133134c
            if (r10 != 0) goto L_0x01c8
            com.google.assistant.e.j.ql r10 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x01c8:
            com.google.assistant.e.j.du r10 = com.google.android.libraries.assistant.assistantactions.p636e.C11278h.m26774d(r0, r10)
            r9.mo19943j(r10)
            return
        L_0x01d0:
            int r1 = r10.f133132a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x01e0
            com.google.assistant.e.c.c.dg r10 = r10.f133136e
            if (r10 != 0) goto L_0x01dc
            com.google.assistant.e.c.c.dg r10 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01dc:
            r9.mo19942i(r10, r0)
            return
        L_0x01e0:
            r9.mo19941h(r0)
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.TimeSelectionField.mo19869a(com.google.assistant.e.c.c.ib):void");
    }
}
