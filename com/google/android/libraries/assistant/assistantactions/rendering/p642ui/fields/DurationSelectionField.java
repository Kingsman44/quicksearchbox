package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.res.Resources;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.util.AttributeSet;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.SpinnerComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11319g;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11320h;
import com.google.assistant.p3897e.p3902c.p3907c.C50988cf;
import com.google.assistant.p3897e.p3902c.p3907c.C50990ch;
import com.google.assistant.p3897e.p3902c.p3907c.C50991ci;
import com.google.assistant.p3897e.p3902c.p3907c.C50993ck;
import com.google.assistant.p3897e.p3921j.C52459sn;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DurationSelectionField */
/* compiled from: PG */
public class DurationSelectionField extends C11407n implements C11319g {

    /* renamed from: a */
    public static final C59071e f36977a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DurationSelectionField");

    /* renamed from: b */
    public SpinnerComponent f36978b;

    /* renamed from: c */
    public int f36979c = -1;

    /* renamed from: d */
    public C11359as f36980d;

    /* renamed from: e */
    public C50991ci f36981e = C50991ci.f132741h;

    /* renamed from: f */
    private TextView f36982f;

    public DurationSelectionField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo19756a(int i, int i2, int i3) {
        String str;
        if (this.f37153l != null && this.f37154m != null && this.f36979c >= 0 && this.f36980d != null) {
            C52459sn snVar = (C52459sn) C52460so.f137714d.createBuilder();
            snVar.copyOnWrite();
            C52460so soVar = (C52460so) snVar.instance;
            soVar.f137716a |= 1;
            soVar.f137717b = (long) ((i * 3600) + (i2 * 60) + i3);
            C52460so soVar2 = (C52460so) snVar.build();
            Resources resources = getContext().getResources();
            long j = soVar2.f137717b;
            C58838bb.m90868c(j >= 0);
            long hours = TimeUnit.SECONDS.toHours(j);
            long minutes = TimeUnit.SECONDS.toMinutes(j) % 60;
            long j2 = j % 60;
            if (hours > 0) {
                str = resources.getString(R.string.fluid_action_duration_hours_minutes_seconds, new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(j2)});
            } else if (minutes > 0) {
                str = resources.getString(R.string.fluid_action_duration_minutes_seconds, new Object[]{Long.valueOf(minutes), Long.valueOf(j2)});
            } else {
                str = resources.getString(R.string.fluid_action_duration_seconds, new Object[]{Long.valueOf(j2)});
            }
            C50991ci ciVar = (C50991ci) this.f36980d.getItem(this.f36979c);
            if (ciVar != null) {
                C50988cf cfVar = (C50988cf) ciVar.toBuilder();
                cfVar.copyOnWrite();
                C50991ci ciVar2 = (C50991ci) cfVar.instance;
                str.getClass();
                ciVar2.f132743a |= 16;
                ciVar2.f132748f = str;
                cfVar.copyOnWrite();
                C50991ci ciVar3 = (C50991ci) cfVar.instance;
                soVar2.getClass();
                ciVar3.f132749g = soVar2;
                ciVar3.f132743a |= 32;
                C50991ci ciVar4 = (C50991ci) cfVar.build();
                this.f36980d.insert(ciVar4, this.f36979c);
                C11359as asVar = this.f36980d;
                asVar.remove((C50991ci) asVar.getItem(this.f36979c + 1));
                this.f36980d.notifyDataSetChanged();
                mo19845c(ciVar4);
            }
        }
    }

    /* renamed from: b */
    public final void mo19809b() {
        C50993ck ckVar;
        int a;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null && this.f37152k != null && this.f36980d != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 21) {
                ckVar = (C50993ck) euVar.f136278f;
            } else {
                ckVar = C50993ck.f132751e;
            }
            this.f36982f.setText(ckVar.f132754b);
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
            this.f36979c = i;
            if (i != -1) {
                this.f36980d.clear();
                this.f36980d.addAll(arrayList);
                this.f36978b.setAdapter((SpinnerAdapter) this.f36980d);
                this.f36978b.setVisibility(0);
                this.f36978b.setSelection(this.f36979c, false);
                C50991ci ciVar2 = (C50991ci) arrayList.get(this.f36979c);
                this.f36981e = ciVar2;
                if ((ciVar2.f132743a & 32) != 0) {
                    this.f36982f.setVisibility(0);
                } else {
                    this.f36982f.setVisibility(4);
                }
            }
            if (arrayList.size() == 1 && (a = C50990ch.m86003a(((C50991ci) arrayList.get(0)).f132747e)) != 0 && a == 2) {
                this.f36978b.setClickable(false);
                this.f36978b.setOnTouchListener(new C11355ao(this));
            }
            mo19847e();
            if (this.f37160s == 2) {
                this.f36982f.setVisibility(8);
            }
        }
    }

    /* renamed from: d */
    public final void mo19846d() {
        C0167am amVar = this.f37156o;
        if (amVar != null) {
            FragmentManager jw = amVar.mo545jw();
            C50991ci ciVar = (C50991ci) this.f36980d.getItem(this.f36979c);
            if (ciVar == null || (ciVar.f132743a & 32) == 0) {
                C11320h.m26934a(this.f37159r, this, 0, 1, 0).show(jw, "DurationSelectionField");
                return;
            }
            C52460so soVar = ciVar.f132749g;
            if (soVar == null) {
                soVar = C52460so.f137714d;
            }
            long j = soVar.f137717b;
            if (j < 86400 && j >= 0) {
                int i = (int) j;
                int i2 = i / 3600;
                C11320h.m26934a(this.f37159r, this, i2, C11360at.m27089a(i), (i - (i2 * 3600)) - (C11360at.m27089a(i) * 60)).show(jw, "DurationSelectionField");
            }
        }
    }

    /* renamed from: o */
    public final void mo19841o() {
        if (this.f36978b.requestFocus()) {
            this.f36978b.requestFocusFromTouch();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36982f = (TextView) findViewById(R.id.duration_selection_field_title);
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.duration_list);
        this.f36978b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f36980d = new C11359as(this, getContext());
        C11356ap apVar = new C11356ap(this);
        SpinnerComponent spinnerComponent2 = this.f36978b;
        spinnerComponent2.f36871e = apVar;
        spinnerComponent2.setOnFocusChangeListener(new C11357aq(this));
        this.f36978b.setOnTouchListener(new C11358ar(this));
    }

    /* renamed from: p */
    public final void mo19843p() {
        this.f36978b.clearFocus();
    }

    public DurationSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DurationSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: e */
    public final void mo19847e() {
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
            this.f36982f.setTextColor(i);
        }
        if (this.f36978b.getChildAt(0) != null && this.f37153l != null) {
            SpinnerComponent spinnerComponent = this.f36978b;
            spinnerComponent.mo19803c((TextView) spinnerComponent.getChildAt(0), this.f37153l.mo19717a(), this.f37151j);
        }
    }

    /* JADX WARNING: type inference failed for: r6v15, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19845c(com.google.assistant.p3897e.p3902c.p3907c.C50991ci r10) {
        /*
            r9 = this;
            r9.f36981e = r10
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            r1 = 1
            if (r0 != 0) goto L_0x0009
            goto L_0x00cf
        L_0x0009:
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            com.google.protobuf.bn r2 = r10.toBuilder()
            com.google.assistant.e.c.c.cf r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50988cf) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.ci r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50991ci) r3
            int r4 = r3.f132743a
            r4 = r4 | 2
            r3.f132743a = r4
            r3.f132745c = r1
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.ci r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50991ci) r2
            int r3 = r0.f136277e
            r4 = 21
            if (r3 != r4) goto L_0x0031
            java.lang.Object r3 = r0.f136278f
            com.google.assistant.e.c.c.ck r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r3
            goto L_0x0033
        L_0x0031:
            com.google.assistant.e.c.c.ck r3 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.f132751e
        L_0x0033:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.c.c.cj r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50992cj) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.ck r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r5
            r2.getClass()
            r5.f132756d = r2
            int r6 = r5.f132753a
            r6 = r6 | 2
            r5.f132753a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.ck r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r5
            com.google.protobuf.cq r6 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.emptyProtobufList()
            r5.f132755c = r6
            int r5 = r0.f136277e
            if (r5 != r4) goto L_0x0061
            java.lang.Object r5 = r0.f136278f
            com.google.assistant.e.c.c.ck r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r5
            goto L_0x0063
        L_0x0061:
            com.google.assistant.e.c.c.ck r5 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.f132751e
        L_0x0063:
            com.google.protobuf.cq r5 = r5.f132755c
            java.util.Iterator r5 = r5.iterator()
        L_0x0069:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r5.next()
            com.google.assistant.e.c.c.ci r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50991ci) r6
            com.google.protobuf.bn r7 = r6.toBuilder()
            com.google.assistant.e.c.c.cf r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50988cf) r7
            int r8 = r6.f132743a
            r8 = r8 & r1
            if (r8 == 0) goto L_0x0097
            int r8 = r2.f132743a
            r8 = r8 & r1
            if (r8 == 0) goto L_0x0097
            java.lang.String r6 = r6.f132744b
            java.lang.String r8 = r2.f132744b
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0097
            com.google.protobuf.bn r6 = r2.toBuilder()
            r7 = r6
            com.google.assistant.e.c.c.cf r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50988cf) r7
            goto L_0x00a7
        L_0x0097:
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.assistant.e.c.c.ci r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50991ci) r6
            int r8 = r6.f132743a
            r8 = r8 | 2
            r6.f132743a = r8
            r8 = 0
            r6.f132745c = r8
        L_0x00a7:
            r3.mo53498a(r7)
            goto L_0x0069
        L_0x00ab:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.c.c.ck r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r3
            r3.getClass()
            r2.f136278f = r3
            r2.f136277e = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            r2.f36729a = r0
        L_0x00cf:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            if (r0 == 0) goto L_0x0223
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r0 = r9.f37154m
            if (r0 != 0) goto L_0x00d9
            goto L_0x0223
        L_0x00d9:
            com.google.assistant.e.j.so r0 = r10.f132749g
            if (r0 != 0) goto L_0x00df
            com.google.assistant.e.j.so r0 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
        L_0x00df:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            r3 = 4
            if (r2 == 0) goto L_0x0180
            com.google.assistant.e.j.tr r2 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.tp r2 = (com.google.assistant.p3897e.p3921j.C52488tp) r2
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = r9.f37153l
            com.google.assistant.e.j.e.eu r4 = r4.f36729a
            java.lang.String r4 = r4.f136279g
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.j.tr r5 = (com.google.assistant.p3897e.p3921j.C52490tr) r5
            r4.getClass()
            int r6 = r5.f137797a
            r6 = r6 | r1
            r5.f137797a = r6
            r5.f137800d = r4
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r4 = r9.f37153l
            com.google.assistant.e.j.e.eu r4 = r4.f36729a
            java.lang.String r4 = r4.f136280h
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.j.tr r5 = (com.google.assistant.p3897e.p3921j.C52490tr) r5
            r4.getClass()
            int r6 = r5.f137797a
            r6 = r6 | 2
            r5.f137797a = r6
            r5.f137801e = r4
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.j.tr r4 = (com.google.assistant.p3897e.p3921j.C52490tr) r4
            int r5 = r4.f137797a
            r5 = r5 | r3
            r4.f137797a = r5
            r4.f137802f = r1
            com.google.assistant.e.j.tm r4 = com.google.assistant.p3897e.p3921j.C52485tm.f137770c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.tl r4 = (com.google.assistant.p3897e.p3921j.C52484tl) r4
            com.google.assistant.e.j.so r5 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.sn r5 = (com.google.assistant.p3897e.p3921j.C52459sn) r5
            long r6 = r0.f137717b
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.assistant.e.j.so r0 = (com.google.assistant.p3897e.p3921j.C52460so) r0
            int r8 = r0.f137716a
            r8 = r8 | r1
            r0.f137716a = r8
            r0.f137717b = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            com.google.assistant.e.j.tm r0 = (com.google.assistant.p3897e.p3921j.C52485tm) r0
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.j.so r5 = (com.google.assistant.p3897e.p3921j.C52460so) r5
            r5.getClass()
            r0.f137773b = r5
            int r5 = r0.f137772a
            r5 = r5 | r1
            r0.f137772a = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.j.tm r4 = (com.google.assistant.p3897e.p3921j.C52485tm) r4
            r4.getClass()
            r0.f137799c = r4
            r4 = 12
            r0.f137798b = r4
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            r0.f36730b = r2
        L_0x0180:
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r0 = r9.f37154m
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            com.google.android.libraries.assistant.assistantactions.rendering.c.f r0 = r0.mo19691a(r2)
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            com.google.assistant.e.j.e.eu r2 = r2.f36729a
            int r4 = r2.f136275c
            if (r4 != r1) goto L_0x0195
            java.lang.Object r2 = r2.f136276d
            com.google.assistant.e.c.c.dg r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r2
            goto L_0x0197
        L_0x0195:
            com.google.assistant.e.c.c.dg r2 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0197:
            int r2 = r2.f132829a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0211
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            int r2 = r0.f136275c
            if (r2 != r1) goto L_0x01aa
            java.lang.Object r0 = r0.f136276d
            com.google.assistant.e.c.c.dg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r0
            goto L_0x01ac
        L_0x01aa:
            com.google.assistant.e.c.c.dg r0 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01ac:
            com.google.assistant.e.j.du r0 = r0.f132833e
            if (r0 != 0) goto L_0x01b2
            com.google.assistant.e.j.du r0 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x01b2:
            com.google.assistant.e.j.so r10 = r10.f132749g
            if (r10 != 0) goto L_0x01b8
            com.google.assistant.e.j.so r10 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
        L_0x01b8:
            com.google.protos.an.b.k r2 = com.google.protos.p4850an.p4853b.C63367k.f171252c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.an.b.j r2 = (com.google.protos.p4850an.p4853b.C63366j) r2
            com.google.protos.an.b.x r4 = com.google.protos.p4850an.p4853b.C63380x.f171276d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.an.b.w r4 = (com.google.protos.p4850an.p4853b.C63379w) r4
            long r5 = r10.f137717b
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.an.b.x r10 = (com.google.protos.p4850an.p4853b.C63380x) r10
            int r7 = r10.f171278a
            r7 = r7 | r1
            r10.f171278a = r7
            double r5 = (double) r5
            r10.f171279b = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.an.b.x r10 = (com.google.protos.p4850an.p4853b.C63380x) r10
            r10.f171280c = r3
            int r3 = r10.f171278a
            r3 = r3 | 2
            r10.f171278a = r3
            com.google.protobuf.bv r10 = r4.build()
            com.google.protos.an.b.x r10 = (com.google.protos.p4850an.p4853b.C63380x) r10
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.protos.an.b.k r3 = (com.google.protos.p4850an.p4853b.C63367k) r3
            r10.getClass()
            r3.f171255b = r10
            int r10 = r3.f171254a
            r10 = r10 | r1
            r3.f171254a = r10
            com.google.protobuf.bv r10 = r2.build()
            com.google.protos.an.b.k r10 = (com.google.protos.p4850an.p4853b.C63367k) r10
            com.google.knowledge.a.a.j r10 = com.google.android.libraries.assistant.assistantactions.p636e.C11271a.m26759c(r10)
            com.google.assistant.e.j.du r10 = com.google.android.libraries.assistant.assistantactions.p636e.C11278h.m26771a(r0, r10)
            r9.mo19943j(r10)
            return
        L_0x0211:
            int r1 = r10.f132743a
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0220
            com.google.assistant.e.c.c.dg r10 = r10.f132746d
            if (r10 != 0) goto L_0x021c
            com.google.assistant.e.c.c.dg r10 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x021c:
            r9.mo19942i(r10, r0)
            return
        L_0x0220:
            r9.mo19941h(r0)
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.DurationSelectionField.mo19845c(com.google.assistant.e.c.c.ci):void");
    }
}
