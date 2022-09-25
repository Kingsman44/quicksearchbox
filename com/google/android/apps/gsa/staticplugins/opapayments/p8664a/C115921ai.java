package com.google.android.apps.gsa.staticplugins.opapayments.p8664a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;
import com.google.p4129b.p4130a.p4131a.p4132a.C54685bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opapayments.a.ai */
/* compiled from: PG */
public final class C115921ai extends C115905a {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            C54685bb bbVar = (C54685bb) C90734ar.m148199b(getArguments(), "welcome_page_extra", C54685bb.f143541e.getParserForType());
            C58838bb.m90867b(bbVar, "Must supply welcome page under key %s", "welcome_page_extra");
            C58838bb.m90884s(bbVar.f143543a == 2, "Page must have welcome form to render WelcomeFragment.");
            this.f321379b = bbVar;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        mo102314g(R.string.welcome_title, R.string.welcome_message);
        if (onCreateView != null) {
            layoutInflater.inflate(R.layout.opa_payments_welcome, (ViewGroup) onCreateView.findViewById(R.id.opa_payments_oobe_list_container), true);
        }
        mo102313e();
        if (this.f321383f.mo77360a() != null) {
            this.f321383f.mo77360a().setOnClickListener(new C89943l(new C115919ag(this)));
        }
        if (this.f321383f.mo77361b() != null) {
            this.f321383f.mo77361b().setOnClickListener(new C89943l(new C115920ah(this)));
        }
        return onCreateView;
    }
}
