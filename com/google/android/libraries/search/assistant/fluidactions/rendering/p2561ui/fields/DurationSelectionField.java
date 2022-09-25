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
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33247f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33248g;
import com.google.assistant.p3897e.p3902c.p3907c.C50990ch;
import com.google.assistant.p3897e.p3902c.p3907c.C50991ci;
import com.google.assistant.p3897e.p3902c.p3907c.C50993ck;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.DurationSelectionField */
/* compiled from: PG */
public final class DurationSelectionField extends LinearLayout implements C33177b, C33247f {

    /* renamed from: a */
    public static final C59071e f89076a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.DurationSelectionField");

    /* renamed from: l */
    private static final String f89077l = C33248g.f88900a;

    /* renamed from: b */
    public SpinnerComponent f89078b = null;

    /* renamed from: c */
    public int f89079c = -1;

    /* renamed from: d */
    public C33295ba f89080d;

    /* renamed from: e */
    public C50991ci f89081e = C50991ci.f132741h;

    /* renamed from: f */
    public boolean f89082f = false;

    /* renamed from: g */
    public C51941eu f89083g;

    /* renamed from: h */
    public C33184i f89084h;

    /* renamed from: i */
    public C33182g f89085i;

    /* renamed from: j */
    public C32942a f89086j;

    /* renamed from: k */
    public Fragment f89087k;

    /* renamed from: m */
    private TextView f89088m = null;

