package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
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
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33266g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50976bu;
import com.google.assistant.p3897e.p3902c.p3907c.C50978bw;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.DateSelectionField */
/* compiled from: PG */
public final class DateSelectionField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f89059a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.DateSelectionField");

    /* renamed from: b */
    public SpinnerComponent f89060b = null;

    /* renamed from: c */
    public int f89061c = -1;

    /* renamed from: d */
    public C33280am f89062d;

    /* renamed from: e */
    public C50976bu f89063e = C50976bu.f132703h;

    /* renamed from: f */
    public boolean f89064f = false;

    /* renamed from: g */
    public C51941eu f89065g;

    /* renamed from: h */
    public C33182g f89066h;

    /* renamed from: i */
    public C32942a f89067i;

    /* renamed from: j */
    public Fragment f89068j;

    /* renamed from: k */
    private TextView f89069k = null;

    /* renamed from: l */
    private C33266g f89070l;

    public DateSelectionField(Context context) {
        super(context);
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38694a(com.google.assistant.p3897e.p3902c.p3907c.C50976bu r9) {
        /*
            r8 = this;
            r8.f89063e = r9
            com.google.assistant.e.j.e.eu r0 = r8.f89065g
            if (r0 == 0) goto L_0x01ae
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r8.f89066h
            if (r1 == 0) goto L_0x01ae
            com.google.android.libraries.search.assistant.fluidactions.a.a r1 = r8.f89067i
            if (r1 != 0) goto L_0x0010
            goto L_0x01ae
        L_0x0010:
            int r1 = r0.f136277e
            r2 = 12
            if (r1 != r2) goto L_0x001b
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.bw r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r0
            goto L_0x001d
        L_0x001b:
            com.google.assistant.e.c.c.bw r0 = com.google.assistant.p3897e.p3902c.p3907c.C50978bw.f132713e
        L_0x001d:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.c.c.bv r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50977bv) r0
            com.google.protobuf.bn r1 = r9.toBuilder()
            com.google.assistant.e.c.c.br r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50973br) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.c.c.bu r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r3
            int r4 = r3.f132705a
            r4 = r4 | 8
            r3.f132705a = r4
            r4 = 1
            r3.f132708d = r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.bu r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.c.c.bw r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r3
            r1.getClass()
            r3.f132718d = r1
            int r5 = r3.f132715a
            r5 = r5 | 2
            r3.f132715a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.c.c.bw r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r3
            com.google.protobuf.cq r5 = com.google.assistant.p3897e.p3902c.p3907c.C50978bw.emptyProtobufList()
            r3.f132717c = r5
            com.google.assistant.e.j.e.eu r3 = r8.f89065g
            int r5 = r3.f136277e
            if (r5 != r2) goto L_0x0069
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.bw r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r3
            goto L_0x006b
        L_0x0069:
            com.google.assistant.e.c.c.bw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50978bw.f132713e
        L_0x006b:
            com.google.protobuf.cq r3 = r3.f132717c
            java.util.Iterator r3 = r3.iterator()
        L_0x0071:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.c.c.bu r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r5
            com.google.protobuf.bn r6 = r5.toBuilder()
            com.google.assistant.e.c.c.br r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50973br) r6
            int r7 = r5.f132705a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x009f
            int r7 = r1.f132705a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x009f
            java.lang.String r5 = r5.f132706b
            java.lang.String r7 = r1.f132706b
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x009f
            com.google.protobuf.bn r5 = r1.toBuilder()
            r6 = r5
            com.google.assistant.e.c.c.br r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50973br) r6
            goto L_0x00af
        L_0x009f:
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.c.c.bu r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r5
            int r7 = r5.f132705a
            r7 = r7 | 8
            r5.f132705a = r7
            r7 = 0
            r5.f132708d = r7
        L_0x00af:
            r0.mo53496a(r6)
            goto L_0x0071
        L_0x00b3:
            com.google.assistant.e.j.e.eu r1 = r8.f89065g
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.bw r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r0
            r0.getClass()
            r3.f136278f = r0
            r3.f136277e = r2
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r8.f89065g = r0
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r8.f89066h
            r1.mo38581f(r0)
            com.google.assistant.e.j.tr r0 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.tp r0 = (com.google.assistant.p3897e.p3921j.C52488tp) r0
            com.google.assistant.e.j.e.eu r1 = r8.f89065g
            java.lang.String r1 = r1.f136279g
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            r1.getClass()
            int r3 = r2.f137797a
            r3 = r3 | r4
            r2.f137797a = r3
            r2.f137800d = r1
            com.google.assistant.e.j.e.eu r1 = r8.f89065g
            java.lang.String r1 = r1.f136280h
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            r1.getClass()
            int r3 = r2.f137797a
            r3 = r3 | 2
            r2.f137797a = r3
            r2.f137801e = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.tr r1 = (com.google.assistant.p3897e.p3921j.C52490tr) r1
            int r2 = r1.f137797a
            r2 = r2 | 4
            r1.f137797a = r2
            r1.f137802f = r4
            com.google.assistant.e.j.ti r1 = com.google.assistant.p3897e.p3921j.C52481ti.f137762c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.th r1 = (com.google.assistant.p3897e.p3921j.C52480th) r1
            com.google.assistant.e.j.qb r2 = r9.f132707c
            if (r2 != 0) goto L_0x012c
            com.google.assistant.e.j.qb r2 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x012c:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.ti r3 = (com.google.assistant.p3897e.p3921j.C52481ti) r3
            r2.getClass()
            r3.f137765b = r2
            int r2 = r3.f137764a
            r2 = r2 | r4
            r3.f137764a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.ti r1 = (com.google.assistant.p3897e.p3921j.C52481ti) r1
            r1.getClass()
            r2.f137799c = r1
            r1 = 6
            r2.f137798b = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            com.google.assistant.e.j.tt r1 = com.google.assistant.p3897e.p3921j.C52492tt.f137803d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.ts r1 = (com.google.assistant.p3897e.p3921j.C52491ts) r1
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = r8.f89066h
            com.google.assistant.e.j.e.ff r2 = r2.mo38576a()
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.tt r3 = (com.google.assistant.p3897e.p3921j.C52492tt) r3
            r2.getClass()
            r3.f137806b = r2
            int r2 = r3.f137805a
            r2 = r2 | r4
            r3.f137805a = r2
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
            com.google.android.libraries.search.assistant.fluidactions.a.a r1 = r8.f89067i
            com.google.assistant.e.c.c.dg r9 = r9.f132709e
            if (r9 != 0) goto L_0x01a8
            com.google.assistant.e.c.c.dg r9 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01a8:
            java.lang.String r2 = "FA DateSelection"
            r1.mo38364a(r2, r0, r9)
            return
        L_0x01ae:
            com.google.common.f.e r9 = f89059a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r0 = "Failed to handle item click due to invalid args"
            r1 = 51046(0xc766, float:7.153E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.DateSelectionField.mo38694a(com.google.assistant.e.c.c.bu):void");
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
        C50978bw bwVar;
        C51941eu euVar = this.f89065g;
        if (euVar == null || this.f89066h == null || this.f89062d == null || this.f89060b == null || this.f89069k == null) {
            ((C59052c) ((C59052c) f89059a.mo56226d()).mo56372aa(51048)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89065g = euVar2;
            this.f89066h.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89065g;
        if (euVar3.f136277e == 12) {
            bwVar = (C50978bw) euVar3.f136278f;
        } else {
            bwVar = C50978bw.f132713e;
        }
        this.f89069k.setText(bwVar.f132716b);
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
        this.f89061c = i;
        if (i != -1) {
            this.f89062d.clear();
            this.f89062d.addAll(arrayList);
            this.f89060b.setAdapter((SpinnerAdapter) this.f89062d);
            this.f89060b.setVisibility(0);
            this.f89060b.setSelection(this.f89061c, false);
            C50976bu buVar2 = (C50976bu) arrayList.get(this.f89061c);
            this.f89063e = buVar2;
            if ((buVar2.f132705a & 4) != 0) {
                this.f89069k.setVisibility(4);
            } else {
                this.f89069k.setVisibility(0);
            }
        }
        mo38695h();
    }

    /* renamed from: f */
    public final void mo38565f() {
        SpinnerComponent spinnerComponent = this.f89060b;
        if (spinnerComponent != null) {
            spinnerComponent.requestFocus();
            this.f89060b.requestFocusFromTouch();
        }
    }

    /* renamed from: g */
    public final void mo38566g() {
        SpinnerComponent spinnerComponent = this.f89060b;
        if (spinnerComponent != null) {
            spinnerComponent.clearFocus();
        }
    }

    /* renamed from: h */
    public final void mo38695h() {
        int i;
        C51941eu euVar = this.f89065g;
        if (euVar == null || this.f89069k == null || this.f89060b == null) {
            ((C59052c) ((C59052c) f89059a.mo56226d()).mo56372aa(51049)).mo56386p("Failed to update UI color due to invalid args");
            return;
        }
        boolean z = (euVar.f136273a & 64) != 0 && euVar.f136282j;
        if (z) {
            i = C19391a.m36980a(getContext(), R.attr.colorError);
        } else if (this.f89064f) {
            i = C19391a.m36980a(getContext(), R.attr.colorPrimary);
        } else {
            i = C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant);
        }
        this.f89069k.setTextColor(i);
        if (this.f89060b.getChildAt(0) != null) {
            SpinnerComponent spinnerComponent = this.f89060b;
            spinnerComponent.mo38668c(spinnerComponent.getChildAt(0), z, this.f89064f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.fa_date_selection_field_title);
        textView.getClass();
        this.f89069k = textView;
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.fa_date_selection_field_date_list);
        spinnerComponent.getClass();
        this.f89060b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f89062d = new C33280am(this, getContext());
        C33277aj ajVar = new C33277aj(this);
        this.f89070l = ajVar;
        SpinnerComponent spinnerComponent2 = this.f89060b;
        spinnerComponent2.f88973e = ajVar;
        spinnerComponent2.setOnFocusChangeListener(new C33278ak(this));
        this.f89060b.setOnTouchListener(new C33279al(this));
    }

    public DateSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DateSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
