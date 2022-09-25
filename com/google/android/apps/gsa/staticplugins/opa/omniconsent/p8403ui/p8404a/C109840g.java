package com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.p8404a;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84027v;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LinkUtil;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109770b;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109772d;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.shared.C109859c;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.shared.ConsentHeaderLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.C50345tq;
import com.google.assistant.p3861at.ado;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.ui.a.g */
/* compiled from: PG */
public final class C109840g extends C83907bm {

    /* renamed from: b */
    public C91189au f306063b;

    /* renamed from: c */
    public boolean f306064c;

    /* renamed from: d */
    public C104149a f306065d;

    /* renamed from: e */
    private C109770b f306066e;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        arguments.getClass();
        C109770b bVar = (C109770b) C90734ar.m148199b(arguments, "disclosure_args", C109770b.f305851g.getParserForType());
        C58838bb.m90867b(bVar, "Must supply DisclosureFragmentArgs under key %s", "disclosure_args");
        this.f306066e = bVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater from = LayoutInflater.from(C84027v.m133919a(this.f306065d, layoutInflater.getContext(), this.f306064c));
        OpaPageLayout opaPageLayout = new OpaPageLayout(from.getContext());
        LinearLayout linearLayout = (LinearLayout) View.inflate(from.getContext(), R.layout.omniconsent_content, (ViewGroup) null);
        opaPageLayout.mo77371c(linearLayout);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        linearLayout.setLayoutTransition(layoutTransition);
        C109772d dVar = this.f306066e.f305854b;
        if (dVar == null) {
            dVar = C109772d.f305859c;
        }
        ConsentHeaderLayout consentHeaderLayout = (ConsentHeaderLayout) View.inflate(from.getContext(), R.layout.consent_header, (ViewGroup) null);
        consentHeaderLayout.mo98207a(dVar);
        consentHeaderLayout.setId(R.id.udc_header_layout);
        linearLayout.addView(consentHeaderLayout);
        C50345tq tqVar = this.f306066e.f305855c;
        if (tqVar == null) {
            tqVar = C50345tq.f131022d;
        }
        LinearLayout linearLayout2 = (LinearLayout) from.inflate(R.layout.third_party_disclosure_container, (ViewGroup) null);
        linearLayout2.setId(R.id.third_party_disclosure_container);
        from.inflate(R.layout.element_divider, linearLayout2, true);
        int size = tqVar.f131026c.size();
        for (int i = 0; i < size; i++) {
            ado ado = (ado) tqVar.f131026c.get(i);
            C109859c cVar = new C109859c(getActivity(), (AttributeSet) null, 0);
            cVar.mo98210d(ado.f129055d, ado.f129056e);
            cVar.mo77424c(ado.f129054c);
            this.f306063b.mo85421i(ado.f129057f, cVar.mo77422a());
            linearLayout2.addView(cVar);
            if (i != size - 1) {
                from.inflate(R.layout.consent_element_spacing, linearLayout2, true);
            }
        }
        linearLayout.addView(linearLayout2);
        if ((tqVar.f131024a & 1) != 0) {
            C28295m.m52919e(opaPageLayout, new C28292j(tqVar.f131025b));
        } else {
            C28295m.m52919e(opaPageLayout, new C28292j(46423));
        }
        from.inflate(R.layout.element_divider, linearLayout, true);
        from.inflate(R.layout.footer_section, linearLayout, true);
        TextView textView = (TextView) opaPageLayout.findViewById(R.id.opa_consent_footer_paragraph);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(LinkUtil.m133792b(this.f306066e.f305856d));
        C84012g a = opaPageLayout.mo77369a();
        a.mo77475d(1);
        C84010e e = C84011f.m133882e();
        e.mo77375c(this.f306066e.f305857e);
        ((C83958a) e).f228734b = new C89943l(new C109839f(this));
        a.mo77472a(e.mo77373a());
        return opaPageLayout;
    }
}
