package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4129b.p4130a.p4131a.p4132a.C54685bb;
import com.google.p4129b.p4130a.p4131a.p4132a.C54687bd;
import com.google.p4129b.p4130a.p4131a.p4132a.C54689bf;
import com.google.p4129b.p4130a.p4131a.p4132a.C54691bh;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.a */
/* compiled from: PG */
public class C115905a extends C83907bm {

    /* renamed from: g */
    private static final C59071e f321378g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opapayments.a.a");

    /* renamed from: b */
    protected C54685bb f321379b;

    /* renamed from: c */
    public C54691bh f321380c;

    /* renamed from: d */
    protected HeaderLayout f321381d;

    /* renamed from: e */
    protected LinearLayout f321382e;

    /* renamed from: f */
    protected FooterLayout f321383f;

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo102315h(int i, int i2) {
        mo102314g(i, i2);
        this.f321381d.mo77365b(R.drawable.gpay, R.string.gpay_logo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.opa_payments_oobe_template, (ViewGroup) null);
        this.f321381d = (HeaderLayout) inflate.findViewById(R.id.opa_header);
        this.f321383f = (FooterLayout) inflate.findViewById(R.id.opa_payments_footer_container);
        this.f321382e = (LinearLayout) inflate.findViewById(R.id.opa_payments_oobe_list_container);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo102313e() {
        C54687bd bdVar = this.f321379b.f143546d;
        if (bdVar != null) {
            if (!bdVar.f143550b.isEmpty()) {
                C54687bd bdVar2 = this.f321379b.f143546d;
                if (bdVar2 == null) {
                    bdVar2 = C54687bd.f143547c;
                }
                if (!bdVar2.f143549a.isEmpty()) {
                    this.f321383f.mo77362c(2);
                    Button b = this.f321383f.mo77361b();
                    C54687bd bdVar3 = this.f321379b.f143546d;
                    if (bdVar3 == null) {
                        bdVar3 = C54687bd.f143547c;
                    }
                    b.setText(bdVar3.f143549a);
                    Button a = this.f321383f.mo77360a();
                    C54687bd bdVar4 = this.f321379b.f143546d;
                    if (bdVar4 == null) {
                        bdVar4 = C54687bd.f143547c;
                    }
                    a.setText(bdVar4.f143550b);
                    return;
                }
            }
            C54687bd bdVar5 = this.f321379b.f143546d;
            if (bdVar5 == null) {
                bdVar5 = C54687bd.f143547c;
            }
            if (!bdVar5.f143550b.isEmpty()) {
                this.f321383f.mo77362c(1);
                Button a2 = this.f321383f.mo77360a();
                C54687bd bdVar6 = this.f321379b.f143546d;
                if (bdVar6 == null) {
                    bdVar6 = C54687bd.f143547c;
                }
                a2.setText(bdVar6.f143550b);
                return;
            }
            C54687bd bdVar7 = this.f321379b.f143546d;
            if (bdVar7 == null) {
                bdVar7 = C54687bd.f143547c;
            }
            if (!bdVar7.f143549a.isEmpty()) {
                this.f321383f.mo77362c(4);
                Button b2 = this.f321383f.mo77361b();
                C54687bd bdVar8 = this.f321379b.f143546d;
                if (bdVar8 == null) {
                    bdVar8 = C54687bd.f143547c;
                }
                b2.setText(bdVar8.f143549a);
                return;
            }
            this.f321383f.mo77362c(0);
            C59104x d = f321378g.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaPaymentBaseFrag");
            ((C59052c) ((C59052c) d).mo56372aa(30147)).mo56386p("PageValue has empty action and footer button texts");
            return;
        }
        this.f321383f.mo77362c(0);
        C59104x d2 = f321378g.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "OpaPaymentBaseFrag");
        ((C59052c) ((C59052c) d2).mo56372aa(30148)).mo56386p("PageValue does not have page footer");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo102314g(int i, int i2) {
        C54689bf bfVar = this.f321379b.f143545c;
        if (bfVar != null) {
            HeaderLayout headerLayout = this.f321381d;
            C84018m.m133908c(headerLayout.f228718a, bfVar.f143553a, TextView.BufferType.NORMAL, headerLayout);
            HeaderLayout headerLayout2 = this.f321381d;
            C84018m.m133908c(headerLayout2.f228719b, bfVar.f143554b, TextView.BufferType.NORMAL, headerLayout2);
            return;
        }
        HeaderLayout headerLayout3 = this.f321381d;
        C84018m.m133908c(headerLayout3.f228718a, C84018m.m133906a(i, headerLayout3), TextView.BufferType.NORMAL, headerLayout3);
        HeaderLayout headerLayout4 = this.f321381d;
        C84018m.m133908c(headerLayout4.f228719b, C84018m.m133906a(i2, headerLayout4), TextView.BufferType.NORMAL, headerLayout4);
    }
}
