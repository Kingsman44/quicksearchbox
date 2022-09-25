package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
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
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33232j;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33257p;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51124hg;
import com.google.assistant.p3897e.p3902c.p3907c.C51125hh;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52505uf;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.RecurrenceSelectionField */
/* compiled from: PG */
public final class RecurrenceSelectionField extends LinearLayout implements C33177b, C33257p {

    /* renamed from: a */
    public static final C59071e f89173a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.RecurrenceSelectionField");

    /* renamed from: b */
    public boolean f89174b = false;

    /* renamed from: c */
    public C51941eu f89175c;

    /* renamed from: d */
    public C33184i f89176d;

    /* renamed from: e */
    public C33182g f89177e;

    /* renamed from: f */
    public C32942a f89178f;

    /* renamed from: g */
    public Fragment f89179g;

    /* renamed from: h */
    private TextView f89180h = null;

    /* renamed from: i */
    private SpinnerComponent f89181i = null;

    /* renamed from: j */
    private C33355dg f89182j;

    public RecurrenceSelectionField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38636a(String str, Optional optional) {
        C51125hh hhVar;
        C51016dg dgVar;
        String string = getResources().getString(R.string.fa_recurrence_do_not_repeat);
        if (TextUtils.isEmpty(str) || str.equals(getResources().getString(R.string.fa_recurrence_none))) {
            str = string;
        }
        SpinnerComponent spinnerComponent = this.f89181i;
        if (spinnerComponent != null) {
            View childAt = spinnerComponent.getChildAt(0);
            childAt.getClass();
            ((TextView) childAt).setText(str);
            this.f89181i.requestFocus();
            this.f89181i.requestFocusFromTouch();
        }
        C51941eu euVar = this.f89175c;
        if (euVar == null || this.f89177e == null || this.f89178f == null) {
            C59104x d = f89173a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RepeatSelectionField");
            ((C59052c) ((C59052c) d).mo56372aa(51142)).mo56386p("Failed to send ClientInteraction due to invalid args");
            return;
        }
        if (euVar.f136277e == 7) {
            hhVar = (C51125hh) euVar.f136278f;
        } else {
            hhVar = C51125hh.f133077g;
        }
        C51124hg hgVar = (C51124hg) hhVar.toBuilder();
        if (optional.isPresent()) {
            C52397qf qfVar = (C52397qf) optional.get();
            hgVar.copyOnWrite();
            C51125hh hhVar2 = (C51125hh) hgVar.instance;
            qfVar.getClass();
            hhVar2.f133081c = qfVar;
            hhVar2.f133079a |= 2;
            String h = C33232j.m61634h((C52397qf) optional.get(), getContext());
            hgVar.copyOnWrite();
            C51125hh hhVar3 = (C51125hh) hgVar.instance;
            h.getClass();
            hhVar3.f133079a |= 16;
            hhVar3.f133084f = h;
        } else {
            hgVar.copyOnWrite();
            C51125hh hhVar4 = (C51125hh) hgVar.instance;
            hhVar4.f133081c = null;
            hhVar4.f133079a &= -3;
            hgVar.copyOnWrite();
            C51125hh hhVar5 = (C51125hh) hgVar.instance;
            hhVar5.f133079a &= -17;
            hhVar5.f133084f = C51125hh.f133077g.f133084f;
        }
        C51937eq eqVar = (C51937eq) this.f89175c.toBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C51125hh hhVar6 = (C51125hh) hgVar.build();
        hhVar6.getClass();
        euVar2.f136278f = hhVar6;
        euVar2.f136277e = 7;
        C51941eu euVar3 = (C51941eu) eqVar.build();
        this.f89175c = euVar3;
        this.f89177e.mo38581f(euVar3);
        C58976aa aaVar = C58975e.f156826a;
        C52505uf ufVar = (C52505uf) optional.map(C33351dc.f89393a).orElseGet(C33352dd.f89394a);
        C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
        String str2 = this.f89175c.f136279g;
        tpVar.copyOnWrite();
        C52490tr trVar = (C52490tr) tpVar.instance;
        str2.getClass();
        trVar.f137797a |= 1;
        trVar.f137800d = str2;
        String str3 = this.f89175c.f136280h;
        tpVar.copyOnWrite();
        C52490tr trVar2 = (C52490tr) tpVar.instance;
        str3.getClass();
        trVar2.f137797a |= 2;
        trVar2.f137801e = str3;
        tpVar.copyOnWrite();
        C52490tr trVar3 = (C52490tr) tpVar.instance;
        trVar3.f137797a |= 4;
        trVar3.f137802f = true;
        tpVar.copyOnWrite();
        C52490tr trVar4 = (C52490tr) tpVar.instance;
        ufVar.getClass();
        trVar4.f137799c = ufVar;
        trVar4.f137798b = 11;
        C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
        C51953ff a = this.f89177e.mo38576a();
        tsVar.copyOnWrite();
        C52492tt ttVar = (C52492tt) tsVar.instance;
        a.getClass();
        ttVar.f137806b = a;
        ttVar.f137805a |= 1;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        ugVar.mo53877a((C52490tr) tpVar.build());
        tsVar.copyOnWrite();
        C52492tt ttVar2 = (C52492tt) tsVar.instance;
        C52507uh uhVar = (C52507uh) ugVar.build();
        uhVar.getClass();
        ttVar2.f137807c = uhVar;
        ttVar2.f137805a |= 2;
        C52492tt ttVar3 = (C52492tt) tsVar.build();
        C32942a aVar = this.f89178f;
        C51941eu euVar4 = this.f89175c;
        if (euVar4.f136275c == 1) {
            dgVar = (C51016dg) euVar4.f136276d;
        } else {
            dgVar = C51016dg.f132827g;
        }
        aVar.mo38364a("FA Recur", ttVar3, dgVar);
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
        C51125hh hhVar;
        C51941eu euVar = this.f89175c;
        if (euVar == null || this.f89177e == null || this.f89176d == null || this.f89182j == null || this.f89180h == null || this.f89181i == null) {
            C59104x d = f89173a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RepeatSelectionField");
            ((C59052c) ((C59052c) d).mo56372aa(51144)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89175c = euVar2;
            this.f89177e.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89175c;
        if (euVar3.f136277e == 7) {
            hhVar = (C51125hh) euVar3.f136278f;
        } else {
            hhVar = C51125hh.f133077g;
        }
        String f = C33232j.m61632f(hhVar, getContext().getResources());
        this.f89180h.setText(hhVar.f133080b);
        List asList = Arrays.asList(new String[]{f});
        this.f89182j.clear();
        this.f89182j.addAll(asList);
        this.f89181i.setAdapter((SpinnerAdapter) this.f89182j);
        this.f89181i.setVisibility(0);
        this.f89181i.setSelection(0, false);
        mo38724h();
        if (this.f89176d.f88753c) {
            this.f89180h.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo38565f() {
        SpinnerComponent spinnerComponent = this.f89181i;
        if (spinnerComponent != null) {
            spinnerComponent.requestFocus();
            this.f89181i.requestFocusFromTouch();
        }
    }

    /* renamed from: g */
    public final void mo38566g() {
        SpinnerComponent spinnerComponent = this.f89181i;
        if (spinnerComponent != null) {
            spinnerComponent.clearFocus();
        }
    }

    /* renamed from: h */
    public final void mo38724h() {
        int i;
        C51941eu euVar = this.f89175c;
        if (euVar != null && this.f89180h != null && this.f89181i != null) {
            boolean z = (euVar.f136273a & 64) != 0 && euVar.f136282j;
            if (z) {
                i = C19391a.m36980a(getContext(), R.attr.colorError);
            } else if (this.f89174b) {
                i = C19391a.m36980a(getContext(), R.attr.colorPrimary);
            } else {
                i = C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant);
            }
            this.f89180h.setTextColor(i);
            if (this.f89181i.getChildAt(0) != null) {
                SpinnerComponent spinnerComponent = this.f89181i;
                spinnerComponent.mo38668c(spinnerComponent.getChildAt(0), z, this.f89174b);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89180h = (TextView) findViewById(R.id.fa_recurrence_selection_field_title);
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.fa_recurrence_selection_field_recurrence_list);
        spinnerComponent.getClass();
        this.f89181i = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f89182j = new C33355dg(this, getContext());
        this.f89181i.setOnFocusChangeListener(new C33353de(this));
        this.f89181i.setOnTouchListener(new C33354df(this));
    }

    public RecurrenceSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecurrenceSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