    public DurationSelectionField(Context context) {
        super(context);
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38702a(com.google.assistant.p3897e.p3902c.p3907c.C50991ci r9) {
        /*
            r8 = this;
            r8.f89081e = r9
            com.google.assistant.e.j.e.eu r0 = r8.f89083g
            if (r0 == 0) goto L_0x01f3
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r8.f89085i
            if (r1 == 0) goto L_0x01f3
            com.google.android.libraries.search.assistant.fluidactions.a.a r1 = r8.f89086j
            if (r1 != 0) goto L_0x0010
            goto L_0x01f3
        L_0x0010:
            int r1 = r0.f136277e
            r2 = 21
            if (r1 != r2) goto L_0x001b
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.ck r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r0
            goto L_0x001d
        L_0x001b:
            com.google.assistant.e.c.c.ck r0 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.f132751e
        L_0x001d:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.c.c.cj r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50992cj) r0
            com.google.protobuf.bn r1 = r9.toBuilder()
            com.google.assistant.e.c.c.cf r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50988cf) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.c.c.ci r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50991ci) r3
            int r4 = r3.f132743a
            r4 = r4 | 2
            r3.f132743a = r4
            r4 = 1
            r3.f132745c = r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.ci r1 = (com.google.assistant.p3897e.p3902c.p3907c.C50991ci) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.c.c.ck r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r3
            r1.getClass()
            r3.f132756d = r1
            int r5 = r3.f132753a
            r5 = r5 | 2
            r3.f132753a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.c.c.ck r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r3
            com.google.protobuf.cq r5 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.emptyProtobufList()
            r3.f132755c = r5
            com.google.assistant.e.j.e.eu r3 = r8.f89083g
            int r5 = r3.f136277e
            if (r5 != r2) goto L_0x0069
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.ck r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r3
            goto L_0x006b
        L_0x0069:
            com.google.assistant.e.c.c.ck r3 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.f132751e
        L_0x006b:
            com.google.protobuf.cq r3 = r3.f132755c
            java.util.Iterator r3 = r3.iterator()
        L_0x0071:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.c.c.ci r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50991ci) r5
            com.google.protobuf.bn r6 = r5.toBuilder()
            com.google.assistant.e.c.c.cf r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50988cf) r6
            int r7 = r5.f132743a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x009f
            int r7 = r1.f132743a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x009f
            java.lang.String r5 = r5.f132744b
            java.lang.String r7 = r1.f132744b
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x009f
            com.google.protobuf.bn r5 = r1.toBuilder()
            r6 = r5
            com.google.assistant.e.c.c.cf r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50988cf) r6
            goto L_0x00af
        L_0x009f:
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.c.c.ci r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50991ci) r5
            int r7 = r5.f132743a
            r7 = r7 | 2
            r5.f132743a = r7
            r7 = 0
            r5.f132745c = r7
        L_0x00af:
            r0.mo53498a(r6)
            goto L_0x0071
        L_0x00b3:
            com.google.assistant.e.j.e.eu r1 = r8.f89083g
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.ck r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r0
            r0.getClass()
            r3.f136278f = r0
            r3.f136277e = r2
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r8.f89083g = r0
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r8.f89085i
            r1.mo38581f(r0)
            com.google.assistant.e.j.tr r0 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.tp r0 = (com.google.assistant.p3897e.p3921j.C52488tp) r0
            com.google.assistant.e.j.e.eu r1 = r8.f89083g
            java.lang.String r1 = r1.f136279g
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            r1.getClass()
            int r3 = r2.f137797a
            r3 = r3 | r4
            r2.f137797a = r3
            r2.f137800d = r1
            com.google.assistant.e.j.e.eu r1 = r8.f89083g
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
            com.google.assistant.e.j.tm r1 = com.google.assistant.p3897e.p3921j.C52485tm.f137770c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.tl r1 = (com.google.assistant.p3897e.p3921j.C52484tl) r1
            com.google.assistant.e.j.so r2 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.sn r2 = (com.google.assistant.p3897e.p3921j.C52459sn) r2
            com.google.assistant.e.j.so r3 = r9.f132749g
            if (r3 != 0) goto L_0x0134
            com.google.assistant.e.j.so r3 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
        L_0x0134:
            long r5 = r3.f137717b
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.so r3 = (com.google.assistant.p3897e.p3921j.C52460so) r3
            int r7 = r3.f137716a
            r7 = r7 | r4
            r3.f137716a = r7
            r3.f137717b = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.tm r3 = (com.google.assistant.p3897e.p3921j.C52485tm) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.so r2 = (com.google.assistant.p3897e.p3921j.C52460so) r2
            r2.getClass()
            r3.f137773b = r2
            int r2 = r3.f137772a
            r2 = r2 | r4
            r3.f137772a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.tm r1 = (com.google.assistant.p3897e.p3921j.C52485tm) r1
            r1.getClass()
            r2.f137799c = r1
            r1 = 12
            r2.f137798b = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            com.google.assistant.e.j.tt r1 = com.google.assistant.p3897e.p3921j.C52492tt.f137803d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.ts r1 = (com.google.assistant.p3897e.p3921j.C52491ts) r1
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = r8.f89085i
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
            com.google.assistant.e.j.e.eu r1 = r8.f89083g
            int r2 = r1.f136275c
            if (r2 != r4) goto L_0x01ca
            java.lang.Object r1 = r1.f136276d
            com.google.assistant.e.c.c.dg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r1
            goto L_0x01cc
        L_0x01ca:
            com.google.assistant.e.c.c.dg r1 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01cc:
            int r1 = r1.f132829a
            r1 = r1 & 8
            java.lang.String r2 = "FA Duration ClientInput"
            if (r1 == 0) goto L_0x01e7
            com.google.android.libraries.search.assistant.fluidactions.a.a r9 = r8.f89086j
            com.google.assistant.e.j.e.eu r1 = r8.f89083g
            int r3 = r1.f136275c
            if (r3 != r4) goto L_0x01e1
            java.lang.Object r1 = r1.f136276d
            com.google.assistant.e.c.c.dg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r1
            goto L_0x01e3
        L_0x01e1:
            com.google.assistant.e.c.c.dg r1 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01e3:
            r9.mo38364a(r2, r0, r1)
            return
        L_0x01e7:
            com.google.android.libraries.search.assistant.fluidactions.a.a r1 = r8.f89086j
            com.google.assistant.e.c.c.dg r9 = r9.f132746d
            if (r9 != 0) goto L_0x01ef
            com.google.assistant.e.c.c.dg r9 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01ef:
            r1.mo38364a(r2, r0, r9)
            return
        L_0x01f3:
            com.google.common.f.e r9 = f89076a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r0 = "Failed to handle item click due to invalid args"
            r1 = 51066(0xc77a, float:7.1559E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.DurationSelectionField.mo38702a(com.google.assistant.e.c.c.ci):void");
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
        C50993ck ckVar;
        int a;
        C51941eu euVar = this.f89083g;
        if (euVar == null || this.f89085i == null || this.f89084h == null || this.f89080d == null || this.f89078b == null || this.f89088m == null) {
            ((C59052c) ((C59052c) f89076a.mo56226d()).mo56372aa(51069)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89083g = euVar2;
            this.f89085i.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89083g;
        if (euVar3.f136277e == 21) {
            ckVar = (C50993ck) euVar3.f136278f;
        } else {
            ckVar = C50993ck.f132751e;
        }
        this.f89088m.setText(ckVar.f132754b);
        ArrayList arrayList = new ArrayList(ckVar.f132755c);
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C50991ci ciVar = (C50991ci) it.next();
            if ((ciVar.f132743a & 2) != 0 && ciVar.f132745c) {
                break;
            }
            i++;
        }
        this.f89079c = i;
        if (i != -1) {
            this.f89080d.clear();
            this.f89080d.addAll(arrayList);
            this.f89078b.setAdapter((SpinnerAdapter) this.f89080d);
            this.f89078b.setVisibility(0);
            this.f89078b.setSelection(this.f89079c, false);
            C50991ci ciVar2 = (C50991ci) arrayList.get(this.f89079c);
            this.f89081e = ciVar2;
            if ((ciVar2.f132743a & 32) != 0) {
                this.f89088m.setVisibility(0);
            } else {
                this.f89088m.setVisibility(4);
            }
        }
        if (arrayList.size() == 1 && (a = C50990ch.m86003a(((C50991ci) arrayList.get(0)).f132747e)) != 0 && a == 2) {
            this.f89078b.setClickable(false);
            this.f89078b.setOnTouchListener(new C33293az(this));
        }
        mo38704i();
        if (this.f89084h.f88753c) {
            this.f89088m.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo38565f() {
        SpinnerComponent spinnerComponent = this.f89078b;
        if (spinnerComponent != null && spinnerComponent.requestFocus()) {
            this.f89078b.requestFocusFromTouch();
        }
    }

    /* renamed from: g */
    public final void mo38566g() {
        SpinnerComponent spinnerComponent = this.f89078b;
        if (spinnerComponent != null) {
            spinnerComponent.clearFocus();
        }
    }

    /* renamed from: h */
    public final void mo38703h() {
        C33295ba baVar;
        if (this.f89087k == null || (baVar = this.f89080d) == null) {
            ((C59052c) ((C59052c) f89076a.mo56226d()).mo56372aa(51067)).mo56386p("Failed to show DurationPickerDialog due to invalid args");
            return;
        }
        C50991ci ciVar = (C50991ci) baVar.getItem(this.f89079c);
        if (ciVar == null || (ciVar.f132743a & 32) == 0) {
            C33248g.m61667a(getContext(), this, 0, 1, 0).showNow(this.f89087k.getChildFragmentManager(), f89077l);
            return;
        }
        C52460so soVar = ciVar.f132749g;
        if (soVar == null) {
            soVar = C52460so.f137714d;
        }
        long j = soVar.f137717b;
        if (j >= 86400 || j < 0) {
            ((C59052c) ((C59052c) f89076a.mo56226d()).mo56372aa(51068)).mo56388r("Invalid initial duration value %d", j);
            j = 0;
        }
        int i = (int) j;
        int i2 = i / 3600;
        C33248g.m61667a(getContext(), this, i2, C33296bb.m61910a(i), (i - (i2 * 3600)) - (C33296bb.m61910a(i) * 60)).showNow(this.f89087k.getChildFragmentManager(), f89077l);
    }

    /* renamed from: i */
    public final void mo38704i() {
        int i;
        C51941eu euVar = this.f89083g;
        if (euVar == null || this.f89088m == null || this.f89078b == null) {
            ((C59052c) ((C59052c) f89076a.mo56226d()).mo56372aa(51070)).mo56386p("Failed to update UI color due to invalid args");
            return;
        }
        boolean z = (euVar.f136273a & 64) != 0 && euVar.f136282j;
        if (z) {
            i = C19391a.m36980a(getContext(), R.attr.colorError);
        } else if (this.f89082f) {
            i = C19391a.m36980a(getContext(), R.attr.colorPrimary);
        } else {
            i = C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant);
        }
        this.f89088m.setTextColor(i);
        if (this.f89078b.getChildAt(0) != null) {
            SpinnerComponent spinnerComponent = this.f89078b;
            spinnerComponent.mo38668c(spinnerComponent.getChildAt(0), z, this.f89082f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.fa_duration_selection_field_title);
        textView.getClass();
        this.f89088m = textView;
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.fa_duration_selection_field_duration_list);
        spinnerComponent.getClass();
        this.f89078b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f89080d = new C33295ba(this, getContext());
        C33290aw awVar = new C33290aw(this);
        SpinnerComponent spinnerComponent2 = this.f89078b;
        spinnerComponent2.f88973e = awVar;
        spinnerComponent2.setOnFocusChangeListener(new C33291ax(this));
        this.f89078b.setOnTouchListener(new C33292ay(this));
    }

    public DurationSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DurationSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
