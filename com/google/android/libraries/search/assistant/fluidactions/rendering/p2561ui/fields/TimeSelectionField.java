package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33266g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.android.material.timepicker.C44988l;
import com.google.android.material.timepicker.C44989m;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3902c.p3907c.C51145ia;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;
import com.google.assistant.p3897e.p3902c.p3907c.C51148id;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.TimeSelectionField */
/* compiled from: PG */
public final class TimeSelectionField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f89190a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.TimeSelectionField");

    /* renamed from: b */
    public SpinnerComponent f89191b = null;

    /* renamed from: c */
    public C33368dt f89192c;

    /* renamed from: d */
    public int f89193d = -1;

    /* renamed from: e */
    public C51146ib f89194e = C51146ib.f133130h;

    /* renamed from: f */
    boolean f89195f = false;

    /* renamed from: g */
    public C51941eu f89196g;

    /* renamed from: h */
    public C33184i f89197h;

    /* renamed from: i */
    public C33182g f89198i;

    /* renamed from: j */
    public C32942a f89199j;

    /* renamed from: k */
    public Fragment f89200k;

    /* renamed from: l */
    private TextView f89201l = null;

    /* renamed from: m */
    private LinearLayout f89202m = null;

    /* renamed from: n */
    private TextView f89203n = null;

    /* renamed from: o */
    private TextView f89204o = null;

    /* renamed from: p */
    private ImageComponent f89205p = null;

    /* renamed from: q */
    private C33266g f89206q;

    public TimeSelectionField(Context context) {
        super(context);
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38727a(com.google.assistant.p3897e.p3902c.p3907c.C51146ib r9) {
        /*
            r8 = this;
            r8.f89194e = r9
            com.google.assistant.e.j.e.eu r0 = r8.f89196g
            if (r0 == 0) goto L_0x01e4
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r0 = r8.f89198i
            if (r0 == 0) goto L_0x01e4
            com.google.android.libraries.search.assistant.fluidactions.a.a r0 = r8.f89199j
            if (r0 != 0) goto L_0x0010
            goto L_0x01e4
        L_0x0010:
            com.google.protobuf.bn r0 = r9.toBuilder()
            com.google.assistant.e.c.c.hy r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51142hy) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.c.c.ib r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r1
            int r2 = r1.f133132a
            r2 = r2 | 4
            r1.f133132a = r2
            r2 = 1
            r1.f133135d = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.ib r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r0
            com.google.assistant.e.j.e.eu r1 = r8.f89196g
            int r3 = r1.f136277e
            r4 = 9
            if (r3 != r4) goto L_0x0039
            java.lang.Object r1 = r1.f136278f
            com.google.assistant.e.c.c.id r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r1
            goto L_0x003b
        L_0x0039:
            com.google.assistant.e.c.c.id r1 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x003b:
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.c.c.ic r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51147ic) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.c.c.id r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r3
            r0.getClass()
            r3.f133144c = r0
            int r5 = r3.f133142a
            r5 = r5 | 2
            r3.f133142a = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.c.c.id r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r3
            com.google.protobuf.cq r5 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.emptyProtobufList()
            r3.f133146e = r5
            com.google.assistant.e.j.e.eu r3 = r8.f89196g
            int r5 = r3.f136277e
            if (r5 != r4) goto L_0x006b
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.id r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r3
            goto L_0x006d
        L_0x006b:
            com.google.assistant.e.c.c.id r3 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x006d:
            com.google.protobuf.cq r3 = r3.f133146e
            java.util.Iterator r3 = r3.iterator()
        L_0x0073:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b5
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.c.c.ib r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r5
            com.google.protobuf.bn r6 = r5.toBuilder()
            com.google.assistant.e.c.c.hy r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51142hy) r6
            int r7 = r5.f133132a
            r7 = r7 & r2
            if (r7 == 0) goto L_0x00a1
            int r7 = r0.f133132a
            r7 = r7 & r2
            if (r7 == 0) goto L_0x00a1
            java.lang.String r5 = r5.f133133b
            java.lang.String r7 = r0.f133133b
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00a1
            com.google.protobuf.bn r5 = r0.toBuilder()
            r6 = r5
            com.google.assistant.e.c.c.hy r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51142hy) r6
            goto L_0x00b1
        L_0x00a1:
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.c.c.ib r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r5
            int r7 = r5.f133132a
            r7 = r7 | 4
            r5.f133132a = r7
            r7 = 0
            r5.f133135d = r7
        L_0x00b1:
            r1.mo53523a(r6)
            goto L_0x0073
        L_0x00b5:
            com.google.assistant.e.j.e.eu r0 = r8.f89196g
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.id r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r1
            r1.getClass()
            r3.f136278f = r1
            r3.f136277e = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r8.f89196g = r0
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r8.f89198i
            r1.mo38581f(r0)
            com.google.assistant.e.j.tr r0 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.tp r0 = (com.google.assistant.p3897e.p3921j.C52488tp) r0
            com.google.assistant.e.j.e.eu r1 = r8.f89196g
            java.lang.String r1 = r1.f136279g
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            r1.getClass()
            int r4 = r3.f137797a
            r4 = r4 | r2
            r3.f137797a = r4
            r3.f137800d = r1
            com.google.assistant.e.j.e.eu r1 = r8.f89196g
            java.lang.String r1 = r1.f136280h
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            r1.getClass()
            int r4 = r3.f137797a
            r4 = r4 | 2
            r3.f137797a = r4
            r3.f137801e = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.tr r1 = (com.google.assistant.p3897e.p3921j.C52490tr) r1
            int r3 = r1.f137797a
            r3 = r3 | 4
            r1.f137797a = r3
            r1.f137802f = r2
            com.google.assistant.e.j.uj r1 = com.google.assistant.p3897e.p3921j.C52509uj.f137841c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.ui r1 = (com.google.assistant.p3897e.p3921j.C52508ui) r1
            com.google.assistant.e.j.ql r3 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.qk r3 = (com.google.assistant.p3897e.p3921j.C52402qk) r3
            com.google.assistant.e.j.ql r4 = r9.f133134c
            if (r4 != 0) goto L_0x0136
            com.google.assistant.e.j.ql r4 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x0136:
            int r4 = r4.f137515b
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.j.ql r5 = (com.google.assistant.p3897e.p3921j.C52403ql) r5
            int r6 = r5.f137514a
            r6 = r6 | r2
            r5.f137514a = r6
            r5.f137515b = r4
            com.google.assistant.e.j.ql r4 = r9.f133134c
            if (r4 != 0) goto L_0x014c
            com.google.assistant.e.j.ql r4 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x014c:
            int r4 = r4.f137516c
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.j.ql r5 = (com.google.assistant.p3897e.p3921j.C52403ql) r5
            int r6 = r5.f137514a
            r6 = r6 | 2
            r5.f137514a = r6
            r5.f137516c = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.e.j.uj r4 = (com.google.assistant.p3897e.p3921j.C52509uj) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.ql r3 = (com.google.assistant.p3897e.p3921j.C52403ql) r3
            r3.getClass()
            r4.f137844b = r3
            int r3 = r4.f137843a
            r3 = r3 | r2
            r4.f137843a = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.uj r1 = (com.google.assistant.p3897e.p3921j.C52509uj) r1
            r1.getClass()
            r3.f137799c = r1
            r1 = 5
            r3.f137798b = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            com.google.assistant.e.j.tt r1 = com.google.assistant.p3897e.p3921j.C52492tt.f137803d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.ts r1 = (com.google.assistant.p3897e.p3921j.C52491ts) r1
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r3 = r8.f89198i
            com.google.assistant.e.j.e.ff r3 = r3.mo38576a()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.e.j.tt r4 = (com.google.assistant.p3897e.p3921j.C52492tt) r4
            r3.getClass()
            r4.f137806b = r3
            int r3 = r4.f137805a
            r2 = r2 | r3
            r4.f137805a = r2
            com.google.assistant.e.j.uh r2 = com.google.assistant.p3897e.p3921j.C52507uh.f137838b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.ug r2 = (com.google.assistant.p3897e.p3921j.C52506ug) r2
            r2.mo53877a(r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.j.tt r0 = (com.google.assistant.p3897e.p3921j.C52492tt) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.uh r2 = (com.google.assistant.p3897e.p3921j.C52507uh) r2
            r2.getClass()
            r0.f137807c = r2
            int r2 = r0.f137805a
            r2 = r2 | 2
            r0.f137805a = r2
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.j.tt r0 = (com.google.assistant.p3897e.p3921j.C52492tt) r0
            com.google.android.libraries.search.assistant.fluidactions.a.a r1 = r8.f89199j
            com.google.assistant.e.c.c.dg r9 = r9.f133136e
            if (r9 != 0) goto L_0x01df
            com.google.assistant.e.c.c.dg r9 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01df:
            java.lang.String r2 = "FA Time"
            r1.mo38364a(r2, r0, r9)
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.TimeSelectionField.mo38727a(com.google.assistant.e.c.c.ib):void");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C51148id idVar;
        int a;
        C51941eu euVar = this.f89196g;
        if (euVar == null || this.f89198i == null || this.f89197h == null || this.f89192c == null || this.f89201l == null || this.f89191b == null || this.f89203n == null || this.f89202m == null || this.f89204o == null || this.f89205p == null) {
            ((C59052c) ((C59052c) f89190a.mo56226d()).mo56372aa(51153)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89196g = euVar2;
            this.f89198i.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89196g;
        if (euVar3.f136277e == 9) {
            idVar = (C51148id) euVar3.f136278f;
        } else {
            idVar = C51148id.f133140f;
        }
        this.f89201l.setText(idVar.f133143b);
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
        this.f89193d = i;
        if (i != -1) {
            this.f89192c.clear();
            this.f89192c.addAll(arrayList);
            this.f89191b.setAdapter((SpinnerAdapter) this.f89192c);
            this.f89191b.setVisibility(0);
            this.f89191b.setSelection(this.f89193d, false);
            C51146ib ibVar2 = (C51146ib) arrayList.get(this.f89193d);
            this.f89194e = ibVar2;
            if ((ibVar2.f133132a & 2) != 0) {
                this.f89201l.setVisibility(0);
            } else {
                this.f89201l.setVisibility(4);
            }
        }
        if (arrayList.size() == 1 && (a = C51145ia.m86043a(((C51146ib) C58557jl.m90133n(arrayList)).f133138g)) != 0 && a == 2) {
            this.f89191b.setClickable(false);
            this.f89191b.setOnTouchListener(new C33367ds(this, arrayList));
        }
        C51141hx hxVar = idVar.f133145d;
        if (hxVar == null) {
            hxVar = C51141hx.f133119h;
        }
        if ((hxVar.f133121a & 16) != 0) {
            C51141hx hxVar2 = idVar.f133145d;
            if (((hxVar2 == null ? C51141hx.f133119h : hxVar2).f133121a & 4) != 0) {
                TextView textView = this.f89204o;
                if (hxVar2 == null) {
                    hxVar2 = C51141hx.f133119h;
                }
                textView.setText(hxVar2.f133124d);
                ImageComponent imageComponent = this.f89205p;
                C51141hx hxVar3 = idVar.f133145d;
                if (hxVar3 == null) {
                    hxVar3 = C51141hx.f133119h;
                }
                C51012dc dcVar = hxVar3.f133126f;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                imageComponent.mo38649b(dcVar, (Drawable) null);
                this.f89202m.setVisibility(0);
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
                    this.f89203n.setText(DateFormat.getTimeInstance(3).format(instance.getTime()));
                }
            }
        }
        mo38729i();
        if (this.f89197h.f88751a == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
            this.f89201l.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo38565f() {
        SpinnerComponent spinnerComponent = this.f89191b;
        if (spinnerComponent != null && spinnerComponent.requestFocus()) {
            this.f89191b.requestFocusFromTouch();
        }
    }

    /* renamed from: g */
    public final void mo38566g() {
        SpinnerComponent spinnerComponent = this.f89191b;
        if (spinnerComponent != null) {
            spinnerComponent.clearFocus();
        }
    }

    /* renamed from: h */
    public final void mo38728h(C51146ib ibVar) {
        int i;
        if (this.f89200k == null) {
            ((C59052c) ((C59052c) f89190a.mo56226d()).mo56372aa(51152)).mo56386p("fragment is null.");
            return;
        }
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
        lVar.mo48653b(android.text.format.DateFormat.is24HourFormat(getContext()) ? 1 : 0);
        C44989m b = C44989m.m79968b(lVar);
        b.mo48656d(new C33363do(this, b));
        b.showNow(this.f89200k.getChildFragmentManager(), "MaterialTimePickerFragment");
    }

    /* renamed from: i */
    public final void mo38729i() {
        int i;
        C51941eu euVar = this.f89196g;
        if (euVar != null && this.f89201l != null && this.f89191b != null) {
            boolean z = (euVar.f136273a & 64) != 0 && euVar.f136282j;
            if (z) {
                i = C19391a.m36980a(getContext(), R.attr.colorError);
            } else if (this.f89195f) {
                i = C19391a.m36980a(getContext(), R.attr.colorPrimary);
            } else {
                i = C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant);
            }
            this.f89201l.setTextColor(i);
            SpinnerComponent spinnerComponent = this.f89191b;
            spinnerComponent.mo38668c(spinnerComponent.getChildAt(0), z, this.f89195f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89201l = (TextView) findViewById(R.id.fa_time_selection_field_title);
        this.f89202m = (LinearLayout) findViewById(R.id.fa_time_selection_field_text_label);
        this.f89203n = (TextView) findViewById(R.id.fa_time_selection_field_primary_text);
        this.f89204o = (TextView) findViewById(R.id.fa_time_selection_field_secondary_text);
        this.f89205p = (ImageComponent) findViewById(R.id.fa_time_selection_field_icon);
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.fa_time_selection_field_spinner);
        spinnerComponent.getClass();
        this.f89191b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f89192c = new C33368dt(this, getContext());
        C33364dp dpVar = new C33364dp(this);
        this.f89206q = dpVar;
        SpinnerComponent spinnerComponent2 = this.f89191b;
        spinnerComponent2.f88973e = dpVar;
        spinnerComponent2.setOnFocusChangeListener(new C33365dq(this));
        this.f89191b.setOnTouchListener(new C33366dr(this));
    }

    public TimeSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimeSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
