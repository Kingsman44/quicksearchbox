package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84021p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.GlifLoadingLayout;
import com.google.android.setupdesign.p3555d.C45295c;
import com.google.android.setupdesign.p3556e.C45304a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.am */
/* compiled from: PG */
public final class C110463am extends C84021p {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C45304a.m80747c(this);
        C45304a.m80746b(this);
        GlifLoadingLayout glifLoadingLayout = (GlifLoadingLayout) layoutInflater.inflate(R.layout.suw_bc_loading_fragment, viewGroup, false);
        ((C45295c) glifLoadingLayout.mo49129j(C45295c.class)).mo49226c(R.string.opa_value_proposition_title_loading);
        return glifLoadingLayout;
    }
}
