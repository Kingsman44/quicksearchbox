package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p636e.C11271a;
import com.google.android.libraries.assistant.assistantactions.p636e.C11278h;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.SpinnerComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11329q;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51124hg;
import com.google.assistant.p3897e.p3902c.p3907c.C51125hh;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52504ue;
import com.google.assistant.p3897e.p3921j.C52505uf;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.RecurrenceSelectionField */
/* compiled from: PG */
public class RecurrenceSelectionField extends C11407n implements C11329q {

    /* renamed from: a */
    private TextView f37035a;

    /* renamed from: b */
    private SpinnerComponent f37036b;

    /* renamed from: c */
    private C11389bv f37037c;

    public RecurrenceSelectionField(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51125hh hhVar;
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null && this.f37152k != null && this.f37037c != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 7) {
                hhVar = (C51125hh) euVar.f136278f;
            } else {
                hhVar = C51125hh.f133077g;
            }
            String f = C11306d.m26906f(hhVar, getContext().getResources());
            this.f37035a.setText(hhVar.f133080b);
            List asList = Arrays.asList(new String[]{f});
            this.f37037c.clear();
            this.f37037c.addAll(asList);
            this.f37036b.setAdapter((SpinnerAdapter) this.f37037c);
            this.f37036b.setVisibility(0);
            this.f37036b.setSelection(0, false);
            mo19866a();
            if (this.f37160s == 2) {
                this.f37035a.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo19762c(C58833ax axVar, String str, C58833ax axVar2) {
        C11295c cVar;
        C51016dg dgVar;
        C51016dg dgVar2;
        C51125hh hhVar;
        String string = getResources().getString(R.string.assistantactions_do_not_repeat);
        if (TextUtils.isEmpty(str) || str.equals(getResources().getString(R.string.assistantactions_none))) {
            str = string;
        }
        ((TextView) this.f37036b.getChildAt(0)).setText(str);
        this.f37036b.requestFocus();
        this.f37036b.requestFocusFromTouch();
        C11295c cVar2 = this.f37153l;
        if (cVar2 != null) {
            C51941eu euVar = cVar2.f36729a;
            if (euVar.f136277e == 7) {
                hhVar = (C51125hh) euVar.f136278f;
            } else {
                hhVar = C51125hh.f133077g;
            }
            C51124hg hgVar = (C51124hg) hhVar.toBuilder();
            if (axVar2.mo56113h()) {
                C52397qf qfVar = (C52397qf) axVar2.mo56107c();
                hgVar.copyOnWrite();
                C51125hh hhVar2 = (C51125hh) hgVar.instance;
                qfVar.getClass();
                hhVar2.f133081c = qfVar;
                hhVar2.f133079a |= 2;
            } else {
                hgVar.copyOnWrite();
                C51125hh hhVar3 = (C51125hh) hgVar.instance;
                hhVar3.f133081c = null;
                hhVar3.f133079a &= -3;
            }
            C51937eq eqVar = (C51937eq) euVar.toBuilder();
            eqVar.copyOnWrite();
            C51941eu euVar2 = (C51941eu) eqVar.instance;
            C51125hh hhVar4 = (C51125hh) hgVar.build();
            hhVar4.getClass();
            euVar2.f136278f = hhVar4;
            euVar2.f136277e = 7;
            this.f37153l.f36729a = (C51941eu) eqVar.build();
            C58976aa aaVar = C58975e.f156826a;
        }
        if (this.f37153l != null) {
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str2 = this.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str2;
            String str3 = this.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str3.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str3;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            if (axVar2.mo56113h()) {
                C52504ue ueVar = (C52504ue) C52505uf.f137834c.createBuilder();
                C52397qf qfVar2 = (C52397qf) axVar2.mo56107c();
                ueVar.copyOnWrite();
                C52505uf ufVar = (C52505uf) ueVar.instance;
                qfVar2.getClass();
                ufVar.f137837b = qfVar2;
                ufVar.f137836a |= 1;
                tpVar.copyOnWrite();
                C52490tr trVar4 = (C52490tr) tpVar.instance;
                C52505uf ufVar2 = (C52505uf) ueVar.build();
                ufVar2.getClass();
                trVar4.f137799c = ufVar2;
                trVar4.f137798b = 11;
            } else {
                C52505uf ufVar3 = C52505uf.f137834c;
                tpVar.copyOnWrite();
                C52490tr trVar5 = (C52490tr) tpVar.instance;
                ufVar3.getClass();
                trVar5.f137799c = ufVar3;
                trVar5.f137798b = 11;
            }
            this.f37153l.f36730b = (C52490tr) tpVar.build();
        }
        if (this.f37154m != null && (cVar = this.f37153l) != null) {
            C51941eu euVar3 = cVar.f36729a;
            if (euVar3.f136275c == 1) {
                dgVar = (C51016dg) euVar3.f136276d;
            } else {
                dgVar = C51016dg.f132827g;
            }
            if ((dgVar.f132829a & 8) != 0) {
                C51941eu euVar4 = this.f37153l.f36729a;
                if (euVar4.f136275c == 1) {
                    dgVar2 = (C51016dg) euVar4.f136276d;
                } else {
                    dgVar2 = C51016dg.f132827g;
                }
                C51805du duVar = dgVar2.f132833e;
                if (duVar == null) {
                    duVar = C51805du.f135924e;
                }
                mo19943j(C11278h.m26771a(duVar, C11271a.m26758b((C52397qf) axVar2.mo56107c())));
                return;
            }
            mo19941h(this.f37154m.mo19691a(this.f37153l));
        }
    }

    /* renamed from: o */
    public final void mo19841o() {
        this.f37036b.requestFocus();
        this.f37036b.requestFocusFromTouch();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37035a = (TextView) findViewById(R.id.recurrence_selection_field_title);
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.recurrence_list);
        this.f37036b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f37037c = new C11389bv(this, getContext());
        this.f37036b.setOnFocusChangeListener(new C11386bs(this));
        this.f37036b.setOnTouchListener(new C11388bu(this));
    }

    /* renamed from: p */
    public final void mo19843p() {
        this.f37036b.clearFocus();
    }

    public RecurrenceSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecurrenceSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo19866a() {
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
            this.f37035a.setTextColor(i);
        }
        if (this.f37036b.getChildAt(0) != null && this.f37153l != null) {
            SpinnerComponent spinnerComponent = this.f37036b;
            spinnerComponent.mo19803c((TextView) spinnerComponent.getChildAt(0), this.f37153l.mo19717a(), this.f37151j);
        }
    }
}
