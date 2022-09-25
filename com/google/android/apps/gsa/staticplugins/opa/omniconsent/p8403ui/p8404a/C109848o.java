package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.p8404a;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83861u;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83864x;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109776h;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109778j;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.assistant.p3861at.C50347ts;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4018a.p4019a.p4020a.C53751ai;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.o */
/* compiled from: PG */
public final class C109848o extends C109854u {

    /* renamed from: j */
    public C113787bc f306079j;

    /* renamed from: k */
    public boolean f306080k;

    /* renamed from: l */
    private C109776h f306081l;

    /* renamed from: m */
    private View f306082m;

    /* renamed from: p */
    private RadioGroup f306083p;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C83864x mo98186e() {
        C83861u uVar = (C83861u) C83864x.f228509f.createBuilder();
        int a = C53751ai.m86897a(this.f306081l.f305885d);
        if (a == 0) {
            a = 1;
        }
        uVar.copyOnWrite();
        C83864x xVar = (C83864x) uVar.instance;
        xVar.f228513c = a - 1;
        xVar.f228511a |= 2;
        C63088z zVar = this.f306081l.f305884c;
        uVar.copyOnWrite();
        C83864x xVar2 = (C83864x) uVar.instance;
        zVar.getClass();
        xVar2.f228511a |= 4;
        xVar2.f228514d = zVar;
        uVar.copyOnWrite();
        C83864x xVar3 = (C83864x) uVar.instance;
        xVar3.f228512b = 2;
        xVar3.f228511a = 1 | xVar3.f228511a;
        C63088z zVar2 = this.f306081l.f305888g;
        uVar.copyOnWrite();
        C83864x xVar4 = (C83864x) uVar.instance;
        zVar2.getClass();
        xVar4.f228511a |= 8;
        xVar4.f228515e = zVar2;
        return (C83864x) uVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C109778j mo98187g() {
        C109778j jVar = this.f306081l.f305883b;
        return jVar == null ? C109778j.f305889e : jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final View mo98188j(LayoutInflater layoutInflater) {
        C50347ts tsVar = this.f306081l.f305887f;
        if (tsVar == null) {
            tsVar = C50347ts.f131027k;
        }
        View inflate = layoutInflater.inflate(R.layout.confirm_reject_content, (ViewGroup) null, false);
        this.f306082m = inflate;
        HeaderLayout headerLayout = (HeaderLayout) inflate.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, tsVar.f131030b, TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, (CharSequence) null, TextView.BufferType.NORMAL, headerLayout);
        RadioGroup radioGroup = (RadioGroup) this.f306082m.findViewById(R.id.opa_error_radio_group);
        this.f306083p = radioGroup;
        C84018m.m133909d(radioGroup, R.id.opa_error_first_radio, tsVar.f131031c);
        C84018m.m133909d(this.f306083p, R.id.opa_error_first_radio_content, tsVar.f131032d);
        C84018m.m133909d(this.f306083p, R.id.opa_error_first_radio_content_expanded, tsVar.f131033e);
        C84018m.m133909d(this.f306083p, R.id.opa_error_second_radio, tsVar.f131036h);
        C84018m.m133909d(this.f306083p, R.id.opa_error_second_radio_content, tsVar.f131037i);
        ((Button) this.f306082m.findViewById(R.id.opa_error_first_radio_content_expand_button)).setOnClickListener(new C109847n(this));
        mo98196q();
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        this.f306083p.setLayoutTransition(layoutTransition);
        return this.f306082m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C28292j mo98189k() {
        return new C28292j(46430);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo98190l() {
        C50347ts tsVar = this.f306081l.f305887f;
        if (tsVar == null) {
            tsVar = C50347ts.f131027k;
        }
        return tsVar.f131038j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo98192n() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f306083p.getCheckedRadioButtonId() == R.id.opa_error_second_radio) {
            this.f306100h = 3;
            if (this.f306079j.mo100634n()) {
                mo77318iT().mo77312a();
            } else {
                mo77318iT().mo77313b();
            }
        } else {
            mo98203r();
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getClass();
        C109776h hVar = (C109776h) C90734ar.m148199b(arguments, "udc_confirm_reject_args", C109776h.f305880h.getParserForType());
        C58838bb.m90867b(hVar, "Must supply UdcConfirmRejectArgs under key %s", "udc_confirm_reject_args");
        this.f306081l = hVar;
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
    }

    /* renamed from: q */
    public final void mo98196q() {
        View findViewById = this.f306082m.findViewById(R.id.opa_error_first_radio_content_expanded);
        Button button = (Button) this.f306082m.findViewById(R.id.opa_error_first_radio_content_expand_button);
        if (this.f306080k) {
            findViewById.setVisibility(0);
            C50347ts tsVar = this.f306081l.f305887f;
            if (tsVar == null) {
                tsVar = C50347ts.f131027k;
            }
            button.setText(tsVar.f131035g);
            button.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_expand_less_googblue_24, 0);
            return;
        }
        findViewById.setVisibility(8);
        C50347ts tsVar2 = this.f306081l.f305887f;
        if (tsVar2 == null) {
            tsVar2 = C50347ts.f131027k;
        }
        button.setText(tsVar2.f131034f);
        button.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_expand_more_googblue_24, 0);
    }
}
